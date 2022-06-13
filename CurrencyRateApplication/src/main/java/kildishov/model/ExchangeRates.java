package kildishov.model;


import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class ExchangeRates {
    private String license;
    private Integer timestamp;
    private String base;
    private Map<String, Double> rates;
}
