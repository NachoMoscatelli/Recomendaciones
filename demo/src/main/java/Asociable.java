import java.util.List;

public interface Asociable {

    default Integer ponderacion(List<Asociable> elementoAsociar, List<PonderacioneDeRecomendacion> ponderacionesAsociacionDeLAPublicacion){
        Integer resultado = ponderacionesAsociacionDeLAPublicacion.stream().mapToInt(ponderacion -> ponderacion.getPonderacion(this,elementoAsociar)).sum();
        return resultado;
    }
}
