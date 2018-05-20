package org.spring.importresource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:config.xml") // 引入xml配置文件
public class DriverConfig {
	@Value("${jdbc.url}") // 从配置文件中取值
	private String url;

	@Value("${jdbc.username}")
	private String username;

	@Value("${jdbc.password}")
	private String password;

	@Bean
	public DriverManage myDriver() {

		return new DriverManage(url, username, password);

	}
}
