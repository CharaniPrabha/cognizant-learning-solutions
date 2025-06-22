import java.util.*;
import java.lang.*;
class Product{
    int productId;
    String productName;
    String category;
    Product(int productId,String productName,String category){
        this.productId=productId;
        this.productName=productName;
        this.category=category;
    }
    @Override
    public String toString(){
        return "ID:"+productId+" Name:"+productName+" category:"+category;
    }
}
public class Ecommercesearch{
    public static Product linearSearch(Product products[],String targetName){
        for(Product p : products){
            if(p.productName.equalsIgnoreCase(targetName)){
                return p;
            }
        }
        return null; 
    }
    public static Product binarySearch(Product products[],String targetName){
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(targetName);
            if (cmp == 0)
                return products[mid];
            else if (cmp < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return null;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        List <Product> productList = new ArrayList<>();
        System.out.print("How many products do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Product " + (i + 1));
            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Product Name: ");
            String name = sc.nextLine();
            System.out.print("Category: ");
            String category = sc.nextLine();

            productList.add(new Product(id, name, category));
        }
        Product[] products = productList.toArray(new Product[0]);
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
        System.out.print("\nEnter product name to search: ");
        String searchName = sc.nextLine();
        Product result1 = linearSearch(products, searchName);
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not Found"));
        Product result2 = binarySearch(products, searchName);
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not Found"));
    
    }
}