import java.util.List;

public class Asociacion {
    private String nombre;
    private static ConfiguracionAsociacion configuracion;
    private Direccion direccion;

    public List<CaracteristicaDeMascota> getCaracteristicas(){
        return configuracion.getCaracteristicas();
    }
    
    public List<Comodidad> getComodidades(){
        return configuracion.getComodidades();
    }
        
    public List<PonderacioneDeRecomendacion> getPonderaciones() {
        return (List<PonderacioneDeRecomendacion>) configuracion.getPonderaciones();
    }
    
    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
        
    public String getNombre(){
        return nombre;
    }

    public Integer getValorDeInteres() {
        return configuracion.getValorDeInteres();
    }

}
