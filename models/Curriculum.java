class Curriculum {
	private String name;
	private Boolean finished;

	public Curriculum() {
		this.finished = false;
	}

	public Curriculum(String name, Boolean finished) {
		this.name = name;
		this.finished = finished;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean isFinished() {
		return this.finished;
	}

	public void setIsFinished(Boolean finished) {
		this.finished = finished;
	}

}