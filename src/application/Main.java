package application;

import java.util.Locale;
import java.util.Scanner;

import application.model.IphoneMainMenu;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in).useLocale(Locale.US)) {
			System.out.println("------------Tela inicial------------");
			System.out.println("BLOQUEADO");
			System.out.println("DESBLOQUEI PRECIONANDO 'S'");

			char start = sc.next().charAt(0);

			switch (start) {
			case 'S': {

				for (int i = 0; i < 50; i++) {
					System.out.print(">");
					System.out.print("<");
					

				}
				System.out.println("");

				IphoneMainMenu iphone = new IphoneMainMenu();

				// Testando funcionalidades do Reprodutor Musical
				iphone.selectMusic("Brega funk");
				iphone.play();
				iphone.pause();

				// Testando funcionalidades do Aparelho Telefônico
				iphone.turnOn();
				iphone.answer();
				iphone.call();
				iphone.startVoiceMail();
				iphone.turnOff();

				// Testando funcionalidades do Navegador na Internet
				iphone.displayPage("https://www.google.com");
				iphone.search();
				iphone.addNewTab();
				iphone.updatePage();

			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + start);

			}
			
		}

	}


}
