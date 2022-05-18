package com.TFG.Bubble.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TFG.Bubble.interfaces.EmpleoInterface;
import com.TFG.Bubble.modelo.Empleo;
import com.TFG.Bubble.modeloDAO.EmpleoDAO;

@Service
public class EmpleoService implements EmpleoInterface{

	@Autowired
	EmpleoDAO dao;
	
	@Override
	public List<Map<String, Object>> listar() {
		return dao.listar();
	}

	@Override
	public List<Map<String, Object>> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Empleo e) {
		return dao.add(e);
	}

	@Override
	public int edit(Empleo e) {
		return dao.edit(e);
	}

	@Override
	public int delete(int id) {
		return dao.delete(id);
	}

}