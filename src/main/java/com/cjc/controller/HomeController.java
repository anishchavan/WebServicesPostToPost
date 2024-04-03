package com.cjc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cjc.model.Player;
import com.cjc.servicei.ServiceI;

@RestController
public class HomeController {
	@Autowired
	RestTemplate rt;
	
	List<List<Player>> list = new ArrayList<>();
	
	@Autowired
	ServiceI si;
	@PostMapping("/postparentdata")
	public List<List<Player>> postConData(@RequestBody Player p){
		String url1 = "http://localhost:5052/postchild1data";
		List <Player> list1 = rt.postForObject(url1, p, List.class);
		String url2 = "http://localhost:5051/postchild2data";
		List <Player> list2 = rt.postForObject(url2, p, List.class);
		si.saveData(p);
		list.add(list1);
		list.add(list2);
		
		return list;
		
	}
}
