package com.vending.machine.study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Red(질문) -> Greed(응답) -> Refactor(정제)
 */
class VendingMachineTest {

    @Test
    public void 자판기_생성() {
        VendingMachine vendingMachine = new VendingMachine();
        Assertions.assertThat(vendingMachine).isNotNull();
    }
}