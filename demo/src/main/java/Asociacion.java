import java.util.List;

public class Asociacion {
    private String nombre;
    private ConfiguracionAsociacion configuracion;
    private Direccion direccion;

    public List<CaracteristicaDeMascota> getCaracteristicas(){
        return configuracion.getCaracteristicas();
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public List<Comodidad> getComodidades(){
        return configuracion.getComodidades();
    }

    public String getNombre(){
        return nombre;
    }
}
