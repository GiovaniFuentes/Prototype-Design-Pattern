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




        output.close();
    }
}
