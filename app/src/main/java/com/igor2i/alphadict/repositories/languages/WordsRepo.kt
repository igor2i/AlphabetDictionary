package com.igor2i.alphadict.repositories.languages

import androidx.room.Insert
import androidx.room.Update
import com.igor2i.alphadict.entities.Word

interface WordsRepo<T: Word> {

    @Insert
    fun create(word: T)

    @Update
    fun update(word: T)

}