package exercicios;

import java.util.Scanner;

public class lista1 {
	
	public static void main(String[] args) {
		
		Scanner entradaDados = new Scanner(System.in);
		
		/*
		//Exercicio 1
		
		System.out.println("Digite o valor da conta: ");
		
		double valorConta = entradaDados.nextDouble();
		
		System.out.println("Taxa de serviço: 10%");
		System.out.printf("Valor total: R$%.2f \n" , (valorConta * 1.1));
		
		
		System.out.println("\n ================================== \n");
		
		
		//Exercicio 2
		
		System.out.println("Digite um numero inteiro: ");
		int num1 = entradaDados.nextInt();
		
		System.out.println("Digite outro numero inteiro: ");
		int num2 = entradaDados.nextInt();
		
		System.out.println("O resto da divisão inteira entre os dois numeros é " + (num1 % num2));
		
		
		System.out.println("\n ================================== \n");
		
		
		//Exercicio 3
		
		System.out.println("Qual o valor do produto?");
		double valorProduto = entradaDados.nextDouble();
		
		System.out.println("Desconto: 15%");
		System.out.printf("Valor final: R$%.2f \n" , (valorProduto * (1 - 0.15)));
		
		
		System.out.println("\n ================================== \n"); 
		
		
		//Exercicio 4
		
		System.out.println("Qual o valor da mercadoria?");
		double valorMercadoria = entradaDados.nextDouble();
		
		System.out.println("Qual o valor pago?");
		double valorPago = entradaDados.nextDouble();
		
		System.out.printf("Troco: R$%.2f \n", (valorPago - valorMercadoria));
		
		
		System.out.println("\n ================================== \n"); 
		
		
		//Exercicio 5
		
		System.out.println("Digite o primeiro numero");
		int numero1 = entradaDados.nextInt();
		
		System.out.println("Digite o segundo numero");
		int numero2 = entradaDados.nextInt();
		
		System.out.println("Digite o terceiro numero");
		int numero3 = entradaDados.nextInt();
		
		
		if(numero1 > numero2 && numero1 > numero3) {
			System.out.println("O primeiro numero é o maior.");
		}
		else if(numero2 > numero1 && numero2 > numero3) {
			System.out.println("O segundo numero é o maior.");
		}
		else {
			System.out.println("O terceiro numero é o maior.");
		}
		
		if(numero1 < numero2 && numero1 < numero3) {
			System.out.println("O primeiro numero é o menor.");
		}
		else if(numero2 < numero1 && numero2 < numero3) {
			System.out.println("O segundo numero é o menor.");
		}
		else {
			System.out.println("O terceiro numero é o menor.");
		}
		
		
		System.out.println("\n ================================== \n");
		
		
		//Exercicio 6
		System.out.println("Nome: ");
		String nomeFuncionario = entradaDados.nextLine();
		
		System.out.println("Numero da matricula: ");
		String numeroMatricula = entradaDados.nextLine();
		
		System.out.println("Idade: ");
		int idade = entradaDados.nextInt();
		
		//criação de um novo scanner
		Scanner entradaDados2 = new Scanner(System.in);
		
		System.out.println("Sexo: ");
		String sexo = entradaDados2.nextLine();
		
		System.out.println("Endereço: ");
		String endereco = entradaDados2.nextLine();
		
		System.out.println("Bairro: ");
		String bairro = entradaDados2.nextLine();
		
		System.out.println("Estado civil: ");
		String estadoCivil = entradaDados2.nextLine();
		
		
		System.out.println("\n ================================== \n"); 
		
		
		//Exercicio 7
		
		System.out.println("Digite o primeiro numero");
		int primeiroNumero = entradaDados.nextInt();
		
		System.out.println("Digite o segundo numero");
		int segundoNumero = entradaDados.nextInt();
		
		System.out.println("A soma dos dois numeros é igual a " + (primeiroNumero + segundoNumero));
		
		
		System.out.println("\n ================================== \n"); 
		
		
		//Exercicio 8
		
		System.out.println("Nome: ");
		String NOME = entradaDados.nextLine();
		
		System.out.println("Primeira nota: ");
		double NOTA1 = entradaDados.nextDouble();
		
		System.out.println("Segunda nota: ");
		double NOTA2 = entradaDados.nextDouble();
		
		System.out.println("Terceira nota: ");
		double NOTA3 = entradaDados.nextDouble();
		
		System.out.println("A média final é " + ((NOTA1 + NOTA2 + NOTA3)/3));
		
		
		System.out.println("\n ================================== \n");
		
		
		//Exercicio 9
		
		System.out.println("Nome: ");
		String nomeFunc = entradaDados.nextLine();
		
		System.out.println("Departamento: ");
		String departamento = entradaDados.nextLine();
		
		System.out.println("Salario: ");
		double salario = entradaDados.nextDouble();
		
		System.out.println("Valor do abono: 10% ");
		
		System.out.printf("O salário acrescido de abono é igual a R$%.2f \n" , (salario * 1.1));
		
		
		System.out.println("\n ================================== \n");
		
		
		//Exercicio 10
		
		System.out.println("Código do produto:");
		String codigoProduto = entradaDados.nextLine();
		
		System.out.println("Descrição do produto: ");
		String descricaoProduto = entradaDados.nextLine();
		
		System.out.println("Preço de custo: ");
		double precoCusto = entradaDados.nextDouble();
		
		System.out.println("Quantidade: ");
		int quantidade = entradaDados.nextInt();
		
		System.out.println("Percentual de lucro(%): ");
		double percentLucro = (entradaDados.nextDouble())/100;
		
		System.out.printf("Preço final: R$%.2f \n", (precoCusto + (precoCusto * percentLucro)));
		System.out.printf("Lucro por unidade: R$%.2f \n", (precoCusto * percentLucro));
		System.out.printf("Lucro total: R$%.2f \n", (precoCusto * percentLucro * quantidade));
		
		
		System.out.println("\n ================================== \n");
		
		
		//Exercicio 11
		
		System.out.println("Qual o dia do seu aniversário?");
		int diaAniversario = entradaDados.nextInt();
		
		System.out.println("Qual o mês do seu aniversário?");
		int mesAniversario = entradaDados.nextInt();
		
		System.out.println("Qual o ano do seu aniversário?");
		int anoAniversario = entradaDados.nextInt();
		
		System.out.println("Qual o dia atual?");
		int diaAtual = entradaDados.nextInt();
		
		System.out.println("Qual o mês atual?");
		int mesAtual = entradaDados.nextInt();
		
		System.out.println("Qual o ano atual?");
		int anoAtual = entradaDados.nextInt();
		
		
		if(mesAtual > mesAniversario || mesAtual == mesAniversario && diaAtual >= diaAniversario) {
			System.out.println("Sua idade é: " + (anoAtual - anoAniversario) + " anos.");
		}
		else {
			System.out.println("Sua idade é: " + (anoAtual - anoAniversario - 1) + " anos.");
		}
		
		
		System.out.println("\n ================================== \n");
		
		
		//Exercicio 13

		System.out.println("Salário base: ");
		double salarioBase = entradaDados.nextDouble();
		
		System.out.println("Numero de dependentes:");
		int numeroDependentes = entradaDados.nextInt();
		
		System.out.printf("Salario bruto: R$%.2f \n", (salarioBase + (numeroDependentes * 100)));
		System.out.printf("Salario liquido: R$%.2f \n", (salarioBase + (numeroDependentes * 100) - ((salarioBase + (numeroDependentes * 100)) * 0.10)));
		
		
		System.out.println("\n ================================== \n");
		
		
		//Exercicio 14
		
		System.out.println("Largura da parede:");
		double largura = entradaDados.nextDouble();
		
		System.out.println("Altura da parede:");
		double altura = entradaDados.nextDouble();
		
		double rendimento = 3;
		double volume = 2;
		
		System.out.println("Volume necessário de tinta: " + (altura * largura * rendimento) + " litros.");
		System.out.println("Quantidade de latas: " + ((altura * largura * rendimento)/2) + " latas.");
		
		
		System.out.println("\n ================================== \n"); 
		
		
		//Exercicio 15
		
		int a = 5;
		int b = 8;
		int c = 10;
		int x = a + (2 * b) / (c - 6);
		int y = x * a;
		
		System.out.println("O valor de y é: " + y);
		System.out.println("O valor de x é: " + x);
		
		
		System.out.println("\n ================================== \n");
		
		
		//Exercicio 16
		
		System.out.println("Peso da bagagem: ");
		double peso = entradaDados.nextDouble();
		
		double valorAdicional = 0;
		
		if (peso <= 20) {
			System.out.println("Sem valor adicional");
		}
		else if (peso > 20 && peso <= 40) {
			valorAdicional = 5000;
			System.out.printf("Valor adicional: R$%.2f \n", valorAdicional);
		}
		else {
			valorAdicional = 10000;
			System.out.printf("Valor adicional: R$%.2f \n", valorAdicional);
		}
		
		
		System.out.println("\n ================================== \n");
		
		
		//Exercicio 17
		
		System.out.println("Qual a sua altura?");
		double alturaUsuario = entradaDados.nextDouble();
		
		System.out.println("Se você é mulher, seu peso ideal é: " + ((72.7 * alturaUsuario) - 58) + "kg");
		System.out.println("Se você é homem, seu peso ideal é: " + ((62.1 * alturaUsuario) - 44.7) + "kg");
		
		
		System.out.println("\n ================================== \n"); */
		
		
		//Exercicio 18
		
		System.out.println("Qual a sua idade?");
		int idadeAtleta = entradaDados.nextInt();
		
		if (idadeAtleta < 5) {
			System.out.println("Atleta não está apto para competir, pois não possui idade o suficiente.");
		}
		else if (idadeAtleta >= 5 && idadeAtleta <= 7) {
			System.out.println("Categoria: Infantil A.");
		}
		else if (idadeAtleta >= 8 && idadeAtleta <= 10) {
			System.out.println("Categoria: Infantil B.");
		}
		else if (idadeAtleta >= 11 && idadeAtleta <= 13) {
			System.out.println("Categoria: Juvenil A.");
		}
		else if (idadeAtleta >= 14 && idadeAtleta <= 17) {
			System.out.println("Categoria: Juvenil B.");
		}
		else {
			System.out.println("Categoria: Senior.");
		}
	}

}
