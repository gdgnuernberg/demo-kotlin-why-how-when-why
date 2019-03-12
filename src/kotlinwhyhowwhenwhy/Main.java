package kotlinwhyhowwhenwhy;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinwhyhowwhenwhy.classes.CustomerKotlin;
import kotlinwhyhowwhenwhy.extensions.CustomerExtensionsKt;
import kotlinwhyhowwhenwhy.higherorder.HigherOrderFunctions;

public class Main {
    public static void main(String[] args) {
        CustomerKotlin customer = new CustomerKotlin(0, "Fritz", "fritz@gmail.com");

        // TODO make next line compile
        CustomerKotlin customerOverloaded = new CustomerKotlin(0);

        // TODO make class name more beautiful
        CustomerExtensionsKt.hasEmail(customer);

        // TODO make next line compile
        //System.out.println(customer.name);

        // TODO make this more readable
        HigherOrderFunctions.INSTANCE.triggerWorkInBackground(new Function1<String, Unit>() {
            @Override
            public Unit invoke(String result) {
                System.out.println(result);
                return null;
            }
        });

        // TODO show how to force catch checked exceptions

        // TODO make next line compile
        //System.out.println(customer.getUniqueName());
    }
}
