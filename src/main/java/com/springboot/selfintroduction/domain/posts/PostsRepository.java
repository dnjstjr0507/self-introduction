package com.springboot.selfintroduction.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
    // Mybatis,ibatis 에서는 DAO 의 역할과 같은 DB Layer 접근자 JpaRepository<Entity클래스, PK타입>를 상속하면 기본적인 CRUD 메소드가 자동생성
}
