package com.example.kotlin2lesson1.base

interface BaseDiffModel {
    val id: String
    override fun equals(other: Any?): Boolean
}