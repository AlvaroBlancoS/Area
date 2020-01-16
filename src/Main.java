import java.util.Scanner;

public class Main {

	public static void menu() {
		System.out.println("Selecciona una opcion:");
		System.out.println("0- Salir");
		System.out.println("1- Area de un circulo");
		System.out.println("2- Area de un triangulo");
		System.out.println("3- Area de un cuadrado");
		System.out.println("4- Area de un rectangulo");
	}

	public static void main(String[] args) {
		Main.menu();
		Scanner in = new Scanner(System.in);
		int opcion = in.nextInt();

		while (opcion != 0) {
			switch (opcion) {
			case 1:// Area de un circulo
				System.out.print("Indica el radio: ");
				double radio = in.nextDouble();
				Circulo c = new Circulo(radio);
				// Este metodo ya nos da el radio
				System.out.printf("El area es %1.2f\n", c.radio());
				break;

			case 2:// Area de un triangulo
				System.out.println("Indica la base: ");
				double base = in.nextDouble();
				System.out.println("Indica la altura: ");
				double altura = in.nextDouble();
				Triangulo t = new Triangulo(base, altura);
				System.out.printf("El area es %1.2f\n", t.area());

				break;

			case 3:// Area de un cuadrado
				System.out.println("Indica un lado: ");
				double lado = in.nextDouble();
				Cuadrado cd = new Cuadrado(lado);
				System.out.printf("El area es %1.2f\n", cd.cuadrado());
				break;

			case 4:// Area de un rectangulo
				System.out.println("Indica el lado 1: ");
				double lado1 = in.nextDouble();
				System.out.println("Indica el lado 2: ");
				double lado2 = in.nextDouble();
				Rectangulo r = new Rectangulo(lado1, lado2);
				System.out.printf("El area es %1.2f\n", r.rectangulo());
				break;
			default:
				break;
			}
			Main.menu();
			opcion = in.nextInt();
		}
		System.out.println("Hasta Pronto!!!");

	}

}
