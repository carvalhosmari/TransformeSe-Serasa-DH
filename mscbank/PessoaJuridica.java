package mscbank;

public class PessoaJuridica extends Pessoa {
	
	private String cnpj;
	private String setor;
	private String responsavel;
	
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String cnpj, String setor, String responsavel) {
		super();
		this.cnpj = cnpj;
		this.setor = setor;
		this.responsavel = responsavel;
	}
	
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getSetor() {
		return setor;
	}
	
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public String getResponsavel() {
		return responsavel;
	}
	
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
	
}
