package com.TFG.Bubble.controler;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TFG.Bubble.modelo.Empleo;
import com.TFG.Bubble.modelo.Oferta;
import com.TFG.Bubble.service.EmpleoService;
import com.TFG.Bubble.service.OfertaService;

@RestController
@RequestMapping("empleo")
public class EmpleoControler {

	@Autowired
	private EmpleoService service;
	
	@GetMapping("/listar")
	public List<Map<String, Object>> listar() {
		return service.listar();
	}
	
	@GetMapping("/listar/{id}")
	public List<Map<String, Object>> listarId(@PathVariable int id) {
		return service.listarId(id);
	}
	
	
	@PostMapping("/agregar")
	public String save(@RequestBody Empleo empleo) {
		int id=service.add(empleo);
		if(id==0) {
			return "No se pudo Regsitrar!";
		}
		return "Se registró con éxito!";
	}
	
	@PostMapping("/actualizar/{id}")
	public String save(@RequestBody Empleo empleo, @PathVariable int id) {
		int r=service.editAceptacion(empleo, id);
		if(r==0) {
			return "No se pudo Actualizar!";
		}
		return "Se actualizó con éxito!";
	}
	
	@DeleteMapping("/eliminar/{id}")
	public String delete(@PathVariable int id,Model model) {
		int r=service.delete(id);
		if(r==0) {
			return "Registro No Eliminado!";
		}
		return "Registro Eliminado!";
	}
	
}
