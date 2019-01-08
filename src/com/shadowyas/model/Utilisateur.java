package com.shadowyas.model;

public class Utilisateur {
   private String login;
   private String nompre;
   private  String password1;
   private String password2;
   private String mail;
   private String adresse;
   private String cp;
   private String lieu;
   private  String mobile;
   private  String cin;


    public Utilisateur(){

    }


    public String getlogin()
    { return this.login;}

    public void setlogin(String lo)
    {this.login=lo;}

    public String getnompre()
    { return this.nompre;}

    public void setnompre(String np)
    {this.nompre=np;}

    public String password1()
    { return this.password1;}

    public void setpassword1(String pass1)
    {this.password1=pass1;}

    public String getpassword2()
    { return this.password2;}

    public void setpassword2(String pass2)
    {this.password2=pass2;}

    public String getmail()
    { return this.mail;}

    public void setmail(String ml)
    {this.mail=ml;}

    public String getadresse()
    { return this.adresse;}

    public void setadresse(String ad)
    {this.adresse=ad;}

    public String getcp()
    { return this.cp;}

    public void setcp(String c)
    {this.cp=c;}

    public String getlieu()
    { return this.lieu;}

    public void setlieu(String li)
    {this.lieu=li;}

    public String getmobile()
    { return this.mobile;}

    public void setmobile(String mo)
    {this.mobile=mo;}

    public String getcin()
    { return this.cin;}

    public void setcin(String ci)
    {this.cin=ci;}

}
