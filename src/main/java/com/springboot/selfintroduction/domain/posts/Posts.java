package com.springboot.selfintroduction.domain.posts;

import com.springboot.selfintroduction.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by dnjstjr0507@gmail.com on 2019. 5. 6.
 * Github : http://github.com/dnjstjr0507
 */

@NoArgsConstructor(access = AccessLevel.PROTECTED) // 기본생성자 자동추가 // (기본생성자의 접근권한을 protected로 제한)
@Getter
@Entity // Table과 링크될 클래스임을 나타냄
public class Posts extends BaseTimeEntity {

    @Id // 해당테이블의 PK 필드를 나타냄
    @GeneratedValue // PK 의 생성 규칙을 나타냄 기본값은 AUTO, MySQL의 auto_increment와 같이 자동증가 하는 정수형 값이 된다.
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @Column(length = 200, nullable = false)
    private String password;

    private String author;

    @Builder
    public Posts(String title, String content, String password, String author) {
        this.title = title;
        this.content = content;
        this.password = password;
        this.author = author;
    }
}
