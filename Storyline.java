package com.mycompany.project;

/**
 *
 * @author jayja
 */
public class Storyline extends Acts {

    public static void backstory() {
        //sout the intro storyline here
        Plotline.whiteSpace();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("While living on the campus of Tarleton State University, you decide to get a pet duck and name it Oscar P in honor of the university founder's pet.");
        System.out.println("One morning you wake up to realize you do not hear the melodius quacks of Oscar. You search the room only to find that your beloved pet duck has been kidnapped!");
        System.out.println("From that moment you decide to go on a quest to find your best friend, Oscar P.");
        Plotline.anything();
    }

    public static void openingOne() {
        //sout the  storyline here
        Plotline.whiteSpace();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("You begin your journey searching around the on-campus houses, where Oscar could have easily hidden in one of the bushes.");
        System.out.println("You start peering through ground-floor windows, digging in bushes, and yelling out Oscar's name until the girl who walks barefoot outside while walking her cat gave you a strange look.");
        Plotline.anything();
    }

    public static void endOne() {
        //sout the  storyline here
        Plotline.whiteSpace();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("No luck so far in the search for Oscar P. You imagine you can still hear his quacking off in the distance.");
        Plotline.anything();
    }

    public static void openingTwo() {
        //sout the  storyline here
        Plotline.whiteSpace();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("You decide to move on from the dorms, and head South toward the giant statue of John T that stands in the middle of a large pond.");
        System.out.println("You can hear the water quietly splashing and sloshing and hope that Oscar P will be found swimming in the serene waters.");
        Plotline.anything();
    }

    public static void endTwo() {
        //sout the  storyline here
        Plotline.whiteSpace();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("No luck so far in the search for Oscar P. You imagine you can still hear his quacking off in the distance.");
        Plotline.anything();
    }

    public static void openingThree() {
        //sout the  storyline here
        Plotline.whiteSpace();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("From the pond, you decide to go East to Heritage Park, filled with lush green grass and students walking their dogs. ");
        System.out.println("You think about finding Oscar P cuddled up next to someone's dog asleep and your heart is briefly filled with joy.");
        Plotline.anything();
    }

    public static void endThree() {
        //sout the  storyline here
        Plotline.whiteSpace();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("No luck so far in the search for Oscar P. You imagine you can still hear his quacking off in the distance.");
        Plotline.anything();
    }

    public static void openingFour() {
        Plotline.whiteSpace();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("The final boss approaches: it is the ghost of John Tarleton! He eerily tells you that he misses his pet duck, and that he stole your duck to appease his");
        System.out.println("longing for his buddy Oscar P. In order to win your duck back you must beat John T in battle!");
    }

    public static void endFour(String name) {
        Plotline.whiteSpace();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("You have successfully beaten John T and gained your best duck friend back! You cheerfully walk home with Oscar P in your arms while you hum the Tarleton fight song.");
        System.exit(0);
    }
}//endStoryline