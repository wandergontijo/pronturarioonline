package protuarioonline;

public class Usuario {
	int Codigo;
	String Nome;
	String Senha;
	
	boolean Login(String Nome, String Senha){
		
	 return (Nome =="admin") && (Senha=="123456");
		
	}
	

}
