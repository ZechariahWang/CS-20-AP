import java.util.Scanner; // Importing input utilities
import java.util.Random; // Importing random utilities


class Main {

  static int globalArray[] = new int[100]; // Global array. Altered by user in main method
  static Boolean Exit = false; // Exit condition. If made true, will exit program


  // This condition checks for user input and returns it to the main method
  public static int ConditionChecker(){
    Scanner UserInput = new Scanner(System.in);
    int value = 0;

    try{
      value = UserInput.nextInt();
    }
    catch (Exception e){
      System.out.println("invalid input");
    }

    return value;
  }
  
  public static void populate_rand(){ // Fill array with random numbers????
    System.out.println("populating rand");
    Random rand = new Random();
    for (int i = 0; i < globalArray.length; i++){
        globalArray[i] = rand.nextInt(100);
    }
    return;
  }
  
  public static void populate_sequentially(){ // Fill array with an increment each time???
    System.out.println("populating sequen");
    Random random = new Random();
    int init_count = 0;
    for (int i = 0; i <= 99; i++){
      init_count += 1;
      globalArray[i] = i + 1;
    }
  }

  public static void display(){ // Display array data???
    System.out.println("displaying");
    for (int i = 1; i < 101; i++){
      if (i % 5 == 0 && i != 0){
        System.out.println(globalArray[i - 1]);    
      }
      else{
        System.out.print(globalArray[i - 1] + " ");  
      }

    }
  }
  
  public static void shuffle(){ // shuffle array data????
    Random random = new Random();
    for (int i = globalArray.length - 1; i > 0; i--){
      int index = random.nextInt(i + 1);
      int a = globalArray[index];
      globalArray[index] = globalArray[i];
      globalArray[i] = a;
    }
  }

  // This method exits out of the program
  public static void ExitProgram(){
    System.out.println("Exiting");
    Exit = true;
  }

  // This program displays prompts for the user to enter commands into the main method
  public static void DisplayPrompt(){
    System.out.println(" ");
    System.out.println("1 = populate randomly");
    System.out.println("2 = populate sequentially");
    System.out.println("3 = shuffle");
    System.out.println("4 = display");
    System.out.println("5 = exit");
    System.out.println("Enter Desired command:");
  }


  // PLEASE I WANNA DIE
  public static void main(String[] args) {
    do{ 
      DisplayPrompt();
      int decision = ConditionChecker();
      if (decision == 1){
        populate_rand();
      }
      else if (decision == 2){
        populate_sequentially();
      }
      else if (decision == 3){
        shuffle();
      }
      else if (decision == 4){
        display();
      }
      else if (decision == 5){
        ExitProgram();
      }
      else{
        System.out.println("Invalid num");
      }
    } while (Exit == false);
    
  }
}