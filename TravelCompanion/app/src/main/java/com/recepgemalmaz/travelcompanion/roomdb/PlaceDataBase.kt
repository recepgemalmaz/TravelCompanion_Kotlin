package com.recepgemalmaz.travelcompanion.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase

import com.recepgemalmaz.travelcompanion.model.Place

@Database(entities = [Place::class], version = 1)
abstract class PlaceDataBase : RoomDatabase() {
    abstract fun placeDao(): placeDao
}
