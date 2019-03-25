package com.wanchenyang.shape;

import java.awt.*;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-22 16:17
 * @description
 **/
public class Rectangle extends  Shape
{
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics graphics)
    {
        graphics.clearRect(x, y, width, height);
    }
}
