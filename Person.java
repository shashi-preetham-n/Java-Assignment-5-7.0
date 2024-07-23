public class Person{
  // Take 4 Variables and Initialize them
  // Create Getters and Setters
  // Create Constructors
public String pname;
private int pRollno;
public String pclgname;
public String pbranch;

public person1(String Sname,int SRollno,String Sclgname,String Sbranch){
this.pname=Sname;
this.pRollno=SRollno;
this.pclgname=Sclgname;
this.pbranch=Sbranch;
}
public String getSname(){
return pname;
}
public void setSname(String Sname){
this.pname=Sname;
}
public int getSRollno(){
return pRollno;
}
public void setSRollno(int SRollno){
this.pRollno=SRollno;
}
public String getpclgname(){
    return pclgname;
}
public void setpclgname(String Sclgname){
    this.pclgname=Sclgname;
}
public String getpbranch(){
    return pbranch;
}
public void setpbranch(String Sbranch){
    this.pbranch=Sbranch;
}

public static void main(String[] args) throws Exception {
           person1 sc=new person1("shashi", 036677, "jaya", "cse");
          System.out.println(sc.pname);
          System.out.println(sc.getSRollno());
           System.out.println(sc.pclgname);
           System.out.println(sc.pbranch);
}
}
