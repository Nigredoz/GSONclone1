package com.example.gson

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide

class PicViewer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pic_viewer)

        val intent: Intent = getIntent()
        val message: String = intent.getStringExtra("link").toString()
        val image: ImageView = findViewById(R.id.imageView3)
        val url = message

        Glide.with(this).load(url).into(image)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu,menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.getItemId()

        if (id == R.id.heart)
        {
            Toast.makeText(this, "Добавлено в избранное", Toast.LENGTH_SHORT).show()
        }

        return super.onOptionsItemSelected(item)
    }
}