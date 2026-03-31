package TP2;

public class Main {
    public static void main(String[] args) {
        SangPelempar pelempar1 = new SangPelempar("Kelvin", "Eiger", 42, 25.5, "Helm", "Hoodie");
        SangPelempar pelempar2 = new SangPelempar("Joy", "New Era", 44, 28, "Songkok", "Sarung");

        pelempar1.checkStatus();
        pembatas();

        pelempar2.checkStatus();
        pembatas();

        pelempar1.throwing(pelempar2);
        pelempar2.checkStatus();
        pembatas();
        pelempar1.checkStatus();
        pembatas();

        pelempar1.sandal.damageLemaparan = 25;
        pelempar2.sandal.damageLemaparan = 15;

        pelempar1.throwing(pelempar2);
        pelempar2.checkStatus();
        pembatas();
        pelempar1.checkStatus();
        pembatas();

    }

    public static void pembatas() {
        System.out.println("=====================================");
    }
}
