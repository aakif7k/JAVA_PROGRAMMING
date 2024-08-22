import java.util.Scanner;
class emc{
     public static void main(String args[]){
          Scanner scan = new Scanner(System.in);
          String name = scan.nextLine();
          int marks = scan.nextInt();
          scan.nextLine();
          String d = scan.nextLine();


          System.out.println("My name is "+name);
          System.out.println("my mark is "+ marks/100);
          System.out.println("my department is "+d);

     }
}