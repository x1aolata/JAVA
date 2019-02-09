package cd;

public class CD extends Item {

	private String artist;
	private int numofTracks;

//	public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
//		super(title);
//		
//		this.artist = artist;
//		this.numofTracks = numofTracks;
//		this.playingTime = playingTime;
//		this.comment = comment;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public CD(String title, int playingTime, boolean gotIt, String comment, String artist, int numofTracks) {
		super(title, playingTime, gotIt, comment);
		this.artist = artist;
		this.numofTracks = numofTracks;
	}

	public void print() {
		// TODO Auto-generated method stub

		System.out.print("CD:");

		super.print();

		System.out.print(":" + artist);

	}

}
