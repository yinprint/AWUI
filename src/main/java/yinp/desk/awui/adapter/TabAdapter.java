package yinp.desk.awui.adapter;

import yinp.desk.awui.baseview.MyPanel;
import yinp.desk.awui.layout.ItemTab;

import java.awt.*;
import java.util.ArrayList;


public class TabAdapter extends BaseAdapter{
	private ArrayList<String> items=new ArrayList<String>();
	public int clicked=0;
 
	
    public void setData(ArrayList<String> ball){
    	items.addAll(ball);
    	
	}

	@Override
	public MyPanel getView(int position, Component convertView) {
		// TODO �Զ����ɵķ������
		ItemTab item=null;
		
		  if(convertView==null){
			 
			  item=new ItemTab(items.get(position)); 
			}
			else{
				item=(ItemTab)convertView;
			}
		  
		  if(clicked==position){
			  item.title.setForeground(Color.WHITE);
		  }
		  else{
			  item.title.setForeground(new Color(148,148,148));
		  }
		   final int pos=position;
		  /*
		  item.title.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(Component view) {
				// TODO �Զ����ɵķ������
				//Toast.show(""+pos);
				clicked=pos;
				
			}
			  
		  });
		   */
		
		return item.panel;
	}

	@Override
	public int getCount() {
		// TODO �Զ����ɵķ������
		return items.size();
	}
	
	 
	
	
	
	

}
