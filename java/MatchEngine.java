public class MatchEngine{
    private Team home;
    private Team away;
    private Team winner;

    //Goals
    private int homeGoals;
    private int awayGoals;


    public MatchEngine(Team one,Team two){
        home=one;
        away=two;
    }


    public void simulate(){
        if (home==null || away==null) {
            System.out.println("Error 001: One of the teams are null");
            winner=null;
            return;
        }
    }


    public Team getWinner(){
        if (winner==null) {
            return null;
        }
        else{
            return this.winner;
        }
    }

    



}