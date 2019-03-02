package com.wanchenyang.learn;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
/**
 * 
 * @Description:����С��
 * @author: ����
 * @date:   2019��2��27�� ����2:36:15   
 * @version V1.0
 */
public class MyBall extends JFrame implements KeyListener
{
	int x = 40;
	int y = 40;
	
	void startLaunch()
	{
		setSize(500, 500);	//����������С
		setLocation(10,10);	//������������Ļƫ��
		setVisible(true);	//Ĭ�ϲ��ɼ�
		setDefaultCloseOperation(EXIT_ON_CLOSE);	//�رճ���
		this.addKeyListener(this);	//����ע��
	}
	
	
	public static void main(String[] args)
	{
		MyBall ball = new MyBall();
		ball.startLaunch();
	
	}
	
	
	
	public void paint(Graphics g) 
	{
		super.paint(g);
		g.setColor(Color.RED);	//������ɫ
		g.drawOval(x, y, 100, 100);	//��Բ��ƫ�ƣ���С��
		g.drawRect(x, y, 50, 80);	//������	
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
