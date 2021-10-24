import java.util.List;

abstract class PublicacionParaAdoptar extends Publicacion{
    private Mascota mascota;
    // private Persona adoptante;

    public List<CaracteristicaDeUnaMascota> getCaracteristicaDeMascotas(){
        return mascota.getCaracteristicas();
    }
}