
package innovative;

import java.util.ArrayList;
import java.util.Random;

public class Outcomes {
 Outcomes()
 {
	 
 }
  
  public String list()
  {

	   int randomIndex;
	   String randomOutcome;
	  Random random = new Random();
     ArrayList<String> outcomes = new ArrayList<>();
   outcomes.add("Six");
   outcomes.add("Four");
   outcomes.add("Wide");
   outcomes.add("Wicket");
   outcomes.add("Byes");
   outcomes.add("Wide 5");
   outcomes.add("Wicket by LBW");
   outcomes.add("Wicket by Bowled");
   outcomes.add("Wicket by Runout");
   outcomes.add("Wicket by Caught out");
   outcomes.add("Obstructing the Field");
   outcomes.add("Bouncer");
   outcomes.add("Injury to the bowler");
   outcomes.add("Injury to the batsman");
   outcomes.add("Single");
   outcomes.add("Double");
   outcomes.add("Triple");
   outcomes.add("Overthrow");
   outcomes.add("Six and bat broken");
   outcomes.add("Bat broken");
   outcomes.add("No ball");
   outcomes.add("Full toss");
   outcomes.add("Beamer");
   outcomes.add("Hit Wicket");
   outcomes.add("Dot ball");
   outcomes.add("Overthrow and boundary");
     
    randomIndex = random.nextInt(outcomes.size());
    randomOutcome = outcomes.get(randomIndex);
    return   randomOutcome;
  }
 
     
 }
        

