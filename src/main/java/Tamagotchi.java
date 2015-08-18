public class Tamagotchi {
	private String mName;
	private int mWeight;
	private int mAge;
	private int mMeals;
	private int mHappyLevel;
	private int mBathroomLevel;
	private int mTime;

	public Tamagotchi(String name) {
		mName = name;
		mWeight = 1;
		mAge = 0;
	}

	public String getName() {
		return mName;
	}

	public int getWeight() {
		return mWeight;
	}

	public int getAge() {
		return mAge;
	}
}
