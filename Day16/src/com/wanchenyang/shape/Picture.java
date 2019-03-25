package com.wanchenyang.shape;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * @author 晨阳
 * @version 1.0
 * @date 2019-03-22 15:09
 * @description
 **/
public class Picture extends JFrame
{

    private int width;
    private int height;
//    放图形的集合
    private ArrayList<Shape> shapeArrayList = new ArrayList<Shape>();
//    成员内部类
    private class ShapesPanel extends JPanel
{
    protected void paintComponent(Graphics graphics)
    {
        super.paintComponent(graphics);
        for (Shape s:
             shapeArrayList)
        {
            s.draw(graphics);
        }
    }
}


    public Picture(int width, int height)
    {
        add(new ShapesPanel());
        this.width = width;
        this.height = height;
        setLocationRelativeTo(null);
        setSize(width, height);
        setVisible(true);
    }

    public void add(Shape shape)
    {
        shapeArrayList.add(shape);
    }
}
