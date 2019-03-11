package kotlinwhyhowwhenwhy;

import kotlinwhyhowwhenwhy.overloading.OverloadedMethodsInJava;
import kotlinwhyhowwhenwhy.overloading.OverloadedMethodsInKotlinKt;

public class Main {
    public static void main(String[] args) {
        OverloadedMethodsInJava overloadedMethodsInJava = new OverloadedMethodsInJava();
        overloadedMethodsInJava.printMessage("Message");
        overloadedMethodsInJava.printMessage("Message", "Great");
        overloadedMethodsInJava.printMessage("Message", "Great", "!");

        OverloadedMethodsInKotlinKt.printMessage("greetings", "Hey there,", "from Kotlin");
    }
}
