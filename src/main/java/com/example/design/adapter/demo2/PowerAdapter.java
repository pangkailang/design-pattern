package com.example.design.adapter.demo2;

public class PowerAdapter extends Source implements Target {
    @Override
    public void outputTarget() {
        super.outputSource();
    }
}
