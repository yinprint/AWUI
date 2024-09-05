package yinp.desk.awui.baseview;

import yinp.desk.awui.adapter.BaseAdapter;
import yinp.desk.awui.listener.OnItemListener;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.ArrayList;


public class JListView extends MyPanel implements MouseListener,MouseWheelListener {
	
	 public Panel child;
	 
	public int id,type;
	public String tag;
	public int itemSum;//item������

	public int width,height;
	
	public int neiHeight;//�ڲ��߶�
	
	public OnItemListener itemListener;
	private BaseAdapter adapter;
	private ScrollBar bar;
	private ArrayList<Component> components;
	
	
	public JListView(int width,int height){
		 
		child=new Panel();
		bar=new ScrollBar();
		bar.setLocation(width-4, 0);
		bar.setVisible(false);
		this.add(bar);
		this.addMouseWheelListener(this);
		 
		setLayout(null);
		child.setLayout(null);
		this.width=width;
		this.height=height;
		
		setSize(width,height);
		child.setSize(width,height);
		this.add(child);
		
		components =new ArrayList<Component>();
		
		 
	}
	
 
	
	public void addItem(MyPanel panel){
		
		components.add(panel);
		
		int my=itemSum*panel.getHeight();
		
		panel.setId(itemSum);
		itemSum++;
		
		panel.setLocation(0,my);
		panel.addMouseListener(this);
		child.add(panel);
		
		child.setSize(width,itemSum*panel.getHeight());
		
		if(itemSum*panel.getHeight()>height) bar.setVisible(true);
		else  bar.setVisible(false);
		
	}
	
public void notifyItem(MyPanel panel){
		
		 
		//child.add(panel);
		
		 
		
	}
	
	public void removeAllView(){
		
		child.removeAll();
		itemSum=0;
	}
	
	
	public void setAdapter(BaseAdapter adapter){
		this.adapter=adapter;
		for(int m=0;m<adapter.getCount();m++){
			addItem(adapter.getView(m,null));
		}
	}
	
     public void notifyDataSetChanged(){
    	// removeAllView();
    	 for(int m=0;m<adapter.getCount();m++){
    		 if(m<components.size()) notifyItem(adapter.getView(m,components.get(m)));
    		 else
 			 addItem(adapter.getView(m,null));
 		}
    	 
    	 //�Ƴ������Ŀؼ�
    	 for(int n=adapter.getCount();n<components.size();n++){
    		 remove(components.get(n));
    	 }
    	 
    	 itemSum=adapter.getCount();
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



	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		// TODO �Զ����ɵķ������
		 if(e.getWheelRotation()==1){//ǰ
			 bar.setLocation(bar.getX(), bar.getY()+10);
			 
			 child.setLocation(child.getX(), child.getY()-10);
		 }
		 
		 if(e.getWheelRotation()==-1&&child.getY()<0){//��
			 bar.setLocation(bar.getX(), bar.getY()-10);
			 child.setLocation(child.getX(), child.getY()+10);
		 }
		  
	}




 
	
	
	

}
