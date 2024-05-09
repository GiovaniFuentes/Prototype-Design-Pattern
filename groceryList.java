public class groceryList implements GroceryStore{

    protected String item1, item2, item3, name;
    public groceryList(){
        name = "N/A";
        item1 = "No first item";
        item2 = "No second item";
        item3 = "No third item";

        System.out.println("groceryList is made");
    }

    public groceryList(String name, String item1, String item2, String item3){
        this.name = name;
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;

        System.out.println("groceryList is made");
    }



    
    public void setItem1(String item1) {
        this.item1 = item1;
    }

    public void setItem2(String item2) {
        this.item2 = item2;
    }

    public void setItem3(String item3) {
        this.item3 = item3;
    }

    public void setName(String name) {
        this.name = name;
    }








    @Override
    public GroceryStore makeCopy() {
        // TODO Auto-generated method stub
        System.out.println("Recipe being Made");

        groceryList recipeObject = null;

        try {
            recipeObject = (groceryList) super.clone();
        } catch (CloneNotSupportedException e) { // triggered if try to clone object that doesn't extend clonable
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return recipeObject;

    }


    public String toString(){
        String s;
        s = "\t\t" + name + "'s Grocery List\nitem1: " + item1 + "\nitem2: " + item2 + "\nitem3: " + item3;
        return s;
    }

    
}
