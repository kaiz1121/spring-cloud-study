package com.kaiz.user;

import com.kaiz.user.utils.SimpleBaseRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author kaiz
 * @date 17:20 2019/3/30.
 */
@EnableEurekaClient
@SpringBootApplication(scanBasePackages={"com.kaiz.user"})
@EntityScan(basePackages={"com.kaiz.user"})
@EnableJpaRepositories(basePackages = {"com.kaiz.user"},repositoryBaseClass = SimpleBaseRepository.class)
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

}
