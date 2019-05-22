package com.springboot.selfintroduction.web;

import com.springboot.selfintroduction.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by dnjstjr0507@gmail.com on 2019. 5. 6.
 * Github : http://github.com/dnjstjr0507
 */

@Controller
@AllArgsConstructor
public class WebController {

    private PostsService postsService;

    @GetMapping("/")
    public String main(){
        return "index";
    }

    @GetMapping("/guest")
    public String guest(Model model) {
        model.addAttribute("posts", postsService.findAllDesc());
        return "guest";
    }
}
