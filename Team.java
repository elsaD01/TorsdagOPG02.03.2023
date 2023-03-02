class Team{
	
	public String teamName = "TheGoats";

	public int setRank = 80;

	private ArrayList<String> names = new ArrayList<>();


	public Team(String teamName){
		teamName = "TheGoats";
	}

	public String getName() {
		return this.teamName;
	}

	 public static void main(String [] args)
    {
        // Creating an empty setRank
       SetRank<String> setRank = new SetRank<String>();

        // Use add() method to add elements in the setRank
       setRank.add("TeamGoats");
       setRank.add("80");
       setRank.add("20");

       System.out.println("setRank: " + setRank);

   }

   public String toString(){
   	return "Hold: De Uovervindelige Rang: 3 " + teamName + "SetRank is: " + setRank; 


   }


}