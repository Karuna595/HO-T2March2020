package com.mastek.bankapp_project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import com.mastek.bankapp_project.BankAccount;

public class BankAccountDao implements IDao<BankAccount> {

	@Override
	public Set<BankAccount> findAll() {
		final Set<BankAccount> recordSet = new HashSet<>();
		final String sql = "select * from bankaccount;";
		try (Connection connection = DBConnection.getConnection();
				Statement select = connection.createStatement();
				ResultSet records = select.executeQuery(sql);) {

			while (records.next()) {
				final BankAccount account = new BankAccount(records.getString("accname"), records.getInt("accno"),
						records.getDouble("balance"));
				recordSet.add(account);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return recordSet;

			}

		

	@Override
	public BankAccount findById(long id) {
		BankAccount account = new BankAccount();
		final String sql = "select accno, accname, balance from bankaccount where accno=?;";
		try (
				Connection connection = DBConnection.getConnection();
				PreparedStatement select = connection.prepareStatement(sql);				
				
				) {
			select.setLong(1, id);
			ResultSet records= select.executeQuery();
			if (records.next()) {
				account.setAccNo(records.getInt("accno"));
				account.setAccName(records.getString("accname"));
				account.setBalance(records.getDouble("balance"));
			}else {
				account=null;
				}
			records.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return account;
	}

	@Override
	public boolean add(BankAccount t) {
		boolean status=false;
	
		final String sql="insert into bankaccount(accname,accno,balance) values(?,?,?) ";
		try
		{
			Connection connection = DBConnection.getConnection();
			PreparedStatement pr=connection.prepareStatement(sql);
			pr.setString(1, t.getAccName());
			pr.setLong(2, t.getAccNo());
			pr.setDouble(3, t.getBalance());
			int res=pr.executeUpdate();
			if (res!=0)
			{
				status=true;
			}
			else
			{
				status=false;
			}
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public boolean delete(BankAccount t) {
		final String sql="delete from bankaccount where accno=?;";
		try(Connection connection=DBConnection.getConnection();
			PreparedStatement delete=connection.prepareStatement(sql);
			){
			delete.setInt(1, t.getAccNo());
			int i=delete.executeUpdate();
			if(i>0) {
				return true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public boolean update(long id, BankAccount t) {
		final String sql="update bankaccount "
				+ "set accname=?"
				+ "set balance=?"
				+ "where accno=?;";
		try(Connection connection=DBConnection.getConnection();
			PreparedStatement delete=connection.prepareStatement(sql);
			){
			delete.setString(1, t.getAccName());
			delete.setDouble(2, t.getBalance());
			delete.setInt(3, t.getAccNo());
			
			int i=delete.executeUpdate();
			if(i>0) {
				return true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;	}

}
