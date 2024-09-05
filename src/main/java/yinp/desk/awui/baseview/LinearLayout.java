package yinp.desk.awui.baseview;


import java.awt.*;
import java.util.ArrayList;


public class LinearLayout extends MyPanel { 
	public static final int Horizontal=0;
	public static final int Vertical=1;
	
	public static final int match_parent=-100;
	
	public int width,height;
	private int orientation=0;
	private ArrayList<Component>  components;
	private int neiHeight=0;//�ڲ��߶�
	private int neiWidth=0;//�ڲ����
	private boolean isDG=false;
	
 
	
	 
	
	public LinearLayout(int width,int height){
		setLayout(null);
		this.width=width;
		this.height=height;
		
		setSize(width,height);
		components=new ArrayList<Component>();
		
		//setOnClickListener(this);
		this.addMouseListener(this); 
		 
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
		 
		if(view.getClass()==TextView.class){
			neiHeight+=((TextView)view).MarginTop;   
			view.setLocation(((TextView)view).MarginLeft, neiHeight);
			
		}else if(view.getClass()==MyPanel.class){
			 
			neiHeight+=((MyPanel)view).MarginTop;   
			view.setLocation(((MyPanel)view).MarginLeft, neiHeight);
		}
		else if(view.getClass()==LinearLayout.class){
			 
			neiHeight+=((LinearLayout)view).MarginTop;
			view.setLocation(((LinearLayout)view).MarginLeft, neiHeight);
		}

		// view.setLocation(0, neiHeight);
		
		neiHeight+=view.getHeight();
		super.add(view);
		
	}
	
	public void addViewH(Component view){
		components.add(view);
		if(view.getClass()==TextView.class){
			neiWidth+=((TextView)view).MarginLeft; 
			view.setLocation(neiWidth,((TextView)view).MarginTop);
			
		}else if(view.getClass()==MyPanel.class){
			neiWidth+=((MyPanel)view).MarginLeft;
			view.setLocation(neiWidth,((MyPanel)view).MarginTop);
		}else if(view.getClass()==LinearLayout.class){
			neiWidth+=((LinearLayout)view).MarginLeft;
			view.setLocation(neiWidth,((LinearLayout)view).MarginTop);
		}else if(view.getClass()==HorListView.class){
			neiWidth+=((HorListView)view).MarginLeft;
			view.setLocation(neiWidth,((HorListView)view).MarginTop);
		}
		 
		 
		
		neiWidth+=view.getWidth();
		super.add(view);
		
	}
 
	
 
	
	public void setOrientation(int orientation){
		this.orientation=orientation;
	}


 

 
 
   
 

}
