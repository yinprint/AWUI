package yinp.desk.awui.baseview;

import yinp.desk.awui.listener.OnClickListener;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyPanel extends Panel implements ViewM,MouseListener{
	
	public int id,type;
	public int MarginLeft,MarginTop,MarginRight,MarginDown;
	public int PadLeft,PadTop,PadRight,PadDown;
	private int mx,my;
	public int Width,Height;
	private int childSum;
	private OnClickListener listener;
	public String tag;
	 
	 
	public MyPanel(){
		
		 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	
	
	public void setLayoutParams(int width,int height){
		this.Width=width;
		this.Height=height;
	}
	
	
	@Override
	public void setSize(int width,int height){
		this.Width=width;
		this.Height=height;
		
		super.setSize(width, height);
	}
	
	public void setOnClickListener(OnClickListener listener){
		 
		this.addMouseListener(this);
		this.listener=listener;
		
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
	public int getHeight(){
		return super.getHeight()+PadDown;
	}

	 
	 
	public void setPadding(int left, int top, int right, int down) {
		// TODO �Զ����ɵķ������
		PadLeft=left;
		PadTop=top;
		PadRight=right;
		PadDown=down; 
		 
		
	}

	 
	public void setPadding(int wd) {
		// TODO �Զ����ɵķ������
		PadLeft=wd;
		PadTop=wd;
		PadRight=wd;
		PadDown=wd;
		
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

	
	public Component findViewById(int id){
		
		return  this.getComponent(id);
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO �Զ����ɵķ������
		//Toast.show(getParent().toString());
		
		System.out.print("\ntoast:"+getParent().toString());
		
		if(e.getComponent()==this&&listener!=null){
			listener.onClick(e);
			//Toast.show("Mypannel");
		}
		else{
			
			 
		 	 
	     if(getParent().getClass()==MyPanel.class){
	    	 e.setSource(getParent());
			((MyPanel) getParent()).mouseClicked(e);
			
	     }
	     else if(getParent().getClass()==Panel.class){
	    	 //((Panel) getParent()).mouseClicked(e);
	    	 // Toast.show(getParent().toString());
	     }
	     else  if(getParent().getClass()==HorListView.class){
	    	// e.setSource(e);
	    	 ((HorListView) getParent()).mouseClicked(e);
	    	 //Toast.show(getParent().toString());
	     }
	     else  if(getParent().getClass()==LinearLayout.class){
		    	// e.setSource(e);
		    	 ((LinearLayout) getParent()).mouseClicked(e);
		    	 //Toast.show(getParent().toString());
		     }
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





}
