package org.example;


import java.util.Map;
import java.util.Scanner;

public class JuegoPiedraPapelTijera {
    private static final Map<String, PiedraPapelTijera> OPCIONES = Map.of(
            "piedra", PiedraPapelTijera.PIEDRA,
            "papel", PiedraPapelTijera.PAPEL,
            "tijera", PiedraPapelTijera.TIJERA
    );

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jugador 1 (Piedra, Papel o Tijera): ");
        PiedraPapelTijera jugador1 = OPCIONES.get(scanner.next().toLowerCase());

        System.out.print("Jugador 2 (Piedra, Papel o Tijera): ");
        PiedraPapelTijera jugador2 = OPCIONES.get(scanner.next().toLowerCase());

        System.out.println("Resultado: " + jugador1.vs(jugador2));

        scanner.close();
    }
}
