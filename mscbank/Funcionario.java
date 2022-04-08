package mscbank;

import java.time.LocalDate;

public class Funcionario implements AcessoInterno {

	private String nome;
	private String cpf;
	private String ctps;
	private double salario;
	private LocalDate dataAdmissao;
	private String usuario = "usuariopadrao";
	private String senha = "senhapadrao";
	
	
	public Funcionario() {
		super();
	}

	public Funcionario(String nome, String cpf, String ctps, double salario, LocalDate dataAdmissao) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.ctps = ctps;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
		this.getUsuario();
		this.getSenha();
	}

	@Override
	public String toString() {
		return "Nome: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nCTPS: " + this.getCtps() + "\nSalário: " + this.getSalario() + "\nFuncionário desde: " + this.getDataAdmissao() + "\nUsuario: " + this.getUsuario() + "\nSenha: " + this.getSenha();
	}
	
	@Override
	public void autenticarSistema(String usuario, String senha) {
		if (this.getUsuario().equals(usuario) && this.getSenha().equals(senha)) {
			System.out.println("Bem vinda, " + this.getNome());
		}
		else {
			System.out.println("Impossível autenticar. Verifique seus dados de acesso e tente novamente.");
		}
	}
	
	@Override
	public void alterarUsuario(String antigoUser, String novoUser) {
		if (this.getUsuario().equals(antigoUser)) {
			this.setUsuario(novoUser);
			System.out.println("Login do usuário alterado com sucesso.");
		}
		else {
			System.out.println("Não foi possível alterar seu login. Verifique seus dados e tente novamente.");
		}
	}
	
	@Override
	public void alterarSenha(String antigaSenha, String novaSenha) {
		if (this.getSenha().equals(antigaSenha)) {
			this.setSenha(novaSenha);
			System.out.println("Senha alterada com sucesso.");
		}
		else {
			System.out.println("Não foi possível alterar sua senha. Verifique seus dados e tente novamente.");
		}
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCtps() {
		return ctps;
	}

	public void setCtps(String ctps) {
		this.ctps = ctps;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
