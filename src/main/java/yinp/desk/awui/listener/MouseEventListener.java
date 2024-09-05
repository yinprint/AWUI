package yinp.desk.awui.listener;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseEvent;

public class MouseEventListener implements MouseInputListener {

   Point origin;
   //�����ק��Ҫ�ƶ���Ŀ�����
   JFrame frame;

   public MouseEventListener(JFrame frame) {
     this.frame = frame;
     origin = new Point();
   }

   @Override
   public void mouseClicked(MouseEvent e) {}

   /**
   * ��¼��갴��ʱ�ĵ�
   */
   @Override
   public void mousePressed(MouseEvent e) {
     origin.x = e.getX();
     origin.y = e.getY();
   }

   @Override
   public void mouseReleased(MouseEvent e) {}

   /**
   * ����ƽ�������ʱ���������ͼ��Ϊ�ƶ�ͼ��
   */
   @Override
   public void mouseEntered(MouseEvent e) {
    // this.frame.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
   }

   /**
   * ����Ƴ�������ʱ���������ͼ��ΪĬ��ָ��
   */
   @Override
   public void mouseExited(MouseEvent e) {
     this.frame.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
   }

   /**
   * ����ڱ�������קʱ�����ô��ڵ�����λ��
   * �����µ�����λ�� = �ƶ�ǰ����λ��+�����ָ�뵱ǰ����-��갴��ʱָ���λ�ã�
   */
   @Override
   public void mouseDragged(MouseEvent e) {
     Point p = this.frame.getLocation();
     this.frame.setLocation(
       p.x + (e.getX() - origin.x),
       p.y + (e.getY() - origin.y));
   }

   @Override
   public void mouseMoved(MouseEvent e) {}

 }