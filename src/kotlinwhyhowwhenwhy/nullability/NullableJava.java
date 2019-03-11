package kotlinwhyhowwhenwhy.nullability;

import kotlinwhyhowwhenwhy.expressions.Bucket;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public enum NullableJava {
    INSTANCE;

    public Optional<Integer> getOptionalIndexFor(int number, List<Integer> list) {
        if (list.contains(number)) {
            return Optional.of(list.indexOf(number));
        } else {
            return Optional.empty();
        }
    }

    public Integer getIndexFor(int number, List<Integer> list) {
        if (list.contains(number)) {
            return list.indexOf(number);
        } else {
            return null;
        }
    }

    // TODO: copy to NullableKotlin
    public Bucket getBucketFor(int number) {
        if (number < 10) {
            return Bucket.ONE;
        } else if (number < 100) {
            return Bucket.TWO;
        } else if (number < 1000) {
            return Bucket.THREE;
        } else if (number < 10000) {
            return Bucket.FOUR;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        Integer index = NullableJava.INSTANCE.getIndexFor(99, list);

        System.out.println(index.toString());
    }
}
