package sxtdemo.Demo02oop;


interface PetCarer {
	void feed();

	void playWithPet();
}

class Worker implements PetCarer {
	public void feed() {
		System.out.println("Worker feed ... ");
	}

	public void playWithPet() {
		System.out.println("Worker play with pet ... ");
	}
}

