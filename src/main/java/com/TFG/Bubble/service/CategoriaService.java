package com.TFG.Bubble.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TFG.Bubble.interfaces.CategoriaInterface;
import com.TFG.Bubble.modeloDAO.CategoriaDAO;

@Service
public class CategoriaService implements CategoriaInterface{
	
	@Autowired
	CategoriaDAO dao;

	@Override
	public List<Map<String, Object>> listar() {
		return dao.listar();
	}

	@Override
	public List<Map<String, Object>> listarByCategoria(String categoria) {
		return dao.listarByCategoria(categoria);
	}
	

}
