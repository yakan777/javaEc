package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import model.Pract;

public class PractDAO {
	private Connection db;
	private PreparedStatement ps;
	private ResultSet rs;

	private void connect() throws SQLException, NamingException {
		Context context = new InitialContext();
		DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/jsp");
		this.db = ds.getConnection();
	}

	private void disconnect() {
		try {
			if (db != null) {
				db.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Pract> findAll() {
		List<Pract> list = new ArrayList<>();
		try {
			this.connect();
			ps = db.prepareStatement("SELECT * FROM practs");
			rs = ps.executeQuery();
			while(rs.next()) {
				int id= rs.getInt("id");
				String name = rs.getString("name");
				String menu = rs.getString("menu");
				Pract pt = new Pract(id,name,menu);
				list.add(pt);
			}
		} catch (SQLException | NamingException e) {
			e.printStackTrace();
		}finally {
			this.disconnect();
		}
		return list;
	}

	public void insertOne(Pract pract) {
		try {
			this.connect();
			ps=db.prepareStatement
			("INSERT INTO practs(name,menu) VALUES(?,?)");
			ps.setString(1,pract.getName());
			ps.setString(2,pract.getMenu());
			ps.executeUpdate();
		} catch (SQLException | NamingException e) {
			e.printStackTrace();
		}finally {
			this.disconnect();
		}
	}
	public Pract findOne(int id) {
		Pract pract=null;
		try {
			this.connect();
			ps=db.prepareStatement
					("SELECT * FROM practs WHERE id=?");
			ps.setInt(1, id);
			rs=ps.executeQuery();
			if(rs.next()) {
				String name=rs.getString("name");
				String menu=rs.getString("menu");
				pract=new Pract(id,name,menu);

			}
		} catch (SQLException | NamingException e) {
			e.printStackTrace();
		}finally {
			this.disconnect();
		}
		return pract;
	}
	public void UpdateOne(Pract pract) {
		try {
			this.connect();
			ps=db.prepareStatement
					("UPDATE practs SET name=?,menu=? WHERE id=?");
			ps.setString(1, pract.getName());
			ps.setString(2, pract.getMenu());
			ps.setInt(3, pract.getId());
			ps.executeUpdate();
		} catch (SQLException | NamingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}finally {
			this.disconnect();
		}
	}
	public void deleteOne(int id) {
		try {
			this.connect();
			ps=db.prepareStatement
			("DELETE FROM practs WHERE id=?");
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException | NamingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}finally {
			this.disconnect();
		}
	}

}
