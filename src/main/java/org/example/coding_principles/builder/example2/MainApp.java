package org.example.coding_principles.builder.example2;

 class MainApp {
    public static void main(String[] args) {

        CV ani = CV.build().name("Ani")
                .educated(true)
                .hasExperience(true)
                .photoExists(false)
                .build();
    }
}
