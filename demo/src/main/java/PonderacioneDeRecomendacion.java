import java.util.List;

public class PonderacioneDeRecomendacion {
    private List<Asociable> comparables;
    private Integer valor;

    public boolean contiene(Asociable elemento){
        return comparables.contains(elemento);
    }

    public Integer getValor() {
        return valor;
    }    
}
