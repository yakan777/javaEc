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

import model.Mutter;

public class MutterDAO {
	private Connection db;
	private PreparedStatement ps;
	private ResultSet rs;

	private void connect() throws NamingException, SQLException {
		Context context = new InitialContext();
		DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/jsp");
		this.db = ds.getConnection();
	}

	private void disconnect() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (db != null) {
				db.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Mutter> findAll() {
		List<Mutter> mutterList = new ArrayList<>();

		try {
			this.connect();
			String sql = "SELECT ID,NAME,TEXT FROM MUTTER ORDER BY ID DESC";
			System.out.println("try1");
			ps = db.prepareStatement(sql);
			System.out.println("try2");
			rs = ps.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String userName = rs.getString("NAME");
				String text = rs.getString("TEXT");
				Mutter mutter = new Mutter(id, userName, text);
				mutterList.add(mutter);
			}

		} catch (NamingException | SQLException e) {
			System.out.println("catch");
			e.printStackTrace();
		} finally {
			this.disconnect();
		}
		return mutterList;

	}

	public boolean create(Mutter mutter) {
		try  {
			this.connect();
			String sql = "INSERT INTO MUTTER(NAME,TEXT) VALUES(?,?)";
			ps=db.prepareStatement(sql);
			ps.setString(1, mutter.getUserName());
			ps.setString(2, mutter.getText());

			int result = ps.executeUpdate();
			if (result != 1) {
				return false;
			}
		} catch (NamingException | SQLException e) {
			e.printStackTrace();

			return false;
		}finally {
			this.disconnect();
		}
		return true;
	}
}
