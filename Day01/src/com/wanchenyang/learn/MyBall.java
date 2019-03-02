package com.wanchenyang.learn;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
/**
 * 
 * @Description:描述小球
 * @author: 晨阳
 * @date:   2019年2月27日 下午2:36:15   
 * @version V1.0
 */
public class MyBall extends JFrame implements KeyListener
{
	int x = 40;
	int y = 40;
	
	void startLaunch()
	{
		setSize(500, 500);	//设置容器大小
		setLocation(10,10);	//设置容器在屏幕偏移
		setVisible(true);	//默认不可见
		setDefaultCloseOperation(EXIT_ON_CLOSE);	//关闭程序
		this.addKeyListener(this);	//进行注册
	}
	
	
	public static void main(String[] args)
	{
		MyBall ball = new MyBall();
		ball.startLaunch();
	
	}
	
	
	
	public void paint(Graphics g) 
	{
		super.paint(g);
		g.setColor(Color.RED);	//画笔颜色
		g.drawOval(x, y, 100, 100);	//画圆（偏移，大小）
		g.drawRect(x, y, 50, 80);	//画矩形	
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		// TODO Auto-generated method stub
		System.out.println(e.getKeyCode());
		if(e.getKeyCode() == KeyEvent.VK_UP) 
		{
			System.out.println("up");
			y -= 5;
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) 
		{
			System.out.println("down");
			y += 5;
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT) 
		{
			System.out.println("left");
			x -= 5;
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) 
		{
			System.out.println("right");
			x += 5;
		}
		repaint();
		
	}


	@Override
	public void keyReleased(KeyEvent e)
	{
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	
	
	

}
