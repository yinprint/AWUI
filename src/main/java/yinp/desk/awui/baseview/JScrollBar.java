package yinp.desk.awui.baseview;

import yinp.desk.awui.listener.OnTouchListener;

import java.awt.*;
import java.awt.event.*;


public class JScrollBar extends Panel implements MouseListener ,MouseMotionListener,MouseWheelListener{
	
	private OnTouchListener listener;
	
	private int PressedDown,Up;
	
	//λ��
	private int Lx,Ly;
	
	private float PressDx,PressDy;
	private float MoveX,MoveY;
	private float ReleaseX,ReleaseY;
 
	private boolean isPressed=false;
	private boolean isGun=false;
	
	//�ڲ��ؼ�
	public Component child;
	private ScrollBar bar;
	
	private int width,height;
	
	//ACTION
	//0  ����
	//1 �ƶ�
	//2 �ɿ�
	
	
 
	
	
	public JScrollBar(Component view,int width,int height){
		setLayout(null);
		
		this.width=width;
		this.height=height;
		super.setSize(width, height);
		view.setSize(width, height);
		
		bar=new ScrollBar();
		bar.setLocation(width-4, 0);
		//bar.setVisible(false);
		this.add(bar);
		this.addMouseWheelListener(this);
		
		child=view;
		
		 this.add(child);
		 
	}
	
	public void setSize(int width,int height){
		
		super.setSize(width, height);
		this.width=width;
		this.height=height;
				
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


	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		// TODO �Զ����ɵķ������
		 if(e.getWheelRotation()==1){//ǰ
			 if(child.getPreferredSize().getHeight()>this.height) {
				 child.setSize(this.width,(int) child.getPreferredSize().getHeight());
				 bar.setSize(6, (int) (height*height/child.getPreferredSize().getHeight()));
			 }
			 else {//û��BAR
				 
			 }
			 
			 int hd=(int) (10*height/child.getPreferredSize().getHeight());
			 
			 
			 bar.setLocation(bar.getX(), bar.getY()+hd);
			 child.setLocation(child.getX(), child.getY()-10);
		 }
		 
		 
		 if(e.getWheelRotation()==-1&&child.getY()<0){//��
			 
			 int hd=(int) (10*height/child.getPreferredSize().getHeight());
			 
			 bar.setLocation(bar.getX(), bar.getY()-hd);
			 child.setLocation(child.getX(), child.getY()+10);
		 }
		
	}


 
	

}
