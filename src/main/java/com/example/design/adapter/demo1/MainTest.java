package com.example.design.adapter.demo1;

public class MainTest {
    public static void main(String[] args) {
        Source source=new Source();
        PowerAdapter powerAdapter = new PowerAdapter(source);
        powerAdapter.outputTarget();
    }
}
