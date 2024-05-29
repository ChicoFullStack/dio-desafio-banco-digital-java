
public class Main {
	
	public static void main(final String[] args) {
		Cliente chico = new Cliente();
		chico.setNome("Chico de Assis");
		
		Conta cc = new ContaCorrente(chico);
		Conta cp = new ContaPoupanca(chico);
		
		cc.depositar(1000);
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}
	
}
