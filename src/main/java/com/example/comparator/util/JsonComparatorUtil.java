package com.example.comparator.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.example.comparator.entity.MyFieldNode;
import com.example.comparator.entity.MyJsonDocument;
import com.example.comparator.entity.MyJsonNode;
import com.fasterxml.jackson.core.JsonProcessingException;

public class JsonComparatorUtil {

	public static Map<String, Object> getDifferenceBetweenTwoJson(MyJsonDocument docToCheck, MyJsonDocument baseDocument) throws JsonProcessingException {
		Map<String, Object> contentNodeMap = new HashMap<String, Object>();

		if (!docToCheck.getStatus().equals(baseDocument.getStatus())) {
			contentNodeMap.put("status", docToCheck.getStatus());
		}

		if (!docToCheck.getMessages().equals(baseDocument.getMessages())) {
			contentNodeMap.put("messages", docToCheck.getMessages());
		}

		if(docToCheck.getContent().size() != baseDocument.getContent().size())
		{
			for(MyJsonNode docNode : docToCheck.getContent())
			{
				boolean isNodeAvailable = false;
				for(MyJsonNode baseNode : baseDocument.getContent())
				{
					if(docNode.getName().equals(baseNode.getName()))
					{
						isNodeAvailable = true;
						if(docNode.getFields().size() != baseNode.getFields().size())
						{
							Map<String, MyFieldNode> docFieldsMap = docNode.getFields();
							Set<String> baseKeyStrings = baseNode.getFields().keySet();
							for(String keyString : baseKeyStrings)
							{
								docFieldsMap.remove(keyString);
							}
							Map<String, Map<String, MyFieldNode>> fieldNodeToAddMap = new HashMap<>();
							fieldNodeToAddMap.put("fields", docFieldsMap);
							contentNodeMap.put(docNode.getName(), fieldNodeToAddMap);
						}
						break;
					}
				}
				
				if(!isNodeAvailable)
				{
					contentNodeMap.put(docNode.getName(), docNode);
				}
			}
			
		}
		return contentNodeMap;
	}
}
