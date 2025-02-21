import java.util.Scanner;

public class SimpleShoppingCartProgram{
    public static void main(String[] args){
        String name;
        double price;
        int items;
        double total;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the product name : ");
        name = scanner.nextLine();

        System.out.print("Enter the price of the product : ");
        price = scanner.nextDouble();

        System.out.print("Enter the number of items : ");
        items = scanner.nextInt();

        scanner.close();
        total = price * items;

        //call printbill function for print the bill
        printbill(name, price, items, total);
    }

    public static void printbill(String name, double price, int items, double total){
        StringBuffer sb = new StringBuffer();
        sb.append("product name : ");
        sb.append(name).append("\n");
        sb.append("product price : ");
        sb.append(price).append("\n");
        sb.append("number of items : ");
        sb.append(items).append("\n");
        sb.append("total : ");
        sb.append(total).append("\n");
        sb.append("Thank you for shopping with us!");
        System.out.print(sb.toString());
    }
}