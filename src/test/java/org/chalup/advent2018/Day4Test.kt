package org.chalup.advent2018

import com.google.common.truth.Truth
import org.junit.jupiter.api.Test

class Day4Test {
    @Test
    fun `calculate result for 1st strategy`() {
        Truth.assertThat(Day4.strategy1(log)).isEqualTo(240)
    }

    @Test
    fun `calculate result for 2nd strategy`() {
        Truth.assertThat(Day4.strategy2(log)).isEqualTo(4455)
    }

    companion object {
        val log = listOf("[1518-11-01 00:00] Guard #10 begins shift",
                         "[1518-11-01 00:05] falls asleep",
                         "[1518-11-01 00:25] wakes up",
                         "[1518-11-01 00:30] falls asleep",
                         "[1518-11-01 00:55] wakes up",
                         "[1518-11-01 23:58] Guard #99 begins shift",
                         "[1518-11-02 00:40] falls asleep",
                         "[1518-11-02 00:50] wakes up",
                         "[1518-11-03 00:05] Guard #10 begins shift",
                         "[1518-11-03 00:24] falls asleep",
                         "[1518-11-03 00:29] wakes up",
                         "[1518-11-04 00:02] Guard #99 begins shift",
                         "[1518-11-04 00:36] falls asleep",
                         "[1518-11-04 00:46] wakes up",
                         "[1518-11-05 00:03] Guard #99 begins shift",
                         "[1518-11-05 00:45] falls asleep",
                         "[1518-11-05 00:55] wakes up")
    }
}