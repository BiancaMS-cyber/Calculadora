import java.util.Scanner;

	
	class Main {
		
		public static double Soma (double n1, double n2) {
			double Soma = n1+n2;
			return Soma;
		}
		
		public static double Subtracao (double n1, double n2) {
			double Subtracao =  n1 - n2;
			return Subtracao;
		}
		
		public static double Multiplicacao (double n1, double n2) {
			double Multiplicacao =  n1 * n2;
			return Multiplicacao;
		}
			
		public static double Divisao (double n1, double n2) {
			double Divisao =  n1 / n2;
			return Divisao;
		}
			
		
			public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Informe o primeiro numero: ");
				double n1= sc.nextDouble();
				System.out.println("Informe o segundo numero: ");
				double n2 = sc.nextDouble();
				sc.close();
				double Soma = (n1 + n2);
				double Subtracao = (n1 - n2);
				double Multiplicacao = (n1 * n2);
				double Divisao = (n1 / n2);
				
				
				System.out.println("Soma: "+Soma);
				System.out.println("Subtracao: "+Subtracao);
				System.out.println("Multiplicacao: "+Multiplicacao);
				System.out.println("Divisao: "+Divisao);
			

				}

			}



