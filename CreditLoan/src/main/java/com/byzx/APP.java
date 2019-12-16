package com.byzx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication

//@EnableScheduling
@MapperScan(basePackages = { "com.byzx.dao" })
public class APP {

	/**
	 * @方法名: main
	 * @方法说明: 
	 * @作者: LiuChunHui
	 * @邮箱：508499598@qq.com
	 * @日期: 2019年11月28日下午7:14:54
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		SpringApplication.run(APP.class, args);
	}
}
