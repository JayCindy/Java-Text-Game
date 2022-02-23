package com.mycompany.project;
import java.util.Scanner;

/**
 *
 * @author jayja
 */
public class Plotline {

    static Scanner sc = new Scanner(System.in);
    static Player player;
    public static boolean isRunning;
    //random encounters
    public static String[] encounters = {"Battle", "Shop", "Battle", "Battle", "Rest"};
    //enemy names
    public static String[] enemies = {"Goblin", "Generally Annoying Person", "Generally Annoying Person", "Toilet Paper Hoarder", "Evil Squirrel"};
    //Story elements
    public static int place = 0, stage = 1;
    public static String[] places = {"Dorms", "Pond", "Park", "Trogden House"};
    private static Plotline battle;

    //method to get user input
    public static int readInt(String prompt, int userChoices) {
        int input;
        do {
            System.out.println(prompt);
            try {
                input = Integer.parseInt(sc.next());
            } catch (NumberFormatException e) { //I had a different exception (IOException) here but netbeans recommended using the NumberFormatException
                input = -1;
                System.out.println("Invalid input!\n");
            }
        } while (input < 1 || input > userChoices);
        return input;
    }//end readInt

    //method to form white space for a visual break *aesthetics*
    public static void whiteSpace() {
        for (int i = 0; i < 2; i++) {
            System.out.println();
        }
    }//end whiteSpace   

    //method to stop the game until user enters something
    public static void anything() {
        System.out.println("\nEnter a single letter or number to continue. . .");
        sc.next();
    }//end anything

    //printing the main menu
    public static void homePage() {
        whiteSpace();
        System.out.println("MENU");
        System.out.println("Choose an action:");
        //    printSeparator(20);
        System.out.println(">1 Continue on your journey");
        System.out.println(">2 Exit game");
    }//end homePage

    //method to start the game
    public static void start() {
        boolean setName = false;
        String name;
        //print title screen
        whiteSpace();
        System.out.println("The Quest for Oscar P");
        System.out.println("Text Game by Jayla Oldfield");
        anything();
        //getting player name
        do {
            whiteSpace();
            System.out.println("What is your name?");
            name = sc.next();
            if ("Zdenek".equals(name)) {
                System.out.printf("%s, The legends have told of your arrival!\n", name);
                whiteSpace();
                System.out.println("Your name is " + name + ".\nIs that correct?");
                System.out.println(">1 Yes!");
                System.out.println(">2 No, I want to change my name.");
                int input = readInt("-> ", 2);
                if (input == 1) {
                    setName = true;
                }
                if (input != 1 && input != 2) {
                    System.out.println("Invalid input!\n");
                }
            }else if("Talyn".equals(name)){
                System.out.println("Your name is " + name + ".\nIs that correct?");
                System.out.println(">1 Yes!");
                System.out.println(">2 No, I want to change my name.");
                int input = readInt("-> ", 2);
                if (input == 1) {
                    setName = true;
                    System.out.printf(" 'A half-blood, %s, of the eldest gods\n" +
                                        "Shall play a badly made game against all odds\n" +
                                        "And see the world in endless sleep\n" +
                                        "The hero's sanity, cursed code shall reap\n" +
                                        "A single choice shall end his days (metaphorically)\n" +
                                        "Olympus to preserve or raze.'\n" +
                                        "\t--Gandalf (probably)", name);                          
                }
                if (input != 1 && input != 2) {
                    System.out.println("Invalid input!\n");
                }
            } 
            else {
                whiteSpace();
                System.out.println("Your name is " + name + ".\nIs that correct?");
                System.out.println(">1 Yes!");
                System.out.println(">2 No, I want to change my name.");
                int input = readInt("-> ", 2);
                if (input == 1) {
                    setName = true;
                }
                if (input != 1 && input != 2) {
                    System.out.println("Invalid input!\n");
                }
            }
        } while (!setName);
        //print story intro
        Storyline.backstory();
        //create new player using name
        player = new Player(name);
        Storyline.openingOne();
        //setting isRunnning to true, so the game loop can continue
        isRunning = true;
        //start main game loop
        gameLoop();
    }//end start   

    //main game loop
    public static void gameLoop() {
        while (isRunning) {
            homePage();
            int input = readInt("-> ", 2);
            switch (input) {
                case 1:
                    continueQuest();
                case 2:
                    isRunning = false;
                    System.exit(0);
            }//end switch
        }//end gameLoop    
    }//end gameLoop

    public static void places() {
        whiteSpace();
        System.out.println(places[place]);
        System.out.println("Choose an action:");
        //    printSeparator(20);
        System.out.println(">1 Continue on your journey");
        System.out.println(">2 Exit game");
    }//end places

    //method that changes the games' stages based on player xp
    public static void stage() {
        //change acts based on xp
        if (player.xp >= 10 && stage == 1) {
            //incrememnt act and place
            stage = 2;
            place = 1;
            Storyline.endOne();
            //let the player "level up"
            //story
            Storyline.openingTwo();
            //assigning new enemies
            enemies[0] = "Killer mermaid";
            enemies[1] = "Killer mermaid";
            enemies[2] = "Toilet Paper Hoarder";
            enemies[3] = "Killer mermaid";
            enemies[4] = "Killer mermaid";
            //assign new encounters
            encounters[0] = "Battle";
            encounters[1] = "Battle";
            encounters[2] = "Battle";
            encounters[3] = "Rest";
            encounters[4] = "Shop";
        } else if (player.xp >= 40 && stage == 2) {
            //incrememnt act and place
            stage = 3;
            place = 2;
            Storyline.endTwo();
            Storyline.openingThree();
            //assigning new values to enemies
            enemies[0] = "Evil Squirrel";
            enemies[1] = "Generally Annoying Person";
            enemies[2] = "Teenage Troll";
            enemies[3] = "Toilet Paper Hoarder";
            enemies[4] = "Toilet Paper Hoarder";
            //assign new values to encounters
            encounters[0] = "Battle";
            encounters[1] = "Battle";
            encounters[2] = "Battle";
            encounters[3] = "Rest";
            encounters[4] = "Battle";
            //fully heal the player
            player.hp = player.maxHP;
        } else if (player.xp >= 70 && stage == 3) {
            stage = 4;
            place = 3;
            Storyline.endThree();
            Storyline.openingFour();
            player.hp = player.maxHP;
            //call the final battle
            finalBattle();
        }//end ifs
    }//end stage

    //method to calculate a random bad guys
    public static void randoBaddies() {
        //random number bewteen 1 and the length of the encounters array
        int encounter = (int) (Math.random() * encounters.length);
        //calling the respective methods
        switch (encounters[encounter]) {
            case "Battle":
                System.out.println("An enemy appears out of nowhere! Prepare to fight!");
                randoFight();
            //  break;        
            case "Rest":
                nap();
            // break;            
            case "Shop":
                trader();
            // break;
        }//end switch       
    }//end randobaddies

    //method to continue the quest
    public static void continueQuest() {
        //check if act must be increased
        stage();
        //check if games isn't on last act
        if (stage != 4) {
            randoBaddies();
        } else {
            finalBattle();
        }
    }//end continueQuest

    //shopping/ encountering a travelling trader
    public static void trader() {
        whiteSpace();
        System.out.println("You run into a travelling trader!");
        int price = (int) (Math.random() * (10 + player.kits * 3) + 10 + player.kits);
        System.out.println("--Extreme First Aid Kit--\t" + price + " toilet paper sheets.");
        System.out.println("Do you want to buy one?\t<1 Yes\t<2No, thank you");
        int input = readInt("->", 2);
        switch (input) {
            case 1:
                whiteSpace();
                if (player.toiletPaper >= price) {
                    System.out.println("You bought an Extreme First Aid Kit for " + price + " toilet paper squares");
                    player.kits++;
                    player.toiletPaper -= price;
                } else {
                    System.out.println("You don't have enough toilet paper sheets to buy this.");
                    continueQuest();
                    anything();
                }//end else
            case 2:
                System.out.println("Maybe next time!");
                continueQuest();
                anything();
        }//end switch
    }//end shop  

    //taking a rest
    public static void nap() {
        whiteSpace();
        if (player.naps >= 1) {
            System.out.println("Do you want to take a nap? (" + player.naps + " nap(s) left).");
            System.out.println("<1 Yes\t<2No, thank you");
            int input = readInt("->", 2);
            switch (input) {
                case 1:
                    if (player.hp < player.maxHP) {
                        int hpRestore = (int) (Math.random() * player.xp / 4 + 1) + 10;
                        player.hp += hpRestore;
                        System.out.println("You took a nap and restored to " + hpRestore + " health");
                        System.out.println("You are now at " + player.hp + "/" + player.maxHP + " health");
                        player.naps--;
                    }//end if
                    if (player.hp >= player.maxHP) {
                        player.hp = player.maxHP;
                        System.out.println("You are at full health. You do not need to nap now!");
                    }
                    continueQuest();
                case 2:
                    System.out.println("Maybe later!");
                    break;
            }//end switch
            continueQuest();
        }//end if
    }//end nap

    //method for creating random battles
    public static void randoFight() {
        whiteSpace();
        anything();
        battle(new Enemy(enemies[(int) ((Math.random()) * enemies.length)], player.xp));
    }//end randoFight

    //main battle method
    public static void battle(Enemy enemy) {
        while (true) {
            whiteSpace();
            while (enemy.hp > 0) {
                System.out.println(enemy.name + "\nHP: " + enemy.hp + "/" + enemy.maxHP);
                System.out.println(player.name + "\nHP: " + player.hp + "/" + player.maxHP);
                System.out.println("Choose an action:");
                System.out.println(">1 Fight \t>2 Use First Aid Kit \t >3 Run Away");
                int input = readInt("->", 3);
                switch (input) {
                    case 1: //Fight
                        //checking player and enemy stats
                        int damDealt = player.attack() - enemy.defend();
                        int damTaken = enemy.attack() - player.defend();
                        if (damDealt < 0) {
                            damDealt = 1;
                        }
                        if (damTaken < 0) {
                            damTaken = 1;
                        }
                        player.hp -= damTaken;
                        enemy.hp -= damDealt;
                        System.out.println("\t>You strike the " + enemy.name + " for " + damDealt + " damage.");
                        System.out.println("\t>You receive " + damTaken + " in retaliation!");

                        whiteSpace();
                        // check for death or death-like symptoms
                        if (player.hp <= 0) {
                            WriteFile.lose();
                            death();
                        } else if (enemy.hp <= 0) {
                            WriteFile.win();
                            System.out.println("You defeated the " + enemy.name + "!");
                        }
                        player.xp += enemy.xp;
                        System.out.println("You earned " + enemy.hp + " XP!");
                        boolean addRest = (Math.random() * 5 + 1 <= 2.25);
                        int tpEarned = (int) (Math.random() * enemy.xp);
                        if (addRest) {
                            player.naps++;
                            System.out.println("You earned the chance to get an additional rest.");
                        }
                        if (tpEarned > 0) {
                            player.toiletPaper += tpEarned;
                            System.out.println("You collect " + tpEarned + " toilet paper sheets from the corpse of " + enemy.name);
                        }
                        anything();
                        break;
                    case 2:
                        whiteSpace();
                        if (player.kits > 0 && player.hp < player.maxHP) {
                            //  player can use a first aid kit
                            System.out.println("Do you want to use a first aid kit?\t(" + player.kits + " remaining).");
                            System.out.println(">1 Yes\t<2No, thank you");
                            input = readInt("->", 2);
                            switch (input) {
                                case 1:
                                    player.hp = player.maxHP;
                                    whiteSpace();
                                    System.out.println("You used a first aid kit. It restored your health back to " + player.maxHP);
                                    anything();
                            }

                        } else {
                            // player cannot use a first aid kit
                            System.out.println("You don't have any first aid kits OR you are at max health.");
                        }
                        break;
                    case 3:
                        // runaway
                        whiteSpace();
                        //check for final battle
                        if (stage != 4) {
                            // random chance to run away
                            if (Math.random() * 10 + 1 <= 3.5) {//change this
                                System.out.println("You ran away from " + enemy.name + "!");
                                anything();
                                break;
                            } else {
                                System.out.println("You didn't manage to run away.");
                                int damgT = enemy.attack();
                                System.out.println("In you shuffle to escape you took  " + damgT + " damage!");
                                anything();
                                if (player.hp <= 0) {
                                    death();
                                }
                            }
                        } else {
                            System.out.println("YOU CANNOT ESCAPE JOHN TARLETON'S GHOST!");
                            anything();
                        }
                }//end switch    
                continueQuest();
            }//end while 
        }//end while
    }//end battle

    //final battle
    public static void finalBattle() {
        Enemy enemy = new Enemy("JOHN TARLETON'S GHOST", 200);
        while (true) {
            whiteSpace();
            while (enemy.hp > 0) {
                System.out.println(enemy.name + "\nHP: " + enemy.hp + "/" + enemy.maxHP);
                System.out.println(player.name + "\nHP: " + player.hp + "/" + player.maxHP);
                System.out.println("Choose an action:");
                System.out.println(">1 Fight \t>2 Use First Aid Kit \t >3 Run Away");
                int input = readInt("->", 3);
                switch (input) {
                    case 1: //Fight
                        //checking player and enemy stats
                        int damDealt = player.attack() - enemy.defend();
                        int damTaken = enemy.attack() - player.defend();
                        if (damDealt < 0) {
                            damDealt = 1;
                        }
                        if (damTaken < 0) {
                            damTaken = 1;
                        }
                        player.hp -= damTaken;
                        enemy.hp -= damDealt;
                        System.out.println("\t>You strike " + enemy.name + " for " + damDealt + " damage.");
                        System.out.println("\t>You receive " + damTaken + " in retaliation!");
                        whiteSpace();
                        anything();
                        // check for death or death-like symptoms
                        if (player.hp <= 0) {
                            WriteFile.lose();
                            death();
                        } else if (enemy.hp <= 0) {
                            WriteFile.win();
                            System.out.println("You defeated the " + enemy.name + "!");
                            Storyline.endFour(player.name);
                        }
                        // }//end while
                        player.xp += enemy.xp;
                        System.out.println("You earned " + enemy.hp + " XP!");
                        boolean addRest = (Math.random() * 5 + 1 <= 2.25);
                        int tpEarned = (int) (Math.random() * enemy.xp);
                        if (addRest) {
                            player.naps++;
                            System.out.println("You earned the chance to get an additional rest.");
                        }
                        if (tpEarned > 0) {
                            player.toiletPaper += tpEarned;
                            System.out.println("You collect " + tpEarned + " toilet paper sheets from the corpse of " + enemy.name);
                        }
                        anything();
                        break;
                    case 2:
                        whiteSpace();
                        if (player.kits > 0 && player.hp < player.maxHP) {
                            //  player can use a first aid kit
                            System.out.println("Do you want to use a first aid kit?\t(" + player.kits + " remaining).");
                            System.out.println(">1 Yes\t<2No, thank you");
                            input = readInt("->", 2);
                            switch (input) {
                                case 1:
                                    player.hp = player.maxHP;
                                    whiteSpace();
                                    System.out.println("You used a first aid kit. It restored your health back to " + player.maxHP);
                                    anything();
                            }//end switch                                
                        } else {
                            // player cannot use a first aid kit
                            System.out.println("You don't have any first aid kits OR you are at max health.");
                        }
                        break;
                    case 3:
                        // runaway
                        whiteSpace();
                        System.out.println("YOU CANNOT ESCAPE JOHN TARLETON'S GHOST!");
                        anything();
                }//end switch
            }//end while
        }//end while 
    }//end finalBattle

    //method for dead player
    public static void death() {
        whiteSpace();
        System.out.println("You died...");
        System.out.println("You earned " + player.xp + "XP on your journey.");
        System.out.println("Continue to be filled with determination!");
        isRunning = false;
        System.exit(0);
    }//end death

}//END OF PLOTLINE
