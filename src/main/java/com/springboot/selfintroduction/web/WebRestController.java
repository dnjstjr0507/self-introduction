package com.springboot.selfintroduction.web;

import com.springboot.selfintroduction.domain.posts.PostsRepository;
import com.springboot.selfintroduction.dto.posts.PostsSaveRequestDto;
import com.springboot.selfintroduction.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dnjstjr0507@gmail.com on 2019. 05. 03.
 * Github : https://github.com/dnjstjr0507
 */

@RestController
@AllArgsConstructor // Autowried는 비권장 방식이고 @AllArgsConstructor을 통해 생성자로 주입받는다.
public class WebRestController {

    private PostsService postsService;

    @GetMapping("/hello")
    public String hello(){
        return "HelloWorld";
    }

    @PostMapping("/posts")
    public Long savePosts(@RequestBody PostsSaveRequestDto dto){
        return postsService.save(dto);
    }
}
