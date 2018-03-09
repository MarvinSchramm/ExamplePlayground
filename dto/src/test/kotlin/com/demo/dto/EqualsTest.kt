package com.demo.dto

import nl.jqno.equalsverifier.EqualsVerifier
import org.junit.jupiter.api.Test

class EqualsTest {

    @Test
    fun testEquals() {
        EqualsVerifier.forClass(Match::class.java).verify()
    }
}
