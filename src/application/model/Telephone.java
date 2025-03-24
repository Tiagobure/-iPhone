package application.model;

public class Telephone implements TelephoneDevice{

	private String name;
	private Integer number;
	
	
	public Telephone(String name, Integer number) {
		super();
		this.name = name;
		this.number = number;
		
		
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getNumber() {
		return number;
	}


	public void setNumber(Integer number) {
		this.number = number;
	}


	@Override
	public void turnOn() {
		System.out.println("ligando para " + getName());
	}
	
	@Override
	public void call() {
		System.out.println("falando com " + getName());
	}
	
	@Override
	public void turnOff() {
		System.out.println("delisgando chamada com " + getName());
		
	}
	
	
	
	
}
