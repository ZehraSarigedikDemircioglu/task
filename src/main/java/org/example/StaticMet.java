package org.example;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class StaticMet {

    public static void main(String[] args) {

        Functional a = new Functional() {
            @Override
            public LinkedList<BigDecimal> name(List<Long> parameter) {
                return null;
            }
        };
        Functional s = parameter -> new LinkedList<>();
    }
}
