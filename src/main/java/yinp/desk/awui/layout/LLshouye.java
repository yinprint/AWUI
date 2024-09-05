package yinp.desk.awui.layout;

import yinp.desk.awui.baseview.*;
import yinp.desk.awui.listener.OnClickListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;


public class LLshouye extends MyPanel {
    private LinearLayout panel,Lget,Ltop;
    public LinearLayout Llogin;
    public MyLabel label;
    private EditText edit,pass;
    public TextView login,close,tverw,info,printlist,switchbt,tomin,tobig;
    public ImageIcon image,erw;

    public LLshouye(int width, int height){
        setSize(width,height);
        setBackground(new Color(81,81,81));



        panel=new LinearLayout(width,height);
        panel.setBackground(new Color(250,250,250));
        panel.setLayout(null);
        panel.setSize(width, height);
        this.add(panel);

        Ltop=new LinearLayout(width,50);
        Ltop.setBackground(new Color(81,81,81));
        //	Ltop.setDrag();

        label=new MyLabel("   小丢云打印",JLabel.LEFT);
        ImageIcon im = new ImageIcon("pic/icon.png");
        im.setImage(im.getImage().getScaledInstance(30, 30,Image.SCALE_SMOOTH ));
        label.setIcon(im);
        label.setBackground(new Color(81,81,81));
        label.setOpaque(true);
        label.setForeground(new Color(75,161,94));
        label.setSize(150, 50);
        label.setMargin(20,0,0,0);


        Ltop.addViewH(label);





        tomin=new TextView("",JLabel.RIGHT);
        tomin.setSize(50, 50);
        tomin.setMargin(width-320, 0, 0, 0);
        image = new ImageIcon("pic/icon_deal.png");
        image.setImage(image.getImage().getScaledInstance(15, 15,Image.SCALE_SMOOTH ));
        tomin.setIcon(image);
        tomin.setHorizontalTextPosition(JLabel.CENTER);
        tomin.setForeground(new Color(75,161,94));
        Ltop.addViewH(tomin);

//        tomin.setOnClickListener(new OnClickListener(){
//
//            @Override
//            public void onClick(MouseEvent e) {
//
//
//
//            }
//
//        });

        tobig=new TextView("",JLabel.RIGHT);
        tobig.setSize(50, 50);
        tobig.setMargin(0, 0, 0, 0);
        image = new ImageIcon("pic/kuang.png");
        image.setImage(image.getImage().getScaledInstance(15, 15,Image.SCALE_SMOOTH ));
        tobig.setIcon(image);
        tobig.setHorizontalTextPosition(JLabel.CENTER);
        tobig.setForeground(new Color(75,161,94));
        Ltop.addViewH(tobig);


        close=new TextView("",JLabel.RIGHT);
        close.setSize(50, 50);
        close.setMargin(0, 0, 0, 0);
        image = new ImageIcon("pic/close.png");
        image.setImage(image.getImage().getScaledInstance(15, 15,Image.SCALE_SMOOTH ));
        close.setIcon(image);
        close.setHorizontalTextPosition(JLabel.CENTER);
        close.setForeground(new Color(75,161,94));
        Ltop.addViewH(close);

        close.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(MouseEvent e) {

              //  System.exit(0);
            }

        });


        panel.addView(Ltop);

        //打印机管理
        //开机自启
        LinearLayout l2=new LinearLayout(width,50);
        l2.setBackground(new Color(112,112,112));

        printlist=new TextView("打印机管理",JLabel.CENTER);
        printlist.setSize(100, 50);
        printlist.setOpaque(true);
        printlist.setForeground(new Color(250,250,250));
        printlist.setBackground(new Color(112,112,112));
        l2.addViewH(printlist);

        switchbt=new TextView("",JLabel.CENTER);
        switchbt.setSize(100, 50);
        switchbt.setMargin(width-200, 0, 0, 0);
        ImageIcon image2 = new ImageIcon("pic/icon_man.png");
        image2.setImage(image2.getImage().getScaledInstance(65, 25,Image.SCALE_SMOOTH ));
        switchbt.setIcon(image2);
        switchbt.setHorizontalTextPosition(JLabel.CENTER);
        switchbt.setForeground(new Color(255,255,255));
        l2.addViewH(switchbt);

        panel.addView(l2);




        login=new TextView("获取本机二维码",JLabel.CENTER);
        login.setSize(230, 37);

        // login.setBackground(new Color(75,161,94));
        login.setOpaque(true);
        //  login.setForeground(Color.WHITE);
        login.setForeground(new Color(75,161,94));
        login.setMargin((width-230)/2, 15, 0, 0);

       // Llogin=new LinearLayout(width,37);
      //  Llogin.addView(login);


        panel.addView(login);

        info=new TextView(" ",JLabel.CENTER);

        info.setSize(width, 37);

        info.setBackground(new Color(255,255,255));
        info.setOpaque(true);
        info.setForeground(new Color(33,33,33));
        info.setMargin(0, -37, 0, 0);

        info.setVisible(false);
        panel.addView(info);


        // erw = new ImageIcon("pic/erw.jpg");
        //  erw.setImage(erw.getImage().getScaledInstance(100, 100,Image.SCALE_SMOOTH ));


        tverw=new TextView("",JLabel.RIGHT);
        tverw.setSize(250, 250);
        tverw.setMargin(100, 10, 0, 0);

        //  tverw.setIcon(erw);
        tverw.setHorizontalTextPosition(JLabel.CENTER);
        tverw.setForeground(new Color(75,161,94));


        panel.addView(tverw);




    }




}

