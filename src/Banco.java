import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public void listarContas(Banco banco) {
		System.out.println("=== Banco ===");
		System.out.println(String.format("Nome: %s", this.nome) + System.getProperty("line.separator"));
		System.out.println(String.format("=== Contas presentes em %s ===", this.nome));
		banco.contas.forEach(x -> x.imprimirInfosComuns());
		System.getProperty("line.separator");
	}
}
