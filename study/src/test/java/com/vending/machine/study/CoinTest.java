package com.vending.machine.study;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Value;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CoinTest {

    @Test
    public void 동전을_생성한다() {
        Coin coin = new Coin(100);
        assertThat(coin).isNotNull();
    }


}