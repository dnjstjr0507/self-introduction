package com.springboot.selfintroduction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Created by dnjstjr0507@gmail.com on 2019. 5. 6.
 * Github : http://github.com/dnjstjr0507
 */

@EnableJpaAuditing // JPA Auditing 활성화
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
