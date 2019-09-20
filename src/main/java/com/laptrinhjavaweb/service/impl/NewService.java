package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.laptrinhjavaweb.entity.NewEntity;
import com.laptrinhjavaweb.model.NewModel;
import com.laptrinhjavaweb.repository.NewRepository;
import com.laptrinhjavaweb.service.INewService;

@Service
public class NewService implements INewService {
	
	@Autowired
	private NewRepository newRepository;
	
	@Override
	public List<NewModel> findAll() {
		List<NewModel> models = new ArrayList<>();
		List<NewEntity> entities = newRepository.findAll();
		for (NewEntity item: entities) {
			NewModel newModel = new NewModel();
			newModel.setTitle(item.getTitle());
			newModel.setShortDescription(item.getShortDescription());
			models.add(newModel);
		}
		return models;
	}
}
