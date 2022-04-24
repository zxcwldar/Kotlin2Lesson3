package com.example.kotlin2lesson1.common.either

sealed class Either<out A, out B> {
    class Left<out A>(val value: A) : Either<A, Nothing>()
    class Right<out B>(val value: B) : Either< Nothing , B>()

}