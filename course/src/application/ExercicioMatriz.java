package application;

import java.lang.reflect.Array;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe n para linhas:");
		int n = leia.nextInt();
		
		
		
		int[][] matriz = new int[n][n];
		
		// for para percorrer as linhas;
		for(int i=0; i < matriz.length;i++) {
			//for para percorrer as colunas
			for(int j=0; j < matriz[i].length;j++) {
				matriz[i][j] = leia.nextInt();
			}
		}
		
		for(int i=0; i < matriz.length;i++){
			for(int j=0; j < matriz[i].length;j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
		
		int x = 4;
		
		for(int i=0; i < matriz.length;i++){
			for(int j=0; j < matriz[i].length;j++) {
				if (matriz[i][j] == x) {
					System.out.println("Linha "+i+". Coluna "+j);
					// mostra a informações da posição de J que seria as colunas
					System.out.println("Numero a esquerda "+matriz[i][j-1]);
					System.out.println("Numero a direita "+matriz[i][j+1]);
					// mostra a informações da posição de I que seria as linhas
					System.out.println("Numero Up "+matriz[i-1][j]);
					System.out.println("Numero Donw "+matriz[i+1][j]);
				}
				
			}
		}	
	}
}
