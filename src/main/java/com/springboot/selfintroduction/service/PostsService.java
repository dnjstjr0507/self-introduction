package com.springboot.selfintroduction.service;

import com.springboot.selfintroduction.domain.posts.PostsRepository;
import com.springboot.selfintroduction.dto.posts.PostsMainResponseDto;
import com.springboot.selfintroduction.dto.posts.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by dnjstjr0507@gmail.com on 2019. 05. 03.
 * Github : https://github.com/dnjstjr0507
 */

@AllArgsConstructor
@Service
public class PostsService {
    private PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto dto){
        return postsRepository.save(dto.toEntity()).getId();
    }

    @Transactional(readOnly = true) //(readOnly = true)는 트랜잭션 범위는 유지하되, 조회 기능만 남겨두어 조회 속도가 개선 등록/수정/삭제 기능이 없는 메소드에선 사용
    public List<PostsMainResponseDto> findAllDesc() {
        return postsRepository.findAllDesc()
                .map(PostsMainResponseDto::new)
                .collect(Collectors.toList());
    }
}
