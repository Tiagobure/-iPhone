package application.model;

public class MusicPlayer extends Widget {

	@Override
	public void play() {
		System.out.println("Tocar musica");

		
	}

	@Override
	public void pause() {
		
		System.out.println("Pausar musica");

	}

	@Override
	public void search() {

		System.out.println("Pocurar musica");
	}

	@Override
	public void close() {

		System.out.println("Fechar Music Player");

		
	}
	
	
	

	
	
	
	

}
