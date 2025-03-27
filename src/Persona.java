public class Persona {

    private Mascota miMascota;
    private Mascota miOtraMascota;

    private int edad;
    private Persona miPareja;


    public Mascota dameLaReferenciaATuMascota() {
        return miMascota;
    }

    public void tuParejaEs(Persona unaPersona) {
        this.miPareja = unaPersona;
    }

    public Persona cualEsTuPareja() {
//        return miPareja;
        return new Persona();
    }

}
