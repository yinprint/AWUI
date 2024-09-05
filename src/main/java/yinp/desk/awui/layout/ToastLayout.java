package yinp.desk.awui.layout;

import yinp.desk.awui.baseview.LinearLayout;
import yinp.desk.awui.baseview.MyLabel;

import javax.swing.*;
import java.awt.*;


public class ToastLayout extends JFrame  {
	private LinearLayout LL;
	private MyLabel Title;
	private String Stitle;
	private int time=2000;
	private int width=450;
	private int height=60;
	private Rectangle rect=new Rectangle(-1,-1,450,60);
	
	public ToastLayout(String title,int time){
		this.time=time;
		this.Stitle=title;	
		initView();
	}
	
	
	public ToastLayout(String title){
		this.Stitle=title;
		initView();
	}
	
	public ToastLayout(Rectangle rect,String title,int time){
		this.time=time;
		this.Stitle=title;	
		this.rect=rect;
		
		if(width>rect.width-40) width=rect.width-40;
		 
		initView();
	}
	
	
	public void initView(){
	        this.setSize(width, height);
		int  screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
		int  screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;

		rect=new Rectangle((screenWidth-width)/2,(screenHeight-height)/2,450,60);

			this.setBounds((rect.width-width)/2+rect.x, rect.height-height-20+rect.y, width, height);
			
			LL=new LinearLayout(width,height);
			this.add(LL);
			
			Title=new MyLabel(Stitle,JLabel.CENTER);
			Title.setSize(width, height);
			Title.setBackground(new Color(67,67,67));
			Title.setOpaque(true);
			Title.setForeground(Color.WHITE);
			
			LL.addView(Title);
			
			this.setUndecorated(true);
			this.getRootPane().setWindowDecorationStyle(JRootPane.NONE); 
			
			setVisible(true);
			new Thread(){
				public void run(){
					try { 
						sleep(time);
						dispose(); 
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						//FileUtil.error(e);
					}
					
				}
			}.start();
	}

}