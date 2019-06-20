package laboratorioCaja;

public class Caja {
    int ancho, largo, alto;

    Caja(){this.ancho =0; this.largo=0; this.alto=0;}
    Caja(int ancho, int largo, int alto){this.ancho =ancho; this.largo=largo; this.alto=alto;}

    int volumen() {return this.ancho*this.largo*this.alto;}
}
