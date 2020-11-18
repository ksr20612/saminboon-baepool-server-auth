package com.example.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface mainMapper {

	List<Map<String, Object>> getUserInfo(Map<String, String> param);

}
