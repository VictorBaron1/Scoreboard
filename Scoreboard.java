public class Scoreboard
{
   
    private String teamOne;
    private String teamTwo;
    private int TeamOneScore;
    private int TeamTwoScore;
    private String activeTeam;
    public Scoreboard(String one , String two)
    {
            teamOne = one;
            teamTwo = two;
            activeTeam = teamOne;
    }
    public String getScore()
    {
        //return null;
        return TeamOneScore + "-" +  TeamTwoScore + "-" + activeTeam;

    }
}
