package kotlinwhyhowwhenwhy;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinwhyhowwhenwhy.classes.CustomerKotlin;
import kotlinwhyhowwhenwhy.extensions.CustomKotlinUtils;
import kotlinwhyhowwhenwhy.higherorder.HigherOrderFunctions;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        CustomerKotlin customer = new CustomerKotlin(0, "Fritz", "fritz@gmail.com");
        CustomerKotlin customerOverloaded = new CustomerKotlin(0);
        CustomKotlinUtils.hasEmail(customer);
        System.out.println(customer.name);

        HigherOrderFunctions.triggerWorkInBackground(result -> {
            System.out.println(result);
            return null;
        });

        // Use @get:JvmName("getUniqueName") on CustomerKotlin.name to make this work
        // System.out.println(customer.getUniqueName());
    }
}
