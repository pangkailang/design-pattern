package com.example.design.adapter.demo1;

public class PowerAdapter implements Target {
    private Source source;
    public PowerAdapter(Source source){
        this.source=source;
    }
    @Override
    public void outputTarget() {
        source.outputSource();
    }
}
