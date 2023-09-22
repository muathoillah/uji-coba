import java.util.Scanner;

public class PurchasePrice17 {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);

    int price, quantyty;
    double discount=0.1, totalprice,  purchasePrice, totalDiscount;

    System.out.println("input price :");
    price = sc.nextInt();
    System.out.println("Input quantity!");
    quantyty = sc.nextInt();

    totalprice = price*quantyty;
    System.out.println("total price:" +totalprice);

    totalDiscount=totalprice*discount;
    purchasePrice= totalprice - totalDiscount;

    System.out.println("The total discount is " + totalDiscount);
    System.out.println("The Purchase Price is" + purchasePrice);
}
    
}
