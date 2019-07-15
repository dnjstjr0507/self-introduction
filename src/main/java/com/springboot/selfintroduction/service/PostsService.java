package com.springboot.selfintroduction.service;

import com.springboot.selfintroduction.domain.posts.PostsRepository;
import com.springboot.selfintroduction.dto.posts.PostsMainResponseDto;
import com.springboot.selfintroduction.dto.posts.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by dnjstjr0507@gmail.com on 2019. 5. 6.
 * Github : http://github.com/dnjstjr0507
 */

@AllArgsConstructor
@Service
public class PostsService {
    private PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto dto){
        return postsRepository.save(dto.toEntity()).getId();
    }

    @Transactional(readOnly = true)
    public List<PostsMainResponseDto> findAllDesc() {
        return postsRepository.findAllDesc()
                .map(PostsMainResponseDto::new)
                .collect(Collectors.toList());
    }
<<<<<<< HEAD
=======

    @Transactional(readOnly = true)
    public PostsMainResponseDto findById(Long id){
        Posts posts = postsRepository.findByid(id);
        PostsMainResponseDto post = new PostsMainResponseDto(posts);
        return post;

    }

>>>>>>> a32517bbd45a0ef70f7bbe8b0adb51bd0e5393ba
}
