package yinp.desk.awui.baseview;

import yinp.desk.awui.layout.ToastLayout;

import javax.swing.*;
import java.awt.*;


public class Toast {
	
	public static void show(String title){
		Dialog dia=new Dialog(new ToastLayout(title),false);
		dia.setAlwaysOnTop(true);
		dia.show();
		
	}
	
    public static void show(String title,int time){

		Dialog dia=new Dialog(new ToastLayout(title,time),false);

		dia.setAlwaysOnTop(true);
		dia.show();
		
	}
    
 public static void show(JFrame frame,String title,int time){
	Rectangle rect=frame.getBounds();

	 Dialog dia=new Dialog(new ToastLayout(rect,title,time),false);
	 dia.setAlwaysOnTop(true);
	 dia.show();
	}

}
