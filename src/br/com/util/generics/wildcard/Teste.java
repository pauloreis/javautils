package br.com.util.generics.wildcard;

import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List<ClassFilhoA> listFilhoA = List.of(new ClassFilhoA(), new ClassFilhoA());
        List<ClassFilhoB> listFilhoB = List.of(new ClassFilhoB(), new ClassFilhoB());
        printFilhos(listFilhoA);
        printFilhos(listFilhoB);
    }

    private static void printFilhos(List<? extends ClassPai> list){
        for (ClassPai pai : list) {
            pai.print();
        }
    }

    private static void addFilhos(List<? super ClassPai> list){
        list.add(new ClassFilhoA());
        list.add(new ClassFilhoB());
    }
}
