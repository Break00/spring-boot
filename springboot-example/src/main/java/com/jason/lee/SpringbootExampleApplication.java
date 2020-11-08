package com.jason.lee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

// 导入Spring配置文件,使配置文件生效
@ImportResource(locations = {"classpath:spring-context.xml"})
@SpringBootApplication
/**
 * @Author Lee
 */
public class SpringbootExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootExampleApplication.class, args);
	}

}
