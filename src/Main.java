import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("welcome to my Appliction");
        System.out.println("please enter your password Raj");
        Scanner sc= new Scanner(System.in);
        String password= "123@Raj";


        while(true) {
            String input=sc.nextLine();
            if(input.equals(password)) {
                System.out.println("login succesful");
            }else {
                System.out.println("your password is wrong");
                System.out.println("please enter correct password");
            }

        }


    }
}









