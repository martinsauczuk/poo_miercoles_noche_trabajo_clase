public class Auto {

    private String color;
    private String marca;
    private int year;
    private int km = 0;

    public void viajar(int kmViaje) {
        km = km + kmViaje;
    }

    public int cuantosKmLlevas() {
        return km;
    }

    public void tuMarcaEs(String unaMarca) {
        marca = unaMarca;
    }

}
