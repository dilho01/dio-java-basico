package Anatonia_das_classes;
public class MinhaClasse2 {
    
    public static void main (String [] args) {
        String primeiroNome = "Gabrile";
        String segundoNome = "Teixeira";

        String nomecompleto = nomecomploto(primeiroNome, segundoNome);
        System.out.println(nomecompleto);
    }

    public static String nomecomploto (String primeiroNome, String segundoNome) {
        return "Resltado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
