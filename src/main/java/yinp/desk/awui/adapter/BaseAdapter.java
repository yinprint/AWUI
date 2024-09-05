package yinp.desk.awui.adapter;

import yinp.desk.awui.baseview.ListView;
import yinp.desk.awui.baseview.MyPanel;
import yinp.desk.awui.listener.AdapterListener;

import java.awt.*;


public class BaseAdapter implements AdapterListener {
	
 
	private ListView listview;
	 
 
	@Override
	public MyPanel getView(int position, Component convertView) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public int getCount() {
		// TODO �Զ����ɵķ������
		return 0;
	}
	
	
	 
	public void setListView(ListView listview){
		this.listview=listview;
	}
 

	 public void notifyDataSetChanged(){
		  
		 listview.notifyDataSetChanged();
	 }

	 public void notifyDataSetChanged(int position){
		  
		 listview.notifyDataSetChanged(position);
	 }


 
	 

}
