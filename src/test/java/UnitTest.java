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
}
