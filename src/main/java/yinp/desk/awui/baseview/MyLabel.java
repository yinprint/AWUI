package yinp.desk.awui.baseview;

import yinp.desk.awui.listener.OnClickListener;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyLabel extends JLabel implements MouseListener , ViewM{
	private OnClickListener listener;
	private int MarginLeft,MarginTop,MarginRight,MarginDown;
	private int mx,my;
	
	public MyLabel(String name){
		super(name);
		
	}
	
	public MyLabel(String name, int center) {
		// TODO �Զ����ɵĹ��캯�����
		super(name,center);
	
	}

	public void setOnClickListener(OnClickListener listener){
		this.addMouseListener(this);
		
		this.listener=listener;
		
	}
	
	
	/*
	@Override
	public void setBackground(Color color){
		
		super.setBackground(color);
		super.setOpaque(true);
		
	}
	
	 */
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
		if(e.getComponent()==this){
			listener.onClick(e);
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void setMargin(int left, int top, int right, int down) {
		// TODO �Զ����ɵķ������
		MarginLeft=left;
		MarginTop=top;
		MarginRight=right;
		MarginDown=down;
		
		setLocation(mx,my);
	}
	
	@Override
	public void setLocation(int x,int y){
		
		mx=x;
		my=y;
		
		super.setLocation(x+MarginLeft, y+MarginTop);
		
		 
	}
	

	@Override
	public void setMargin(int wd) {
		// TODO �Զ����ɵķ������
		MarginLeft=wd;
		MarginTop=wd;
		MarginRight=wd;
		MarginDown=wd;
		
		setLocation(mx,my);
	}

	

}
