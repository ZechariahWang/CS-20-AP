import java.io.File; // File import
import java.io.FileNotFoundException; // File Exception 
import java.util.Scanner; // Scanner 
import java.util.ArrayList; // import the ArrayList class 
import java.io.BufferedReader; // Buffer Reader 
import java.io.BufferedWriter; // Buffer Writer 
import java.io.FileWriter; // File Writer
import java.io.IOException; // IO Exception 
import java.util.Random; // Importing random utilities 
import java.util.concurrent.TimeUnit;

class Main {
  static final String FILE_PATH = "Anthem.txt";
  static ArrayList<String> global_List1 = new ArrayList<String>();
  static ArrayList<String> global_List_Transfer = new ArrayList<String>();
  static int attemptCounter = 0;

  public static void printToArray1(){
    for (int i = 0; i < global_List1.size(); i++){
      System.out.print(global_List1.get(i) + " ");
    }
  }

  public static void printReferenceArray(){
    for (int i = 0; i < global_List_Transfer.size(); i++){
      System.out.print(global_List_Transfer.get(i) + " ");
    }
  }

  public static void randomizeArrayData(){
    Random random = new Random();
    for (int i = 0; i < global_List1.size(); i++){
      int index = random.nextInt(i + 1);
      String a = global_List1.get(index);
      global_List1.set(index, global_List1.get(i));
      global_List1.set(i, a);
    }
  }

  public static void readInitFile() throws FileNotFoundException {
    File file = new File(FILE_PATH);
    Scanner scan = new Scanner(file);
    System.out.println(" ");
    System.out.println("Initial file data: ");
    System.out.println(" ");
    while (scan.hasNext()) {
      String line = scan.next();
      System.out.print(line + " ");
      global_List1.add(line);
      
    }
    System.out.println(" ");
    scan.close();
  }

  public static void writetoFile(String filename, ArrayList<String> ListWriter) throws IOException{
    BufferedWriter outputWriter = null;
    outputWriter = new BufferedWriter(new FileWriter(filename));
    for (int i = 0; i < ListWriter.size(); i++) {
      outputWriter.write(ListWriter.get(i) + " ");
    }
    outputWriter.flush();  
    outputWriter.close();  
  }

  public static void writetoFileAttemptCounter(String filename) throws IOException{
    System.out.println(" ");
    System.out.println("Transfering attempt data to external file...");
    try { Thread.sleep(2000); } catch(InterruptedException e){}
    System.out.println("[DONE]");
    BufferedWriter outputWriter = null;
    outputWriter = new BufferedWriter(new FileWriter(filename));
    outputWriter.write("Total attempts: " + attemptCounter);
    outputWriter.flush();  
    outputWriter.close();  
  }

  public static void copyData(){
    System.out.println(" ");
    System.out.println("Transfering arraylist data...");
    try { Thread.sleep(2000); } catch(InterruptedException e){}
    System.out.println("[DONE]");
    for (int i = 0; i < global_List1.size(); i++){
      global_List_Transfer.add(global_List1.get(i));
    }
  }

  public static void attemptToSort(){
    final int maxLimit = 1000;
    System.out.println(" ");
    System.out.println("Attempting to sort...");
    try { Thread.sleep(2000); } catch(InterruptedException e){}
    while (true) {
      randomizeArrayData();
      Boolean sameStatus = global_List1.equals(global_List_Transfer);
      if (sameStatus){
        System.out.println("Total number of attempts: " + attemptCounter);
        break;
      }
      else{
        attemptCounter++;
      }
      if (attemptCounter >= maxLimit){
        System.out.println("[DONE]");
        return;
      }
    }
    System.out.println("[DONE]");
  }
  
  public static void main(String[] args) throws IOException {
    readInitFile();
    try { Thread.sleep(1000); } catch(InterruptedException e){}
    copyData();
    try { Thread.sleep(1000); } catch(InterruptedException e){}
    randomizeArrayData();
    try { Thread.sleep(1000); } catch(InterruptedException e){}
    attemptToSort();
    try { Thread.sleep(1000); } catch(InterruptedException e){}
    writetoFileAttemptCounter("BestAttempt.txt");
    try { Thread.sleep(1000); } catch(InterruptedException e){}
    System.out.println("[PROCESS FINISHED]");
  }
}