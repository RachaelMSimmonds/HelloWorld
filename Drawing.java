
public class Drawing {
	public static String name;
	public static boolean cute;
	public static double weight;
	public static int age;
	
	public static void main(String[]args) {
		Drawing newAnimal = new Drawing("Hiro", true, 12.45, 2);
		
		System.out.println(
				String.format("\nString: %1$s, \nBoolean: %1$b, \nDecimal: %1$8.2f,"
						+ "\nInteger: %1$08d, "
						, newAnimal));
		
	}
	
	public Drawing(String n, boolean c, double w, int a) {
		
		name = n;
		cute = c;
		weight = w;
		age = a;
		
		
		
	}
	
	//Getters and setters 
	// Name
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	// Cute or nah
	public boolean getCute() {
		return cute;
	}
	public void setName(boolean c) {
		cute = c;
	}
	// Weight
	public double getWeight() {
		return weight;
	}
	public void setWeaight(double w) {
		weight = w;
	}
	// Age
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		age = a;
	}

}
