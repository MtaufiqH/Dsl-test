package taufiq.apps.kotlindsltest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myImage = findViewById<ImageView>(R.id.iv_example)
        loadImage(myImage)
    }

    private fun loadImage(image: ImageView) {
    Glide.with(this).load(Const.imageUrl).circleCrop().into(image)

    }
}