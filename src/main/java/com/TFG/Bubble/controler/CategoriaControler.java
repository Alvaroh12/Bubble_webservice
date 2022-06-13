package com.TFG.Bubble.controler;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TFG.Bubble.service.CategoriaService;

@RestController
@RequestMapping("categoria")
public class CategoriaControler {
	
	@Autowired
	private CategoriaService service;
	
	@GetMapping("/listar")
	public List<Map<String, Object>> listar() {
		return service.listar();
	}
	
	@GetMapping("/listar/{categoria}")
	public List<Map<String, Object>> listarId(@PathVariable String categoria) {
		return service.listarByCategoria(categoria);
	}

}
