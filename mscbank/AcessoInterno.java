package mscbank;

public interface AcessoInterno {

	public void autenticarSistema(String usuario, String senha);
	public void alterarUsuario(String userAntigo, String userNovo);
	public void alterarSenha(String antigaSenha, String novaSenha);
}
