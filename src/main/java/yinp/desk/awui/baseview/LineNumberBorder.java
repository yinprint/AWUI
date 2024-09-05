package yinp.desk.awui.baseview;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;

public class LineNumberBorder extends AbstractBorder 
{ 
public LineNumberBorder() 
{ 
} 
/* 
* Insets �����������߽�ı�ʾ��ʽ�� ��ָ�������������������Ե�����Ŀռ䡣 
*/ 
// �˷�����ʵ����ʱ�Զ����� 
// �˷�����ϵ���߿��Ƿ�ռ������Ŀռ� 
public Insets getBorderInsets(Component c) 
{ 
return getBorderInsets(c, new Insets(0, 0, 0, 0)); 
} 
public Insets getBorderInsets(Component c, Insets insets) 
{ 
if (c instanceof JTextPane) 
{ 
//���������к���߱߾� 
insets.left = 31; 
}
return insets;

}

public boolean isBorderOpaque() 
{ 
return false; 
} 
// �߿�Ļ��Ʒ��� 
// �˷�������ʵ�� 
public void paintBorder(Component c, Graphics g, int x, int y, int width, 
int height) 
{ 
// ��õ�ǰ��������ı߽���Ρ� 
java.awt.Rectangle clip = g.getClipBounds(); 
FontMetrics fm = g.getFontMetrics(); 
int fontHeight = fm.getHeight(); 
// starting location at the "top" of the page... 
// y is the starting baseline for the font... 
int ybaseline = y + fm.getAscent(); 
// now determine if it is the "top" of the page...or somewhere 
// else 
int startingLineNumber = (clip.y / fontHeight) + 1; 
if (startingLineNumber != 1) 
{ 
ybaseline = y + startingLineNumber * fontHeight 
- (fontHeight - fm.getAscent()); 
} 
int yend = ybaseline + height; 
if (yend > (y + height)) 
{ 
yend = y + height; 
} 

//����һ����line
g.setColor(new Color(242,242,242)); 
//g.setColor(new Color(49,214,148)); 
//g.fillRect(0, 0,20, height);
//g.fillRect(22, 0,1, height);
g.drawLine(26, 0, 26, height);

g.setColor(new Color(51,51,51)); 
// �����к� 
while (ybaseline < yend) 
{ 
String label = padLabel(startingLineNumber, 0, true); 
if(label.length()==2)label=" "+label;
 

g.drawString(label, 3, ybaseline); 
ybaseline += fontHeight; 
startingLineNumber++; 
} 
} 
// Ѱ���ʺϵ����ֿ�� 
private int lineNumberWidth(JTextArea jta) 
{ 
int lineCount = Math.max(jta.getRows(), jta.getLineCount()); 
return jta.getFontMetrics(jta.getFont()).stringWidth(lineCount + " "); 
} 
private String padLabel(int lineNumber, int length, boolean addSpace) 
{ 
StringBuffer buffer = new StringBuffer(); 
buffer.append(lineNumber); 
for (int count = (length - buffer.length()); count > 0; count--) 
{ 
buffer.insert(0, ' '); 
} 
if (addSpace) 
{ 
buffer.append(' '); 
} 
return buffer.toString(); 
} 
} 