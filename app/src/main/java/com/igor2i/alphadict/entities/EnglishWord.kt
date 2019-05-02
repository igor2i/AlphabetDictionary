package com.igor2i.alphadict.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

//@Entity(tableName = "T_English_Words")
@Entity
data class EnglishWord(
    @PrimaryKey override val original: String,
    override val translate: String
    ) : Word