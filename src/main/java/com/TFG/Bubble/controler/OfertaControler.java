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

import com.TFG.Bubble.modelo.Oferta;
import com.TFG.Bubble.modelo.Usuario;
import com.TFG.Bubble.service.OfertaService;
import com.TFG.Bubble.service.UsuarioService;

@RestController
@RequestMapping("oferta")
public class OfertaControler {

	@Autowired
	private OfertaService service;
	
	@GetMapping("/listar")
	public List<Map<String, Object>> listar() {
		return service.listar();
	}
	
	@GetMapping("/listar/{id}")
	public List<Map<String, Object>> listarId(@PathVariable int id) {
		return service.listarId(id);
	}
	
	@GetMapping("/listar/{id}/{categoria}")
	public List<Map<String, Object>> listarCategoria(@PathVariable int id, @PathVariable String categoria) {
		return service.listarCategoria(id, categoria);
	}
	
	@GetMapping("/listarOU/{id}")
	public List<Map<String, Object>> getOfertaUsuario(@PathVariable int id) {
		return service.getOfertaUsuario(id);
	}	
	
	@GetMapping("/listarMOU/{id}")
	public List<Map<String, Object>> getMisOfertaUsuario(@PathVariable int id) {
		return service.getMisOfertaUsuario(id);
	}	
	
	@GetMapping("/listarOUE/{id}")
	public List<Map<String, Object>> getOfertaUsuarioEmpleo(@PathVariable int id) {
		return service.getOfertaUsuarioEmpleo(id);
	}	
	
	@GetMapping("/listarOUEM/{id}")
	public List<Map<String, Object>> getOfertaUsuarioEmpleoMe(@PathVariable int id) {
		return service.getOfertaUsuarioEmpleoMe(id);
	}
	
	@PostMapping("/agregar")
	public String save(@RequestBody Oferta oferta) {
		int id=service.add(oferta);
		if(id==0) {
			return "No se pudo Regsitrar!";
		}
		return "Se registr?? con ??xito!";
	}
	
	@PostMapping("/actualizar/{id}")
	public String save(@RequestBody String descripcion,@PathVariable int id) {
		int r=service.editDescripcion(descripcion, id);
		if(r==0) {
			return "No se pudo Actualizar!";
		}
		return "Se actualiz?? con ??xito!";
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
