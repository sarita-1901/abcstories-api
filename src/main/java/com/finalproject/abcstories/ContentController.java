package com.finalproject.abcstories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ContentController {
    @Autowired
    ContentRepository contentRepository;

   @Autowired
    ContentService contentService;


    //GET all contents
    @GetMapping("/contents")
    public ResponseEntity<List<ContentDTO>> getContents(){
        //get list of all contents from content repo
        //for each content, make content DTO and send list of content DTO
        List<Content> contentList = contentRepository.findAll();
        System.out.println("In Getting content");
        List <ContentDTO> contentDTOList = contentList.stream().map((content) -> {
            System.out.println(content.getContentId());
                        System.out.println(content.getCategoryId());
//                        System.out.println(contentService.getContentById(content.getId()));
            return contentService.getContentById(content.getContentId());
        }).collect(Collectors.toList());
        return ResponseEntity.status(HttpStatus.OK).body(contentDTOList);
    }

    @GetMapping("/content/{id}")
    public ResponseEntity<ContentDTO> getContent(@PathVariable String id) {
//            return ResponseEntity.status(HttpStatus.OK).body(ticketRepository.findById(parseInt(id)));
        try{
            return ResponseEntity.status(HttpStatus.OK).body(contentService.getContentById(parseInt(id)));

        }catch (ResourceNotFoundException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    //POST a new content
    @PostMapping("/content")
    public ResponseEntity<String> addContent(@RequestBody Content content){
        System.out.println(" In Post CALl!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Received ticket:"+ content);
        contentRepository.save(content);
        return ResponseEntity.status(HttpStatus.CREATED).body("Content has been added");
    }

}
