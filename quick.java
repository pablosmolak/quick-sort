public class quick {
    
    public static void quickSort(int[] lista, int menor, int maior){   

        if(menor < maior){
            int indicePivo = separar(lista, menor, maior);
            
            quickSort(lista, menor, indicePivo - 1);
            

            quickSort(lista, indicePivo + 1, maior);
            
        }
    }

    public static int separar(int[] lista, int menor, int maior){
        int pivo = lista[maior];
        int cont = menor -1;

        for (int i = menor; i < maior; i++) {
            if(lista[i] <= pivo){
                cont ++;
                mudar(lista,cont,i);

            }
            
        }
        mudar(lista, cont+1, maior);
        return cont+1;

    }

    public static void mudar(int[] lista, int cont, int i) {
        int temp = lista[cont];
        lista[cont] = lista[i];  
        lista[i] = temp;
    }

    
    public static void main(String[] args) {
        
        int[] lista = {999,-999,-1,84,-20,-15,85,25,36,45,21};
       
        quickSort(lista,0, lista.length -1);
        
        for (int i = 0; i < lista.length; i++) {
                System.out.println(lista[i]);
        } 
    }
    
}
