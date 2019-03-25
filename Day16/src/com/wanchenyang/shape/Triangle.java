package com.wanchenyang.shape;

import java.awt.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-22 15:08
 * @description
 **/
public class Triangle extends Shape
{
    private int[] x = new int[3];
    private int[] y = new int[3];

    public Triangle(int x1,int y1,int x2,int y2,int x3,int y3)
    {
        x[0] = x1;
        x[1] = x2;
        x[2] = x3;
        y[0] = y1;
        y[1] = y2;
        y[2] = y3;

    }

    @Override
    public void draw(Graphics graphics)
    {
        graphics.drawPolygon(x, y, x.length);
    }
}
