package com.mastek.bankapp_spring.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mastek.bankapp_spring.model.BankAccount;

public class BankAccountDao implements IDao<BankAccount> {
	private JdbcTemplate jdbcTemplate;
	private BankAccountRowMapper rowMapper;

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
//        JdbcTemplate.update(sql_stmt,Object ... args)
		return jdbcTemplate.update(sql, object.getAccNo(), object.getAccName(), object.getBalance()) > 0;
	}

	@Override
	public boolean delete(BankAccount account) {
		final String sql = "delete from bankaccount where accNo=?;";
		return jdbcTemplate.update(sql, account) > 0;
	}

}
