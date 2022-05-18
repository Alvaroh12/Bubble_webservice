package com.TFG.Bubble.interfaces;

import java.util.List;
import java.util.Map;

import com.TFG.Bubble.modelo.Usuario;

public interface UsuarioInterface {

	public List<Map<String, Object>>listar();
	public List<Map<String, Object>>listarId(int id);
	public int add(Usuario u);
	public int edit(Usuario u);
	public int delete(int id);
	
}
