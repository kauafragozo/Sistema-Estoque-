import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer saldoinicial = 0;
		Boolean executando = true;
	
		while(executando) {
			
			if(saldoinicial == 0) {
			System.out.println("Insira o Saldo Inicial");
			saldoinicial = sc.nextInt();
			System.out.println("Saldo Incial alterado para: " + saldoinicial);
			}else {
			System.out.println("----------");
			System.out.println("Selecione uma Opção:");
			System.out.println("1 - Entrada");
			System.out.println("2 - Saída");
			Integer op =sc.nextInt();
			
			System.out.println("----------");
			System.out.println("Insira a Quantidade");
			Integer qtd = sc.nextInt();
			Integer saldo = 0;
			
			switch(op) {
			case 1:
				saldo = saldoinicial + qtd;
				System.out.println("O Saldo é igual a:" + saldo);
				break;
			case 2:
				if(saldoinicial >= qtd) {
					saldo = saldoinicial - qtd;
					System.out.println("O Saldo é igual a :" + saldo);
				}else {
					System.out.println("Quantidade Insuficiente");
				}
				break;
				default:
					System.out.println("Opção Inválida");
			}
			
			System.out.println("----------");
			System.out.println("Deseja Realizar outra Operação?");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			Integer op2 = sc.nextInt();
			
			switch(op2) {
			case 1:
				saldoinicial = saldo;
				executando = true;
				break;
			case 2: 
				executando = false;
				break;
				default:
					System.out.println("Opção Inválida");
					break;
			}
		}
		}	
		sc.close();
	}
}
