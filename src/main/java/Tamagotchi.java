public class Tamagotchi {
	private String mName;
	private int mWeight;
	private int mAge;
	private int mMeals;
	private int mHappyLevel;
	private int mBathroomLevel;
	private int mTime;

	private final int MAX_MEALS = 5;
	private final int MAX_HAPPYLEVEL = 5;
	private final int MAX_BATHROOMLEVEL = 5;

	public Tamagotchi(String name) {
		mName = name;
		mWeight = 1;
		mAge = 0;
		mMeals = 0;
		mHappyLevel = 3;
		mBathroomLevel = 0;
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

	public int getMeals() {
		return mMeals;
	}

	public int getHappyLevel() {
		return mHappyLevel;
	}

	public int getBathroomLevel() {
		return mBathroomLevel;
	}

	public int eat() {
		if (mMeals < MAX_MEALS) {
			mMeals += 1;
		} else if (mMeals == MAX_MEALS){
			mWeight += 1;
			mMeals = 0;
		}
		return mMeals;
	}

	public int getOlder() {
		if (mWeight % 5 == 0) {
			mAge += (mWeight/5) + 1;
		}
		return mAge;
	}
}
