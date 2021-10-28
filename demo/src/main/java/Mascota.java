import java.util.List;

abstract class Mascota {
    private List<CaracteristicaDeUnaMascota> caracteristicas;
    private Asociacion asociacion;

    public List<CaracteristicaDeUnaMascota> getCaracteristicas() {
        return caracteristicas;
    }

    public Asociacion getAsociacion() {
        return asociacion;
    }

    public void setAsociacion(Asociacion asociacion) {
        this.asociacion = asociacion;
    }

    public void setCaracteristicas(List<CaracteristicaDeUnaMascota> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
}
