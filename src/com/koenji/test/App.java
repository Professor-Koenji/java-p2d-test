package com.koenji.test;

import processing.core.PApplet;

public class App extends PApplet {

    @Override
    public void settings () {
        this.size(1024, 768);
    }

    @Override
    public void setup () {
        this.surface.setTitle("P2D Test");

        this.background(0);
    }

    @Override
    public void draw () {
        this.fill(0, 0, 0, 10);
        this.rect(0, 0, 1024, 768);
        this.fill(255, 0, 255);
        this.noStroke();
        this.rect(20, 40, this.mouseX - 20, this.mouseY - 40);
    }

}
