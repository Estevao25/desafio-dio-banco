import java.util.List;

import lombok.Data;

@Data
public class Banco {

	private String nome;
	private List<Conta> contas;

	public void listarContas(Banco banco) {
		System.out.println("=== Banco ===");
		System.out.println(String.format("Nome: %s", this.nome) + System.getProperty("line.separator"));
		System.out.println(String.format("=== Contas presentes em %s ===", this.nome));
		banco.contas.forEach(x -> x.imprimirInfosComuns());
		System.getProperty("line.separator");
	}
}
