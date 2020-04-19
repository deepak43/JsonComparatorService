package com.example.comparator.util;

import java.util.HashSet;
import java.util.Set;

import com.example.comparator.entity.MyJsonDocument;
import com.example.comparator.entity.MyJsonNode;

public class JsonComparatorUtil {
	
	public static MyJsonDocument getDifferenceBetweenTwoJson(MyJsonDocument docToCheck, MyJsonDocument baseDocument) {
		MyJsonDocument returnJsonNodeDocument = null;
		if(!docToCheck.getStatus().equals(baseDocument.getStatus()))
		{
			//To DO: Add diff to returnJsonNodeDocument 
			System.out.println(docToCheck.getStatus() + "<---->" + baseDocument.getStatus());
		}
		if(!docToCheck.getMessages().equals(baseDocument.getMessages()))
		{
			//To DO: Add diff to returnJsonNodeDocument 
			System.out.println(docToCheck.getMessages()+ "<---->" + baseDocument.getMessages());
		}
		if(!docToCheck.getContent().equals(baseDocument.getContent()))
		{
			if(docToCheck.getContent().size() != baseDocument.getContent().size())
			{
				/*System.out.println(docToCheck.getContent().size()+ "<---->" + baseDocument.getContent().size());
				System.out.println(docToCheck.getContent());
				System.out.println(baseDocument.getContent());*/
				
				Set<MyJsonNode> docSet = new HashSet<MyJsonNode>(docToCheck.getContent());
				Set<MyJsonNode> baseSet = new HashSet<MyJsonNode>(baseDocument.getContent());
				docSet.removeAll(baseSet);

				//System.out.println("ad -> " + docSet);
			}
		}
		return returnJsonNodeDocument;
	}
}
