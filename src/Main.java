import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text

//        Pepita pepita = new Pepita();

//        System.out.println( "Energia" + pepita.cuantaEnergiaTeQueda() );
//        pepita.vola();
//        pepita.vola();
//        pepita.vola();
//        System.out.println( "Energia despues del vuelo" + pepita.cuantaEnergiaTeQueda() );
//
//        int numero = 45;
//
//
//        Auto auto = new Auto();
//        System.out.println( auto.cuantosKmLlevas() );
//        auto.viajar(100);
//        System.out.println( auto.cuantosKmLlevas() );
//        System.out.println( auto.cualEsTuniveldeCombusible() );
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Cual es tu edad?");
//        int edad = input.nextInt();
//        System.out.println("Cual es tu nombre?");
//
//        String nombreIngresado = input.next();
//
//        System.out.println("Nombre:" + nombreIngresado + " Edad:" + edad);


//        Dron dron = new Dron();
//        dron.encender();
//
//        Pepita pepita = new Pepita();
//        pepita.tuVehiculoEs(dron);
//
//        pepita.cualEsTuVehiculo().encender();

        Auto bugatiRojo = new Auto();
        Auto ferrariGris = new Auto();
        Auto miAuto = ferrariGris;

        System.out.println(bugatiRojo);
        System.out.println(ferrariGris);
        System.out.println(miAuto);

        bugatiRojo.viajar(60);
        int kmsDelBugatiEnEsteMomento = bugatiRojo.cuantosKmLlevas();

        ferrariGris.viajar(100);
        System.out.println(ferrariGris.cuantosKmLlevas());
        miAuto.viajar(10);
        System.out.println(miAuto.cuantosKmLlevas());

        miAuto = new Auto();
        System.out.println(miAuto.cuantosKmLlevas());



        //
//        boolean comparacion = bugatiRojo != ferrariGris;

        Persona luciano = new Persona();
        luciano.tuParejaEs( luciano );

        final Persona p1 = luciano.cualEsTuPareja();
        p1.tuParejaEs(new Persona());

        System.out.println( luciano.cualEsTuPareja() );
        System.out.println( luciano.cualEsTuPareja() );
        System.out.println( luciano.cualEsTuPareja() );
        System.out.println( luciano.cualEsTuPareja() );

//        System.out.println( luciano.cualEsTuPareja() == luciano.cualEsTuPareja() );








    }
}