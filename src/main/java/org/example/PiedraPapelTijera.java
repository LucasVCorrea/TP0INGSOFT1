package org.example;

public class PiedraPapelTijera {
    private final String nombre;
    private PiedraPapelTijera venceA;

    private PiedraPapelTijera(String nombre, PiedraPapelTijera venceA) {
        this.nombre = nombre;
        this.venceA = venceA;
    }

    public PiedraPapelTijera vs(PiedraPapelTijera otro) {
        return otro == this ? this : otro == venceA ? this : otro;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public static final PiedraPapelTijera PIEDRA = new PiedraPapelTijera("Piedra", null);
    public static final PiedraPapelTijera PAPEL = new PiedraPapelTijera("Papel", null);
    public static final PiedraPapelTijera TIJERA = new PiedraPapelTijera("Tijera", null);

    static {
        PIEDRA.venceA = TIJERA;
        PAPEL.venceA = PIEDRA;
        TIJERA.venceA = PAPEL;
    }
}
