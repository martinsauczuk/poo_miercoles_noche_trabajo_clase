package practica2ej5;

public class Empleado {

    private String nombre;
//    private Regalo regaloArecibir;
    private TipoDeTransporte enQueViajo;

//    public void tuRegaloEs(Regalo unRegalo) {
//        this.regaloArecibir = unRegalo;
//    }

    public void tuMovilidadEs(TipoDeTransporte unTipoDeMovilidad) {
        this.enQueViajo = unTipoDeMovilidad;
    }

    public TipoDeTransporte enQueViajas() {
        return this.enQueViajo;
    }

}
