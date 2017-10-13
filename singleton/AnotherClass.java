class AnotherClass {

	AnotherClass() {
		/*simple let's just instantiate singleton and non singleton object here*/
		SingletonClass singleton = SingletonClass.getInstance();
		NonSingletonClass nonSingleton = new NonSingletonClass();
		/*and do something here*/
		System.out.println("\n\nAnother class behavior: ");
		System.out.println("singleton behavior in another class");
		System.out.println("name: " + singleton.getName());
		System.out.println("non singleton behavior in another class");
		System.out.println("name: " + nonSingleton.getName());
	}
}