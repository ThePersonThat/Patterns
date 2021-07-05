package com.alex.patterns.builder.example;

public class ComplextClass {
    /* some fields make it difficult to construct this class */
    private String name;
    private String address;
    private String type;
    private int age;
    private int count;
    private int price;


    private ComplextClass(Builder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.type = builder.type;
        this.age = builder.age;
        this.count = builder.count;
        this.price = builder.price;
    }


    /*
    * This class can implements some interface "Builder" if you need to have several Builders
    * for several types of object
    * */
    public static class Builder {
        /* default values if these fields are not initialized */
        private String name = "default";
        private String address = "default";
        private String type = "default";
        private int age = 0;
        private int count = 0;
        private int price = 0;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setCount(int count) {
            this.count = count;
            return this;
        }

        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public ComplextClass build() {
            return new ComplextClass(this);
        }
    }
}
