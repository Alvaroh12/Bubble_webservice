package com.TFG.Bubble.modeloDAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.TFG.Bubble.interfaces.OfertaInterface;
import com.TFG.Bubble.modelo.Oferta;


@Repository
public class OfertaDAO implements OfertaInterface{

	@Autowired
	JdbcTemplate template;

	@Override
	public List<Map<String, Object>> listar() {
		List<Map<String, Object>> list = template.queryForList("select * from oferta");
		return list;
	}

	@Override
	public List<Map<String, Object>> listarId(int id) {
		List<Map<String, Object>> list = template.queryForList("select * from oferta where id_usuario!=?", id);
		return list;
	}
	
	// Acceder a oferta ???
	@Override
	public List<Map<String, Object>> listarCategoria(int id, String categoria) {
		List<Map<String, Object>> list = template.queryForList("SELECT tipo_oferta, c.categoria, precio, nombre FROM oferta o\r\n"
				+ "inner join usuario on o.id_usuario=usuario.id_usuario \r\n"
				+ "inner join categoria c on o.categoria = c.id_categoria\r\n"
				+ "where o.id_usuario!=? and c.categoria=?", id, categoria);
		return list;
	}
	
	@Override
	public List<Map<String, Object>> getOfertaUsuario(int id) {
		List<Map<String, Object>> list = template.queryForList("SELECT o.id_oferta, tipo_oferta, c.categoria, precio, nombre, o.descripcion, correo, o.id_usuario FROM oferta o\r\n"
				+ "inner join usuario on o.id_usuario = usuario.id_usuario\r\n"
				+ "inner join categoria c on o.categoria = c.id_categoria\r\n"
				+ "where o.id_usuario!=?", id);
		return list;
	}
	
	@Override
	public int add(Oferta o) {
		String sql = "insert into oferta(tipo_oferta,descripcion,precio, id_usuario, categoria)values(?,?,?,?,?)";
		return template.update(sql, o.getTipo_oferta(), o.getDescripcion(), o.getPrecio(), o.getId_usuario(), o.getCategoria());
	}

	@Override
	public int editDescripcion(String descricion, int id) {
		String sql="update oferta set descripcion=? where id_oferta=?";		
		return template.update(sql,descricion, id);
	}

	@Override
	public int delete(int id) {
		String sql="delete from oferta where id_oferta=?";
		return template.update(sql,id);
	}    

	}
	
	

