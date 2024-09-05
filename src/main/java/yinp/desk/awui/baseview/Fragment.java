package yinp.desk.awui.baseview;

public class Fragment {
	
	private MyPanel layout;
	private Activity context;
	
	
	public Fragment(){
		onCreate();
	}
	
	public Fragment(Activity cn){
		context=cn;
		onCreate();
	}
	
	public void onCreate() {
		// TODO �Զ����ɵķ������
		
	
	}
	
	//Fragment֮�䴫������
	public void sendData(int pos,Object object){
		context.sendData(pos, object);
	}
	
	//Fragment֮�䴫������
    public void getData(int pos,Object object){
			 
	}
	
	public void setView(MyPanel mp){
		layout=mp;
	}
	
	
	public MyPanel getView(){
		
		return layout;
	}
	
	public Activity getActivity(){
		
		return context;
	}

}
