package mod1_syntax.syntax.lesson23_bigint_bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecIntDemo {

    public static void main(String[] args) {



        BigDecimal bigNumber1 = new BigDecimal("213351351231232351241324234523412345.67");
        BigDecimal bigNumber2 = BigDecimal.valueOf(234235124.56);

        BigDecimal sum = bigNumber1.add(bigNumber2);
        BigDecimal tax = sum.multiply(new BigDecimal("0.13"));

        System.out.printf("Большая сумма: %.2f, Большой налог: %e%n", sum, tax);

        BigInteger bigInt1 = new BigInteger("2342356515165165123123");
        BigInteger bigInt2 = BigInteger.valueOf(1231251233);

        BigInteger substr = bigInt1.subtract(bigInt2);
        System.out.printf("Большой целочисленный минус: %d", substr);

    }
}
