package com.example.comparator.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.comparator.entity.MyJsonDocument;
import com.example.comparator.entity.MyJsonToCompareDocument;
import com.example.comparator.service.BaseJsonService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RestController
public class BaseJsonController {
	
	@Autowired
	private BaseJsonService jsonService;

	@GetMapping("/base-json/{id}")
	public MyJsonDocument getBaseJson(@PathVariable("id") int id) 
	{
		return jsonService.getBaseJson(id);
	}

	@PostMapping("/base-json")
	public int addBaseJson(@RequestBody MyJsonDocument docNode) throws JsonMappingException, JsonProcessingException
	{
		return jsonService.addBaseJson(docNode);
	}
	
	@PutMapping("/base-json")
	public void updateBaseJson(@RequestBody MyJsonDocument docNode)
	{
		jsonService.updateBaseJson(docNode);
	}
	
	@DeleteMapping("/base-json/{id}")
	public void deleteBaseJson(@PathVariable("id") int id)
	{
		jsonService.deleteBaseJson(id);
	}

	@PostMapping("/compare-jsons")
	public Map<String, Object> compareWithBaseJson(@RequestBody MyJsonToCompareDocument jsonToCompare)
	{
		return jsonService.compareWithBaseJson(jsonToCompare.getBaseJsonID(), jsonToCompare.getInputJson());
	}
}
