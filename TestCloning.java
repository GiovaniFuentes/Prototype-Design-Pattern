import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestCloning {

    public static void main(String[] args) throws FileNotFoundException {
        CloneFactory recipeMaker =  new CloneFactory();
        groceryList firstList = new groceryList();
        groceryList clonedList = (groceryList) recipeMaker.getClone(firstList);

       
        PrintWriter output = new PrintWriter("output.txt");
        
        output.println(firstList);

        output.println(clonedList);


        output.println("\n\nThe Following proves that the cloned recipe is in a different location in memory from the first");
        output.println("First List Hashcode: " + System.identityHashCode(firstList));

        output.println("Cloned List Hashcode: " + System.identityHashCode(clonedList));

        output.println("\nSetting the cloned Lists's first item to\nmilk and setting the the name to Bob.");
        clonedList.setItem1("milk");
        clonedList.setName("Bob");

        output.println("\nPrinting both lists after the change");
        output.println("first list");
        output.println(firstList);
        output.println("\nCloned list");
        output.println(clonedList);

        output.println("\n\nNow we will create a completely new list for Joe\nit will have eggs, cheese and bacon\nWe will then make a copy of the list and give it to Jane.\nJane wants milk instead of cheese");

        groceryList Joe = new groceryList("Joe", "eggs", "cheese", "bacon");

        groceryList Jane = (groceryList) recipeMaker.getClone(Joe);
        output.println("\nPrinting Joe's List then printing copy of Joe's list");
       
        output.println(Joe);

        output.println(Jane);

        output.println("\nNow we will change the cloned list to Jane's name and\nalso change cheese to Milk for jane");
        
        //changing cloned name to Jane and item3 to milk
        Jane.setName("Jane");
        Jane.setItem2("Milk");

        output.println(Joe);

        output.println(Jane);

        output.println("\nNotice how only the item for the cloned list(Jane's) changed but not For Joe's");


        output.close();
    }
}
