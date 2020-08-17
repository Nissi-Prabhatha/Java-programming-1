import java.util.*;

class CustomException extends Exception{
    CustomException(String s){
    super(s);
    }
}
public class GenericQ8{
    static <T>void validate()throws CustomException{
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int temp = ((2*n)/3);
        System.out.println("2/3rd of "+n+" : "+temp);
    }
public static void main(String args[]){
    try{
      validate();
      System.out.println("Here you go  (:");
}
    catch(Exception e){System.out.println("Sorry not a number! :/ "+e);}
    }
}
