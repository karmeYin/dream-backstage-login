package com.orginaldream.backstage.login.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
  @PostMapping("/{user}")
  public Map<String,String> login(@PathVariable String user){
    HashMap<String, String> stringStringHashMap = new HashMap<>();
    stringStringHashMap.put("loginservice","success");
    return  stringStringHashMap;
  }

}
