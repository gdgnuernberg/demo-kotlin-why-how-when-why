package kotlinwhyhowwhenwhy.overloading;

public enum PrinterJava {
    INSTANCE;

    public void printMessage(String message) {
        printMessage(message, "");
    }

    public void printMessage(String message, String prefix) {
        printMessage(message, prefix, "");
    }

    public void printMessage(String message, String prefix, String suffix) {
        System.out.format("%s %s %s \n", prefix, message, suffix);
    }
}
