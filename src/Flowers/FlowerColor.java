package Flowers;

/**
 * Created by Yasya on 24.10.16.
 */
public enum FlowerColor {
    RED, PURPLE, PINK, WHITE;
    public String toString() {
        switch (this) {
            case RED: return "red";
            case PURPLE: return "purple";
            case PINK: return "pink";
            case WHITE: return "white";
            default: return "unspecified";
        }
    }
}

