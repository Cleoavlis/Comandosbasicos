package AgenciadeViagens;

import java.util.Scanner;

public class CompanhiaAereaFlash {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Bem vindo à Companhia Áerea Flash");
		System.out.println("");
		System.out.println("Digite a data que deseja viajar:");
		String data = entrada.next();
		System.out.println("A data escolhida " +data);
		System.out.println("");
		System.out.println("Digite 1 - Para viagem nacional "+"\n"+ "Digite 2 para viagem internacional");
	
	
		String Viagem = entrada.next();
		int valorN = 1500;
		int valorI = 4000;
		
		// Switch Nacional ou Internacional
		switch (Viagem) {
		case "1": // Viagem Nacional
			System.out.println(" O destino escolhido é  Nacional");
			System.out.println("Escolha a cidade de acordo as opções: "+"\n"+ "1 - Porto Seguro" +"\n"+ "2 - Forteleza" +"\n"+ "3 - Rio de Janeiro");
			String Viagem1 = entrada.next();
			switch (Viagem1) {
			// 1 Opção de escolha da viagem
			case "1":
				System.out.println("Seu destino é o Porto Seguro");
				System.out.println("A forma de pagamento deve efetuado no cartão:" +"\n"+ "Escolha a opção"+ "\n"+ " 1 - a vista ou 2- em até 10X");
				int formaPagamento = entrada.nextInt();
				// Forma de pagamento
				switch (formaPagamento) {
				// Pagamento a vista
				case 1:
					System.out.println("Você escolheu o pagamento a vista "+ "R$ "+valorN);
					System.out.println("Seu pagamento foi aprovado");

				break;
				// Pagamento a prazo
				case 2:
					System.out.println("Você escolheu o pagamento parcelado digite em quantas parcela deseja de 1 - 10");
					double parc = entrada.nextInt();
					System.out.println("Digite a quantidade parcelas");
					System.out.println("Você parcelou em: " +(valorN/parc));
					System.out.println("Seu pagamento foi aprovado");
					
}
				break;
				// 2 Opção de escolha da viagem

			case "2":
				System.out.println("Seu destino é o Forteleza");
				System.out.println("A forma de pagamento deve efetuado no cartão:" +"\n"+ "Escolha a opção"+ "\n"+ " 1 - a vista ou 2- em até 10X");
				int formaPagamento1 = entrada.nextInt();
				
				switch (formaPagamento1) {
				// Pagamento a vista
				case 1:
					System.out.println("Você escolheu o pagamento a vista "+ "R$ "+valorN);
					System.out.println("Seu pagamento foi aprovado");

				break;
				// Pagamento a prazo
				case 2:
					System.out.println("Você escolheu o pagamento parcelado digite em quantas parcela deseja de 1 - 10");
					double parc = entrada.nextInt();
					System.out.println("Digite a quantidade parcelas");
					System.out.println("Você parcelou em: " +(valorN/parc));
					System.out.println("Seu pagamento foi aprovado");
					
}
				
				
				break;	
				// 3 Opção de escolha da viagem
			case "3":
				System.out.println("Seu destino é o Rio de Janeiro");
				System.out.println("A forma de pagamento deve efetuado no cartão:" +"\n"+ "Escolha a opção"+ "\n"+ " 1 - a vista ou 2- em até 10X");
				int formaPagamento2 = entrada.nextInt();
				
				switch (formaPagamento2) {
				// Pagamento a vista
				case 1:
					System.out.println("Você escolheu o pagamento a vista "+ "R$ "+valorN);
					System.out.println("Seu pagamento foi aprovado");

				break;				
				// Pagamento a prazo
				case 2:
					System.out.println("Você escolheu o pagamento parcelado digite em quantas parcela deseja de 1 - 10");
					double parc = entrada.nextInt();
					System.out.println("Digite a quantidade parcelas");
					System.out.println("Você parcelou em: " +(valorN/parc));
					System.out.println("Seu pagamento foi aprovado");
					
}
				break;
				
			}
			break;
			//Viagem Internacional
		case "2":
			System.out.println(" O destino escolhido é  internacional");
			System.out.println("Escolha a cidade de acordo as opções: "+"\n"+ "1 - Londres" +"\n"+ "2 - Paris" +"\n"+ "3 - New York");
			String Viagem2 = entrada.next();
			switch (Viagem2) {
			// 1 Opção de escolha da viagem
			case "1":
				System.out.println("Seu destino é o Londres");
				System.out.println("A forma de pagamento deve efetuado no cartão:" +"\n"+ "Escolha a opção"+ "\n"+ " 1 - a vista ou 2- em até 10X");
				int formaPagamento = entrada.nextInt();
				
				switch (formaPagamento) {
				// Pagamento a vista
				case 1:
					System.out.println("Você escolheu o pagamento a vista "+ "R$ "+valorI);
					System.out.println("Seu pagamento foi aprovado");

				break;
				// Pagamento a vista
				case 2:
					System.out.println("Você escolheu o pagamento parcelado digite em quantas parcela deseja de 1 - 10");
					double parc = entrada.nextInt();
					System.out.println("Digite a quantidade parcelas");
					System.out.println("Você parcelou em: " +(valorI/parc));
					System.out.println("Seu pagamento foi aprovado");
					
}
				break;
				
			case "2":
				// 2 Opção de escolha da viagem
				System.out.println("Seu destino é o Paris");
				System.out.println("A forma de pagamento deve efetuado no cartão:" +"\n"+ "Escolha a opção"+ "\n"+ " 1 - a vista ou 2- em até 10X");
				int formaPagamento1= entrada.nextInt();
				
				switch (formaPagamento1) {
				// Pagamento a vista
				case 1:
					System.out.println("Você escolheu o pagamento a vista "+ "R$ "+valorI);
					System.out.println("Seu pagamento foi aprovado");

				break;
				// Pagamento a prazo
				case 2:
					System.out.println("Você escolheu o pagamento parcelado digite em quantas parcela deseja de 1 - 10");
					double parc = entrada.nextInt();
					System.out.println("Digite a quantidade parcelas");
					System.out.println("Você parcelou em: " +(valorI/parc));
					System.out.println("Seu pagamento foi aprovado");
					
				break;	
				}
				// 3 Opção de escolha da viagem
			case "3":
				System.out.println("Seu destino é o New York");
				System.out.println("A forma de pagamento deve efetuado no cartão:" +"\n"+ "Escolha a opção"+ "\n"+ " 1 - a vista ou 2- em até 10X");
				int formaPagamento2= entrada.nextInt();
				
				switch (formaPagamento2) {
				// Pagamento a vista
				case 1:
					System.out.println("Você escolheu o pagamento a vista "+ "R$ "+valorI);
					System.out.println("Seu pagamento foi aprovado");

				break;
				// Pagamento a prazo
				case 2:
					System.out.println("Você escolheu o pagamento parcelado digite em quantas parcela deseja de 1 - 10");
					double parc = entrada.nextInt();
					System.out.println("Digite a quantidade parcelas");
					System.out.println("Você parcelou em: " +(valorI/parc));
					System.out.println("Seu pagamento foi aprovado");
					
				break;	
				}
				
				break;
			default:
				System.out.println("Opção escolhida não está disponível");
				break;
				
			}
			
		}

		

	}

}

	
