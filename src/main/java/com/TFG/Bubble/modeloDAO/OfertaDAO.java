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
		List<Map<String, Object>> list = template.queryForList("select * from oferta where id_oferta=?", id);
		return list;
	}
	
	@Override
	public int add(Oferta o) {
		String sql = "insert into oferta(tipo_oferta,descripcion,precio, id_usuario)values(?,?,?,?)";
		return template.update(sql, o.getTipo_oferta(), o.getDescripcion(), o.getPrecio(), o.getId_usuario());
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
