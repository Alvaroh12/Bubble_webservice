package com.TFG.Bubble.modeloDAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.TFG.Bubble.interfaces.CategoriaInterface;

@Repository
public class CategoriaDAO implements CategoriaInterface{
	
	@Autowired
	JdbcTemplate template;

	@Override
	public List<Map<String, Object>> listar() {
		List<Map<String, Object>> list = template.queryForList("select * from categoria");
		return list;
	}

	@Override
	public List<Map<String, Object>> listarByCategoria(String categoria) {
		List<Map<String, Object>> list = template.queryForList("select * from categoria where categoria=?", categoria);
		return list;
	}

}
