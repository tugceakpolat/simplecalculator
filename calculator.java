import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {

        int n1;
        int n2;
        int select;

        Scanner input= new Scanner(System.in);
        System.out.print("Enter First Number : ");
        n1= input.nextInt();
        System.out.print("Enter Second Number : ");
        n2= input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Your Choose :");
        select= input.nextInt();
        switch (select){
            case 1:
                System.out.println("Result : " + (n1+n2));
                break;
            case 2:
                System.out.println("Result : " + (n1-n2));
                break;
            case 3:
                System.out.println("Result : " +(n1*n2));
                break;
            case 4:
                if (n1 == 0 || n2 == 0) {
                    System.out.println("Result : The number 0 cannot be divided by any number.");
                } else {
                    System.out.println("Result : " + (n1/n2));
                }

                break;
            default:
                System.out.println("Please enter a number between 1 and 4.");
        }



    }
}
