package com.cjc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.homerepository.HomeRepository;
import com.cjc.model.Player;
import com.cjc.servicei.ServiceI;
@Service
public class ServiceImpl implements ServiceI {
	@Autowired
	HomeRepository hr;
	@Override
	public void saveData(Player p) {
		hr.save(p);
		
	}

}
