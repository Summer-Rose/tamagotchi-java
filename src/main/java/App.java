import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class App {

    public static String userName = "";
    public static Tamagotchi myTam;

    public static void main(String[] args) {
    	staticFileLocation("/public");
    	String layout = "templates/layout.vtl";

      get("/", (request, response) -> {
        HashMap<String, Object> model = new HashMap<String, Object>();

        model.put("template", "templates/index.vtl");
        return new ModelAndView (model, layout);
      }, new VelocityTemplateEngine());

      get("/new-game", (request, reponse) -> {
        HashMap<String, Object> model = new HashMap<String, Object>();
        userName = request.queryParams("userName");
        String tamName = request.queryParams("tamName");
        myTam = new Tamagotchi(tamName);

        model.put("userName", userName);
        model.put("myTam", myTam);
        model.put("template", "templates/new-game.vtl");

        return new ModelAndView (model, layout);
      }, new VelocityTemplateEngine());

      post("/play-game", (request, reponse) -> {
        HashMap<String, Object> model = new HashMap<String, Object>();

        boolean playClicked =  Boolean.parseBoolean(request.queryParams("playClicked"));
        boolean feedClicked =  Boolean.parseBoolean(request.queryParams("feedClicked"));

        if (feedClicked) {
          myTam.eat();
          myTam.adjustHappyLevel();
        } else if (playClicked) {
          myTam.play();
        }

        model.put("feedClicked", feedClicked);
        model.put("playClicked", playClicked);
        model.put("userName", userName);
        model.put("myTam", myTam);
        model.put("template", "templates/new-game.vtl");

        return new ModelAndView (model, layout);
      }, new VelocityTemplateEngine());

    }

    public static void eatMeals() {
      // System.out.println("Calling eat...");
      // momo.eat();
      // System.out.println("Number of meals eaten: " + momo.getMeals());
      // System.out.println("Weight: " + momo.getWeight());
      // System.out.println("Hungry? " + momo.isHungry());
      // momo.adjustHappyLevel();
      // System.out.println("Happiness Level: " + momo.getHappyLevel());
      // System.out.println("Need potty? " + momo.needsBathroom());
      //
      // System.out.println("**********************************");
    }
}
