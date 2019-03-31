package com.kaiz.product;

import com.kaiz.product.utils.SimpleBaseRepository;
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
 * @date 17:28 2019/3/30.
 */
@EnableEurekaClient
@SpringBootApplication(scanBasePackages={"com.kaiz.product"})
@EntityScan(basePackages={"com.kaiz.product"})
@EnableJpaRepositories(basePackages = {"com.kaiz.product"},repositoryBaseClass = SimpleBaseRepository.class)
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }

}
