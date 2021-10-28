import java.util.List;

public class MascotaFicticia extends Mascota{
    private List<Asociable> caracteristicasDeseadas;


    public boolean machea(MascotaReal mascota, List<Asociable> comodidades){
        List<CaracteristicaDeUnaMascota> caracateristicasDeMascota = (List<CaracteristicaDeUnaMascota>) mascota.getCaracteristicas();
        List<PonderacioneDeRecomendacion> ponderacionesAsociacionDeLAPublicacion = this.getAsociacion().getPonderaciones();

        Integer ponderacionMascotaParecida = (Integer) caracateristicasDeMascota.stream().mapToInt(caracteristica -> caracteristica.ponderacion(caracteristicasDeseadas,ponderacionesAsociacionDeLAPublicacion)).sum();
        Integer ponderacionPorComodidad = (Integer) caracateristicasDeMascota.stream().mapToInt(caracteristica -> caracteristica.ponderacion(comodidades,ponderacionesAsociacionDeLAPublicacion)).sum();
        Integer ponderacionFinal = ponderacionMascotaParecida + ponderacionPorComodidad;

        return ponderacionFinal >= this.getAsociacion().getValorDeInteres();
    }
}
