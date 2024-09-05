package yinp.desk.awui.baseview;

import yinp.desk.awui.listener.OnTouchListener;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class ScrollBar extends Panel implements MouseListener ,MouseMotionListener{
	
	private OnTouchListener listener;
	
	private int PressedDown,Up;
	
	//λ��
	private int Lx,Ly;
	
	private float PressDx,PressDy;
	private float MoveX,MoveY;
	private float ReleaseX,ReleaseY;
 
	private boolean isPressed=false;
	private boolean isGun=false;
	
	//ACTION
	//0  ����
	//1 �ƶ�
	//2 �ɿ�
	
	
	public ScrollBar(){
		super();
		
		this.setBackground(new Color(54,54,54));
		this.setSize(6, 200);
	}
	
	
	public void setLocation(int x,int y){
		Lx=x;
		Ly=y;
		
		super.setLocation(Lx, Ly);
	}
	
	public void setOnTouchListener(OnTouchListener listener){
		this.listener=listener;
		
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
	}



	@Override
	public void mousePressed(MouseEvent e) {
		// TODO �Զ����ɵķ������
		PressDy=e.getY();
		listener.OnTouch(e, 0);
		
	 
		 
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO �Զ����ɵķ������
	 
		ReleaseY=e.getY();
		Ly=this.getY();
		
		listener.OnTouch(e, 2);
		
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
	public void mouseDragged(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
		MoveY=e.getY();
		super.setLocation(Lx, (int) (Ly+(MoveY-PressDy)));
		System.out.print("�ƶ�MoveY��"+e.getY());
		
		 listener.OnTouch(e, 1);
		
	}



	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO �Զ����ɵķ������
		 
		 
	}


 
	

}
