package com.example.comparator.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.comparator.entity.MyJsonDocument;

public interface MyJsonDocumentRepository extends JpaRepository<MyJsonDocument, Integer> {

}
