package com.example.demo.model;

public class Retry {
    int count;
    int noOfAttenpts;

    public Retry(int count, int noOfAttenpts) {
        this.count = count;
        this.noOfAttenpts = noOfAttenpts;
    }
    public Retry(){}

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getNoOfAttenpts() {
        return noOfAttenpts;
    }

    public void setNoOfAttenpts(int noOfAttenpts) {
        this.noOfAttenpts = noOfAttenpts;
    }

    @Override
    public String toString() {
        return "Retry{" +
                "count=" + count +
                ", noOfAttenpts=" + noOfAttenpts +
                '}';
    }
}
