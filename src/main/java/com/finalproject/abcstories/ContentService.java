package com.finalproject.abcstories;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class ContentService {
    @Autowired
    ContentRepository contentRepository;
   @Autowired
    CommentRepository commentRepository;

   public ContentDTO getContentById(int id) throws ResourceNotFoundException {
       Optional<Content> optionalContent = contentRepository.findById(id);
       List<Comments> CommentsList = commentRepository.findAllBycontentid(id);
       Content content;
     if(!optionalContent.isPresent()){
           throw new ResourceNotFoundException();
       }
       content=optionalContent.get();
       ContentDTO contentDTO=new ContentDTO();
       BeanUtils.copyProperties(content,contentDTO);

       contentDTO.setComments(CommentsList.stream().map(response -> {
           ContentDTO.ContentCommentsDTO ContentCommentsDTO=new ContentDTO.ContentCommentsDTO();
           BeanUtils.copyProperties(response,ContentCommentsDTO);
           return ContentCommentsDTO;
       }).collect(Collectors.toList()));
       return contentDTO;

   }

}


