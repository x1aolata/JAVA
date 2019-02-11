package cd;

import java.util.ArrayList;

public class Database {

//	private ArrayList<CD> listCD=new ArrayList<CD>();
//	private ArrayList<DVD> listDVD=new ArrayList<DVD>();
	private ArrayList<Item> listItem = new ArrayList<Item>();
//	public void add(CD cd) {
//		listCD.add(cd);
//		
//	}

	public void add(Item item) {
		listItem.add(item);

	}

	public void list() {
//		for (CD cd : listCD)
//		{
//			cd.print();
//			
//		}
		for (Item item : listItem) {
			item.print();

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database db = new Database();
		db.add(new CD("abc", 4, false, "abc", "..", 70));
		db.list();
		System.out.println();
		System.out.println(db);
		System.out.println(db.toString());
		

	}

}
