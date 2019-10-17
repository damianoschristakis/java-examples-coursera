package noulis;

//acessability private/public modifiers
public class HelloWorld {
    // web application?
    // desk application?
    // service
    // terminal application
    public static void main(String[] args){
        System.out.println("Hello Noulis, let's count");
        int num1=5, num2=10, sum;
        sum = num1 + num2;
        String sentence = "Total: ";
        System.out.println( sentence + sum ); //unboxing sum: int -> string - syntactic sugaring
    }
}
