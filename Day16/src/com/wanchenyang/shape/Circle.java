package com.wanchenyang.shape;

import java.awt.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-22 15:07
 * @description
 **/
public class Circle extends Shape
{
    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw(Graphics graphics)
    {
        graphics.drawOval(x-radius, y-radius, radius*2, radius*2);
    }
}
