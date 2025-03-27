public class Pepita {

    private int nivelDeEnergia = 100;
    private Dron miDron;

    public int cuantaEnergiaTeQueda() {
        return nivelDeEnergia;
    }

    public void come(int gramos) {
        nivelDeEnergia ++;
    }

    public void vola() {
        nivelDeEnergia --;
    }

    public Dron cualEsTuVehiculo() {
        return miDron;
    }

    public void tuVehiculoEs(Dron unDron) {
        miDron = unDron;
    }



}
