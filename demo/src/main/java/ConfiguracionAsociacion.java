import java.util.List;

public class ConfiguracionAsociacion {
    private List<PonderacioneDeRecomendacion> ponderaciones;
    private List<CaracteristicaDeMascota> caracteristicas;
    private List<Comodidad> comodidades;

    public List<PonderacioneDeRecomendacion> getPonderaciones() {
        return ponderaciones;
    }

    public List<Comodidad> getComodidades() {
        return comodidades;
    }
    
    public List<CaracteristicaDeMascota> getCaracteristicas() {
        return caracteristicas;
    }

}
