package me.dylanburton.blastarreborn.lasers;

import android.graphics.Bitmap;

/**
 * Created by Dylan on 7/16/2017.
 */

/*
 * Ship Laser will be used for all enemies
 */
public class ShipLaser {
    private float x = 0;
    private float y = 0;
    private float dx = 0;
    private float dy = 5;

    private Bitmap bmp;

    public ShipLaser(){}

    public ShipLaser(Bitmap bmp){
        this.bmp = bmp;

    }

    public Bitmap getBmp() {
        return bmp;
    }

    public void setBmp(Bitmap bmp) {
        this.bmp = bmp;
    }

    public void setPosition(float x, float y){
        this.x = x;
        this.y = y;

    }

    public float getDx(){
        return dx;
    }

    public float getDy(){
        return dy;
    }

    public void setDx(float dx){
        this.dx = dx;
    }

    public void setDy(float dy){
        this.dy = dy;
    }
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }


}
