package br.com.util.polimorfismo;

/*
    COMPOSIÇÃO
    Classe que evita repetição de codigo,
    Pois ClasseA e B por assinarem o contrato deveriam fazer uma implementação muito semelhante.
 */

public class ClasseXUtil {

    public String implementacao(String str) {
        return "Implementação da Classe: " + str;
    }

}
