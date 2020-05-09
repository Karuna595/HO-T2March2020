package com.mastek.app.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.mastek.app.model.BankAccount;

@Component
public class BankAccountDao implements IDao<BankAccount> {

	private JdbcTemplate jdbcTemplate;
	@Autowired
	private BankAccountRowMapper rowMapper;


	@Autowired
	public BankAccountDao(DataSource dataSource) {
		super();
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.rowMapper = new BankAccountRowMapper();
	}

	public BankAccountDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<BankAccount> findAll() {
		final String sql = "select accNo,accName,balance from bankaccount;";
		return jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public BankAccount findById(long id) {
		final String sql = "select accNo,accName,balance from bankaccount where accNo=?;";
		return jdbcTemplate.queryForObject(sql, new Object[] { id }, new BankAccountRowMapper());
	}

	@Override
	public boolean save(BankAccount object) {
		final String sql = "insert into bankaccount (accNo,accName,balance) values(?,?,?);";
//		JdbcTemplate.update(sql_stmt,Object ... args)
		return jdbcTemplate.update(sql, object.getAccNo(), object.getAccName(), object.getBalance()) > 0;
	}

	@Override
	public boolean delete(long id) {
		final String sql = "delete from bankaccount where accNo=?;";
		return jdbcTemplate.update(sql, id) > 0;
	}

}