package be.intec.frituurfrida.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import be.intec.frituurfrida.interfaces.MainDaoInterface;
import be.intec.frituurfrida.model.Usuarios;

public class UserDao extends MainDbConection implements
		MainDaoInterface<Usuarios> {
	private int idGerado;
	private Usuarios user;

	@Override
	public void add(Usuarios obj) {
		String query = "INSERT INTO login (email, passwords)VALUES (?,?)";
		String query2 = "INSERT INTO usuario (nome, end, tel, email,fk_login )VALUES (?,?,?,?,?)";
	
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(
						query, Statement.RETURN_GENERATED_KEYS);
				PreparedStatement statement2 = connection
						.prepareStatement(query2);) {
			ResultSet rs = null;
			statement.setString(1, obj.getEmail());
			statement.setString(2, obj.getSenha());

			int result = statement.executeUpdate();
			rs = statement.getGeneratedKeys();
			while (rs.next()) {
				idGerado = rs.getInt(1);
			}

			obj.setId(idGerado);

			statement2.setString(1, obj.getNome());
			statement2.setString(2, obj.getEndereco());
			statement2.setString(3, obj.getTel());
			statement2.setString(4, obj.getEmail());
			statement2.setInt(5, obj.getId());

			int result2 = statement2.executeUpdate();
			if ((result == 0) || (result2 == 0)) {
				System.out.println("Order niet toegevoedg   ");
			} else {
				System.out.println("Order toegevoedg    " + obj.getId());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	@Override
	public void update(Usuarios obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Usuarios> show() {
		List<Usuarios> list = new ArrayList<>();
		String query = "Select * From USUARIO ";
		
		return list;
	}

	@Override
	public void delete(Usuarios obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object getItem(Usuarios obj) {
		String query = "Select * From USUARIO ";
		
		
		
		return null;
	}

}
