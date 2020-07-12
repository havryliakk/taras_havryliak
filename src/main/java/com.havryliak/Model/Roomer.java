package com.havryliak.Model;

public class Roomer {
    private String first_name;
    private String second_name;
    private int age;
    private String nationality;

    public Roomer(String first_name, String second_name, int age, String nationality) {
        this.first_name = first_name;
        this.second_name = second_name;
        this.age = age;
        this.nationality = nationality;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return nationality;
    }

    public void setCountry(String country) {
        this.nationality = country;
    }

    @Override
    public String toString() {
        return "Roomer{" +
                "first_name='" + first_name + '\'' +
                ", second_name='" + second_name + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
