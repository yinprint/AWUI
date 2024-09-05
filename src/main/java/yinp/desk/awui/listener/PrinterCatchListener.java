package yinp.desk.awui.listener;

import yinp.desk.awui.bean.PrintBean;

public interface PrinterCatchListener {

    public void onStatus(PrintBean printer,String status);

    public void onFinish(PrintBean printer);

}
