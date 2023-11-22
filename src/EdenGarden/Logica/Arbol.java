package EdenGarden.Logica;

public class Arbol extends Planta {
    private String variedad;
    private String tipoTronco;
    private Double radio;
    private String colorHojas;
    private String tipoHojas;
    public Arbol(){

    }

    @Override
    public void saludo() {
        System.out.println("Hola soy un Arbol");
    }

    public Arbol(String variedad, String tipoTronco, Double radio,String colorHojas, String tipoHojas){
        this.variedad = variedad;
        this.tipoTronco = tipoTronco;
        this.radio = radio;
        this.colorHojas = colorHojas;
        this.tipoHojas = tipoHojas;

    }
    public String getVariedad(){
        return variedad;
    }
    public void setVariedad(String variedad){
        this.variedad = variedad;
    }
    public String getTipoTronco(){
        return  tipoTronco;
    }
    public void setTipoTronco(String tipoTronco){
        this.tipoTronco = tipoTronco;
    }
    public Double getRadio(){
        return radio;
    }
    public void setRadio(Double radio){
        this.radio = radio;
    }
    public String getColorHojas(){
        return colorHojas;
    }
    public void setColorHojas(String colorHojas){
        this.colorHojas = colorHojas;
    }
    public String getTipoHojas(){
        return  tipoHojas;
    }
    public void setTipoHojas(){
        this.tipoHojas=tipoHojas;
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "variedad='" + variedad + '\'' +
                ", tipoTronco='" + tipoTronco + '\'' +
                ", radio=" + radio +
                ", colorHojas='" + colorHojas + '\'' +
                ", tipoHojas='" + tipoHojas + '\'' +
                '}';
    }
}
