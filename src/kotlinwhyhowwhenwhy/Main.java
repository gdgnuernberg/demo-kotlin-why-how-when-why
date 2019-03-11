package kotlinwhyhowwhenwhy;

import kotlinwhyhowwhenwhy.classes.CustomerJava;
import kotlinwhyhowwhenwhy.overloading.OverloadedMethodsInKotlinKt;

public class Main {
    public static void main(String[] args) {
        CustomerJava customerJava = new CustomerJava(1);
        customerJava.setName("Morton Cornelius");
        customerJava.setEmail("mortoncornelius@gmail.com");

        OverloadedMethodsInKotlinKt.printMessage(
                customerJava.getName(),
                String.valueOf(customerJava.getId()),
                customerJava.getEmail());
    }
}
