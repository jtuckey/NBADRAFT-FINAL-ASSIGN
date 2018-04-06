import java.util.*;

public class NBAGAME {
	
	public void display_menu() 
    {
	System.out.println ("                     WELCOME TO THE NBA DRAFT GAME\n"
			+ "***********************************************************************\r\n" + 
			"  ***************************************  **************************\r\n" + 
			"    ************************************    ***********************\r\n" + 
			"      *************************** ******* ***********************\r\n" + 
			"        ***********************    **** **********************\r\n" + 
			"          **********************   **  *********************\r\n" + 
			"            *******************      *********************\r\n" + 
			"              ****************      ********************\r\n" + 
			"                *************  *    ******************\r\n" + 
			"                  *********** *     ****************\r\n" + 
			"                    ********* *      *************\r\n" + 
			"                      ****** *   ***   *********\r\n" + 
			"                        ****  ********  ******\r\n" + 
			"                          *  ************  *\r\n" + 
			"                            ***************\r\n" + 
			"                              ***********\r\n" + 
			"                               ********\r\n" + 
			"                                 ****\r\n" + 
			"                                  **\r\n" + 
			"                                  ");
	Scanner user_input = new Scanner(System.in);                      //Scanner created
	String TeamName;                                                  //String created
	System.out.print("Enter your team name: ");                       //asking for input of user
	TeamName = user_input.next();                                     //making string the input
	System.out.println("1) Option 1\n2) Option 2\n3) Option 3");      //menu layout
	System.out.print("Selection: ");                                  //input layout
    }
    
    public void question()
    {                                                                  //loop menu
	System.out.println("Would you like to continue or quit?");
	System.out.println("To Continue enter 9.");
	System.out.println("If you wish to quit input 0.");
	Scanner question = new Scanner(System.in);
       
	switch (question.nextInt()) 
	{
	    case 0:
	    System.out.println ("Thank You for playing,\n GoodBye!");
	    break;
  
	    case 9:
	    System.out.println ("Continue");
	    new NBAGAME();
	    break;
	    default:
	    System.err.println ( "Error input, Please input again" );
	    break;
	}
    }
 
    public NBAGAME() 
    {
	Scanner in = new Scanner(System.in);
        display_menu();
  
	switch (in.nextInt()) 
	{
	    case 1:                                                                          //Option 1 Pick
	    System.out.println ( "You picked option 1" );
	    question();
	    break;
  
	    case 2:
	    System.out.println ( "You picked option 2" );                                    //Option 2 Pick
	    question();
	    break;
  
	    case 3:
	    System.out.println ( "You picked option 3" );                                    //Option 3 Pick
	    question();
	    break;
	    default:
	    System.err.println ( "Error input" );                                            //Error Reading 
	    break;
	}
    }
 
    public static void main (String[]args) 
    {
	new NBAGAME();
    }
}
