public class MinhaClasse {


public static void main(String[] args) {
    
    // VARIÁVEIS EM JAVA
    String BR = "Brasil";
    String US = "Estados Unidos";
    int AnoAtual = 2025;
    double PI = 3.14;
    String [] emails = {"Brasil@gmail.com", "EUA@gmail.com"}
    
    //CHAMANDO FUNÇÕES
    String paisesAliados = PaisesAliados(BR, US);
    System.out.println(paisesAliados);

    if(BR == "Brasil") {
        System.out.println("O país é Brasil");
    } else {
        System.out.println("O país não é Brasil");
    }

}

    //FUNÇÕES EM JAVA

    public static String PaisesAliados(String pais1, String pais2) {
        return pais1.concat(" ").concat(pais2);
    }

}