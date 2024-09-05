package yinp.desk.awui.baseview;

import yinp.desk.awui.adapter.BaseAdapter;
import yinp.desk.awui.listener.OnItemListener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class HorListView extends MyPanel implements MouseListener,MouseWheelListener {
	
	//public MyPanel child;
	public static int Warp_content=-1;
	public int id,type;
	public String tag;
	public int itemSum;//item������

	public int width,height;
	
	public int neiHeight;//�ڲ��߶�
	
	public OnItemListener itemListener;
	private BaseAdapter adapter;
	private ScrollBar bar;
	 
	
	public HorListView(int width,int height){
		 
		//child=new MyPanel();
		bar=new ScrollBar();
		bar.setLocation(0, height-4);
		bar.setVisible(false);
		this.add(bar);
		this.addMouseWheelListener(this);
		this.addMouseListener(this);
		setLayout(null);
		this.setLayout(null);
		this.width=width;
		this.height=height;
		
		setSize(width,height);
		//this.setSize(width,height);
		//this.add(child);
		 
	}
	
 
	
	public void addItem(MyPanel panel){
		
		 
		int mx=itemSum*panel.getWidth();
		
		panel.setId(itemSum);
		itemSum++;
		
		panel.setLocation(mx,0);
		panel.addMouseListener(this);
		this.add(panel);
		
		this.setSize(itemSum*panel.getWidth(),height);
		
		if(itemSum*panel.getWidth()>width) bar.setVisible(true);
		else  bar.setVisible(false);
		
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
		
		//Toast.show("listview");
		MyPanel view=(MyPanel) e.getSource();
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



	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		// TODO �Զ����ɵķ������
		 if(e.getWheelRotation()==1){//ǰ
			 bar.setLocation(bar.getX()+10, bar.getY());
			 
			 this.setLocation(this.getX()-10, this.getY());
		 }
		 
		 if(e.getWheelRotation()==-1&&this.getX()<0){//��
			 bar.setLocation(bar.getX()-10, bar.getY());
			 this.setLocation(this.getX()+10, this.getY());
		 }
		  
	}




 
	
	
	

}
