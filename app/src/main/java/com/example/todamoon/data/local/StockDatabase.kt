package com.example.todamoon.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [CompanyListingsEntity::class],
    version = 1
)
abstract class StockDatabase: RoomDatabase() {

    abstract val dao: StockDao
}