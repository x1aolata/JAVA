package S;

import java.util.ArrayList;

public class Manage {
	private ArrayList<student> students = new ArrayList<student>();

	// 增加
	public void add(student s) {
		students.add(s);

	}

	// 清空
	public void clear() {

		students.clear();
	}

	// 获取人数
	public int getSize() {
		return students.size();
	}

	// 逐个打印
	public void list() {

		for (student s : students) {
			System.out.println(s);
//			s.print();

		}
	}

	// 获取单条信息
	public student getStudent(int index) {
		return students.get(index);
	}

	// 删除单条信息
	public void removeStudent(int index) {
		students.remove(index);

	}

	public static void main(String[] args) {

		Manage manage = new Manage();

		student a = new student("小邋遢", "男", 18, "20191101001", 25.5);
		student b = new student("大邋遢", "女", 19, "20191101002", 30);
		student c = new student("很邋遢", "男", 17, "20191101003", 37);
		student d = new student("超邋遢", "女", 20, "20191101004", 31.5);
		student e = new student("不邋遢", "女", 20, "20191101005", 30);

		manage.add(new student("小邋遢", "男", 18, "20191101001", 25.5));
		manage.add(b);
		manage.add(c);
		manage.add(d);
		manage.add(e);

		manage.list();

		System.out.println(a.equals(b));
		System.out.println(e.equals(b));

		System.out.println(manage.getSize());

		System.out.println(manage.getStudent(0));
		System.out.println(manage.getStudent(4));
		System.out.println("**********************************************************************");

		manage.removeStudent(0);
		manage.removeStudent(2);
		manage.list();

		manage.clear();
		manage.list();
	}

}
