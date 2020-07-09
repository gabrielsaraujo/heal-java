package entities;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class ExerciciosCondicional {
	
	{
		/* Exercício 05:
		 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a 
		 * quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
		 */
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double total = 0;
		
		System.out.println("Segue nosso cardápio de produtos: \n\n"
				+ "1 - Cachorro Quente R$4.00 \n2 - X-Salada R$4.50 \n3 - X-Bacon R$5.00 \n4 - Torrada Simples R$2.00 \n"
				+ "5 - Refrigerante R$1.50 \n\nInforme o número do item que deseja:");
		double item = sc.nextDouble();
		System.out.println("Informe a Quantidade que deseja: ");
		int qtd_Item = sc.nextInt();
		
		if(item == 1){
			total = qtd_Item * 4.0;
			System.out.printf("Total: R$ %.2f", total);
		}
		else if(item == 2) {
			total = qtd_Item * 4.5;
			System.out.printf("Total: R$ %.2f", total);
		}
		else if(item == 3) {
			total = qtd_Item * 5.0;
			System.out.printf("Total: R$ %.2f", total);
		}
		else if(item == 4) {
			total = qtd_Item * 2.0;
			System.out.printf("Total: R$ %.2f", total);
		}
		else if(item == 5) {
			total = qtd_Item * 1.5;
			System.out.printf("Total: R$ %.2f", total);
		}
		else {
			System.out.println("Este item não existe no nosso cardápio!");
		}

		sc.close();
	}
	
/*-------------------------------------------------------------------------------------------------*/

	{
		/* Exercício 06:
		 *  Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem
		 *  dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este 
		 *  valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos,
		 *  deverá ser impressa a mensagem "Fora do intervalo".
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		double valor = sc.nextDouble();
		
		if(valor >= 0.0 && valor <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}
		else if(valor > 25.0 && valor <= 50.0) {
			System.out.println("Intervalo [25,50]");
		}
		else if(valor > 50.0 && valor <= 75.0 ) {
			System.out.println("Intervalo [50,75]");
		}
		else if(valor > 75.0 && valor <= 100.0){
			System.out.println("Intervalo [75,100]");
		}
		else {
			System.out.println("Fora do intervalo!");
		}
		sc.close();
	}
	
{

/*-------------------------------------------------------------------------------------------------*/
		/*Desafio Youtube:
		 * Leia dois valores inteiros X e Y. A seguir, calcule a soma dos números ímpares
		 * entre eles. Exemplos de entrada: (x=15,y=12,Resultado:13), (x=6,y=-5,Resultado:5) 
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois valores: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int soma = 0;
		int qtd = 0;
		int desc = 0;
		if(n1 > n2) {
			qtd = n1;
			desc = n2;
		}else {
			qtd = n2;
			desc = n1;
		}
		for(int j=qtd-1; j > desc; j--) {
			if(j % 2 != 0) {
				soma = soma + j;
			}
		}
		System.out.println(soma);
		sc.close();
	}

/*-------------------------------------------------------------------------------------------------*/

	{
	/*
	 * Exercício 01
	 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
	 * até X, um valor por linha, inclusive o X, se for o caso.
	 */
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Informe o valor de X: ");
	int x = sc.nextInt();
	
	while(x < 1) {
		System.out.println();
		System.out.println("Informe um valor para X maior ou igual a 1: ");
		x = sc.nextInt();
	}
	for(int j=1; j < x; j++) {
		if(j % 2 != 0) {
			System.out.println(j);
		}
	}
	
	sc.close();
}

/*-------------------------------------------------------------------------------------------------*/
	
		{
		/*
		 * Exercício 05:
		 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que
		 * serão lidos em seguida. Mostre quantos destes valores X estão dentro do intervalo
		 * [10,20] e quantos estão fora do intervalo, mostando essas informações conforme exemplo
		 * (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int x = sc.nextInt();
		int y = 0;
		int in = 0, out = 0;
		
		for(int j=0; j < x; j++) {
			System.out.println("Informe número para validar intervalo: ");
			y = sc.nextInt();
			if(y >= 10 && y <= 20) {
				in++;
			}
			else {
				out++;
			}
		}
		System.out.println(in + " in\n" + out + " out\n");
		
		sc.close();
		}

//---------------------------------------------------------------------------------------------------------------------------------------
		
		/*
		Exercício: 
			Fazer um programa para ler as medidas dos lados de dois triângulos X e Y
			(suponga medidas válidas). Em seguida, mostrar o valor das áreas dos dois triângulos
			e dizer qual dos dois triângulos possui a maior área.
			Fórmula da área de um Triângulo: area = Raíz(p(p-a)*(p-b)*(p-c)); onde p = (a+b+c) / 2;
		*/
		
		//Foi definido uma classe triângulo para conter três atributos e receber os objetos(lados) do triângulo.

		public static void exercicio(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			Triangle  x , y;    // -> É necessário declarar as variáveis com o tipo da classe triangle.
			x = new Triangle(); // -> para que o objeto possa existir, ser usado eu tenho instanciar o objeto. 
			y = new Triangle();
			
			System.out.println("Enter the measures of triangle X: ");
			x.a = sc.nextDouble();
			x.b = sc.nextDouble();
			x.c = sc.nextDouble();
			
			System.out.println("Enter the measures of triangle Y: ");
			y.a = sc.nextDouble();
			y.b = sc.nextDouble();
			y.c = sc.nextDouble();
			
			double p1 = (x.a + x.b + x.c) / 2;
			double p2 = (y.a + y.b + y.c) / 2;
			
			double areaX = Math.sqrt(p1 * (p1 - x.a) * (p1 - x.b) * (p1 - x.c));
			double areaY = Math.sqrt(p2 * (p2 - y.a) * (p2 - y.b) * (p2 - y.c));
			
			System.out.printf("area of Triangle X = %.4f\n", areaX);
			System.out.printf("area of Triangle Y = %.4f\n", areaY);
			
			if(areaX > areaY) {
				System.out.println("Larger area X");
			}
			else {
				System.out.println("Larger area Y");
			}
		
		}
		
}
