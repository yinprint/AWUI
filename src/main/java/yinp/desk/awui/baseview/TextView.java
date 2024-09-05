package yinp.desk.awui.baseview;

import yinp.desk.awui.listener.OnClickListener;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TextView extends JLabel implements MouseListener , ViewM{
	private OnClickListener listener;
	public int MarginLeft,MarginTop,MarginRight,MarginDown;
	private int mx,my;
	
	public TextView(String name){
		super(name);
		this.addMouseListener(this);
	 
	}
	
	public TextView(String name, int center) {
		// TODO �Զ����ɵĹ��캯�����
		
		super(name,center);
		this.addMouseListener(this);
		
	}

	public void setOnClickListener(OnClickListener listener){
		 
		 
		
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
		
		if(e.getComponent()==this&&listener!=null){
			//Toast.show(this.getText());
			listener.onClick(e);
		}
		else{
		 	//Toast.show(getParent().toString());
			e.setSource(getParent());
			((MyPanel) getParent()).mouseClicked(e);
		}
	   //  Toast.show(this.getText());

		//System.out.println("点击1："+e.getLocationOnScreen().x+"_"+e.getLocationOnScreen().y);


	}

	@Override
	public void mousePressed(MouseEvent e) {


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
	
	 
	public void setSMargin(int left, int top, int right, int down) {
		// TODO �Զ����ɵķ������
		MarginLeft=left;
		MarginTop=top;
		MarginRight=right;
		MarginDown=down;
		
		super.setLocation(mx+MarginLeft, my+MarginTop);
	}
	
	@Override
	public void setLocation(int x,int y){
		
		mx=x;
		my=y;
		
		//super.setLocation(x+MarginLeft, y+MarginTop);
		super.setLocation(x, y);
		
		 
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
	
	public String getId(){
		return this.getName();
	}

	

}
