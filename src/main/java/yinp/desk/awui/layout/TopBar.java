package yinp.desk.awui.layout;

import yinp.desk.awui.baseview.LinearLayout;
import yinp.desk.awui.baseview.MyLabel;
import yinp.desk.awui.baseview.TextView;
import yinp.desk.awui.listener.OnClickListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class TopBar {
    public LinearLayout  Ltop;
    private MyLabel label;
    public TextView close;
    public ImageIcon image;

    public TopBar(int width,int height) {

        Ltop = new LinearLayout(width, 50);
        Ltop.setBackground(new Color(81, 81, 81));
        //	Ltop.setDrag();

        label = new MyLabel("        ", JLabel.LEFT);

        label.setBackground(new Color(81, 81, 81));
        label.setOpaque(true);
        label.setForeground(new Color(75, 161, 94));
        label.setSize(100, 50);

         //label.setText(PropertiesFile.get("name"));


        Ltop.addViewH(label);

        close = new TextView("", JLabel.RIGHT);
        close.setSize(50, 50);
        close.setMargin(width - 180, 0, 0, 0);
        image = new ImageIcon("pic/close.png");
        image.setImage(image.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH));
        close.setIcon(image);
        close.setHorizontalTextPosition(JLabel.CENTER);//设置文本相对于图像的水平位置
        close.setForeground(new Color(75, 161, 94));
        //close.setFont(new Font("宋体", Font.PLAIN, 18));
        Ltop.addViewH(close);

        close.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(MouseEvent e) {
                // TODO 自动生成的方法存根

               // System.exit(0);
            }

        });

    }




}
