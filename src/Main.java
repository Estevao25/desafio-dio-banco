import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Banco bancoEstevao = new Banco();
		bancoEstevao.setNome("Banco Estevão");
		List<Conta> contas = new ArrayList<>();
		
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Cliente silvio = new Cliente();
		silvio.setNome("Silvio");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		Conta poupancaSilvio = new ContaPoupanca(silvio);
		poupancaSilvio.depositar(90000);
		
		contas.add(cc);
		contas.add(poupanca);
		contas.add(poupancaSilvio);
		bancoEstevao.setContas(contas);
				
		cc.depositar(100); 
		cc.transferir(101, poupanca); //não funciona por conta do if
		cc.transferir(100, poupanca);
		
//		cc.imprimirExtrato();
//		poupanca.imprimirExtrato();
		bancoEstevao.listarContas(bancoEstevao);
	}

}
