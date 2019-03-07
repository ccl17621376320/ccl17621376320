package com.demo.springboot.config;

import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@MapperScan("com.demo.springboot.mapper") //或者直接在Mapper类上面添加注解@Mapper,建议使用前者，不然每个mapper加个注解也挺麻烦的
public class DBConfig {

	/**
	 * durid 配置访问『ip白名单』『ip黑名单』『登录账号密码』
	 * @return
	 */
	@Bean
	public ServletRegistrationBean<StatViewServlet> druidStatViewServlet() {
		ServletRegistrationBean<StatViewServlet> registrationBean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
		registrationBean.addInitParameter("allow", "127.0.0.1");// IP白名单 (没有配置或者为空，则允许所有访问)
		registrationBean.addInitParameter("deny", "");// IP黑名单 (存在共同时，deny优先于allow)
		registrationBean.addInitParameter("loginUsername", "root");
		registrationBean.addInitParameter("loginPassword", "1234");
		registrationBean.addInitParameter("resetEnable", "false");
		return registrationBean;
	}
}
