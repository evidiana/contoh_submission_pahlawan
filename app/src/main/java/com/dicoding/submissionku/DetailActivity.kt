package com.dicoding.submissionku

import android.app.Person
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DetailActivity :AppCompatActivity (){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val dataHero = if (Build.VERSION.SDK_INT >= 33) {
            intent.getParcelableExtra<Person>("key_hero", Hero::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra<Person>("key_hero")
        }
        val tvDetailName = findViewById(R.id.tv_detail_name)
        val tvDetailDescription = findViewById(R.id.tv_detail_description)
        val ivDetailPhoto = findViewById(R.id.iv_detail_photo)

        tvDetailName.text = dataHero.name
        tvDetailDescription.text = dataHero.description
        ivDetailPhoto.setImageResource(dataHero.photo)

} }