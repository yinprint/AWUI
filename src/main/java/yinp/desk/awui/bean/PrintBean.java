package yinp.desk.awui.bean;

import javax.print.PrintService;

public class PrintBean {
    String printname,siteroot,token,name,port,driver;
    int machineid,uniacid,acid,storeid;
    int tasksum;

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public void setPagesPrinted(int pagesPrinted) {
        this.pagesPrinted = pagesPrinted;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    int pagesPrinted;
    int totalPages;

    public int getTasksum() {
        return tasksum;
    }

    public void setTasksum(int tasksum) {
        this.tasksum = tasksum;
    }

    boolean isopen,ishave,toblack;
    int verifystate;
    private PrintService printsv;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public boolean isToblack() {
        return toblack;
    }

    public void setToblack(boolean toblack) {
        this.toblack = toblack;
    }

    public PrintService getPrintsv() {
        return printsv;
    }

    public int getVerifystate() {
        return verifystate;
    }

    public void setVerifystate(int verifystate) {
        this.verifystate = verifystate;
    }

    public void setPrintsv(PrintService printsv) {
        this.printsv = printsv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIshave() {
        return ishave;
    }

    public void setIshave(boolean ishave) {
        this.ishave = ishave;
    }

    public String getPrintname() {
        return printname;
    }

    public void setPrintname(String printname) {
        this.printname = printname;
    }

    public String getSiteroot() {
        return siteroot;
    }

    public void setSiteroot(String siteroot) {
        this.siteroot = siteroot;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getMachineid() {
        return machineid;
    }

    public void setMachineid(int machineid) {
        this.machineid = machineid;
    }

    public int getUniacid() {
        return uniacid;
    }

    public void setUniacid(int uniacid) {
        this.uniacid = uniacid;
    }

    public int getAcid() {
        return acid;
    }

    public void setAcid(int acid) {
        this.acid = acid;
    }

    public int getStoreid() {
        return storeid;
    }

    public void setStoreid(int storeid) {
        this.storeid = storeid;
    }

    public boolean isIsopen() {
        return isopen;
    }

    public void setIsopen(boolean isopen) {
        this.isopen = isopen;
    }
}
