package test.quarkus;

import io.quarkus.funqy.Funq;

import java.util.Map;

public class GreetingFunction {

    @Funq
    public String funqyHello(Map<String, String> params) {
        return "hello funqy " + params.get("name");
    }
}
