package com.example.comparator.service;

import java.util.Map;

import com.example.comparator.entity.MyJsonDocument;

public interface BaseJsonService {
	public int addBaseJson(MyJsonDocument docNode);
	public MyJsonDocument getBaseJson(int id);
	public void updateBaseJson(MyJsonDocument docNode);
	public void deleteBaseJson(int id);
	public Map<String, Object> compareWithBaseJson(int baseDocumentId, MyJsonDocument docToCheck);
}
