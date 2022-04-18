package br.com.util.segregation;

import java.util.HashMap;
import java.util.Map;

public class Param {
    private final Map<String, String> parametro = new HashMap<>();

    public Map<String, String> get() {
        return parametro;
    }
}
