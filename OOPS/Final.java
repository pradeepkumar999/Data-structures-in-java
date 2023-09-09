

public class Final {
    final int x=15;
    public static void main(String args[]){
    Final myObj=new Final();
    myObj.x=40;// will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
    }
    
}
