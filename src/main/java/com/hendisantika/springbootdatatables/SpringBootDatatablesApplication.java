package com.hendisantika.springbootdatatables;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.datatables.repository.DataTablesRepositoryFactoryBean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(repositoryFactoryBeanClass = DataTablesRepositoryFactoryBean.class)
public class SpringBootDatatablesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDatatablesApplication.class, args);
    }
}
