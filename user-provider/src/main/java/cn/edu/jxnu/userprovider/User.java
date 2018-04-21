<<<<<<< HEAD
package cn.edu.jxnu.userprovider;

import lombok.Data;
import lombok.ToString;

/**
 * @author 梦境迷离
 * @version V1.0 
 * @time. 2018年4月18日
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
=======
package cn.edu.jxnu.userprovider;

import lombok.Data;
import lombok.ToString;

/**
 * @author 梦境迷离
 * @version V1.0 
 * @time. 2018年4月18日
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
>>>>>>> d46f2d713ed86d5411620a5faa41f5fb430f7a0b
