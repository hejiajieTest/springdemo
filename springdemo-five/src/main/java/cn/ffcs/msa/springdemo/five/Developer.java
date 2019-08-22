package cn.ffcs.msa.springdemo.five;

public class Developer {

	private Language language;

	//autowire by constructor
	public Developer(Language language) {
		this.language = language;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}
	
	
}
