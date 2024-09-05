package yinp.desk.awui.baseview;

import yinp.desk.awui.listener.JTextFieldHintListener;
import yinp.desk.awui.listener.OnClickListener;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EditText extends JTextField implements MouseListener , ViewM {
	
	private OnClickListener listener;
	private int MarginLeft,MarginTop,MarginRight,MarginDown;
	private int mx,my;
	private boolean isOut=false;
	
    public EditText(){
    	this.addMouseListener(this);
   }
	
	public void setOnClickListener(OnClickListener listener){
		 
	 
		this.listener=listener;
		
	}
	
	public void setHideText(String title){
		 addFocusListener(new JTextFieldHintListener(title, this));
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
		if(e.getComponent()==this&&listener!=null){
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
		isOut=false;
		setFocusable(true);
		//Toast.show("mouseEntered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO �Զ����ɵķ������
		isOut=true;
		 
	//	Toast.show("mouseExited");
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
	
	public String getId(){
		return this.getName();
	}
	
	

}
