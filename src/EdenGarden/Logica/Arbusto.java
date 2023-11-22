package EdenGarden.Logica;

public class Arbusto extends Planta {
    private Double ancho;
    private Boolean domestico;
    private String variedad;
    private String colorHojas;
    private Boolean poda;
    public Arbusto(){

    }

    @Override
    public void saludo() {
        System.out.println("Hola soy un Arbusto");
    }

    public Arbusto(Double ancho, Boolean domestico, String variedad,String colorHojas, Boolean poda ){
        this.ancho = ancho;
        this.domestico = domestico;
        this.variedad = variedad;
        this.colorHojas = colorHojas;
        this.poda = poda;
    }
    public Double getAncho(){
        return ancho;
    }
    public void setAncho(Double ancho){
        this.ancho = ancho;
    }
    public Boolean getDomestico(){
        return  domestico;
    }
    public void setDomestico(Boolean domestico){
        this.domestico = domestico;
    }
    public String getVariedad(){
        return variedad;
    }
    public void setVariedad( String variedad){
        this.variedad = variedad;
    }
    public String getColorHojas(){
        return  colorHojas;
    }
    public void setColorHojas(String colorHojas){
        this.colorHojas = colorHojas;
    }
    public Boolean getPoda(){
        return poda;
    }
    public void setPoda(Boolean poda){
        this.poda = poda;
    }

    @Override
    public String toString() {
        return "Arbusto{" +
                "ancho=" + ancho +
                ", domestico=" + domestico +
                ", variedad='" + variedad + '\'' +
                ", colorHojas='" + colorHojas + '\'' +
                ", poda=" + poda +
                '}';
    }
}
