import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the options 1.+\n2.-\n3.*\n4./\n5.%\n6.+=\n7.-=\n8.*\n9./=\n10.%=\n11.Exit");
        int options = sc.nextInt();
        switch (options) {
            case 1:
                  System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
              break;
            case 3:
                  System.out.println(a*b);
                break;
            case 4:
                  System.out.println(a/b);
                break;
             case 5:
                  System.out.println(a%b);
                break;
            case 6:
                  System.out.println(a+=b);
                break;
            case 7:
                  System.out.println(a-=b);
                break;
            case 8:
                  System.out.println(a*=b);
                break;
            case 9:
                  System.out.println(a/=b);
                break;
            case 10:
                  System.out.println(a%=b);
                break;
            default:
            System.out.println();
                break;
        }

    }
}
