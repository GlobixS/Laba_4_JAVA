package com.itproger;

    // Amphibian.java
    public class Amphibian {
        private String name;
        private int age;

        public Amphibian(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public class Skin {
            private boolean isMoist;

            public Skin(boolean isMoist) {
                this.isMoist = isMoist;
            }

            public void describe() {
                System.out.println(name + " has " + (isMoist ? "moist" : "dry") + " skin.");
            }
        }

        public void speak() {
            System.out.println(name + " makes a sound.");
        }
    }


