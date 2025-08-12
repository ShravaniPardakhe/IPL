package repository;

import entity.Team;

public class TeamRepository 
{
	//should return MI team details.
	public static Team getMITeamDetails()
	{
		Team team = new Team();
		team.setId(101);
		team.setTeamName("Mumbai Indians");
		team.setCaptainName("Hardik Pandya");
		team.setCoachName("Jaywardhan");
		team.setQualified(false);
		team.setnRR(2.3f);
		
		
		team.setId(102);
		team.setTeamName("Chennai Super Kings");
		team.setCaptainName("Ruturaj Gaikwad");
		team.setCoachName("Stephen Fleming");
		team.setQualified(true);
		team.setnRR(0.439f);
		
		
		team.setId(103);
		team.setTeamName("Kolkata Knight Riders");
		team.setCaptainName("Shreyas Iyer");
		team.setCoachName("Chandrakanth Pandit");
		team.setQualified(true);
		team.setnRR(0.428f);
		
		
		team.setId(104);
		team.setTeamName("Rajasthan Royals");
		team.setCaptainName("Sanju Samson");
		team.setCoachName("Kumar Sangakkara");
		team.setQualified(true);
		team.setnRR(0.273f);
		
		
		
		
		team.setId(105);
		team.setTeamName("Royal Challengers Bengluru");
		team.setCaptainName("Faf du Plessis");
		team.setCoachName("Andy Flower");
		team.setQualified(false);
		team.setnRR(-0.284f);
		
		
		
		team.setId(106);
		team.setTeamName("Sunrises Hyderabad");
		team.setCaptainName("Pat Cummins");
		team.setCoachName("Daniel Vettori");
		team.setQualified(false);
		team.setnRR(0.345f);
		
		
		
		team.setId(107);
		team.setTeamName("Delhi Capitals");
		team.setCaptainName("Rishabh Pant");
		team.setCoachName("Picky Pointing");
		team.setQualified(false);
		team.setnRR(0.478f);
		
		
		
		team.setId(108);
		team.setTeamName("Punjab Kings");
		team.setCaptainName("Shikhar Dhawan");
		team.setCoachName("Trevor Bayliss");
		team.setQualified(false);
		team.setnRR(0.439f);
		
		
		
		team.setId(109);
		team.setTeamName("Gujarat Titans");
		team.setCaptainName("Shubham Gill");
		team.setCoachName("Ashish Nehra");
		team.setQualified(true);
		team.setnRR(0.201f);
		
		
		
		team.setId(110);
		team.setTeamName("Lucknow Super Giants");
		team.setCaptainName("KL Rahul");
		team.setCoachName("Justin Langer");
		team.setQualified(true);
		team.setnRR(0.215f);
		return team;
	}
	
	//add similar methods for remaining 9 teams.
	
}
