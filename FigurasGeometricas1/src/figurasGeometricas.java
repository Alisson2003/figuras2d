public class figurasGeometricas {
    String tipo;

    public figurasGeometricas() {

    }
    public figurasGeometricas(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public void mostrarDatos(){
        System.out.println("Tipo: " + tipo);

    }

}
