public class Circulo extends dos_D{
    double radio;

    public Circulo() {

    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void calcularAreaCirculo(){
        System.out.println("Raio del circulo: " + radio);
        double area = Math.PI * radio * radio;
        System.out.println("Area del circulo: " + area);

    }

    public void calcularPerimetroCirculo(){
        double perimetro = 2 * Math.PI * radio;
        System.out.println("Perimetro del circulo: " + perimetro);
    }

    @Override
    public void mostrarDatos(){
        calcularAreaCirculo();
        calcularPerimetroCirculo();

    }

}
