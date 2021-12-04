package com.mhamadelitawi.peopleFlow.src.model;

import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String name;
    private String phone;
    private String mail;
    private Integer age;
    private StateMachine status;

    public Employee() {
    }

    public Employee(Integer id, String name, String phone, String mail, Integer age) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.age = age;
    }

    public Employee(String name, String phone, String mail, Integer age) {
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public StateMachine getStatus() {
        return status;
    }

    public void setStatus(StateMachine status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                ", age=" + age +
                ", status=" + status +
                '}';
    }
}
