abstract class Publicacion {
    private Persona autor;
    private EstadoPublicacion estado;
    private Asociacion asociacion;
    
    public Persona getAutor() {
        return autor;
    }
    public Asociacion getAsociacion() {
        return asociacion;
    }
    public void setAsociacion(Asociacion asociacion) {
        this.asociacion = asociacion;
    }
    public EstadoPublicacion getEstado() {
        return estado;
    }
    public void setEstado(EstadoPublicacion estado) {
        this.estado = estado;
    }
    public void setAutor(Persona autor) {
        this.autor = autor;
    }

}
