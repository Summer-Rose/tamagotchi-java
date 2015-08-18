import org.junit.*;
import static org.junit.Assert.*;

public class UnitTest {

	@Test
	public void Tamagotchi_instantiatesCorrectly_true() {
		Tamagotchi myTamagotchi = new Tamagotchi("Momo");
		assertEquals(true, myTamagotchi instanceof Tamagotchi);
	}

	@Test
	public void Tamagotchi_getsCorrectAge() {
		Tamagotchi myTamagotchi = new Tamagotchi("Momo");
		assertEquals(0, myTamagotchi.getAge());
	}

	@Test
	public void Tamagotchi_getsCorrectWeight() {
		Tamagotchi myTamagotchi = new Tamagotchi("Momo");
		assertEquals(1, myTamagotchi.getWeight());
	}

	@Test
	public void Tamagotchi_gainsWeightCorrectly() {
		Tamagotchi myTamagotchi = new Tamagotchi("Momo");
		myTamagotchi.eat();
		myTamagotchi.eat();
		myTamagotchi.eat();
		myTamagotchi.eat();
		myTamagotchi.eat();
		assertEquals(2, myTamagotchi.getWeight());
	}

	@Test
	public void Tamagotchi_isHungry_true() {
		Tamagotchi myTamagotchi = new Tamagotchi("Momo");
		assertEquals(true, myTamagotchi.isHungry());
	}

	@Test
	public void Tamagotchi_isHungry_false() {
		Tamagotchi myTamagotchi = new Tamagotchi("Momo");
		myTamagotchi.eat();
		myTamagotchi.eat();
		myTamagotchi.eat();
		assertEquals(false, myTamagotchi.isHungry());
	}

	@Test
	public void Tamagotchi_getCorrectHappyLevel() {
		Tamagotchi myTamagotchi = new Tamagotchi("Momo");
		assertEquals(3, myTamagotchi.getHappyLevel());
	}

	@Test
	public void Tamagotchi_needsBathroom_true() {
		Tamagotchi myTamagotchi = new Tamagotchi("Momo");
		myTamagotchi.eat();
		myTamagotchi.eat();
		myTamagotchi.eat();
		myTamagotchi.eat();
		myTamagotchi.eat();
		assertEquals(true, myTamagotchi.needsBathroom());
	}

	@Test
	public void Tamagotchi_needsBathroom_false() {
		Tamagotchi myTamagotchi = new Tamagotchi("Momo");
		myTamagotchi.eat();
		myTamagotchi.eat();
		myTamagotchi.eat();
		assertEquals(false, myTamagotchi.needsBathroom());
	}

}
