package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.mainMapper;

@Service
public class mainService {
	
	@Autowired
	private mainMapper mapper;

	public List<Map<String, Object>> getEmpInfo(Map<String, String> param) {
		// TODO Auto-generated method stub
		return mapper.getUserInfo(param);
	}

}
