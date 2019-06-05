package com.br.soctest.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.spring.guides.gs_producing_web_service.Exame;

@Repository
public class ExameRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional
	public List<Exame> getExames(Exame exame) {
		String query = "SELECT id, nome, resultado FROM exame";
		if (exame != null && exame.getId() != null) {
			query = "SELECT id, nome, resultado FROM exame where id = " + exame.getId();
		}
		return jdbcTemplate.query(query,
				(rs, rowNum) -> new Exame(rs.getString("id"), rs.getString("nome"), rs.getString("resultado")));
	}
}
