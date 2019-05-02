package com.igor2i.alphadict.services

import androidx.room.Database
import androidx.room.RoomDatabase
import com.igor2i.alphadict.entities.EnglishWord
import com.igor2i.alphadict.repositories.languages.EnglishWordsRepo

@Database(entities = [EnglishWord::class], version = 1)
abstract class DataBaseService : RoomDatabase() {

    abstract fun englishWordsRepo(): EnglishWordsRepo

}