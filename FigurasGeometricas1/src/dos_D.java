public class dos_D extends figurasGeometricas {
    int nLados;

    public dos_D(){

    }

    public dos_D(int nLados) {
        this.nLados = nLados;
    }

    public dos_D(String tipo, int nLados) {
        super(tipo);
        this.nLados = nLados;
    }

    public int getnLados() {
        return nLados;
    }

    public void setnLados(int nLados) {
        this.nLados = nLados;
    }

    public void calcularArea2D(){
        System.out.println("Area");

    }

    public void calcularPerimetro2D(){
        System.out.println("Perimetro");

    }
    public void mostrarDatos(){
        System.out.println("Datos");
    }

}
