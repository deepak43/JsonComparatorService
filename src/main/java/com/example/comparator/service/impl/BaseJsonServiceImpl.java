package com.example.comparator.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.comparator.dao.MyJsonDocumentRepository;
import com.example.comparator.entity.MyJsonDocument;
import com.example.comparator.service.BaseJsonService;
import com.example.comparator.util.JsonComparatorUtil;

@Service
public class BaseJsonServiceImpl implements BaseJsonService {

	@Autowired
	private MyJsonDocumentRepository jsonDocRepo;

	@Override
	public int addBaseJson(MyJsonDocument docNode) {
		MyJsonDocument addedDocNode = jsonDocRepo.save(docNode);
		return addedDocNode.getId();
	}

	@Override
	public MyJsonDocument getBaseJson(int id) {
		Optional<MyJsonDocument> result = jsonDocRepo.findById(id);
		
		MyJsonDocument theDocument = null;
		
		if (result.isPresent()) {
			theDocument = result.get();
		}
		else {
			throw new RuntimeException("Did not find document with id - " + id);
		}
		
		return theDocument;
	}

	@Override
	public void updateBaseJson(MyJsonDocument docNode) {

		jsonDocRepo.save(docNode);
	}

	@Override
	public void deleteBaseJson(int id) {
		jsonDocRepo.deleteById(id);
	}

	@Override
	public MyJsonDocument compareWithBaseJson(MyJsonDocument docToCheck) {
		MyJsonDocument baseDocument = getBaseJson(1);
		try 
		{
			if(!(docToCheck.equals(baseDocument)))
			{
				return JsonComparatorUtil.getDifferenceBetweenTwoJson(docToCheck, baseDocument);
			}
		}
		catch(Exception ex)
		{
			
		}
		return null;
	}
}
