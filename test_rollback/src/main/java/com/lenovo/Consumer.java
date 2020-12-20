package com.lenovo;

import java.util.Objects;

public class Consumer {
    private String name;
    private Integer age;
    private String email;

    public Consumer() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Consumer)) return false;
        Consumer consumer = (Consumer) o;
        return Objects.equals(name, consumer.name) &&
                Objects.equals(age, consumer.age) &&
                Objects.equals(email, consumer.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email);
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    public Consumer(String name, Integer age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
