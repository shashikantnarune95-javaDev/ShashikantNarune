package oops;

public class Animal {
	public void baking()
	{
		System.out.println("Animal is Barking");
	}
}
 class Dog extends Animal{
	public void eat()
	{
		System.out.println("Dog is Eating");
	}

}
 class BabyDog extends Dog {
		public void weep()
		{
			System.out.println("Babydog is weeping");
		}
		

	}
