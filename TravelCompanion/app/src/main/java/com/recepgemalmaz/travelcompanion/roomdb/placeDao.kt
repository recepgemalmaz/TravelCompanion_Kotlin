package com.recepgemalmaz.travelcompanion.roomdb

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.recepgemalmaz.travelcompanion.model.Place
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Flowable

@Dao
interface placeDao {

    @Query ("SELECT * FROM Place")
    fun getAll() : Flowable<List<Place>>


    @Insert
    fun insert(places : Place) :Completable

    @Delete
    fun delete(places : Place) : Completable
}