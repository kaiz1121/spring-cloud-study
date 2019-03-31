package com.kaiz.product_order;

import com.kaiz.product_order.utils.SimpleBaseRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author kaiz
 * @date 16:55 2019/3/31.
 */
@EnableEurekaClient
@SpringBootApplication(scanBasePackages={"com.kaiz.product_order"})
@EntityScan(basePackages={"com.kaiz.product_order"})
@EnableJpaRepositories(basePackages = {"com.kaiz.product_order"},repositoryBaseClass = SimpleBaseRepository.class)
public class ProductOrderApplication {

    //方式一 --restTemplate
//    @Bean(value = "restTemplate")
//    RestTemplate restTemplate() {
//        return new RestTemplate();
//    }
    @Bean
    @LoadBalanced
    RestOperations restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
    public static void main(String[] args) {
        SpringApplication.run(ProductOrderApplication.class, args);
    }


}

