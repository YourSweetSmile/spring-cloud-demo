/**
 * 
 */
package com.exmp.cloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;

/**
 * @des
 * @author yinjunwu
 * @date 2018年10月31日
 * @version 0.0.1
 */
@Configuration
public class ConfigBean {

	@Bean
	@LoadBalanced  //客户端ribbon负载均衡
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
	
}
