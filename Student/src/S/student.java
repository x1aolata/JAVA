package S;

public class student {
	private String name;
	private String sex;
	private int age;
	private String studentId;
	private double credit;

	public student(String name, String sex, int age, String studentId, double credit) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.studentId = studentId;
		this.credit = credit;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		if (Double.doubleToLongBits(credit) != Double.doubleToLongBits(other.credit))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "student [name=" + name + ", sex=" + sex + ", age=" + age + ", studentId=" + studentId + ", credit="
				+ credit + "]";
	}
//	// Êä³ö
//	public void print() {
//
//		System.out.println(
//				"student [name=" + name + ", sex=" + sex + ", age=" + age + ", studentId=" + studentId + ", credit="
//						+ credit + "]");
//
//	}
}
