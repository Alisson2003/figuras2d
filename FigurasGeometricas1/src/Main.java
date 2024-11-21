import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        figurasGeometricas fig = new figurasGeometricas();

        fig.mostrarDatos();

        dos_D dos_D = new dos_D();
        dos_D.mostrarDatos();

        tres_D tres_D = new tres_D();
        tres_D.mostrarDatos();
        tres_D.mostrarDatos3D();

        Triangulo triangulo = new Triangulo();
        triangulo.mostrarDatos();


        double radio;

        System.out.println("ingrese el radio: ");
        radio = sc.nextDouble() ;

        Circulo circulo = new Circulo(radio);
        circulo.mostrarDatos();

    // Sobre escrituras de metodos
        //@override



    }
}