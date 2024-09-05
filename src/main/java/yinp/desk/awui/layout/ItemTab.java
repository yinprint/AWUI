package yinp.desk.awui.layout;

import yinp.desk.awui.baseview.MyPanel;
import yinp.desk.awui.baseview.TextView;

import javax.swing.*;
import java.awt.*;


public class ItemTab extends MyPanel {
	public MyPanel panel;
	public TextView title;
 
	public int width=150,height=60;
	
	
	
	public ItemTab(String name){
		
		setSize(width,height);
	 
		
		panel=new MyPanel();
	//	panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setSize(width, height);
	//	panel. setBackground(new Color(230,230,230));
		title=new TextView(name,JLabel.CENTER);
		title.setSize(width, height);
		
		//this.add(panel);
		
		panel.add(title);
	 
		   //�������
		   Label line=new Label();
		   line.setSize(width, 1);
		   line.setLocation(0, height-1);
		   line.setBackground(new Color(242,242,242));
		//   panel.add(line);
	}
	
	
	
 

}
