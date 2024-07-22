public class Functions{
// prepare a void function
  // prepare a function with parameters 
  // prepare a function using paramater and returntype
  // 3 methods should contain same name 
  public void name(String name){
          System.out.println("function is created");
          }
    public void name1(String name){
          System.out.println("shashi"+"preetham");
          }
       public String name2(String name){
            System.out.println("shashi");
            return name;
          }

  public static void main(String[]args){
  Functions f=new Functions();
  // Call three Functions here
          f.name("shashi");
          f.name1("shashi");
           f.name2("shashi");
            
  }
}
