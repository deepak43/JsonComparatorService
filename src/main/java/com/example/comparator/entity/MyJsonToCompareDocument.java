package com.example.comparator.entity;

public class MyJsonToCompareDocument {

	private int baseJsonID;
	private MyJsonDocument inputJson;

	public MyJsonToCompareDocument() {
	}

	public int getBaseJsonID() {
		return baseJsonID;
	}

	public void setBaseJsonID(int baseJsonID) {
		this.baseJsonID = baseJsonID;
	}

	public MyJsonDocument getInputJson() {
		return inputJson;
	}

	public void setInputJson(MyJsonDocument inputJson) {
		this.inputJson = inputJson;
	}
}
