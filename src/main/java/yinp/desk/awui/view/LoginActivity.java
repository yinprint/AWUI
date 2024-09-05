package yinp.desk.awui.view;

import yinp.desk.awui.baseview.Activity;
import yinp.desk.awui.baseview.LinearLayout;
import yinp.desk.awui.layout.LLshouye;
import yinp.desk.awui.listener.MouseEventListener;
import yinp.desk.awui.listener.OnClickListener;

import javax.print.PrintException;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class LoginActivity extends Activity {
    private LLshouye shouye;
    private LinearLayout Ltop;
    @Override
    public void onCreate() {
        // TODO 自动生成的方法存根
        super.onCreate();
        setUndecorated(true);

        shouye=new LLshouye(442,425);
        setContentView(shouye);

        try {
            initView();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (PrintException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (TimeoutException e) {
            throw new RuntimeException(e);
        }

    }

    private void initView() throws IOException, PrintException, InterruptedException, TimeoutException {

        Ltop=(LinearLayout)findViewById(0);


        shouye.printlist.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(MouseEvent e) {
                // TODO 自动生成的方法存根
                //setContentView(new LLshouye(442,675));

            }

        });

        shouye.switchbt.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(MouseEvent e) {
                // TODO 自动生成的方法存根

            }

        });

        shouye.tomin.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(MouseEvent e) {
                // TODO 自动生成的方法存根
                setExtendedState(JFrame.ICONIFIED);
            }

        });

        shouye.tobig.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(MouseEvent e) {
                // TODO 自动生成的方法存根

                  //  setVisible(false);
                    //new BigActivity(0,0);
            }

        });

        shouye.close.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(MouseEvent e) {


                setVisible(false);

            }

        });


        MouseEventListener mouseListener = new MouseEventListener(LoginActivity.this);
        Ltop.addMouseListener(mouseListener);
        Ltop.addMouseMotionListener(mouseListener);




    }



}
