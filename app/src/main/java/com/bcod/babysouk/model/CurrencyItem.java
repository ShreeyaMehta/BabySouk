package com.bcod.babysouk.model;

public class CurrencyItem {
    private int flagImage;
    private int countryName;
    private int currency;

    public CurrencyItem(int flagImage, int countryName, int currency) {
        this.flagImage = flagImage;
        this.countryName = countryName;
        this.currency = currency;
    }

    public int getFlagImage() {
        return flagImage;
    }

    public int getCountryName() {
        return countryName;
    }

    public int getCurrency() {
        return currency;
    }
}
