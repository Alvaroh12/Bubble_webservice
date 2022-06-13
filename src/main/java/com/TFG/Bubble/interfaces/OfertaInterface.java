package com.TFG.Bubble.interfaces;

import java.util.List;
import java.util.Map;

import com.TFG.Bubble.modelo.Oferta;

public interface OfertaInterface {

	public List<Map<String, Object>>listar();
	public List<Map<String, Object>>listarId(int id);
	public List<Map<String, Object>>getOfertaUsuario(int id);
	public List<Map<String, Object>>listarCategoria(int id, String categoria);
	public int add(Oferta o);
	public int editDescripcion(String descricion, int id);
	public int delete(int id);
	
	
}
