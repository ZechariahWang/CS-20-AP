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

  // This condition checks for user input and returns it to the main method
  public static int InputNum(){
    int value = 0;
    boolean invalid = false;
    do{
      System.out.println("Enter number: ");
      Scanner UserInput = new Scanner(System.in);
      try{
        value = UserInput.nextInt();
        invalid = true;
      }
      catch (Exception e){
        System.out.println("invalid input (1)");
      }
    } while (invalid == false);
    
    return value;
  }

  public static int InputReplacementNum(){
    int value = 0;
    boolean invalid = false;
    do{
      System.out.println("Enter replacement number: ");
      Scanner UserInput = new Scanner(System.in);
      try{
        value = UserInput.nextInt();
        invalid = true;
      }
      catch (Exception e){
        System.out.println("invalid input (1)");
      }
    } while (invalid == false);
    
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
    System.out.println("displaying...");
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
    System.out.println("Shuffled randomly!");
  }

  public static void findFirstOccurance(int num){ // Find first occurance of a number in the array
    for (int i = 0; i < globalArray.length; i ++){
      if (num == globalArray[i]){
        System.out.println("The first occurance of " + num + " is at index: " + i);
        return;
      }
    }
    System.out.println("No number in list! (Error code -1)");
  }

  public static void checkAscending(){ // Check if array is in ascending order
    for (int i = 0; i < globalArray.length - 1; i++) {
      if (globalArray[i] > globalArray[i + 1]) {
        System.out.println("Array is not in ascending order!");
        return;
      }
    }
    System.out.println("Array is in ascending order!");
  }

  public static void findLowestValue(){ // Find lowest number in array
    int minValue = globalArray[0];
    for(int i = 1; i < globalArray.length; i++){
      if(globalArray[i] < minValue){
        minValue = globalArray[i];
      }
    }
    System.out.println("Lowest number in array is: " + minValue);
  }

  public static void findHighestValue(){ // Find highest number in array
    int maxValue = globalArray[0];
    for(int i = 1; i < globalArray.length; i++){
      if(globalArray[i] > maxValue){
        maxValue = globalArray[i];
      }
    }
      
    System.out.println("Highest number in array is: " + maxValue);
  }

  public static void numberOccurance(int num){ // Find occurance of num
    int res = 0;
    for (int i = 0; i < globalArray.length; i++){
        if (num == globalArray[i]){
          res++;
        }
    }
  
    System.out.println("Occurance: " + res + " time(s)");
  }

  public static void replaceNum(int num, int replacementNum){ // Find occurance of num
    int replacementCounter = 0;
    for (int i = 0; i < globalArray.length; i++){
        if (globalArray[i] == num){
          globalArray[i] = replacementNum;
          replacementCounter ++;
        }
    }
    System.out.println("Replaced on " + replacementCounter + " occasions!");
  }

  public static void sortArray(){ // Bubble sort algorithm
    for (int i = 0; i < globalArray.length - 1; i++){
      for (int j = 0; j <  globalArray.length - i - 1; j++){
        if (globalArray[j] > globalArray[j + 1]){
          int temp = globalArray[j];
          globalArray[j] = globalArray[j + 1];
          globalArray[j + 1] = temp;
        }
      }
    }
    System.out.println("Sorted!");
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
    System.out.println("5 = Find First occurance");
    System.out.println("6 = Check if ascending");
    System.out.println("7 = Find lowest value");
    System.out.println("8 = Find highest value");
    System.out.println("9 = Find number Occurance");
    System.out.println("10 = Replace Number");
    System.out.println("11 = Sort Array");
    System.out.println("12 = exit");
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
        int chosenNum = InputNum();
        findFirstOccurance(chosenNum);
      }
      else if (decision == 6){
        checkAscending();
      }
      else if (decision == 7){
        findLowestValue();
      }
      else if (decision == 8){
        findHighestValue();
      }
      else if (decision == 9){
        int chosenNum = InputNum();
        numberOccurance(chosenNum);
      }
      else if (decision == 10){
        int chosenNum = InputNum();
        int replacementNum = InputReplacementNum();
        replaceNum(chosenNum, replacementNum);
      }
      else if (decision == 11){
        sortArray();
      }
      else if (decision == 12){
        ExitProgram();
      }
      else{
        // System.out.println("Invalid num");
      }
    } while (Exit == false);
    
  }
}