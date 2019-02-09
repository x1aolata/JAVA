package cd;

public class DVD extends Item {
	
//	
//	public DVD(String title, String director, int playingTime, boolean gotIt, String comment) {
//		super(title);
//		this.director = director;
//		this.playingTime = playingTime;
//		this.gotIt = gotIt;
//		this.comment = comment;
//	}



	private String director;


	

	public DVD(String title, int playingTime, boolean gotIt, String comment, String director) {
	super(title, playingTime, gotIt, comment);
	this.director = director;
}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}