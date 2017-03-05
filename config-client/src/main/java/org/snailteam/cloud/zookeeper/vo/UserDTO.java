package org.snailteam.cloud.zookeeper.vo;

import java.io.IOException;
import java.util.Date;

import org.jsoup.Jsoup;

public class UserDTO {
	private Long id;
	private String name;
	private Date birthday;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public static void main(String[] args) throws IOException {
		String body = Jsoup.connect("http://localhost:8888/refresh").ignoreContentType(true).ignoreHttpErrors(true).post().html();
		System.out.println(body);
	}
	
}
