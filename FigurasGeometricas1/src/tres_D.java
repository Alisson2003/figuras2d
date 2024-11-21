public class tres_D extends figurasGeometricas{
    int nLados;
    int nCaras;

    public tres_D (){

    }

    public tres_D( int nLados, int nCaras) {
        this.nLados = nLados;
        this.nCaras = nCaras;
    }

    public tres_D(String tipo, int nLados, int nCaras) {
        super(tipo);
        this.nLados = nLados;
        this.nCaras = nCaras;
    }


    public int getnLados() {
        return nLados;
    }

    public void setnLados(int nLados) {
        this.nLados = nLados;
    }

    public int getnCaras() {
        return nCaras;
    }

    public void setnCaras(int nCaras) {
        this.nCaras = nCaras;
    }

    public void calcularArea3D(){
        System.out.println("Area");

    }

    public void calcularVolumen3D(){
        System.out.println("Volumen");

    }

    public void mostrarDatos3D(){
        System.out.println("Datos");

    }

}
