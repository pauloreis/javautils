package br.com.util.segregation;

public class Test {
    public static void main(String[] args) {
        Url url1 = new Url("www.teste.com.br?param={a}");
        url1.replace("{a}", "valorParametro");
        System.out.println(url1.get());

        Param param = new Param();
        param.get().put("{a}","valor1");
        param.get().put("{b}","valor2");
        param.get().put("{c}","valor3");
        Url url2 = new Url("www.teste.com.br?paramA={a}&paramB={b}&paramC={c}");
        url2.replaceAll(param);
        System.out.println(url2.get());
    }
}
