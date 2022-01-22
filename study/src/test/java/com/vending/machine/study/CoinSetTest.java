package com.vending.machine.study;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.*;

class CoinSetTest {

    @Test
    void 동전을_생성한다() {
        CoinSet coin = CoinSet._100_COIN;
        assertThat(coin.value).isEqualTo(100);
    }

    @ParameterizedTest(name = "동전은 {0}원이 있다.")
    @MethodSource("coinSet")
    public void 동전은_500원_100원_50원_10원이_있다(int value, CoinSet coin) {
        assertThat(coin.value).isEqualTo(value);
    }

    static List<Arguments> coinSet() {
        return Arrays.asList(
                Arguments.of(500, CoinSet._500_COIN),
                Arguments.of(100, CoinSet._100_COIN),
                Arguments.of(50, CoinSet._50_COIN),
                Arguments.of(10, CoinSet._10_COIN)
        );
    }

}