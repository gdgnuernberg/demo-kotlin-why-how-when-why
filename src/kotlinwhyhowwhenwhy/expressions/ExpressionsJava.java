package kotlinwhyhowwhenwhy.expressions;


import javafx.scene.paint.Color;

public class ExpressionsJava {
    public boolean isDrive(String color) {
        switch (color) {
            case "green":
                return true;
            case "orange":
                return true;
            default:
                return false;
        }
    }

    public boolean isDrive(Color color) {
        if (Color.GREEN.equals(color)) {
            return true;
        } else if (Color.ORANGE.equals(color)) {
            return true;
        }
        return false;
    }
}
