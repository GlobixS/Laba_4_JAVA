package com.itproger;

public class Main {
    public static void main(String[] args) {
        Amphibian frog = new Amphibian("Green Frog", 3);

        // Внутрішній клас (Композиція)
        Amphibian.Skin skin = frog.new Skin(true);
        skin.describe();

        // Асоціація — Environment існує незалежно
        Environment pond = new Environment("Pond");
        System.out.println("Frog lives near a " + pond.getType());

        // Агрегація — Biologist спостерігає, але не володіє
        Biologist b = new Biologist();
        b.observe(frog);

        InfoBook.AmphibianInfo.printInfo();
    }
}
