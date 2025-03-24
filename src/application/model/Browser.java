package application.model;

public class Browser extends Widget{
	
	
	public void search() {
		System.out.println("escreva na procura!");

	}

	@Override
	public void play() {
		System.out.println("Buscar...");
		
	}

	@Override
	public void pause() {
		System.out.println("pausar busca.");
		
	}

	@Override
	public void close() {
		System.out.println("Fechar Browser");
		
	}
	

}
