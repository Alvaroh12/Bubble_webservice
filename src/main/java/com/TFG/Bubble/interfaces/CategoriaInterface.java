package com.TFG.Bubble.interfaces;

import java.util.List;
import java.util.Map;

public interface CategoriaInterface {

	public List<Map<String, Object>>listar();
	public List<Map<String, Object>>listarByCategoria(String categoria);
	
}
