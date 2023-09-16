package org.example.coding_principles.builder.example2;

public class CV {
    //this design pattern in convenient to use if your class has a big quantity of field
    // and you can logically create more than one type of object.
    private final String name;
    private final String address;
    private final String phone;
    private final String email;
    private final boolean hasExperience;
    private final boolean educated;
    private final boolean photoExists;

    private CV(Builder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.phone = builder.phone;
        this.email = builder.email;
        this.hasExperience = builder.hasExperience;
        this.educated = builder.educated;
        this.photoExists = builder.photoExists;
    }


    static Builder build() {
        return new Builder();
    }

    static class Builder {
        private String name;
        private String address;
        private String phone;
        private String email;
        private boolean hasExperience;
        private boolean educated;
        private boolean photoExists;

        Builder name(String name) {
            this.name = name;
            return this;
        }

        Builder address(String address) {
            this.address = address;
            return this;
        }

        Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        Builder email(String email) {
            this.email = email;
            return this;
        }

        Builder hasExperience(boolean hasExperience) {
            this.hasExperience = hasExperience;
            return this;
        }

        Builder educated(boolean educated) {
            this.educated = educated;
            return this;
        }

        Builder photoExists(boolean photoExists) {
            this.photoExists = photoExists;
            return this;
        }

        CV build() {
            return new CV(this);
        }
    }
}
