package bubbleSort;

public class Main {

	public static void main(String[] args) {
         //Bubble Sort
		// Vetor 1, 10% aleatório e o resto ordenado
//				int vetor1[] = new int[1000];
//				for (int i = 0; i < 100; i++) {
//					vetor1[i] = (int) (Math.random() * 1000);
//				}
//				for (int j = 99; j < vetor1.length; j++) {
//					vetor1[j] = j;
//				}
//				System.out.println("Vetor 1 antes da ordenação: ");
//				for (int j = 0; j < vetor1.length; j++) {
//					System.out.print(vetor1[j]+ " , ");
//			}System.out.println();
//				int[] resultado = bubbleSort(vetor1);
//				System.out.println("Vetor após ordenação: ");
//				imprimirVetor(vetor1);
//				System.out.println("Quantidade de comparações: " + resultado[0]);
//		        System.out.println("Quantidade de trocas: " + resultado[1]);
//		-----------------------------------------------------------------------------
		
		// Vetor 2, totalmente aleatório
//		int vetor2[] = new int[1000];
//		for (int i = 0; i < vetor2.length; i++) {
//			vetor2[i] = (int) (Math.random() * vetor2.length);
//		}
//		System.out.println("Vetor 2 antes da ordenação: ");
//		for (int j = 0; j < vetor2.length; j++) {
//			System.out.print(vetor2[j]+ " ");
//		}int[] resultado = bubbleSort(vetor2);
//		System.out.println("\nVetor 2 ");
//	    bubbleSort(vetor2);
//		imprimirVetor(vetor2);
//		System.out.println("Quantidade de comparações: " + resultado[0]);
//        System.out.println("Quantidade de trocas: " + resultado[1]);
//		-------------------------------------------------------------------------------
		
		// Vetor 3, inversamente ordenado

        int[] arrayInverso = new int[1000];
        
        for (int i = 0,  j = arrayInverso.length; i < arrayInverso.length; i++, j--) {
            arrayInverso[i] = j;
        
        }
        System.out.println("Vetor 3 antes da ordenação: ");
		for (int j = 0; j < arrayInverso.length; j++) {
			System.out.print(arrayInverso[j]+ " ");
		}
		int[] resultado = bubbleSort(arrayInverso);
        System.out.println("\nVetor 3");
        bubbleSort(arrayInverso);
        for (int i = 0; i < arrayInverso.length; i++) {
            System.out.print(arrayInverso[i]+ " ");
        }System.out.println();
        System.out.println("Quantidade de comparações: " + resultado[0]);
        System.out.println("Quantidade de trocas: " + resultado[1]);
		        
	}
	
	
	
	 public static int[] bubbleSort(int[] vetor) {
	        int n = vetor.length;
	        int comparacoes = 0;
	        int trocas = 0;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                comparacoes++;
	                if (vetor[j] > vetor[j + 1]) {
	                    int temp = vetor[j];
	                    vetor[j] = vetor[j + 1];
	                    vetor[j + 1] = temp;
	                    trocas++;
	                }
	            }
	        }
	        int[] resultado = {comparacoes, trocas};
	        return resultado;
	    }

	    public static void imprimirVetor(int[] vetor) {
	        for (int i = 0; i < vetor.length; i++) {
	            System.out.print(vetor[i] + " ");
	        }
	        System.out.println();
	    }
	}

