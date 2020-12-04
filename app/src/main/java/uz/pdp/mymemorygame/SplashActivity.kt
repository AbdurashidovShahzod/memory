package uz.pdp.mymemorygame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    lateinit var handler: Handler
    var anim1: Animation? = null
    var anim2: Animation? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.
//
//        var anim1 = AnimationUtils.loadAnimation(this, R.anim.anim_splash)
//        var anim2 = AnimationUtils.loadAnimation(this, R.anim.anim_splash_bottom)
//
//        splashTxt.animation = anim1
//        splash_img.animation = anim2
        setContentView(R.layout.activity_splash)
        handler = Handler()
        handler.postDelayed({
            startActivity(Intent(this, FirstActivity::class.java))
            finish()
        }, 3000)
    }
}

