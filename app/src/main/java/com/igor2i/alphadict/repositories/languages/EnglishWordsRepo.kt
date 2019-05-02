package com.igor2i.alphadict.repositories.languages

import androidx.room.Dao
import androidx.room.Query
import com.igor2i.alphadict.entities.EnglishWord
import com.igor2i.alphadict.entities.Word

@Dao
interface EnglishWordsRepo: WordsRepo<EnglishWord> {


    @Query("SELECT * FROM EnglishWord where original=:original LIMIT 1")
    fun getByOriginal(original: String): EnglishWord

    @Query("SELECT * FROM EnglishWord where translate=:translate")
    fun getByTranslate(translate: String): List<EnglishWord>

    @Query("SELECT * FROM EnglishWord")
    fun getAll(): List<EnglishWord>

    @Query("SELECT * FROM EnglishWord LIMIT 10")
    fun getLastTen(): List<EnglishWord>

}