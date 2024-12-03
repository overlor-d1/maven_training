package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static fr.lernejo.Sample.Operation.ADD;
import static fr.lernejo.Sample.Operation.MULT;

class SampleTest {

    @Test
    void fact_lower_than_0() {
        int n = -1;
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> new Sample().fact(n));
    }

    @Test
    void fact_lower_greater_than_0() {
        int n = 5; // (1)
        int fact = new Sample().fact(n);
        Assertions.assertThat(fact).as("fact of 2")
            .isEqualTo(120); // (3)
    }

    @Test
    void op_add() {
        int n1 = 5;
        int n2 = 10;

        int sum = new Sample().op(ADD, n1, n2);
        Assertions.assertThat(sum).as("opération addition").isEqualTo(15);

    }

    @Test
    void op_mul() {
        int n1 = 5;
        int n2 = 10;

        int sum = new Sample().op(MULT, n1, n2);
        Assertions.assertThat(sum).as("opération multiplication").isEqualTo(50);

    }
}
