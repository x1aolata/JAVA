package homework;

public class G {
	void makeCry(CanCry c) {
		c.cry();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat cat=new Cat();
		Dog dog=new Dog();
		G g = new G();
		g.makeCry(cat);
		g.makeCry(dog);
		
		
	}

}
