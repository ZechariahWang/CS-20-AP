import java.text.DecimalFormat;
import java.util.Random;

class Main {
  static double[] c_2_a = new double[13];
  static double[] c_36_a = new double[13];
  static double[] c_500_a = new double[13];
  static double[] c_10k_a = new double[13];
  static final double probBase = 36;
  static final double probBase36 = 36;
  static final double probBase500 = 500;
  static final double probBase10k = 10000;

  public static void printFormat(double value){
    DecimalFormat df = new DecimalFormat("#.####");
    System.out.println(df.format(value)); 
  }

  public static void Display2Prob(){
    DecimalFormat df = new DecimalFormat("0.0000");
    System.out.print("Theoretical Probability of rolling 2 die: \n");
    System.out.print("X:  \t  2\t\t\t 3\t\t\t4\t\t   5\t\t  6\t\t\t 7\t\t\t8\t\t   9\t\t  10\t\t 11\t\t\t12 \t\n");
    System.out.print("P(X):  \t  " + df.format(1 / probBase) + "     " + df.format(2 / probBase) + "     " + df.format(3 / probBase) + "     "  + df.format(4 / probBase) + "     " + df.format(5 / probBase) + "     " +  df.format(6 / probBase) + "     " + df.format(5 / probBase) + "     " + df.format(4 / probBase) + "     " + df.format(3 / probBase) + "     " +  df.format(2 / probBase) + "     " + df.format(1 / probBase) + " \t\n");
  }

  public static void Display36Prob(){
    DecimalFormat df = new DecimalFormat("0.0000");
    System.out.print("Results rolling 36 die: \n");
    System.out.print("X:  \t  2\t\t\t 3\t\t\t4\t\t   5\t\t  6\t\t\t 7\t\t\t8\t\t   9\t\t  10\t\t 11\t\t\t12 \t\n");
    System.out.print("Count:\t  " + df.format(c_36_a[1]) + "     " + df.format(c_36_a[2]) + "     " + df.format(c_36_a[3]) + "     "  + df.format(c_36_a[4]) + "     " + df.format(c_36_a[5]) + "     " +  df.format(c_36_a[6]) + "     " + df.format(c_36_a[7]) + "     " + df.format(c_36_a[8]) + "     " + df.format(c_36_a[9]) + "     " +  df.format(c_36_a[10]) + "     " + df.format(c_36_a[11]) + " \t\n");
    System.out.print("Em Prob:  " + df.format(c_36_a[1] / probBase) + "     " + df.format(c_36_a[2] / probBase) + "     " + df.format(c_36_a[3] / probBase) + "     "  + df.format(c_36_a[4] / probBase) + "     " + df.format(c_36_a[5] / probBase) + "     " +  df.format(c_36_a[6] / probBase) + "     " + df.format(c_36_a[7] / probBase) + "     " + df.format(c_36_a[8] / probBase) + "     " + df.format(c_36_a[9] / probBase) + "     " +  df.format(c_36_a[10] / probBase) + "     " + df.format(c_36_a[11] / probBase) + " \t\n");
    System.out.print("P(X):  \t  " + df.format(1 / probBase) + "     " + df.format(2 / probBase) + "     " + df.format(3 / probBase) + "     "  + df.format(4 / probBase) + "     " + df.format(5 / probBase) + "     " +  df.format(6 / probBase) + "     " + df.format(5 / probBase) + "     " + df.format(4 / probBase) + "     " + df.format(3 / probBase) + "     " +  df.format(2 / probBase) + "     " + df.format(1 / probBase) + " \t\n");
  }

  public static void Display500Prob(){
    DecimalFormat df = new DecimalFormat("0.0000");
    DecimalFormat df_count = new DecimalFormat("00.000");
    System.out.print("Results rolling 500 die: \n");
    System.out.print("X:  \t  2\t\t\t 3\t\t\t4\t\t   5\t\t  6\t\t\t 7\t\t\t8\t\t   9\t\t  10\t\t 11\t\t\t12 \t\n");
    System.out.print("Count:\t  " + df_count.format(c_500_a[1]) + "     " + df_count.format(c_500_a[2]) + "     " + df_count.format(c_500_a[3]) + "     "  + df_count.format(c_500_a[4]) + "     " + df_count.format(c_500_a[5]) + "     " +  df_count.format(c_500_a[6]) + "     " + df_count.format(c_500_a[7]) + "     " + df_count.format(c_500_a[8]) + "     " + df_count.format(c_500_a[9]) + "     " +  df_count.format(c_500_a[10]) + "     " + df_count.format(c_500_a[11]) + " \t\n");
    System.out.print("Em Prob:  " + df.format(c_500_a[1] / probBase500) + "     " + df.format(c_500_a[2] / probBase500) + "     " + df.format(c_500_a[3] / probBase500) + "     "  + df.format(c_500_a[4] / probBase500) + "     " + df.format(c_500_a[5] / probBase500) + "     " +  df.format(c_500_a[6] / probBase500) + "     " + df.format(c_500_a[7] / probBase500) + "     " + df.format(c_500_a[8] / probBase500) + "     " + df.format(c_500_a[9] / probBase500) + "     " +  df.format(c_500_a[10] / probBase500) + "     " + df.format(c_500_a[11] / probBase500) + " \t\n");
    System.out.print("P(X):  \t  " + df.format(1 / probBase) + "     " + df.format(2 / probBase) + "     " + df.format(3 / probBase) + "     "  + df.format(4 / probBase) + "     " + df.format(5 / probBase) + "     " +  df.format(6 / probBase) + "     " + df.format(5 / probBase) + "     " + df.format(4 / probBase) + "     " + df.format(3 / probBase) + "     " +  df.format(2 / probBase) + "     " + df.format(1 / probBase) + " \t\n");
  }

  public static void Display10kProb(){
    DecimalFormat df = new DecimalFormat("0.0000");
    DecimalFormat df_count10k = new DecimalFormat("0000.0");
    System.out.print("Results rolling 10,000 die: \n");
    System.out.print("X:  \t  2\t\t\t 3\t\t\t4\t\t   5\t\t  6\t\t\t 7\t\t\t8\t\t   9\t\t  10\t\t 11\t\t\t12 \t\n");
    System.out.print("Count:\t  " + df_count10k.format(c_10k_a[1]) + "     " + df_count10k.format(c_10k_a[2]) + "     " + df_count10k.format(c_10k_a[3]) + "     "  + df_count10k.format(c_10k_a[4]) + "     " + df_count10k.format(c_10k_a[5]) + "     " +  df_count10k.format(c_10k_a[6]) + "     " + df_count10k.format(c_10k_a[7]) + "     " + df_count10k.format(c_10k_a[8]) + "     " + df_count10k.format(c_10k_a[9]) + "     " +  df_count10k.format(c_10k_a[10]) + "     " + df_count10k.format(c_10k_a[11]) + " \t\n");
    System.out.print("Em Prob:  " + df.format(c_10k_a[1] / probBase10k) + "     " + df.format(c_10k_a[2] / probBase10k) + "     " + df.format(c_10k_a[3] / probBase10k) + "     "  + df.format(c_10k_a[4] / probBase10k) + "     " + df.format(c_10k_a[5] / probBase10k) + "     " +  df.format(c_10k_a[6] / probBase10k) + "     " + df.format(c_10k_a[7] / probBase10k) + "     " + df.format(c_10k_a[8] / probBase10k) + "     " + df.format(c_10k_a[9] / probBase10k) + "     " +  df.format(c_10k_a[10] / probBase10k) + "     " + df.format(c_10k_a[11] / probBase10k) + " \t\n");
    System.out.print("P(X):  \t  " + df.format(1 / probBase) + "     " + df.format(2 / probBase) + "     " + df.format(3 / probBase) + "     "  + df.format(4 / probBase) + "     " + df.format(5 / probBase) + "     " +  df.format(6 / probBase) + "     " + df.format(5 / probBase) + "     " + df.format(4 / probBase) + "     " + df.format(3 / probBase) + "     " +  df.format(2 / probBase) + "     " + df.format(1 / probBase) + " \t\n");
  }
  
  public static void DisplayProbability(int amount){
    if (amount == 2) {Display2Prob();}
    if (amount == 36) {Display36Prob();}
    if (amount == 500) {Display500Prob();} 
    if (amount == 10000) {Display10kProb();}
  }

  public static void r_roll2_p(){
    Random r = new Random();
    for (int i = 0; i < 2; i++){
      int score = (r.nextInt(6)) + 1 + (r.nextInt(6) + 1);
      c_2_a[score]++;
    }
  }

  public static void r_roll36_p(){
    Random r = new Random();
    for (int i = 0; i < 36; i++){
      int score = (r.nextInt(6)) + 1 + (r.nextInt(6) + 1);
      c_36_a[score]++;
    }
  }

  public static void r_roll500_p(){
    Random r = new Random();
    for (int i = 0; i < 500; i++){
      int score = (r.nextInt(6)) + 1 + (r.nextInt(6) + 1);
      c_500_a[score]++;
    }
  }

  public static void r_roll10k_p(){
    Random r = new Random();
    for (int i = 0; i < 10000; i++){
      int score = (r.nextInt(6)) + 1 + (r.nextInt(6) + 1);
      c_10k_a[score]++;
    }
  }
  
  public static void main(String[] args) {
    r_roll2_p();
    r_roll36_p();
    r_roll500_p();
    r_roll10k_p();
    DisplayProbability(2);
    DisplayProbability(36);
    DisplayProbability(500);
    DisplayProbability(10000);
  }
}