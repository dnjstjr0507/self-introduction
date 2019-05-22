package com.springboot.selfintroduction.dto.posts;

import com.springboot.selfintroduction.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

/**
 * Created by dnjstjr0507@gmail.com on 2019. 5. 6.
 * Github : http://github.com/dnjstjr0507
 */

@Getter
public class PostsMainResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;
    private String password;
    private String modifiedDate;

    public PostsMainResponseDto(Posts entity) {
        id = entity.getId();
        title = entity.getTitle();
        content = entity.getContent();
        author = entity.getAuthor();
        password = entity.getPassword();
        modifiedDate = toStringDateTime(entity.getModifiedDate());
    }

    /**
     * Java 8 버전
     */
    private String toStringDateTime(LocalDateTime localDateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return Optional.ofNullable(localDateTime)
                .map(formatter::format)
                .orElse("");
    }

    /**
     * Java 7 버전

    private String toStringDateTimeByJava7(LocalDateTime localDateTime){
        if(localDateTime == null){
            return "";
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return formatter.format(localDateTime);
    }
     */
}
