/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Pengguna
 */
public class CurrencyConversionResponse {

    /**
     * @return the base
     */
    public String getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(String base) {
        this.base = base;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the rates
     */
    public Map<String, String> getRates() {
        return rates;
    }

    /**
     * @param rates the rates to set
     */
    public void setRates(Map<String, String> rates) {
        this.rates = rates;
    }
    private String base;
    private String date;
    private Map<String, String> rates = new TreeMap<>();
}
