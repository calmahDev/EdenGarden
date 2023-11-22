package EdenGarden.Logica;

public abstract class Planta {
    private String nombre;
    private  Double altoPalo;
    private Boolean hojas;
    private String climaIdeal;

    public Planta() {
    }

    public Planta(String nombre, Double altoPalo, Boolean hojas, String climaIdeal) {
        this.nombre = nombre;
        this.altoPalo = altoPalo;
        this.hojas = hojas;
        this.climaIdeal = climaIdeal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getAltoPalo() {
        return altoPalo;
    }

    public void setAltoPalo(Double altoPalo) {
        this.altoPalo = altoPalo;
    }

    public Boolean getHojas() {
        return hojas;
    }

    public void setHojas(Boolean hojas) {
        this.hojas = hojas;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }
    public abstract void saludo();
}
