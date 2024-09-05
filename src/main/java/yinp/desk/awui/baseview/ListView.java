package yinp.desk.awui.baseview;

import yinp.desk.awui.adapter.BaseAdapter;
import yinp.desk.awui.listener.OnItemListener;
import yinp.desk.awui.listener.OnTouchListener;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.ArrayList;


public class ListView extends MyPanel implements MouseListener,MouseWheelListener {
	
	private Graphics gBuffer;
	//public MyPanel child;
	public int neiHeight;//??????
	
	public int id,type;
	public String tag;
	public int itemSum;//item??????

	public int width,height;
	
	public OnItemListener itemListener;
	private BaseAdapter adapter;
	
	private ArrayList<Component> components;
	
	private ScrollBar bar;
	private ListView list;
	private boolean closewhell=false;
	
	 
	
	public ListView(int width,int height){
		setLayout(null);
		 
		 
		this.width=width;
		this.height=height;
		
		setSize(width,height);
		//child=new MyPanel();
		
		//child.setSize(width,height);
		//this.add(child);
		
		bar=new ScrollBar();
		bar.setLocation(width-4, 0);
		bar.setVisible(false);
		this.add(bar);
		this.addMouseWheelListener(this);
		
		components =new ArrayList<Component>();
		
	 
		bar.setOnTouchListener(new OnTouchListener(){

			@Override
			public void OnTouch(MouseEvent event, int action) {
				// TODO ??????????????
				
				//System.out.print(""+action);
				
				switch(action){
				case 0://????
					bar.setBackground(new Color(49,214,148));
					System.out.print("????");
					break;
				case 1://???
					System.out.print("???");
					break;
				case 2://???
					bar.setBackground(new Color(94,94,94));
					
					break;
				}
				
			}
			
		});
		
		
	}
	
 
	
	public void addItem(MyPanel panel){
		components.add(panel);
		 
		int my=itemSum*panel.getHeight();
		
		panel.setId(itemSum);
		itemSum++;
		
		panel.setLocation(0,my);
		panel.addMouseListener(this);
		this.add(panel);
	   
		
		if(itemSum*panel.getHeight()>height) bar.setVisible(true);
		else  bar.setVisible(false);
		
		this.setSize(width,itemSum*panel.getHeight());
	}
	
	
	public MyPanel setItem(int position,MyPanel panel){
		  
		int my=position*panel.getHeight();
		
		panel.setId(position); 
		
		panel.setLocation(0,my);
		panel.addMouseListener(this);
		 
		return panel; 
	}
	
	public void addItemp(MyPanel panel){
		components.add(panel);
		 
		int my=itemSum*panel.getHeight();
		
		panel.setId(itemSum);
		itemSum++;
		
		panel.setLocation(0,my);
		panel.addMouseListener(this);
		list.add(panel);
	   
		
		if(itemSum*panel.getHeight()>height) bar.setVisible(true);
		else  bar.setVisible(false);
		
		list.setSize(width,itemSum*panel.getHeight());
	}
	
	public void removeAllView(){
		
		for(Component cm:components) this.remove(cm);
		//this.removeAll();
		itemSum=0;
	}
	
	
	public void setAdapter(BaseAdapter adapter){
		this.adapter=adapter;
		adapter.setListView(this);
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
    public void notifyDataSetChanged(int position){ 
    	this.remove(components.get(position));
    	
    	MyPanel itm=adapter.getView(position,components.get(position));
    	
    	 this.add(setItem(position,itm));
    	// this.add(setItem(position,(MyPanel)components.get(position)));
    //	components.set(position, setItem(position,(MyPanel)components.get(position)));
      
	}
    
     public void notifyDataSetChanged2(){
    	 
    	 for(int m=0;m<adapter.getCount();m++){
    		 if(m<components.size()) adapter.getView(m,components.get(m));
    		 else
 			 addItem(adapter.getView(m,null));
 		}
    	 
    	 //???????????
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
		// TODO ??????????????
		MyPanel view=(MyPanel) e.getComponent();
		int position=view.getId();
		if(itemListener!=null)
		itemListener.onItem(position, view);
	}



	@Override
	public void mousePressed(MouseEvent e) {
		// TODO ??????????????
		
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO ??????????????
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO ??????????????
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO ??????????????
		
	}



	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		// TODO ??????????????

		if(closewhell) return;


		 if(e.getWheelRotation()==1){//下
			 bar.setLocation(bar.getX(), bar.getY()-MarginTop+10);
			 
			 setLocation(getX(),getY()-MarginTop-10);
			 
		 }

		 if(e.getWheelRotation()==-1){//上
			  if(getY()-MarginTop<0){
			 bar.setLocation(bar.getX(), bar.getY()-MarginTop-10);
			  
			setLocation(getX(), getY()-MarginTop+10);
			  }
		 }
		  
	}

/*
	@Override
	public void update(Graphics g){
		super.update(g);
		//paint(g);
		
	}

 
	public void paint(Graphics scr)  
	{  
	     if(list==null){
	    	 list=new ListView(width,height);
	    	 list.setAdapter(adapter);
	         gBuffer=list.getGraphics();  
	     }
	     
	     for(int m=0;m<adapter.getCount();m++){
		 	 
	    	 addItemp(adapter.getView(m,null));
	 		}
	     
	     scr=gBuffer;
	     
	}  
	
	*/

}
