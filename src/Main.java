public class Main {
    public static void main(String[] args) {
        String texto = null;

        try{
            System.out.println(texto.length());
        }catch (NullPointerException e){
            System.err.println("Voce tentou imprimir o tamanho de uma variavel nula");
        }
    }
}