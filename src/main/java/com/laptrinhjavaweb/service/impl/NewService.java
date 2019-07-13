package com.laptrinhjavaweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.dao.INewDAO;
import com.laptrinhjavaweb.model.NewModel;
import com.laptrinhjavaweb.service.INewService;

@Service
public class NewService implements INewService {
	
	@Autowired
	private INewDAO newDao;
	
	@Override
	public List<NewModel> findAll() {
		return newDao.findAll();
	}
}
