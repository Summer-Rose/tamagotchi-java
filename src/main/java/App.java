// import java.util.ArrayList;
// import java.util.Map;
// import java.util.HashMap;
// import spark.ModelAndView;
// import spark.template.velocity.VelocityTemplateEngine;
// import static spark.Spark.*;


public class App {
    public static Tamagotchi momo = new Tamagotchi("Momo");

    public static void main(String[] args) {
    	// staticFileLocation("/public");
    	// String layout = "templates/layout.vtl";
      System.out.println("Initial weight: " + momo.getWeight());
      System.out.println("**********************************");

      for (int i=0; i<15; i++) {
        eatMeals();
      }


      System.out.println("**********************************");
      System.out.println("Age: " + momo.getAge());

    }

    public static void eatMeals() {
      System.out.println("Calling eat...");
      momo.eat();
      System.out.println("Number of meals eaten: " + momo.getMeals());
      System.out.println("Weight: " + momo.getWeight());
      System.out.println("Hungry? " + momo.isHungry());
      momo.adjustHappyLevel();
      System.out.println("Happiness Level: " + momo.getHappyLevel());
      System.out.println("Need potty? " + momo.needsBathroom());

      System.out.println("**********************************");
    }
}
