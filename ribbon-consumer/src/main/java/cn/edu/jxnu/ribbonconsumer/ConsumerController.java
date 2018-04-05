package cn.edu.jxnu.ribbonconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 梦境迷离
 * @description
 * @time 2018年4月5日
 */

@RestController
public class ConsumerController {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
	public String helloConsumer() {
		logger.info("返回。。。。");
		return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();// 404
	}
}
