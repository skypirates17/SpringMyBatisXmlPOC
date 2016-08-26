package com.poc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.poc.model.User;
@Repository
public interface UserMapper {
	
	public int insert(User user);
	public List<User> fetch(User user);
	public int delete(User user);
	public int update(User user);
}
