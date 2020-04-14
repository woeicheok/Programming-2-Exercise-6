import java.util.*;
public class TestBook
{
   public static void main (String[]args)
   {
     Scanner keyboard = new Scanner(System.in);
     System.out.print("Number of books: ");
     int n = keyboard.nextInt();
     Book[]myLibrary = new Book[n];

       for (int i=0;i<n;i++)
       {
          keyboard.nextLine();
          System.out.print("Title: ");
          String title = keyboard.nextLine();
          System.out.print("Price: ");
          double price = keyboard.nextDouble();
   
          myLibrary[i] = new Book(title,price);
       }
               
        double highestPrice = myLibrary[0].getPrice();
        String highestPriceBook = myLibrary[0].getTitle();
         
        for (int i=0;i<n;i++)
        {      
           if (myLibrary[i].getPrice()>highestPrice)
           {
               highestPrice = myLibrary[i].getPrice();
               highestPriceBook = myLibrary[i].getTitle();
           }
        }
        System.out.printf("%n\"%s\"%s%.2f%n%n", highestPriceBook ," is the highest price book which is RM " , highestPrice);
        System.out.println("Books that contain the term \"Java\" in their title:");
        for(int j=0;j<n;j++)
        {
            if(myLibrary[j].getTitle().contains("Java"))
            System.out.println("\""+myLibrary[j].getTitle()+"\"");
        }
    }
}


class Book 
{
    private String title;  //book’s title
    private double price;  //book’s price
   
    public Book(String t, double p) 
    {
      title = t;
      price = p;
    }
    public String getTitle() 
    {
      return title;
    }   
    public double getPrice() 
    {
      return price;
    }
}