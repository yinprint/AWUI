package yinp.desk.awui.baseview;

import yinp.desk.awui.listener.OnClickListener;

import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class LinearLayout2 extends MyPanel implements MouseInputListener {
	private OnClickListener listener;
	public static final int Horizontal=0;
	public static final int Vertical=1;
	
	public static final int match_parent=-100;
	
	public int width,height;
	private int orientation=0;
	private ArrayList<Component>  components;
	private int neiHeight=0;//�ڲ��߶�
	private int neiWidth=0;//�ڲ����
	private boolean isDG=false;
	
 
	
	 
	
	public LinearLayout2(int width,int height){
		setLayout(null);
		this.width=width;
		this.height=height;
		
		setSize(width,height);
		components=new ArrayList<Component>();
		
		//this.addMouseListener(this); 
		 
	}
	
	
	public void addView(Component view){
		components.add(view);
		
	 /*
		if(view.Width==match_parent){
			view.Width=this.width;
		 }
		if(view.Height==match_parent){
			view.Height=this.height;
		}
		
		view.setSize(view.Width, view.Height);
		*/
		view.setLocation(0, neiHeight);
		
		neiHeight+=view.getHeight();
		super.add(view);
		
	}
	
	public void addViewH(Component view){
		components.add(view);
	 
		view.setLocation(neiWidth, 0);
		
		neiWidth+=view.getWidth();
		super.add(view);
		
	}
 
	
public void setOnClickListener(OnClickListener listener){
		 
		
		this.listener=listener;
		
	}
	
	public void setOrientation(int orientation){
		this.orientation=orientation;
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO �Զ����ɵķ������
		if(e.getComponent()==this&&listener!=null){
			listener.onClick(e);
		}
	}


 
	
	
	public void setDrag(){
		this.addMouseMotionListener(this);
		  origin = new Point();
		  isDG=true;
	}
	
	Point origin;
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
    	}
    	
    	System.out.print("mouseDragged222");
    	
    }


	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
	}
   
 

}
