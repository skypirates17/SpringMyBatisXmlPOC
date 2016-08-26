package com.poc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.dao.UserMapper;
import com.poc.dto.DataTransferObject;
import com.poc.model.User;
import com.poc.service.UserService;

/**
 * service for accessing dao objects
 * @author joliveros
 *
 */
@Service
public class UserServiceImpl extends BaseService implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	/**
	 * inserts data to database and the object is carried by data transfer object
	 */
	@Override
	public boolean insert(DataTransferObject dto) {
		// TODO Auto-generated method stub
		return resultChecker(userMapper.insert(dto.getUser()));
	}

	/**
	 * returns DTO that carries the fetched object from database
	 */
	@Override
	public DataTransferObject fetch(DataTransferObject dto) {
		// TODO Auto-generated method stub
		DataTransferObject returnDTO = new DataTransferObject();
		List<User> user = userMapper.fetch(dto.getUser());
		returnDTO.setListUser(user);
		return returnDTO;
	}

	/**
	 * deletes data to database and the object is carried by data transfer object
	 */
	@Override
	public boolean delete(DataTransferObject dto) {
		// TODO Auto-generated method stub
		return resultChecker(userMapper.delete(dto.getUser()));
	}

	/**
	 * update data to database and the object is carried by data transfer object
	 */
	@Override
	public boolean update(DataTransferObject dto) {
		// TODO Auto-generated method stub
		return resultChecker(userMapper.update(dto.getUser()));
	}

}
