package be.intec.frituurfrida.persistence;

import be.intec.frituurfrida.model.Usuarios;

public class testemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		UserDao dao = new UserDao();
				Usuarios u =new Usuarios();
				u.setEmail("jonasleao@gmail.com");
				u.setEndereco("rua almeida reis 142");
				u.setNome("jonas silva");
				u.setSenha("123456789");
				u.setTel("32731650");
				dao.add(u);
		
	}

}
