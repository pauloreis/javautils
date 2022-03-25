package br.com.util.polimorfismo;

/*
 POLIMORFISMO
 Classe polimorfica, pois metodoX1 recebe uma Interace (contrato)
 Que pode ser tanto ClasseA quanto B
*/
public class ClasseX {

    private String str;

    public String metodoX1(Contrato c){
        return c.metodoC1(str);
    }

    public void setStr(String str) {
        this.str = str;
    }
}
