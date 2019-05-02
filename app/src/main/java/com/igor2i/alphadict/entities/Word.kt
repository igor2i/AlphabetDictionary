package com.igor2i.alphadict.entities

import java.io.Serializable

interface Word : Serializable {
    val original: String
    val translate: String

}