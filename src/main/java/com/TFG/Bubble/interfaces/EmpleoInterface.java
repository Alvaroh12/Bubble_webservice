package com.TFG.Bubble.interfaces;

import java.util.List;
import java.util.Map;

import com.TFG.Bubble.modelo.Empleo;

public interface EmpleoInterface {

	public List<Map<String, Object>>listar();
	public List<Map<String, Object>>listarId(int id);
	public int add(Empleo e);
	public int edit(Empleo e);
	public int delete(int id);
	
}
