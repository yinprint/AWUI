package yinp.desk.awui.baseview;

import yinp.desk.awui.adapter.TabAdapter;
import yinp.desk.awui.listener.OnClickListener;
import yinp.desk.awui.listener.OnItemListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;


public class TabLayout2  extends MyPanel {
	public LinearLayout panel;
	public LinearLayout Ltop,Content;
	public TextView label,close,tabo,tabt,tabth,tabf;
	public HorListView listview;
	public TabAdapter adapter;
	public ImageIcon image;
	public int clicked=0;
	public int width;
	public Fragment[] items;
	
	public TabLayout2(int width,int height){
		setSize(width,height);
		
		this.Width=width;
		
		panel=new LinearLayout(width,height);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setSize(width, height);
		this.add(panel);
		
		Ltop=new LinearLayout(width,60);
		Ltop.setBackground(new Color(81,81,81));  
		
		label=new TextView("���Ĺ�����",JLabel.CENTER);
		label.setBackground(new Color(81,81,81));  
		label.setOpaque(true);
		label.setForeground(new Color(75,161,94));
		label.setSize(150, 60);
		
		listview=new HorListView(width-260,60);
		listview.setMargin(50, 0, 0, 0);
		 
		
		close=new TextView("",JLabel.CENTER);
		close.setSize(60, 60); 
		//close.setBackground(Color.WHITE);
		//close.setOpaque(true);
		image = new ImageIcon("pic/close.png");
		image.setImage(image.getImage().getScaledInstance(15, 15,Image.SCALE_SMOOTH ));
		close.setIcon(image);
		close.setHorizontalTextPosition(JLabel.CENTER);//�����ı������ͼ���ˮƽλ��
		close.setForeground(new Color(75,161,94));
		//close.setFont(new Font("����", Font.PLAIN, 18));
		
		
		close.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(MouseEvent e) {
				// TODO �Զ����ɵķ������
				
				System.exit(0);
			}
			
		});
	 
		
		Content=new LinearLayout(width,height-60);
		
		adapter=new TabAdapter();
		listview.setAdapter(adapter);
		
		Ltop.addViewH(label);
		Ltop.addViewH(listview); 
		Ltop.addViewH(close);
		
		panel.addView(Ltop); 
		panel.addView(Content); 
		 
		
		listview.setOnItemListener(new OnItemListener(){

			@Override
			public void onItem(int position, Component view) {
				// TODO �Զ����ɵķ������
				//Toast.show(""+position);
				adapter.clicked=position;
				listview.notifyDataSetChanged();
				
				if(clicked!=position){
					
					//if(clicked!=-1) items[position].getView().setVisible(false);
					clicked=position;
					
			 	Content.removeAll();
					
					if(items!=null&&items.length>position){
						 
					//	pl.add(items[position].getView());
					//	Content.add(pl);
						 Content.add(items[position].getView());
					}
					 
				}
				
			}
			
		});
		 
		
	}
	 
	
	public void change(int position){
		adapter.clicked=position;
		listview.notifyDataSetChanged();
		
		if(clicked!=position){
			clicked=position;
			Content.removeAll();
			if(items!=null&&items.length>position)
			Content.add(items[position].getView());
		}
		
	}
	 
	
	public void setTab(String[] tabs){
		 
		 
		adapter.setData(new ArrayList<String>(Arrays.asList(tabs)));
	 	listview.notifyDataSetChanged();
		
	}
	
	public void setItems(Fragment[] it){
		items=it;
		if(items!=null&&items.length>0){
			 
			 Content.add(items[0].getView());
		}
		 
	}
	
	
	public void setClicked(int ck){
		
		if(clicked==ck) return;
		
		
		
		clicked=ck;
		
	}
 

}
