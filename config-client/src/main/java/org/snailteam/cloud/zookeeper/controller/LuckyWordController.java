
package org.snailteam.cloud.zookeeper.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RefreshScope
@ConfigurationProperties(prefix = "info")
public class LuckyWordController {

  @Value("${info.description}")String description;
  @RequestMapping("/lucky-word")
  public String showLuckyWord() {
    return "The lucky word is: " + description;
  }
	 public String getDescription() {
		return description;
	}
  public void setDescription(String description){
	  this.description  = description;
  }
}