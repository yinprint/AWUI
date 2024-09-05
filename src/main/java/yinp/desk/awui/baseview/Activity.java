package yinp.desk.awui.baseview;

import javax.swing.*;
import java.awt.*;

public class Activity extends JFrame {
	private MyPanel Layout;
	private Fragment items[];
	public int screenWidth,screenHeight,x=-1,y=-1;
	

	 
    public Activity(){
    	onCreate();
    	
    }

	public Activity(int x,int y){
    	this.x=x;
    	this.y=y;
		onCreate();

	}
	
    
    public void setFragments(Fragment items[]){
    	this.items=items;
    	
    }
    
    public Fragment[] getFragments(){
    	
    	return items;
    }
    
    public void sendData(int pos,Object object){
    	items[pos].getData(pos, object);
    }
	
	public void onCreate() {

		
	
	}
	
	public void onResume() {

		
	}
	
	public void setContentView(MyPanel panel){

		screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
		screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
		Layout=panel;
		if(x==-1&&y==-1)
		this.setBounds((screenWidth-panel.getWidth())/2, (screenHeight-panel.getHeight())/2, panel.getWidth(), panel.getHeight());
		else
			this.setBounds(x, y, panel.getWidth(), panel.getHeight());

		this.add(panel);
		this.setVisible(true);
	}
	
	public void startActivity(Activity ac, Activity ad){
	//	ac.setVisible(false);
		 
		
	}
	
	public Component findViewById(int id){
		
		return  ((MyPanel)Layout.getComponent(0)).getComponent(id);
	}
	
	public void finish(){
		 dispose();
	}

	
	public MyPanel getView(){
		return this.Layout;
	}


	public void   Log(String log){
    	System.out.println(log);
	}

 

	
}
