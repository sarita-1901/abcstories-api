package com.finalproject.abcstories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comments, Integer> {
        List<Comments> findAllBycontentid(int contentId);
}
