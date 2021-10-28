import java.util.List;

public class PonderacioneDeRecomendacion {
    private Asociable primerAsociable;
    private Asociable segundAsociable;
    private Integer valor;

    public Integer getValor() {
        return valor;
    }

    public Integer getPonderacion(Asociable asociableMascota, List<Asociable> elementoAsociar) {
        if(this.lasAsocia(asociableMascota,elementoAsociar)){
            return this.getValor();
        }else return 0;
    }

    private boolean lasAsocia(Asociable asociableMascota, List<Asociable> elementoAsociar) {
        return (asociableMascota.equals(primerAsociable) && elementoAsociar.contains(segundAsociable)) ||
        (asociableMascota.equals(segundAsociable) && elementoAsociar.contains(segundAsociable));
    }   

}
