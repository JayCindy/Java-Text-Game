package com.mycompany.project;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author jayja
 */
public class WriteFile {

    public static void win() {
        try {
            FileWriter myWriter = new FileWriter("winner.txt");
            myWriter.write("CONGRATULATIONS!\nYou have successfully defeated the enemy and found Oscar P!\n");
            myWriter.write("As a memorial to your hard work, below is a certificate of accomplishment!\n");
            myWriter.write("\t\t----------------------------------------------------------------------------------------------------\n");
            myWriter.write("\t\t-                                                                                                  -\n");
            myWriter.write("\t\t-                  This certificate states that the hero of this journey                           -\n");
            myWriter.write("\t\t-                successfully defeated the enemies to regain their lost pet.                       -\n");
            myWriter.write("\t\t-                                                                                                  -\n");
            myWriter.write("\t\t-            On this day, in the terrible year of 2020, a bright spot was regained                 -\n");
            myWriter.write("\t\t-                              through the finding of Oscar P.                                     -\n");
            myWriter.write("\t\t-                                                                                                  -\n");
            myWriter.write("\t\t-                                                                                                  -\n");
            myWriter.write("\t\t-                                                                                                  -\n");
            myWriter.write("\t\t-                            May his spirit ever shine through you,                                -\n");
            myWriter.write("\t\t-                                And your Poo always be purple.                                    -\n");
            myWriter.write("\t\t-                                                                                                  -\n");
            myWriter.write("\t\t-                                                                                                  -\n");
            myWriter.write("\t\t----------------------------------------------------------------------------------------------------\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }//end try/catch
    }//end win

    public static void lose() {
        try {
            FileWriter myWriter = new FileWriter("loser.txt");
            myWriter.write("You have been defeated by the enemy and did not find Oscar P!\n");
            myWriter.write("As a memorial to your effort, below is a certificate of your death!\n");
            myWriter.write("\t\t----------------------------------------------------------------------------------------------------\n");
            myWriter.write("\t\t-                                                                                                  -\n");
            myWriter.write("\t\t-                   This certificate states that the hero of this journey                          -\n");
            myWriter.write("\t\t-               was defeated by the enemies while trying regain their lost pet.                    -\n");
            myWriter.write("\t\t-                                                                                                  -\n");
            myWriter.write("\t\t-               On this day, in the terrible year of 2020, a dark spot was left                    -\n");
            myWriter.write("\t\t-                              in the journey of finding of Oscar P.                               -\n");
            myWriter.write("\t\t-                                                                                                  -\n");
            myWriter.write("\t\t-                                                                                                  -\n");
            myWriter.write("\t\t-                                                                                                  -\n");
            myWriter.write("\t\t-                                   May your spirit live on,                                       -\n");
            myWriter.write("\t\t-                                And your Poo always be purple.                                    -\n");
            myWriter.write("\t\t-                                                                                                  -\n");
            myWriter.write("\t\t-                                                                                                  -\n");
            myWriter.write("\t\t----------------------------------------------------------------------------------------------------\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }//end try/catch
    }//end lose  
}//end WriteFile