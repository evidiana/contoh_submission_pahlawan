package com.dicoding.submissionku

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parceler
import kotlinx.parcelize.Parcelize

@Parcelize
data class Hero (
    val name: String,
    val description: String,
    val photo: Int
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readInt()
    ) {
    }

    companion object : Parceler<Hero> {
        override fun Hero.write(parcel: Parcel, flags: Int) {
            parcel.writeString(name)
            parcel.writeString(description)
            parcel.writeInt(photo)
        }

        override fun create(parcel: Parcel): Hero {
            return Hero(parcel)
        }
    }
}