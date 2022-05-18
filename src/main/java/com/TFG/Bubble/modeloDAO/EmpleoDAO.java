package com.TFG.Bubble.modeloDAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.TFG.Bubble.interfaces.EmpleoInterface;
import com.TFG.Bubble.modelo.Empleo;

@Repository
public class EmpleoDAO implements EmpleoInterface{

	@Autowired
	JdbcTemplate template;

	@Override
	public List<Map<String, Object>> listar() {
		List<Map<String, Object>> list = template.queryForList("select * from empleo");
		return list;
	}

	@Override
	public List<Map<String, Object>> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Empleo e) {
		String sql = "insert into empleo(isAceptado,isCancelado,id_oferta,id_usuario_comprador,id_usuario_oferente)values(?,?,?,?,?)";
		return template.update(sql, e.getIsAceptado(), e.getIsCancelado(), e.getId_oferta(), e.getId_usuario_comprador(), e.getId_usuario_oferente());
	}

	@Override
	public int edit(Empleo e) {
		String sql="update empleo set isAceptado=?, isCancelado=? where id=?";	
		return template.update(sql,e.getIsAceptado(),e.getIsCancelado());
	}

	@Override
	public int delete(int id) {
		String sql="delete from empleo where id=?";
		return template.update(sql,id);
	}

}
