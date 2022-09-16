import java.util.Scanner; // Importing input utilities
import java.util.Random; // Importing random utilities


class Main {

  static int globalArray[] = new int[99];

  static Boolean Exit = false;

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
  }
  
  public static void display(){ // Display array data???
    System.out.println("displaying");
    for (int i = 0; i < globalArray.length; i++){
       System.out.print(globalArray[i] + ", ");
    }
    System.out.print("array length: " + globalArray.length);
  }
  
  public static void shuffle(){ // Display array data???
    int index, temp;
    Random random = new Random();
    
    for (int i = globalArray.length - 1; i > 0; i--)
    {
        index = random.nextInt(i + 1);
        temp = globalArray[index];
        globalArray[index] = globalArray[i];
        globalArray[i] = temp;
    }
  }

  public static void ExitProgram(){
    System.out.println("Exiting");
    Exit = true;
  }
  
  public static void main(String[] args) {
    do{ 
      System.out.println("Desired command: ");
      int decision = ConditionChecker();
      if (decision == 1){
        populate_rand();
      }
      else if (decision == 2){
        populate_sequentially();
      }
      else if (decision == 3){
        display();
      }
      else if (decision == 4){
        shuffle();
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