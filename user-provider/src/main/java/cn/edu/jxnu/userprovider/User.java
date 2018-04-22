package cn.edu.jxnu.userprovider;

import lombok.Data;
import lombok.ToString;

/**
 * @author 梦境迷离
 * @version V1.0
 * @time 018年4月18日
 */
@Data
@ToString
public class User {

	private Integer id;

	private String name;

	public User(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public User() {
		super();
	}
}
