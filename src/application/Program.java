package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.stream.Collectors;

import entities.Account;
import entities.Employee;
import entities.Product;
import entities.Rooms;
import entities.Triangle;
import util.Calculator;

public class Program {

	public static void main(String[] args) throws ParseException {

		/*----IN�CIO PROJETO STRING (Sem Classe)----
		 * Projeto com exemplos de manipula��es com String.
		 */
		
		String original = "abcde FGHIJ ABC abc DEFG ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		//Remove espa�os do come�o e fim de uma String.
		String s03 = original.trim();
		//Recortar uma String.
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		//Substituir uma String.
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		//Busca o �ndice do valor especificado retornando um int.
		int k = original.indexOf("bc");
		int u = original.lastIndexOf("bc");
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + k);
		System.out.println("Last index of 'bc': " + u);
		
		/*FIM DO PROJETO String*/
		/*---------------------------------------------------------------------------------------------------------------------*/
				
		
		/* ----Projeto de uma Conta banc�ria  (Classe Account)---- 
		 * � um Exerc�cio que possui conceito de POO com classe para 
		 * tratar objetos e m�todos para os fluxos de valida��es. */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int numberAccount = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char answer = sc.next().toLowerCase().charAt(0);
		
		Account account;
		
		if(answer == 'y') {
			System.out.print("Enter initial deposit value: ");
			double depositIni = sc.nextDouble();
			account = new Account(numberAccount, holder, depositIni);
		}
		else {
			account = new Account(numberAccount, holder);
		}
		
		System.out.println("\nAccount data:");
		System.out.println(account);
		
		System.out.print("\nEnter a deposit value: ");
		double deposit = sc.nextDouble();
		account.deposit(deposit);
		
		System.out.println("Updated data: ");
		System.out.println(account);
		
		System.out.print("\nEnter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withDraw(withdrawValue);
		
		System.out.println("Updated data: ");
		System.out.print(account);
		
		/*FIM DO PROJETO Account*/
		/*---------------------------------------------------------------------------------------------------------------------*/
		
		/*----IN�CIO PROJETO DATE (Sem Classe)----
		 * Projeto com exemplos/aplica��o da classe "Date" e os tipos de formata��o 
		 * de data mais interessantes de usar. Bem como as formata��es das m�scaras 
		 * padr�es de data "dd/mm/yyyy hh:mm:ss" e com base no GMT e UTC(ISO-8601). 
		 */
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		//instante atual no java:
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		//Data inicial que o java escolheu pra iniciar de acordo com o GMT: que � 01/01/1970. 
		//s� que como n�o existe algum formato ela � impressa com a diferen�a do Brasil em rela��o ao GMT que � de -3h
		Date x3 = new Date(0L);
		//Formatando uma data para 5 horas do dia inicial escolhido pelo java 01/01/1970.
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		
		Date y1 = sdf1.parse("02/07/2020");
		Date y2 = sdf2.parse("02/07/2020 22:08:15");
		//Padr�o UTC
		Date y3 = Date.from(Instant.parse("2020-07-02T15:42:07Z"));
		
		
		System.out.println("Impress�es das datas sem nenhuma formata��o");
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("y3: " + y3);
		System.out.println("------------------------");
		System.out.println("Impress�es das datas com formata��o");
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("------------------------");
		System.out.println("Impress�es das datas com formata��o GMT");
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));
		
		/*FIM DO PROJETO Date*/
		/*---------------------------------------------------------------------------------------------------------------------*/
		
		/*----IN�CIO PROJETO CALENDAR (Sem Classe)----
		 * Projeto com exemplos de uso da classe "Calendar", usada para trabalhar 
		 * com data quando se precisa de mais funcionalidades */
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2020-07-02T22:55:45Z"));
		
		System.out.println(sdf.format(d));
		
		//Acrescentar 4h � data da vari�vel d.
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		System.out.println();
		System.out.println("----------------------");
		System.out.println();
		
		//Resgatando um valor espec�fico valor da data.
		int minute = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("Minutes: " + minute);
		System.out.println("Minutes: " + month);
		
		/*FIM DO PROJETO Calendar*/
		/*---------------------------------------------------------------------------------------------------------------------*/
		
		
		/*----IN�CIO PROJETO STATIC (Package util e classe Calculator)----*/
		/*Este projeto � um Exerc�cio que calcula circunfer�ncia e volume de um c�rculo 
		 * UTILIZANDO M�TODOS E ATRIBUTOS EST�TICOS.
		 */
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI value: %.2f\n", Calculator.PI);
		
		/*FIM DO PROJETO Static*/
		/*---------------------------------------------------------------------------------------------------------------------*/
		
		
		/*----IN�CIO PROJETO TRIANGLE (Classe Triangle)----*/
		/*Projeto Exerc�cio com classe estruturada "Triangle", com seus pr�prios atributos definidos.
		 * Possui express�o utilizando raiz quadrada com a classe "Math".
		 */
		
		Triangle  x , y;    // -> � necess�rio declarar as vari�veis com o tipo da classe triangle.
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
		
		double areaX = x.calculateArea();
		double areaY = y.calculateArea();
		
		System.out.printf("area of Triangle X = %.4f\n", areaX);
		System.out.printf("area of Triangle Y = %.4f\n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area X");
		}
		else {
			System.out.println("Larger area Y");
		}
		
		/*FIM DO PROJETO Triangle*/
		/*---------------------------------------------------------------------------------------------------------------------*/
		
		
		/*----IN�CIO DO PROJETO PRODUCT (Classe Product)----*/
		/*Projeto Exerc�cio que possui classe estruturada com construtores 
		 *sobre carga(v�rios construtores) e m�todos getters and setters.
		 */
		
		//product � o meu p1 ou produto 1, como n�o vamos ter v�rios produtos nesse exemplo, foi poss�vel por apenas "product".
		
		System.out.print("Enter Product Data: \nName: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
				
		Product product = new Product(name, price);
				
		product.setName("Computador");
		System.out.println("Updated Name: " + product.getName());
				
		product.setPrice(1500.00);
		System.out.println("Updated Price: " + product.getPrice());
				
		System.out.printf("\nProduct data: " + product + "\n");
				
		int enter;
		System.out.print("\nMake a Stock entry. Enter the Quantity you want: ");
		enter = sc.nextInt();
				
		product.addProducts(enter);
		System.out.printf("\nUpdated data: " + product + "\n");
				
		int remove;
				
		System.out.print("\nEnter the number of products to be removed from stock: ");
		remove = sc.nextInt();
				
		product.removeProducts(remove);
		/*"product.toString()" � a mesma coisa que s� o "product", s� pra lembrar que quando usado 
		uma vari�vel com um tipo definido em uma classe dentro do "System.out.print", ele j� executa 
		automaticamente o m�todo toString do java, pois ele espera automaticamente uma String, j� que o 
		"System.out.print" � um m�todo para exibir mensagens. Nesse caso, fizemos um m�todo toString para sobrepor o do java.*/
		System.out.printf("\nUpdated data: " + product.toString());
		
		/*FIM DO PROJETO Product*/
		/*---------------------------------------------------------------------------------------------------------------------*/
		
		
		/*----IN�CIO PROJETO VECT (Sem Classe)----*/
		/*Projeto com aplica��o de vetor com tipo primitivo*/
		
		System.out.println("Informe a quantidade pessoas que teram a altura calculada: ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		double sum = 0.0;
		for(int j = 0; j < n; j++) {
			 sum = sum + vect[j];
		}
		
		double avg = sum / n;
		System.out.printf("Average Height: %.2f\n", avg);
		
		/*FIM DO PROJETO Vect*/
		/*---------------------------------------------------------------------------------------------------------------------*/
		
		
		/*----IN�CIO PROJETO Rooms VectRef (Classe Rooms)----*/
		/*Projeto com aplica��o de vetor com tipo estruturado*/
		
		/* Problema:
		 * A dona de um pensionato possui dez quartos para alugar para estudantes,
		 * sendo esses quartos identificados pelos n�meros de 0 a 9.
		 * 
		 * Fazer um programa que inicie com todos os dez quartos vazios, e depois
		 * leia uma quantidade N representando o n�mero de estudantes que v�o 
		 * alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
		 * N estudantes. Para cada registro de aluguel, informar o nome e email do
		 * estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
		 * que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
		 * um relat�rio de todas ocupa��es do pensionato, por orderm de quarto.
		 */
		
		Rooms[] vect1 = new Rooms[10];
		
		System.out.print("How many rooms will be rented? ");
		int NStudents = sc.nextInt();
		
		for(int i = 1; i <= NStudents ; i++) {

			System.out.print("\nRent #" + i + "\nName: ");
			sc.nextLine();
			String namec = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vect1[room] = new Rooms(namec, email);
		}
		
		System.out.println("\nBusy rooms: ");
		for(int i = 0; i < vect.length; i++) {
			if(vect1[i] != null) {
				System.out.println(i + ": " + vect1[i].getName() + ", " + vect1[i].getEmail());
			}
		}
		
		/*FIM DO PROJETO Rooms*/
		/*---------------------------------------------------------------------------------------------------------------------*/
		
		
		/*----IN�CIO PROJETO LIST (Sem Classe)----*/
		/*Projeto com exemplos do uso da classe "List" com tipos de objetos primitivos 
		 * Ex: String, Integer, Double e etc. S�o exemplificados comandos como: adicionar, 
		 * remover, fazer um filtro de uma lista para outra com uma express�o lambda e mais.
		 */
		
		/* Listas s�o objetos do tipo interface, e por esse motivo n�o pode ser instanciada normalmente: 
		 List<> list = new List<>(). para instanciar uma objeto do tipo interface deve-se utilizar uma
		 classe que implementa a sua interface. Nesse caso utilizamos a ArrayList pois ela possui m�todos
		 de busca otimizados. */
		 
		 List<String> list = new ArrayList<>(); 
		 
		 list.add("Gabriel");
		 list.add("Thamires");
		 list.add("Renildo");
		 list.add("Suzana");
		 list.add(2, "Shanks");
		 list.add("Rinaldo");
		 
		 System.out.println(list.size());
		 
		 for (String ds : list) {
			 System.out.println(ds);
		 }
		
		 System.out.println("------------------");
		 list.remove("Gabriel");
		 list.removeIf(ay -> ay.charAt(0) == 'T');
		 
		 for (String at : list) {
			 System.out.println(at);
		 }

		 System.out.println("--------------------");
		 System.out.println("Index of Renildo: " + list.indexOf("Renildo"));
		 System.out.println("Index of inexiste: " + list.indexOf("Alucard"));
		 System.out.println("--------------------");
		 
		 List<String> result = list.stream().filter(ax -> ax.charAt(0) == 'R').collect(Collectors.toList());
		 
		 for (String ax : result) {
			 System.out.println(ax);
		 }
		 
		 System.out.println("---------------------");
		 String aname = list.stream().filter(ax -> ax.charAt(0) == 'R').findFirst().orElse(null);
		 System.out.println(aname);
		
		 /*FIM DO PROJETO List*/
		 /*---------------------------------------------------------------------------------------------------------------------*/
		 
		 /*IN�CIO DO PROJETO Employee_List (Com Classe)----*/
		 /*Esse projeto � um exerc�cio sobre um cadastro de funcion�rios onde � informado um id para sua refer�ncia,
		  *o nome e seu sal�rio contendo valida��es de id e acr�scimo de sal�rio com utiliza��o da classe "List". 
		  * Recebendo como par�metro um tipo de objeto estruturado
		  */
		 
		 System.out.print("How many employees will be registered: ");
		 int n1 = sc.nextInt();
			
		 List<Employee> list1 = new ArrayList<>();
			
		 for(int i=0; i<n1; i++) {
			 System.out.println("\nEmployee #" + (i + 1) + ": ");
			 System.out.print("Id: ");
			 Integer id1 = sc.nextInt();
			 while(verifyId(list1, id1)) {
			 	System.out.println("This id already taken. Try again: ");
			 	id1 = sc.nextInt();
				}
			 System.out.print("Name: ");
			 sc.nextLine();
			 String name1 = sc.nextLine();
			 System.out.print("Salary: ");
			 Double salary1 = sc.nextDouble();
			
			 list1.add(new Employee(id1, name1, salary1));
			}
			
		 System.out.print("\nEnter the employee id that will have salary increase :");
		 int id1 = sc.nextInt();
		 Employee emp = list1.stream().filter(bx -> bx.getId() == id1).findFirst().orElse(null);
			
		 if(emp == null) {
		 	System.out.println("This id does not exist.");
		 }
		 else {
		 	System.out.print("Enter the percentage: ");
		 	double percent = sc.nextDouble();
		 	emp.increaseSalary(percent);
				
		 }
			
		 System.out.println("\nList of Employees: ");
		 for(Employee obj : list1) {
		 	System.out.println(obj.getId() + ", " + obj.getName() + ", " + String.format("%.2f", obj.getSalary()));
		 }
			
		 /*FIM DO PROJETO List*/
		 /*-------------------------------------------------------------------------------------------------------------------*/	
		 
		 
		 /*----IN�CIO DO PROJETO Matrix (Sem Classe)----*/
		 /*Projeto Exerc�cio utilizando aplica��o de Matriz*/ 
		 
		 /*Fazer um programa para ler dois n�meros inteiros M e N, e depois ler
			 * uma matriz de M Linhas por N colunas contendo n�meros inteiros,
			 * podendo haver repeti��es. Em seguida, ler um n�mero inteiro x que
			 * pertence � matriz. Para cada ocorr�ncia de X, mostrar os valores �
			 * esquerda, acima, � direita e abaixo de X, quando houver, conforme
			 * exemplo:
			 */
			
			/*Entrada de dados:
			 *  3 4
			 *  10 8 15 12
			 *  21 11 23 8
			 *  14 5 13 19
			 *  8
			 *  
			 *  Resultado que deve ser exibido com os dados acima:
			 *  Position: 0,1
			 *  Left: 10
			 *  Right: 15
			 *  Down: 11
			 *  Position: 1,3
			 *  Left: 23
			 *  Up: 12
			 *  Down: 19
			 */
			
			int m = sc.nextInt();
			int n5 = sc.nextInt();
			
			Integer[][] mat = new Integer[m][n5];
			
			for(int i=0; i<mat.length; i++) {
				for(int j=0; j<mat[i].length; j++) {
					mat[i][j] = sc.nextInt();
				}
			}
			
			int x5 = sc.nextInt();
			
			for(int i=0; i<mat.length; i++) {
				for(int j=0; j<mat[i].length; j++) {
					if(mat[i][j] == x5) {
						System.out.println("Position: " + i + "," + j);
						if(j > 0) {
							System.out.println("Left: " + mat[i][j-1]);
						}
						if(i > 0) {
							System.out.println("Up: " + mat[i-1][j]);
						}
						if(j < mat[i].length) {
							System.out.println("Right: " + mat[i][j+1]);
						}
						if(i < mat.length) {
							System.out.println("Down: " + mat[i+1][j]);
						}
					}
					
				}
			}
		
		/*FIM DO PROJETO Matrix*/
		/*---------------------------------------------------------------------------------------------------------------------*/
		 
		 
		 sc.close();
		
	}
	
	/*M�todo referente ao projeto Employee_List*/
	public static boolean verifyId(List<Employee> list1, int id1) {
		
		Employee idExist = list1.stream().filter(x -> x.getId() == id1).findFirst().orElse(null);
		if(idExist == null) {
			return false;
		}
		else {
			return true;
		}
	}

}
