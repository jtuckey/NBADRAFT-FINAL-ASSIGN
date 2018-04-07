import java.util.*;
import java.util.Random;

public class NBAGAME {
	public int balance = 10000;
	public int outcome;
	public int user_option;
	public int WorL;
	
	
	public void display_menu() 
    {
	
	System.out.println ("                     WELCOME TO THE NBA DRAFT GAME\n"                                           //title
			+ "************************************************************************\r\n" + 
			"  ****************************************  **************************\r\n" + 
			"    *************************************    ***********************\r\n" + 
			"      **************************** ******* ***********************\r\n" + 
			"        ************************    **** **********************\r\n" + 
			"          ***********************   **  *********************\r\n" + 
			"            ********************      *********************\r\n" + 
			"              *****************      ********************\r\n" + 
			"                **************  *    ******************\r\n" + 
			"                  ************ *     ****************\r\n" + 
			"                    ********** *      *************\r\n" + 
			"                      ******* *   ***   *********\r\n" + 
			"                        *****  ********  ******\r\n" + 
			"                          **  ************  *\r\n" + 
			"                            ****************\r\n" + 
			"                              ************\r\n" + 
			"                               *********\r\n" + 
			"                                 *****\r\n" + 
			"                                  ***\r\n" + 
			"                                   *");
	Scanner user_input = new Scanner(System.in);                      // Scanner created
	String TeamName;                                                  // String created
	System.out.print("Enter your team name: ");                       // asking for input of user
	TeamName = user_input.next();                                     // making string the input
	System.out.println("Your current Balance is: " + balance);
	System.out.println("1) View current team roster\n2) Draft New Player\n3) Play a Match\n4) Quit");      //menu layout
	System.out.print("Selection: ");                                  // input layout
    }
    
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	
	
	
	public void Win()                                                 //Winning Screen
	{
	System.out.println("|__  o\\\r\n" + 
			"| W    \\O\r\n" + 
			"|       |\\_         |\\\r\n" + 
			"|      /-\\           \\O\r\n" + 
			"|    /     \\          |\r\n" + 
			"|                    /|\r\n" + 
			"|                   |  \\\r\n" + 
			" You have earned 5000 Dolars!!");
	balance = balance + 5000;                                                            //Winning Money bonus income added onto balance
	System.out.println("Your current Balance is: " + balance);
	System.out.println("1) View current team roster\n2) Draft New Player\n3) Play a Match\n4) Quit");      //menu layout
	System.out.print("Selection: ");
	
	Scanner in = new Scanner(System.in);
    user_option = in.nextInt();
	switch (user_option) 
	{
	    case 1:                                                                          //Insert code where you are able to view your team
	    System.out.println ( "Here is your team roster: " );
	    Win();
	    break;
  
	    case 2:
	    System.out.println ( "Here are the avaliable players: " );                        //Insert code displaying players 
	    Loss();
	    break;
  
	    case 3:
	    System.out.println ( "Let the match begin!!" );                                   //Random number generator code to see if win or loss
	    Random rand = new Random();
	    WorL = rand.nextInt(10) + 1;
	    break;
	    
	    case 4:
    	System.out.println ( "Thank You for playing,\nGoodBye!" );                        //Quit Game
    	break;
	   
	    default:
	    System.err.println ( "Error input" );                                            //Error Reading 
	    break;
	}
if (WorL==5) {
	outcome = 3;                                                                   // Outcome = Tie if random number is 5
}
else if (WorL>5) {
	outcome = 1;                                                                  // Outcome = Win if random number is above 5
}
else {
	outcome = 2;                                                                   //Outcome = Loss if random number is below 5
}  
switch (outcome) 
{
    case 1:                                                                          
    System.out.println ( "You won the match!!" );                                    //outcome of win
    Win();
    break;

    case 2:
    System.out.println ( "You lost the match!!" );                                    //outcome of loss
    Loss();
    break;

    case 3:
    System.out.println ( "You tied the match!!" );                                    //outcome of tie
    Tie();
    break;

    
    default:
    System.err.println ( "Error input" );                                            //Error Reading     of no use to actual code
    break;
    }
	}
	
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void Tie()                                                                      //Tie Screen
	{
		System.out.println("| |     VOOSH!    \\\\\r\n" + 
				"| |   _________  \\| \\\r\n" + 
				"| |==(_________) \\  |   \\\r\n" + 
				"| |   XXXXXXXX    | |  \\ \\\r\n" + 
				"|/    XXXXXX      | |   \\\r\n" + 
				"       XXXX       | |    \\ \\\r\n" + 
				"         ///^^\\\\  | |       \\\r\n" + 
				"        ||| . ~| / /\r\n" + 
				"         `.  ^ ;/ /\r\n" + 
				"   _       \\ ~/  /\r\n" + 
				"  ((/|   /~|  |\\_|\r\n" + 
				"   \\ \\  / ) ~~   |             \\||/\r\n" + 
				"    \\ \\/ /|      |          <\\/.  //\r\n" + 
				"     \\__/  |_____|          /     /\r\n" + 
				"          /      |          (    3\r\n" + 
				"         /___/|__|           | |~\r\n" + 
				"         / /   | |          | ~~\\\r\n" + 
				"        / /    | |          | \\__\\\r\n" + 
				"        \\ \\     | |         |  \\ \\" +
				"  You have earned no money in this match");                                //No money earned in tie
		System.out.println("Your current Balance is: " + balance);
		System.out.println("1) View current team roster\n2) Draft New Player\n3) Play a Match\n4) Quit");      //menu layout
		System.out.print("Selection: ");
		
		Scanner in = new Scanner(System.in);
	    user_option = in.nextInt();
		switch (user_option) 
		{
		    case 1:                                                                          //Insert code where you are able to view your team
		    System.out.println ( "Here is your team roster: " );
		    Win();
		    break;
	  
		    case 2:
		    System.out.println ( "Here are the avaliable players: " );                        //Insert code displaying players 
		    Loss();
		    break;
	  
		    case 3:
		    System.out.println ( "Let the match begin!!" );                                   //Random number generator code to see if win or loss
		    Random rand = new Random();
		    WorL = rand.nextInt(10) + 1;
		    break;
		    
		    case 4:
	    	System.out.println ( "Thank You for playing,\nGoodBye!" );                        //Quit Game
	    	break;
		   
		    default:
		    System.err.println ( "Error input" );                                            //Error Reading 
		    break;
		}
	if (WorL==5) {
		outcome = 3;                                                                   // Outcome = Tie if random number is 5
	}
	else if (WorL>5) {
		outcome = 1;                                                                  // Outcome = Win if random number is above 5
	}
	else {
		outcome = 2;                                                                   //Outcome = Loss if random number is below 5
	}  
	switch (outcome) 
	{
	    case 1:                                                                          
	    System.out.println ( "You won the match!!" );                                    //outcome of win
	    Win();
	    break;

	    case 2:
	    System.out.println ( "You lost the match!!" );                                    //outcome of loss
	    Loss();
	    break;

	    case 3:
	    System.out.println ( "You tied the match!!" );                                    //outcome of tie
	    Tie();
	    break;

	    
	    default:
	    System.err.println ( "Error input" );                                            //Error Reading     of no use to actual code
	    break;
	    }
	}
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public void Loss()
    {                                                                  // Losing menu for restarting the game or exiting 
	System.out.println("          o- - -  \\o          __|\r\n" + 
			"             o/   /|          vv`\\\r\n" + 
			"            /|     |              |\r\n" + 
			"             |    / \\_            |\r\n" + 
			"            / \\   |               |\r\n" + 
			"           /  |                   |");
    System.out.println("Would you like to continue or quit?");
	System.out.println("To Continue enter 1.");
	System.out.println("If you wish to quit input 2.");
	Scanner question2 = new Scanner(System.in);
 	switch (question2.nextInt()) 
	{
	    case 1:
	    System.out.println ("Lets Try Again!");                           // Re-Load game
		new NBAGAME();
	    break;
  
	    case 2:
	    System.out.println ("Thank You for playing,\nGoodBye!");
	    System.exit(0);                                                       // Exit the program
	    break;
	    
	    default:
	    System.err.println ( "Error input" );             // Error input check
	    break;
	}
    }
 
    
  //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------  
    
    
    public  NBAGAME() 
    {
    	Scanner in = new Scanner(System.in);
        display_menu();
        user_option = in.nextInt();
    	switch (user_option) 
    	{
    	    case 1:                                                                          //Insert code where you are able to view your team
    	    System.out.println ( "Here is your team roster: " );
    	    Win();
    	    break;
      
    	    case 2:
    	    System.out.println ( "Here are the avaliable players: " );                        //Insert code displaying players 
    	    Loss();
    	    break;
      
    	    case 3:
    	    System.out.println ( "Let the match begin!!" );                                   //Random number generator code to see if win or loss
    	    Random rand = new Random();
    	    WorL = rand.nextInt(10) + 1;
    	    break;
    	    
    	    case 4:
        	System.out.println ( "Thank You for playing,\nGoodBye!" );                        //Quit Game
        	break;
    	   
    	    default:
    	    System.err.println ( "Error input" );                                            //Error Reading 
    	    break;
    	}
	if (WorL==5) {
		outcome = 3;                                                                   // Outcome = Tie if random number is 5
	}
	else if (WorL>5) {
		outcome = 1;                                                                  // Outcome = Win if random number is above 5
	}
	else {
		outcome = 2;                                                                   //Outcome = Loss if random number is below 5
	}  
	switch (outcome) 
	{
	    case 1:                                                                          
	    System.out.println ( "You won the match!!" );                                    //outcome of win
	    Win();
	    break;
  
	    case 2:
	    System.out.println ( "You lost the match!!" );                                    //outcome of loss
	    Loss();
	    break;
  
	    case 3:
	    System.out.println ( "You tied the match!!" );                                    //outcome of tie
	    Tie();
	    break;

	    
	    default:
	    System.err.println ( "Error input" );                                            //Error Reading     of no use to actual code
	    break;
	}
    }
 
    
    
    
    public static void main (String[]args) 
    {
	new NBAGAME();
    }
}
