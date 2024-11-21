public class Cuadrado extends dos_D{
    double lado;

    public Cuadrado(){

    }
    public Cuadrado(double lado){
        this.lado = lado;
    }


    public Cuadrado(String tipo, int nLados, double lado) {
        super(tipo, nLados);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void calcularAreaCuadrado(){


    }

    public void calcularPerimetroCuadrado(){


    }

    @Override
    public void mostrarDatos(){

    }
}
