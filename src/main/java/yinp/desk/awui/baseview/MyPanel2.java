package yinp.desk.awui.baseview;

import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseEvent;

public class MyPanel2 extends Panel implements ViewM,MouseInputListener{
	
	public int id,type;
	private int MarginLeft,MarginTop,MarginRight,MarginDown;
	//private int PadLeft,PadTop,PadRight,PadDown;
	private int mx,my;
	public int Width,Height;
	private int childSum;
	
	public String tag;
	private boolean isDG=true;
	
	 
	public MyPanel2(){
		
		this.addMouseListener(this); 
		this.addMouseMotionListener(this);
		 
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
	
	
	
	@Override
	public void setMargin(int left, int top, int right, int down) {
		// TODO �Զ����ɵķ������
		MarginLeft=left;
		MarginTop=top;
		MarginRight=right;
		MarginDown=down;
		
		setLocation(mx,my);
	}

	/*
	@Override
	public void setPadding(int left, int top, int right, int down) {
		// TODO �Զ����ɵķ������
		PadLeft=left;
		PadTop=top;
		PadRight=right;
		PadDown=down;
		
	}

	@Override
	public void setPadding(int wd) {
		// TODO �Զ����ɵķ������
		PadLeft=wd;
		PadTop=wd;
		PadRight=wd;
		PadDown=wd;
		
	}
	
	*/
	
	
	
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


	public void setDrag(){
		  origin = new Point();
		  isDG=true;
			System.out.print("222"+isDG);
	}
	
	Point origin= new Point();;
    //�����ק��Ҫ�ƶ���Ŀ����� 
     
     
 
 
    /**
    * ��¼��갴��ʱ�ĵ�
    */
    @Override
    public void mousePressed(MouseEvent e) {
    	if(isDG){
      origin.x = e.getX(); 
      origin.y = e.getY();
    	}
    }
 
    @Override
    public void mouseReleased(MouseEvent e) {}
 
    /**
    * ����ƽ�������ʱ���������ͼ��Ϊ�ƶ�ͼ��
    */
    @Override
    public void mouseEntered(MouseEvent e) {
    	if(isDG)
      this.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
    }
     
    /**
    * ����Ƴ�������ʱ���������ͼ��ΪĬ��ָ��
    */
    @Override
    public void mouseExited(MouseEvent e) {
    	if(isDG) this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }
 
    /**
    * ����ڱ�������קʱ�����ô��ڵ�����λ��
    * �����µ�����λ�� = �ƶ�ǰ����λ��+�����ָ�뵱ǰ����-��갴��ʱָ���λ�ã�
    */
    @Override
    public void mouseDragged(MouseEvent e) {
    	if(isDG){
      Point p = this.getLocation();
      this.setLocation(
        p.x + (e.getX() - origin.x), 
        p.y + (e.getY() - origin.y)); 
      
  	System.out.print("222"+isDG);
    	}
    	 
     
    	
    }


	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
	}

}
