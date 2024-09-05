package yinp.desk.awui.listener;

import yinp.desk.awui.baseview.MyPanel;

import java.awt.*;

public interface AdapterListener {
	public MyPanel getView(int position, Component convertView);
	public int getCount();

}
