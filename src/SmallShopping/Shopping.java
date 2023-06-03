package SmallShopping;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("WELCOME TO OUR STORE!!!");
        System.out.println();
        String[]products = {"shoes","handbag","watch","bracelet","clasp"};
        double[]prices = {59,25,100,70,90};

        int x;
        int y;
        String a;
        int sum = 0;

        outerLoop:
        while(true){
            System.out.println("Products and their prices :");
            for(int i=0; i<products.length; i++){
                System.out.println(products[i]+" : "+prices[i]+"$");
            }
            System.out.println();
            System.out.println("Enter what product you wanna buy...");
            a = scan.next();

            if(a.equalsIgnoreCase("shoes")){
                x=0;
            }else if(a.equalsIgnoreCase("handbag")){
                x=1;
            }else if(a.equalsIgnoreCase("watch")){
                x=2;
            }else if(a.equalsIgnoreCase("bracelet")){
                x=3;
            }else if(a.equalsIgnoreCase("clasp")){
                x=4;
            }else{
                System.out.println("Please enter a valid product name!");
                continue;
            }
            System.out.println("How many of this product would you like to buy?");

            y=scan.nextInt();
            sum+=prices[x]*y;

            while(true){
                System.out.println("Do you want to buy something else?");
                a= scan.next();
                if(a.equalsIgnoreCase("no")){
                    System.out.println("The total amount to be paid : "+sum);
                    break outerLoop;
                }else if(a.equalsIgnoreCase("yes")){
                    continue outerLoop;
                }else{
                    System.out.println("Please only say 'yes' or 'no'!");
                }
            }
        }
        System.out.println("Have a nice day!");
    }
}
