public class Triangulo extends dos_D{
    double base;
    double altura;
    double lado;

    public Triangulo() {
    }

    public Triangulo(double base, double altura, double lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    public Triangulo(String tipo, int nLados, double base, double altura, double lado) {
        super(tipo, nLados);
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void calcularAreaTiangulo(){
        System.out.println("");
    }

    public void calcularPerimetroTiangulo(){
        System.out.println("");

    }
    @Override
    public void mostrarDatos(){
    }

}
