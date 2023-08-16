package hello.com;

public class Lec_80_Try_Catch {
    public static void main(String[] args) {
        int a = 6000;
        int b = 9;
        try {


            int c;
            c = a / b;
            System.out.println(c);
        }
        catch (Exception d){
            System.out.println("we failed to divide the reason is: ");
            System.out.println(d);
        }
//        System.out.println(c);
        System.out.println("The end of the program");
    }
}
