package br.com.util.segregation;

public class Url {

    private String value;

    public Url(String value) {
        this.value = value;
    }

    public void replace(String key, String value){
        this.value = this.value.replace(key, value);
    }

    public void replaceAll(Param param) {
        param.get().forEach(this::replace);
    }

    public String get(){
        return this.value;
    }
}
