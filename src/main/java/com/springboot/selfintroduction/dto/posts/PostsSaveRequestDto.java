package com.springboot.selfintroduction.dto.posts;

import com.springboot.selfintroduction.domain.posts.Posts;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by dnjstjr0507@gmail.com on 2019. 5. 6.
 * Github : http://github.com/dnjstjr0507
 */

@Getter
@Setter
@NoArgsConstructor
public class PostsSaveRequestDto {

    private String title;
    private String content;
    private String password;
    private String author;

    public Posts toEntity(){
        return Posts.builder()
                .title(title)
                .content(content)
                .password(password)
                .author(author)
                .build();
    }
}
