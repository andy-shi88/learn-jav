class Main {
	public static void main(String[] args) {
		/*on calling below line you should get compile error that we cannot access it due to private modifier*/
		// SingletonClass singleton = new SingletonClass();
		// so we'll instantiate it in another way
		SingletonClass singleton = SingletonClass.getInstance();
		// see how it differ when we instantiate it?
		NonSingletonClass nonSingleton = new NonSingletonClass();

		/*let's see the difference in the use cases*/
		singleton.setName("singleton name here");
		nonSingleton.setName("NonSingletonName here");
		System.out.println("singleton behavior in main class");
		System.out.println("name: " + singleton.getName());
		System.out.println("non singleton behavior in main class");
		System.out.println("name: " + nonSingleton.getName());

		/*so far it's the same*/
		/*let's see if we instantiate them in another class*/
		AnotherClass another = new AnotherClass();
		System.out.println("We get null value for non singleton name object here");
		/*
			this is because singleton will return the same instance again and again
			wherever you call it.
			while normal class instantiation will always create new instance in the memory
		*/
	}
}