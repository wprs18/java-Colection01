package Main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
      
      	Main app = new Main();
		app.start();

	}

	private void start() {
		List<String> listaPalavras = new ArrayList<String>();
		int qtd = 0;
		
		while(qtd < 5){
		    String valor = obterValor();
		    if(valor == "INVALIDO" || valor == ""){
		        System.out.println("Valor invalido, digite novamente.");
		    } else{
		        listaPalavras.add(valor);
		        qtd++;
		        System.out.println("Palavra: " + qtd + " Foi inserida corretamente");
		    }
		}
		
		System.out.println("\n======= Adição de palavras completa =======\n");
		
		for (int i = 0; i < listaPalavras.size(); i++) {

			System.out.println("Palavra nº " + (i+1) + ": " + listaPalavras.get(i));
		}
		
		System.out.println("\n======= Adicionando 2 itens a lista e removendo o segundo e terceiro item da lista =======\n");

		listaPalavras.add("item adicionado automaticamente 01");
		listaPalavras.add("item adicionado automaticamente 02");
		
		listaPalavras.remove(1);
		listaPalavras.remove(1);
		
		for (int i = 0; i < listaPalavras.size(); i++) {

			System.out.println("Palavra nº " + (i+1) + ": " + listaPalavras.get(i));
		}
		
		
	}
	
    private String obterValor(){
        Scanner ler = new Scanner(System.in);
        String palavra = "";
        System.out.print("Digite uma palavra: ");
        
        try {
				palavra = ler.nextLine();
			} catch (Exception e) {
				palavra = "INVALIDO";
				ler.next();
			}
			return palavra;
			
    }

    }