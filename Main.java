class Main{
	
	public static void main(String [] args){

		TeamName tn = new TeamName();
		tn.teamName = "TheGoats";
		String teamName = tn.getName();
		System.out.println("The teams name is: " + teamName);

		SetRank sr = new SetRank();
		int age = Integer.parseInt(sr.setRank("Teams rank is: "));
		System.out.println(age);
	 
	

	}

}