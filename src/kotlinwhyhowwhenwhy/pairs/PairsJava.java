package kotlinwhyhowwhenwhy.pairs;


import kotlinwhyhowwhenwhy.overloading.PrinterJava;

public class PairsJava {
    public static void main(String[] args) {
        com.sun.tools.javac.util.Pair<String, String> pairSun =
                new com.sun.tools.javac.util.Pair<>("Morton", "Cornelius");
        javafx.util.Pair<String, String> pairJavaFx =
                new javafx.util.Pair<>("Morton", "Cornelius");


        PrinterJava.INSTANCE.printMessage(pairSun.fst, "", pairSun.snd);
        PrinterJava.INSTANCE.printMessage(pairJavaFx.getKey(), "", pairJavaFx.getValue());
    }
}
