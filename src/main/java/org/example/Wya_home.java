package org.example;

public class Wya_home {
    public static void main(String[] args) {
        int path = 5;
        double speedTaxi = 60;
        double timeOfPath = (double) path / speedTaxi;
        double delay = 0.35;
        double timePathOfHome = timeOfPath + delay;

        System.out.println("Время на путь до дома составляет " + timePathOfHome + " часов");

    }
}
