package application.model;

public class IphoneMainMenu extends MusicPlayer implements TelephoneDevice, Browser {

	//telephone
	@Override
	public void call() {
		System.out.println("em chamda...");

	}

	@Override
	public void turnOn() {
		System.out.println("inicando chamada...");

	}

	@Override
	public void turnOff() {
		System.out.println("encerrando chamada...");

	}

	@Override
	public void answer() {
		System.out.println("atendendo..");

	}

	@Override
	public void startVoiceMail() {
		System.out.println("correio de voz...");

		
	}

//Browser

	@Override
	public void displayPage(String url) {
		System.out.println("exibindo Pagina "+ url);

	}

	@Override
	public void search() {
        System.out.println("procurando...procurando...procurando... ");

	}

	@Override
	public void addNewTab() {
        System.out.println("Nova aba adicionada.");

	}

	@Override
	public void updatePage() {
        System.out.println("Página atualizada.");
		
	}

	// music player
	@Override
	public void play() {
        System.out.println("Tocando música...");
		
	}

	@Override
	public void pause() {
        System.out.println("Música pausada.");
		
	}

	@Override
	public void selectMusic(String music) {
        System.out.println("Selecionando música: " +  music);
		
	}

	@Override
	public void close() {
        System.out.println("fechar player");
		
	}
	
	
	
	
}
