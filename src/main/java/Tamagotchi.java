public class Tamagotchi {
	private String mName;
	private int mWeight;
	private int mAge;
	private int mMealsCount;
	private int mHappyLevel;

	private final int MAX_MEALS = 5;
	private final int MAX_HAPPYLEVEL = 5;

	public Tamagotchi(String name) {
		mName = name;
		mWeight = 1;
		mAge = 0;
		mMealsCount = 0;
		mHappyLevel = 3;
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

	public int getMealsCount() {
		return mMealsCount;
	}

	public int getHappyLevel() {
		return mHappyLevel;
	}

	public int eat() {
		if (mMealsCount < MAX_MEALS) {
			if (mMealsCount + 1 == MAX_MEALS) {
				mWeight += 1;
			}
			mMealsCount += 1;
		} else if (mMealsCount == MAX_MEALS){
			mAge += 1;
			mMealsCount = 1;
		}
		return mMealsCount;
	}

	public boolean isHungry() {
		return (mMealsCount <= 1);
		}

	public int adjustHappyLevel() {
		if (isHungry()) {
			mHappyLevel = 1;
		}
		else {
			if (mMealsCount < MAX_MEALS && mHappyLevel < MAX_HAPPYLEVEL) {
				mHappyLevel += 1;
			} else if (mMealsCount == MAX_MEALS) {
				mHappyLevel -= 1;
			}
		}
		return mHappyLevel;
	}

	public boolean needsBathroom() {
		return (mMealsCount == MAX_MEALS);
	}

	public void play() {
		if (mHappyLevel < MAX_HAPPYLEVEL) {
			mHappyLevel += 1;
		}
	}

}
