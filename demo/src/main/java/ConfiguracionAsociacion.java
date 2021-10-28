import java.util.List;

public class ConfiguracionAsociacion {
    private List<PonderacioneDeRecomendacion> ponderaciones;
    private List<CaracteristicaDeMascota> caracteristicas;
    private List<Comodidad> comodidades;
    private Integer valorInteres;

    public List<PonderacioneDeRecomendacion> getPonderaciones() {
        return ponderaciones;
    }

    public Integer getValorInteres() {
        return valorInteres;
    }

    public void setValorInteres(Integer valorInteres) {
        this.valorInteres = valorInteres;
    }

    public List<Comodidad> getComodidades() {
        return comodidades;
    }
    
    public List<CaracteristicaDeMascota> getCaracteristicas() {
        return caracteristicas;
    }

    public Integer getValorDeInteres() {
        return valorInteres;
    }

}
