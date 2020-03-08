/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mypackage;


public class Patient {
    private String pname;
    private String pid;
    private int height;
    private int weight;
    private String pcategory;
    private String pgender;
    private String bgroup;
    private String dob;
    private long mobile;
    private String mail;
    private String address;
    private String gname;
    private  Long gmobile;    

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getPcategory() {
        return pcategory;
    }

    public void setPcategory(String pcategory) {
        this.pcategory = pcategory;
    }

    public String getPgender() {
        return pgender;
    }

    public void setPgender(String pgender) {
        this.pgender = pgender;
    }

    public String getBgroup() {
        return bgroup;
    }

    public void setBgroup(String bgroup) {
        this.bgroup = bgroup;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Long getGmobile() {
        return gmobile;
    }

    public void setGmobile(Long gmobile) {
        this.gmobile = gmobile;
    }

    public void displayPatientDetails()
    {
        System.out.println("The following are the Details of the Patient"+this.getPname());
        System.out.println("Patient Name :"+this.getPname());
        System.out.println("Patient ID :"+this.getPid());
        System.out.println("Height :"+this.getHeight());
        System.out.println("Weight :"+this.getWeight());
        System.out.println("Patient Category :"+this.getPcategory());
        System.out.println("Gender :"+this.getPgender());
        System.out.println("Blood Grooup :"+this.getBgroup());
        System.out.println("Date of Birth :"+this.getDob());
        System.out.println("Mobile number :"+this.getMobile());
        System.out.println("Email ID :"+this.getMail());
        System.out.println("Adddres :"+this.getAddress());
        System.out.println("Guardian's Name :"+this.getGname());
        System.out.println("Guardian's Mobile :"+this.getGmobile());
    }
}
