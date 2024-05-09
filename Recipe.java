public class Recipe implements GroceryStore{


    public Recipe(){
        System.out.println("Recipe is made");
    }


    @Override
    public GroceryStore makeCopy() {
        // TODO Auto-generated method stub
        System.out.println("Recipe being Made");

        Recipe recipeObject = null;

        try {
            recipeObject = (Recipe) super.clone();
        } catch (CloneNotSupportedException e) { // triggered if try to clone object that doesn't extend clonable
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return recipeObject;

    }


    public String toString(){
        return "I am a recipe wooo";
    }

    
}
