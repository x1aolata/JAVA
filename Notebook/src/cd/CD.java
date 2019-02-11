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

		
		CD cd=new CD("abc", 4, false, "abc", "..", 70);
		CD cd1=new CD("abc", 4, false, "abc", "..", 70);
		System.out.println(cd.equals(cd1));
		System.out.println(cd.toString());
		
	}
@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		CD cc=(CD)arg0;
		return artist.equals(cc.artist);
	}

	@Override
	public String toString() {
		return "CD [artist=" + artist + ", numofTracks=" + numofTracks + ", toString()=" + super.toString() + "]";
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
