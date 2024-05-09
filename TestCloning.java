public class TestCloning {

    public static void main(String[] args) {
        CloneFactory recipeMaker =  new CloneFactory();
        groceryList firstList = new groceryList();
        groceryList clonedList = (groceryList) recipeMaker.getClone(firstList);


        System.out.println(firstList);

        System.out.println(clonedList);


        System.out.println("\n\nThe Following proves that the cloned recipe is in a different location in memory from the first");
        System.out.println("First List Hashcode: " + System.identityHashCode(firstList));

        System.out.println("Cloned List Hashcode: " + System.identityHashCode(clonedList));


    }
}
