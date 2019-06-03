package com.rabbit.bean;

public class Employee {
    private String name;
    private int age;
    private String address;
    private String contact;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }

    public Employee() {
    }

    public Employee(String name, int age, String address, String contact) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.contact = contact;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }
}
