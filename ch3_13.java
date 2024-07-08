import java.util.Scanner;

public class ch3_13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = sc.next();
        System.out.println("How old are you?");
        int age = sc.nextInt();
        System.out.println(name+","+age+"Years old.");
    }
}