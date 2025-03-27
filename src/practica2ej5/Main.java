package practica2ej5;

public class Main {

    public static void main(String[] args) {

        Regalo voucher50lucas = new Regalo();
        Regalo kitSeguridad = new Regalo();

        TipoDeTransporte colectivo = new TipoDeTransporte();
        colectivo.setRegaloMerecido(voucher50lucas);

        TipoDeTransporte bici = new TipoDeTransporte();
        bici.setRegaloMerecido(kitSeguridad);

        Empleado julian = new Empleado();
        julian.tuMovilidadEs(colectivo);
        System.out.println( julian.enQueViajas().getRegaloMerecido());


        Empleado samuel = new Empleado();
        samuel.tuMovilidadEs(bici);

        Empleado empleado = new Empleado();
        empleado.tuMovilidadEs(bici);

        // ESTO ES LO QUE NO QUEREMOS HACER
//        if (empleado.enQueViajas() == bici) {
//            empleado.tuRegaloEs(kitSeguridad);
//        }
//
//        if (empleado.enQueViajas() == colectivo) {
//            empleado.tuRegaloEs(voucher50lucas);
//        }



    }
}
