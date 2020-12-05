package uz.pdp.mymemorygame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class TestActivity : AppCompatActivity(), Animation.AnimationListener {
    var i1 = false
    var i2 = false
    var i3 = false
    var i4 = false
    var i5 = false
    var i6 = false
    var i7 = false
    var i8 = false
    var i9 = false
    var i10 = false
    var i11 = false
    var i12 = false
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        var animation1 = AnimationUtils.loadAnimation(this, R.anim.animation1)
        var animation2 = AnimationUtils.loadAnimation(this, R.anim.animation2)

        animation1.setAnimationListener(this)
        animation2.setAnimationListener(this)

        imageM1.setOnClickListener {
            imageM1.startAnimation(animation1)
            i1 = true
            counter++
        }
        imageM2.setOnClickListener {
            imageM2.startAnimation(animation1)
            i2 = true
            counter++
        }
        imageM3.setOnClickListener {
            imageM3.startAnimation(animation1)
            i2 = true
            counter++
        }
        imageM4.setOnClickListener {
            imageM4.startAnimation(animation1)
            i2 = true
            counter++
        }
        imageM5.setOnClickListener {
            imageM5.startAnimation(animation1)
            i2 = true
            counter++
        }
        imageM6.setOnClickListener {
            imageM6.startAnimation(animation1)
            i2 = true
            counter++
        }
        imageM7.setOnClickListener {
            imageM7.startAnimation(animation1)
            i2 = true
            counter++
        }
        imageM8.setOnClickListener {
            imageM8.startAnimation(animation1)
            i2 = true
            counter++
        }
        imageM9.setOnClickListener {
            imageM9.startAnimation(animation1)
            i2 = true
            counter++
        }
        imageM10.setOnClickListener {
            imageM10.startAnimation(animation1)
            i2 = true
            counter++
        }
        imageM11.setOnClickListener {
            imageM11.startAnimation(animation1)
            i2 = true
            counter++
        }
        imageM12.setOnClickListener {
            imageM12.startAnimation(animation1)
            i2 = true
            counter++
        }


    }

    override fun onAnimationStart(p0: Animation?) {

    }

    override fun onAnimationEnd(p0: Animation?) {
        var animation2 = AnimationUtils.loadAnimation(this, R.anim.animation2)


    }

    override fun onAnimationRepeat(p0: Animation?) {

    }


}