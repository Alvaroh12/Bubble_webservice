package com.TFG.Bubble.modeloDAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.TFG.Bubble.interfaces.UsuarioInterface;
import com.TFG.Bubble.modelo.Usuario;


@Repository
public class UsuarioDAO implements UsuarioInterface {

	@Autowired
	JdbcTemplate template;

	@Override
	public List<Map<String, Object>> listar() {
		List<Map<String, Object>> list = template.queryForList("select * from usuario");
		return list;
	}

	@Override
	public List<Map<String, Object>> listarId(int id) {

		return null;
	}

	@Override
	public int add(Usuario u) {
		String sql = "insert into usuario(nombre,correo,password)values(?,?,?)";
		return template.update(sql, u.getNombre(), u.getCorreo(), u.getPassword());
	}

	@Override
	public int editNombre(Usuario u) {
		String sql="update usuario set nombre=? where id_usuario=?";		
		return template.update(sql,u.getNombre(),u.getId_usuario());
	}

	@Override
	public int delete(int id) {
		String sql="delete from usuario where id_usuario=?";
		return template.update(sql,id);
	}
	
}
