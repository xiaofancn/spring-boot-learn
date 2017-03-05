package org.snailteam.cloud.zookeeper;

import java.io.IOException;

import org.jsoup.Jsoup;

public class ClientRefresh {
	public static void main(String[] args) throws IOException {
		String body = Jsoup.connect("http://localhost:8080/refresh").timeout(1000*10).ignoreContentType(true).ignoreHttpErrors(true).post().html();
		System.out.println(body);
	}
}
