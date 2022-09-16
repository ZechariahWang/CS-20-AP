import java.util.Scanner; // Importing input utilities
import java.util.Random; // Importing random utilities

// Main class
class Main {

  // PLAYER AND COMPUTER SCORE
  static int playerScore = 0;
  static int prev_playerScore = 0;
  static int CPUScore = 0;
  static int prev_CPUScore = 0;

  // Throw counters
  static int PlayerThrowCounter              = 0;
  static int CPUThrowCounter                 = 0;

  static final int square                    = 1;
  static final int rectangle                 = 1;
  static final int triangle                  = 2;
  static final int circle                    = 3;
  static final int diamond                   = 4;

  // I only realized I spelled roll wrong after I declared them, don't judge.
  static int playerRole1                     = 0;
  static int playerRole2                     = 0;
  static int playerRole3                     = 0;
  static int playerRole4                     = 0;
  static int playerRole5                     = 0;

  // Player Pattern data
  static String playerPattern1               = "";
  static String playerPattern2               = "";
  static String playerPattern3               = "";
  static String playerPattern4               = "";
  static String playerPattern5               = "";

  // I only realized I spelled roll wrong after I declared them, don't judge.
  static int ComputerRole1                   = 0;
  static int ComputerRole2                   = 0;
  static int ComputerRole3                   = 0;
  static int ComputerRole4                   = 0;
  static int ComputerRole5                   = 0;

  // Computer pattern data
  static String computerPattern1             = "";
  static String computerPattern2             = "";
  static String computerPattern3             = "";
  static String computerPattern4             = "";
  static String computerPattern5             = "";

  // Roll counter. Resets with every iteration
  static int playerRoll                      = 0;
  static int CPURoll                         = 0;

  public static int Rand_helper(int upperLimit){
    Random rand = new Random();
    int upperBound = upperLimit;
    int random = rand.nextInt(upperBound);
    return random;
  }

  // This function should take in a threshhold parameter, compare it to the odds of the CPU getting a better score, and return that percentage.
  public static double odds(int t){

    int a = 1;
    int b = 1;
    int c = 2;
    int d = 3;
    int e = 4;
    int score = 0;
    double counter = 0;

    for (int i = 0; i < 2; i++){
      for (int j = 0; j < 2; j++){
        for (int k = 0; k < 2; k++){
          for (int l = 0; l < 2; l++){
            for (int m = 0; m < 2; m++){
              score = (i * a) + (j * b) + (k * c) + (l * d) + (m * e);
              if (score > t){
                counter += 1;
              }
            }
          }
        }
      }
    }  
    double chance = (counter / 32) * 100;
    return chance;
  }

  // Condition checker method. Checks whether method is invalid or can be used in main.
  public static int ConditionChecker(){
    Scanner UserInput = new Scanner(System.in);
    char value = 'z';

    try{
      value = UserInput.next().charAt(0);
      if (value != 'y' && value != 'n'){
        System.out.println("invalid input");
      }
    }
    catch (Exception e){
      System.out.println("invalid input");
    }

    int ASCII_Val = value; // Gets the ascii value of the char. Used for checks later on.
    return ASCII_Val;
  }

  // Increments the roll counter for the specified player type.
  public static void IncrementRoll(int playerType){
    if (playerType == 1){
      playerRoll += 1;
    }
    else if (playerType == 2){
      CPURoll += 1;
    }
    return;
  }

  // Displays round data and end game stats
  public static void DisplayData(int dataType){
    if (dataType == 1){ // Init welcome
      String InitialScore = "Player:" + playerScore + " " + "CPU: " + CPUScore;
      System.out.println("");
      System.out.println("Welcome to the Bone Game");
      System.out.println("========================");
      System.out.println(InitialScore);
      System.out.println("========================");
    }
    else if (dataType == 2){ // Player won
      String FinalScore = "Player:" + playerScore + " " + "CPU: " + CPUScore;
      System.out.println("");
      System.out.println("Game Results");
      System.out.println("========================");
      System.out.println(FinalScore);
      System.out.println("========================");
      System.out.println("Player Wins!");
    }
    else if (dataType == 3){ // Computer Won
      String FinalScore = "Player:" + playerScore + " " + "CPU: " + CPUScore;
      System.out.println("");
      System.out.println("Game Results");
      System.out.println("========================");
      System.out.println(FinalScore);
      System.out.println("========================");
      System.out.println("CPU Wins!");
    }
    else if (dataType == 4){ // Tie!
      String FinalScore = "Player:" + playerScore + " " + "CPU: " + CPUScore;
      System.out.println("");
      System.out.println("Game Results");
      System.out.println("========================");
      System.out.println(FinalScore);
      System.out.println("========================");
      System.out.println("Tie!");
    }
    
    return;
  }

  // reset data depending on the player type (player or CPU).
  public static void ResetData(int playerType){
    if (playerType == 1){
      playerRole1 = 0;
      playerRole2 = 0;
      playerRole3 = 0;
      playerRole4 = 0;
      playerRole5 = 0;

      playerPattern1 = "";
      playerPattern2 = "";
      playerPattern3 = "";
      playerPattern4 = "";
      playerPattern5 = "";
    }
    else if (playerType == 2){
      ComputerRole1 = 0;
      ComputerRole2 = 0;
      ComputerRole3 = 0;
      ComputerRole4 = 0;
      ComputerRole5 = 0;

      computerPattern1 = "";
      computerPattern2 = "";
      computerPattern3 = "";
      computerPattern4 = "";
      computerPattern5 = "";
    }
    
    return;
  }

  // Player roll logic. Changes pattern strings, points depending on shape etc. 
  public static int Roll_Player(){
    for (int i = 0; i < 5; i++){
      int random = Rand_helper(2);
      
      if (i == 0){
        if (random == 0){
          playerRole1 = 0; 
          playerPattern1 = "blank";
        }
        else if (random == 1){
          playerRole1 = 1;
          playerPattern1 = "rectangle";
        }
      }
      else if (i == 1){
        if (random == 0){
          playerRole2 = 0;
          playerPattern2 = "blank";
        }
        else if (random == 1){
          playerRole2 = 1;
          playerPattern2 = "square";
        }
      }
      else if (i == 2){
        if (random == 0){
          playerRole3 = 0;
          playerPattern3 = "blank";
        }
        else if (random == 1){
          playerRole3 = 2;
          playerPattern3 = "triangle";
        }
      }
      else if (i == 3){
        if (random == 0){
          playerRole4 = 0;
          playerPattern4 = "blank";
        }
        else if (random == 1){
          playerRole4 = 3;
          playerPattern4 = "circle";
        }
      }
      else if (i == 4){
        if (random == 0){
          playerRole5 = 0;
          playerPattern5 = "blank";
        }
        else if (random == 1){
          playerRole5 = 4;
          playerPattern5 = "diamond";
        }
      }
    }
    
    int finalScore = playerRole1 + playerRole2 + playerRole3 + playerRole4 + playerRole5;
    return finalScore;
  }

  // Computer roll logic. Changes pattern strings, points depending on shape etc. 
  public static int Roll_CPU(){
    for (int i = 0; i < 5; i++){
      int random = Rand_helper(2);
      
      if (i == 0){
        if (random == 0){
          ComputerRole1 = 0; 
          computerPattern1 = "blank";
        }
        else if (random == 1){
          ComputerRole1 = 1;
          computerPattern1 = "rectangle";
        }
      }
      else if (i == 1){
        if (random == 0){
          ComputerRole2 = 0;
          computerPattern2 = "blank";
        }
        else if (random == 1){
          ComputerRole2 = 1;
          computerPattern2 = "square";
        }
      }
      else if (i == 2){
        if (random == 0){
          ComputerRole3 = 0;
          computerPattern3 = "blank";
        }
        else if (random == 1){
          ComputerRole3 = 2;
          computerPattern3 = "triangle";
        }
      }
      else if (i == 3){
        if (random == 0){
          ComputerRole4 = 0;
          computerPattern4 = "blank";
        }
        else if (random == 1){
          ComputerRole4 = 3;
          computerPattern4= "circle";
        }
      }
      else if (i == 4){
        if (random == 0){
          ComputerRole5 = 0;
          computerPattern5 = "";
        }
        else if (random == 1){
          ComputerRole5 = 4;
          computerPattern5 = "diamond";
        }
      }
    }
    int finalScore = ComputerRole1 + ComputerRole2 + ComputerRole3 + ComputerRole4 + ComputerRole5;
    return finalScore;
  }

  // Player move function. All decision logic regarding player moves.
  public static void Player_Move(){
    int PlayerAdditionalScore = 0;

    IncrementRoll(1);
    int init_player_scoreMain = Roll_Player();
    PlayerAdditionalScore = init_player_scoreMain;
          
    String init_finalScorePatternMain = playerPattern1 + " " + playerPattern2 + " " + playerPattern3 + " " + playerPattern4 + " " + playerPattern5;
    System.out.println("Player throw: " + playerRoll);
    System.out.println(" ");
    System.out.println(init_finalScorePatternMain);
    System.out.println(" ");
    System.out.println("Your points: " + init_player_scoreMain);
         
    ResetData(1);
          
    init_finalScorePatternMain = "";
    init_player_scoreMain = 0;

    
    while (playerRoll < 3 && playerRoll != 0){

      System.out.println("Do you want to throw again? (y/n)");
      int playerChoice = ConditionChecker();
      if (playerChoice == 121){ // ASCII key for y

        IncrementRoll(1);
        int player_scoreMain = Roll_Player();
        PlayerAdditionalScore = player_scoreMain;
          
        String finalScorePatternMain = playerPattern1 + " " + playerPattern2 + " " + playerPattern3 + " " + playerPattern4 + " " + playerPattern5;
        System.out.println("Player throw: " + playerRoll);
        System.out.println(" ");
        System.out.println(finalScorePatternMain);
        System.out.println(" ");
        System.out.println("Your points: " + player_scoreMain);
          
        ResetData(1);
          
        finalScorePatternMain = "";
        player_scoreMain = 0;
      }
      else if (playerChoice == 110){ // ASCII key for n
        playerScore += PlayerAdditionalScore;
        prev_playerScore = PlayerAdditionalScore;
        return;
      }
    }

    playerScore += PlayerAdditionalScore;
    prev_playerScore = PlayerAdditionalScore;
  }

  // CPU move function. All decision logic regarding computer moves.
  public static void CPU_Move(){
    int CPUAdditionalScore = 0;
    while (CPURoll < 3){
      
      IncrementRoll(2);
      int cpu_scoreMain = Roll_CPU();
      CPUAdditionalScore = cpu_scoreMain;

          
      String finalScorePatternMain = computerPattern1 + " " + computerPattern2 + " " + computerPattern3 + " " + computerPattern4 + " " + computerPattern5;
      System.out.println("CPU throw: " + CPURoll);
      System.out.println(" ");
      System.out.println(finalScorePatternMain);
      System.out.println(" ");
      System.out.println("CPU points: " + cpu_scoreMain);

      double chance = odds(cpu_scoreMain);
      double prev_chance = odds(prev_CPUScore);
      double riskTolerance = 50;

      if ((chance >= riskTolerance) || (prev_chance >= riskTolerance)){
        // Continue in loop
      }
      else{
        CPUScore += CPUAdditionalScore;
        prev_CPUScore = 0;
        return;
      }
          
      ResetData(2);
          
      finalScorePatternMain = "";
      cpu_scoreMain = 0;
      prev_CPUScore = CPUAdditionalScore;
    }

    CPUScore += CPUAdditionalScore;
    prev_CPUScore = 0;
  }

  // Checks the return value of the condition value function above. Main game loop.
  public static void main(String[] args) {
    DisplayData(1);
    do{ // Normal game loop
      Player_Move();
      CPU_Move();
      DisplayData(1);
      playerRoll = 0;
      CPURoll = 0;
    } while (playerScore < 20 && CPUScore < 20);
    
    if (playerScore > CPUScore){
      DisplayData(2);
    }
    else if (CPUScore > playerScore){
      DisplayData(3);
    }
    else if (CPUScore == playerScore){ // Not sure if this will ever run, just as a cut edge scenario
      DisplayData(4);
    }
  }
}