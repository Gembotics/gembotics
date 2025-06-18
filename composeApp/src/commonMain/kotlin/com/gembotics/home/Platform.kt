package com.gembotics.home

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform