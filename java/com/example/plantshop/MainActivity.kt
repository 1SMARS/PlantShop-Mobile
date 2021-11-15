package com.example.plantshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.cardview.widget.CardView
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerLayout: DrawerLayout = findViewById(R.id.drawerLayout)
        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val pelargoniumCard: CardView = findViewById(R.id.pelargoniumCard)
        val aloeCard: CardView = findViewById(R.id.aloeCard)
        val anthuriumcard: CardView = findViewById(R.id.anthuriumCard)
        val cactusCard: CardView = findViewById(R.id.cactusCard)
        val dendrobiumCard: CardView = findViewById(R.id.dendrobiumCard)
        val hyacinthCard: CardView = findViewById(R.id.hyacinthCard)


         pelargoniumCard.setOnClickListener {
            startActivity(Intent(this, PelargoniumActivity::class.java))

        }
        aloeCard.setOnClickListener {
            startActivity(Intent(this, AloeActivity::class.java))
        }
        anthuriumcard.setOnClickListener {
            startActivity(Intent(this, AnthuriumActivity::class.java))
        }
        cactusCard.setOnClickListener {
            startActivity(Intent(this, CactusActivity::class.java))
        }
        dendrobiumCard.setOnClickListener {
            startActivity(Intent(this, DendrobiumActivity::class.java))
        }
        hyacinthCard.setOnClickListener {
            startActivity(Intent(this, HyacinthActivity::class.java))
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}