import java.util.*;
 
class Main {

  public static int power(int a,int b)
  {
    int temp=1;
    for (int i=1; i<=b; i++){
         temp = temp*a;
    }
    return temp;
  }
    
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
      int base=s.nextInt();
      int exp=s.nextInt();
      int res=power(base,exp);
        System.out.println(res);
    }
}