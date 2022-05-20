package com.TFG.Bubble.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TFG.Bubble.interfaces.UsuarioInterface;
import com.TFG.Bubble.modelo.Usuario;
import com.TFG.Bubble.modeloDAO.UsuarioDAO;

@Service
public class UsuarioService implements UsuarioInterface{

	@Autowired
	UsuarioDAO dao;
	
	@Override
	public List<Map<String, Object>> listar() {
		return dao.listar();
	}

	@Override
	public List<Map<String, Object>> listarId(int id) {
		return dao.listarId(id);
	}

	@Override
	public int add(Usuario u) {
		return dao.add(u);
	}

	@Override
	public int editNombre(Usuario u) {
		return dao.editNombre(u);
	}

	@Override
	public int delete(int id) {
		return dao.delete(id);
	}

}
