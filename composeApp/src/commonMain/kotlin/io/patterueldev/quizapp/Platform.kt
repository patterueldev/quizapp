package io.patterueldev.quizapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform