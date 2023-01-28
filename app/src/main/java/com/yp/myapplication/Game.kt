package com.yp.myapplication

import kotlin.random.Random

object Game {

        private val rules = mapOf(
                "ROCK-SCISSORS" to true,
                "ROCK-PAPER" to false,
                "SCISSORS-PAPER" to true,
                "SCISSORS-ROCK" to false,
                "PAPER-ROCK" to true,
                "PAPER-SCISSORS" to false
        )

        private val options = listOf("ROCK","SCISSORS", "PAPER")

        private val optionDrawable = mapOf(
                "ROCK" to R.drawable.rock,
                "SCISSORS" to R.drawable.scissors,
                "PAPER" to R.drawable.paper
        )

        fun pickRandomOption(): String{
                return options[Random.nextInt(0, 3)]
        }

        fun pickDrawable(option: String): Int{
                return optionDrawable[option] !!
        }

        fun isDraw(from: String, to: String): Boolean {
                return from == to
        }

        fun isWin(from: String, to: String): Boolean{
                return rules["$from-$to"]!!
        }

}