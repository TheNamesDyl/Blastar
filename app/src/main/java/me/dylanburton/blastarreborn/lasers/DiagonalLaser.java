package me.dylanburton.blastarreborn.lasers;

import android.graphics.Bitmap;

import me.dylanburton.blastarreborn.spaceships.Ship;
import me.dylanburton.blastarreborn.spaceships.ShipType;

/**
 * Created by Dylan on 7/16/2017.
 */

public class DiagonalLaser extends ShipLaser{



    public DiagonalLaser(Ship ship, Bitmap laserBitmap, float x, float y, int slope ){ //slope, dont input 0 into parameter because thats not a diagonal line, thats horizontal


        setShip(ship);
        setEnemyLaser(true);
        setBmp(laserBitmap);

        if(slope != 0 && !(slope >= 10)) {//this wont make sense until you draw it out on paper (atleast it didnt for me)
            if (slope < 0) {
                setDx(-8);
            } else {
                setDx(8);
            }
            setDy(5);
            slope = slope * -1;

            if (slope > 1 && slope < 10) {
                setDx(getDx() * (1 - slope / 10)); //makes Dx smaller as slope gets bigger
            } else if (slope < 1) {
                setDy(getDy() * (slope*-1)); //makes Dy smaller as slope gets smaller
            }

            //if slope = 0, then dx and dy are already set to 5
        }

        setX(x);
        setY(y);

    }



}
