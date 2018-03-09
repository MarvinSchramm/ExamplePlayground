package com.demo.dto

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.Instant

data class Match @JsonCreator constructor(@JsonProperty("id") val id: String,
                                          @JsonProperty("id") val homeTeam: Team? = null,
                                          @JsonProperty("id") val awayTeam: Team? = null,
                                          @JsonProperty("id") val matchDateTime: Instant = Instant.now()) {
    companion object {
        fun newInstanceKotlin(id: String): Match {
            return Match(id)
        }

        @JvmStatic
        fun newInstanceJava(id: String): Match {
            return Match(id)
        }
    }

    data class Team @JsonCreator constructor(@JsonProperty("id") val id: String,
                                             @JsonProperty("name") val name: String)
}


