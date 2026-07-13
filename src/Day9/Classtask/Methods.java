package Day9.Classtask;



public class Methods {
    public static void main(String [] args){
        System.out.println(adder(4,5,6,7,6,7,7,8,9));
    }
    public static void greet(String name ,int age){
        System.out.print("good evening "  + name   );
    }
    //with parameter with return type
    public static int adder(int ...num){
        // num variable is in integer Array datatype:
        int sum =0;
        // [4,5,6,7,6,7,7,8,9]
        for (int i=0; i<num.length;i++){
            sum =sum +num[i];
        }
        return sum;
    }
    //without parameter  with return type-
    public static double pi(){
        return 3.14;
    }
    // without parameter without return-
    // with parameter with return type-
    // without parameter  with return type-
    //with parameter without return type
    public static void multiply(int a , int b){

        System.out.print(a*b);
    }
}
