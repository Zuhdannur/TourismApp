package studio.pro.ma.tourismapps

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.graphics.Palette
import kotlinx.android.synthetic.main.activity_blog.*

class BlogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blog)
        init()
    }

    fun init(){
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = "Blog"
        var bitmap: Bitmap = BitmapFactory.decodeResource(getResources(),
            R.drawable.example_image)

        Palette.from(bitmap).generate(object : Palette.PaletteAsyncListener{
            override fun onGenerated(palette: Palette?) {
                val muted = palette!!.getMutedColor(R.attr.colorPrimary)
                collapsing_toolbar.setContentScrimColor(muted)
            }

        })

    }
}
