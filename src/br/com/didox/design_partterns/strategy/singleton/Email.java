package br.com.didox.design_partterns.strategy.singleton;

public class Email {
	private Email(String _emailDe, String _host, String _usuario, String _senha) {
		this.emailDe = _emailDe;
		this.host = _host;
		this.usuario = _usuario;
		this.senha = _senha;
	}
	
	private static Email email;
	private String emailDe;
	private String host;
	private String usuario;
	private String senha;
	
	public static void configurar(String _emailDe, String _host, String _usuario, String _senha) {
		if(email == null) email = new Email(_emailDe, _host, _usuario, _senha);
	}
	
	public static Email configurado() throws Exception {
		verificaEmailConfigurado();
		return email;
	}
	
	private static void verificaEmailConfigurado() throws Exception {
		if(email == null) throw new Exception("Email não configurado");
	}
	
	public void enviar(String para, String titulo, String corpo) throws Exception {
		verificaEmailConfigurado();
		
		System.out.println("Enviando email configurado com:");
		System.out.println("Host:" + this.host);
		System.out.println("Usuario:" + this.usuario);
		System.out.println("Senha" + this.senha);
		
		System.out.println("Email de:" + this.emailDe);
		System.out.println("Email para:" + para);
		System.out.println("Email titulo:" + titulo);
		System.out.println("Email corpo:" + corpo);
	}
}