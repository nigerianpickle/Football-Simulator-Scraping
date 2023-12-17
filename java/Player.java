import java.util.Random;


public class Player{
    final static int lowerBound=30;
    private Random random = new Random();

    
    private Positions position;

    // Generate a random integer between 30 and 99
    //assigns players a random rating between 30 and 99(Will optimize it,so that only players without ratings get random ratings)
    private int rating=random.nextInt(69)+lowerBound;
    private String firstName;
    private String lastName;


    //if im reading data from websites
    private int goalTally;//total number of goals that this player has
    private int assistTally;//assists
    private int cleanSheets;//clean sheets


    //Constructor types
    //input in the form(Daniel Nwogo)
    public Player(String fName,String lName){
        this.firstName=fName;
        this.lastName=lName;
    }


    public String toString(){
        return firstName+" "+lastName;
    }

    //Getters
    //Name Getters:-
    public String getName(){
        return firstName+" "+lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getRating(){
        return this.rating;
    }


}
