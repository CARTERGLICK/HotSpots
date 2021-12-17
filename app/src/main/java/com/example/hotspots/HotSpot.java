/*package com.example.hotspots;

import java.util.Locale;

public class HotSpot {

    public static final int LEFT_CORNER = 0;
    public static final int LEFT_WING = 1;
    public static final int TOP_KEY = 2;
    public static final int RIGHT_WING = 3;
    public static final int RIGHT_CORNER = 4;

    private Integer attempts;
    private Integer made;

    public Integer getAttempts() {
        return attempts;
    }

    public void setAttempts(Integer attempts) {
        this.attempts = attempts;
    }

    public Integer getMade() {
        return made;
    }

    public void setMade(Integer made) {
        this.made = made;
    }

    public HotSpot() {
        attempts = 0;
        made = 0;
    }

    public void madeAttempt(){
        made++;
        attempts++;
    }

    public void missAttempt(){
        attempts++;
    }

    public Integer getPercentage(){
        if(attempts != 0){
            return (int)((double) made / attempts);
        }
        else return 0;
    }

    public String getPercentageString(){
        String percent = "N/A";
        if(attempts != 0){
            percent = String.format("%.1f",(double)made / attempts, Locale.US);
            percent += " %";
        }
        return percent;
    }

}
*/