package org.example.coding_principles.builder.example1;

public class Laptop {
    private final int id;
    private final String brand;
    private final int ram;
    private final boolean touchscreen;
    private final double screen;

    private Laptop(Builder builder) {
        this.id = builder.id;
        this.brand = builder.brand;
        this.ram = builder.ram;
        this.touchscreen = builder.touchscreen;
        this.screen = builder.screen;
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", ram=" + ram +
                ", touchscreen=" + touchscreen +
                ", screen=" + screen +
                '}';
    }

    int getId() {
        return this.id;
    }

    String getBrand() {
        return this.brand;
    }

    int getRAM() {
        return this.ram;
    }

    boolean isTouchscreen() {
        return this.touchscreen;
    }

    double getScreen() {
        return this.screen;
    }

    Builder build() {
        return new Builder();
    }

    static class Builder {
        private int id;
        private String brand;
        private int ram;
        private boolean touchscreen;
        private double screen;

        Builder id(int id) {
            this.id = id;
            return this;
        }

        Builder brand(String brand){
            this.brand = brand;
            return this;
        }

        Builder ram(int ram){
            this.ram = ram;
            return this;
        }
         Builder touchscreen(boolean touchscreen){
            this.touchscreen = touchscreen;
            return this;
         }

        Builder screen(double screen){
            this.screen = screen;
            return this;
        }

        Laptop build(){
            return new Laptop(this);
        }
    }

}
