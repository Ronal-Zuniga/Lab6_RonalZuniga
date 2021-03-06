
package lab6_ronalzuniga;

public class Canciones {
    private String nombre;
    private int puntuacion;
    private int year;
    private String artista;
    private String album;

    public Canciones() {
    }

    public Canciones(String nombre, int puntuacion, int year, String artista, String album) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.year = year;
        this.artista = artista;
        this.album = album;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
