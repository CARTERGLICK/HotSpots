package com.example.hotspots;

public class Counter {
    private Integer missTotal;
    private Integer value;
    private Integer percentage;
    private Boolean rW = false;
    private Boolean tK = false;
    private Boolean lW = false;
    private Boolean lC=  false;
    private Boolean rC=  false;

    public Boolean getrW() {
        return rW;
    }

    public Boolean gettK() {
        return tK;
    }

    public Boolean getlW() {
        return lW;
    }

    public Boolean getlC() {
        return lC;
    }

    public Boolean getrC() {
        return rC;
    }

    public void setrC(Boolean rC) {
    }

    public void setrW(Boolean rW) {
        this.rW = rW;
    }

    public void settK(Boolean tK) {
        this.tK = tK;
    }

    public void setlW(Boolean lW) {
        this.lW = lW;
    }

    public void setlC(Boolean lC) {
        this.lC = lC;
    }

    public Integer getPercentage() {
        return percentage;
    }

    public void setPercentage() {
        this.percentage = (int) ((double) value / (value + missTotal) * 100);

    }

    public Counter() {
        value = 0;
        missTotal = 0;
    }

    public void madeBasket() {
        value++;
    }

    public void missBasket() {
        missTotal++;
    }

    public Integer getValue() {
        return value;
    }

    public void resetButton() {
        value = 0;
        missTotal = 0;


    }

}
