package Controller;

public class Ordenacao {
    public Ordenacao(){
        super();
    }

    public int[] QuickSort(int[] vetor, int inicio, int fim){
        if (fim > inicio){ //condição de parada
            int posicaoPivoFixo= dividir(vetor, inicio, fim);
            QuickSort(vetor, inicio, posicaoPivoFixo - 1);
            QuickSort(vetor, posicaoPivoFixo + 1, fim);
        }
        return vetor;
    }


    private int dividir(int[] vetor, int inicio, int fim){
        int ponteiroEsquerda= inicio + 1;
        int ponteiroDireita= fim;
        int pivo= vetor[inicio];

        while (ponteiroEsquerda <= ponteiroDireita){
            while (ponteiroEsquerda <= ponteiroDireita && vetor[ponteiroEsquerda] <= pivo){
                ponteiroEsquerda++;
            }
            while (ponteiroDireita >= ponteiroEsquerda && vetor[ponteiroDireita] >= pivo){
                ponteiroDireita--;
            }
            if (ponteiroEsquerda < ponteiroDireita){
                trocar(vetor, ponteiroEsquerda, ponteiroDireita);
                ponteiroEsquerda++;
                ponteiroDireita--;
            }
        }
        trocar(vetor, inicio, ponteiroDireita);
        return ponteiroDireita;
    }

    private void trocar(int[] vetor, int i, int j) {
        int auxiliar= vetor[j];
        vetor[j]= vetor[i];
        vetor[i]= auxiliar;
    }
}
