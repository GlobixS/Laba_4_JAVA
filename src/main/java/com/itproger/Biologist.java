package com.itproger;

public class Biologist {

    public void observe(Amphibian amphibian) {

        class Note {
            private String observation;

            public Note(String observation) {
                this.observation = observation;
            }

            public void record() {
                System.out.println("Спостереження: " + observation);
            }
        }

        Note note = new Note("Спостереження за земневодними: " + amphibian.getClass().getSimpleName());
        note.record();
    }
}
