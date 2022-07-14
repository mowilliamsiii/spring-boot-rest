package com.moseswilliamsiii.myrestfulservice.model;



public class Customer {

    private Integer Id;
    private String name;
    private Boolean isFemale;

    public Customer(Integer id, String name, Boolean isFemale) {
        Id = id;
        this.name = name;
        this.isFemale = isFemale;
    }

    public Integer getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public Boolean getFemale() {
        return isFemale;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", isFemale=" + isFemale +
                '}';
    }
}
