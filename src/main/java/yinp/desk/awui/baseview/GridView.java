package yinp.desk.awui.baseview;

import yinp.desk.awui.adapter.BaseAdapter;
import yinp.desk.awui.listener.OnItemListener;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class GridView extends Panel implements MouseListener {
	
	public int id,type;
	public String tag;
	public int itemSum;//item������
	public int lineSum;//ÿһ�е�����
	public int width,height;
	
	public OnItemListener itemListener;
	private BaseAdapter adapter;
	
	 
	
	public GridView(int width,int height){
		setLayout(null);
		this.width=width;
		this.height=height;
		
		setSize(width,height);
		
		
		 
		
	}
	
	private MyPanel getItemPanel(int height){
		MyPanel pl=new MyPanel();
		pl.setSize(width/lineSum, height);
		int mx=(width/lineSum)*(itemSum%lineSum);
		int my=(itemSum/lineSum)*height;
		pl.setLocation(mx,my);
		
		
		return pl;
	}
	
 
	public void addItem2(MyPanel panel){
		
		 System.out.print(panel.getHeight());
		 
		 MyPanel pl=getItemPanel(panel.getHeight());
		 pl.add(panel);
		 
		 panel.setId(itemSum);
		 panel.addMouseListener(this);
		itemSum++;
		 
		add(pl);
	}
	
	
	public void addItem(MyPanel panel){
		
		int mx=(width/lineSum)*(itemSum%lineSum);
		int my=(itemSum/lineSum)*panel.getHeight();
		
		
		panel.setId(itemSum);
		itemSum++;
		
		panel.setLocation(mx,my);
		panel.addMouseListener(this);
		add(panel);
	}
	
	public void removeAllView(){
		
		this.removeAll();
		itemSum=0;
	}
	
	
	public void setAdapter(BaseAdapter adapter){
		this.adapter=adapter;
		for(int m=0;m<adapter.getCount();m++){
			addItem(adapter.getView(m,null));
		}
	}
	
     public void notifyDataSetChanged(){
    	 removeAllView();
    	 for(int m=0;m<adapter.getCount();m++){
 			addItem(adapter.getView(m,null));
 		}
	}
	
	
	public void setOnItemListener(OnItemListener listener){
		
		itemListener=listener;
		
	 }
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public int getItemSum() {
		return itemSum;
	}

	public void setItemSum(int itemSum) {
		this.itemSum = itemSum;
	}

	public int getLineSum() {
		return lineSum;
	}

	public void setLineSum(int lineSum) {
		this.lineSum = lineSum;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO �Զ����ɵķ������
		MyPanel view=(MyPanel) e.getComponent();
		int position=view.getId();
				
		itemListener.onItem(position, view);
	}



	@Override
	public void mousePressed(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
	}




 
	
	
	

}
