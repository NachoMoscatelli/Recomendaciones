import java.util.List;

class PublicacionDeInteres extends Publicacion {
    private MascotaFicticia mascotaModelo;
    private List<Asociable> comodidades;

    public List<PublicacionParaAdoptar> leInteresa(List<PublicacionParaAdoptar> publicaciones){
        return (List<PublicacionParaAdoptar>) publicaciones.stream().filter(publicacion -> mascotaModelo.machea(publicacion.getMascota(),comodidades)).toList();
    }

}

