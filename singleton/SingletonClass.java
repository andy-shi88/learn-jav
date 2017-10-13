class SingletonClass {
	private static SingletonClass instance = null;
	private String name;
	private Integer number;

	public static SingletonClass getInstance() {
		if (instance == null)
			instance = new SingletonClass();
		return instance;
	}

	/*key 1 here, the singleton class have private constructor*/
	private SingletonClass() {
		/*this constructor will be blank, exist just for instantiating purpose*/
	} 


	/*below would just be some getter setter*/
	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}