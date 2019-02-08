package Notebook;

import java.util.ArrayList;

public class NoteBook {

	private ArrayList<String> notes = new ArrayList<String>();

	public void add(String s) {
		notes.add(s);

	}

	public void add(String s, int location) {
		notes.add(location, s);
		;

	}

	public int getSize() {
		return notes.size();
	}

	public String getNote(int index) {
		return notes.get(index);
	}

	public void removeNote(int index) {
		notes.remove(index);

	}

	public String[] list() {
		String[] a = new String[notes.size()];
//		for (int i = 0; i < notes.size(); i++) {
//			a[i] = notes.get(i);
//		}
		notes.toArray(a);
		return a;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoteBook nb = new NoteBook();
		nb.add("first");
		nb.add("2");
		nb.add("third", 1);
		String[] a = nb.list();
		for (String s : a) {
			System.out.println(s);
		}

		System.out.println("8888888888888888888888888");
		nb.removeNote(1);
		String[] b = nb.list();
		for (String s : b) {
			System.out.println(s);
		}

	}

}