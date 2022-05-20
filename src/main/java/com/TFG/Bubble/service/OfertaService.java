package com.TFG.Bubble.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TFG.Bubble.interfaces.OfertaInterface;
import com.TFG.Bubble.modelo.Oferta;
import com.TFG.Bubble.modeloDAO.OfertaDAO;

@Service
public class OfertaService implements OfertaInterface{

	@Autowired
	OfertaDAO dao;
	
	@Override
	public List<Map<String, Object>> listar() {
		return dao.listar();
	}

	@Override
	public List<Map<String, Object>> listarId(int id) {
		return dao.listarId(id);
	}

	@Override
	public int add(Oferta o) {
		return dao.add(o);
	}

	@Override
	public int editDescripcion(String descricion, int id) {
		return dao.editDescripcion(descricion,id);
	}

	@Override
	public int delete(int id) {
		return dao.delete(id);
	}

}
