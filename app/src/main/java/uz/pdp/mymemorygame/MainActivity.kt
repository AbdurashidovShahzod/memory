package uz.pdp.mymemorygame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Animation.AnimationListener {
    var animation1: Animation? = null
    var animation2: Animation? = null
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
        setContentView(R.layout.activity_main)
        var animation1 = AnimationUtils.loadAnimation(this, R.anim.animation1)
        var animation2 = AnimationUtils.loadAnimation(this, R.anim.animation2)
        animation1.setAnimationListener(this)

        imageM1.setOnClickListener {
            imageM1.startAnimation(animation1)
            i1 = true
        }
        imageM2.setOnClickListener {
            i2 = true
            imageM2.startAnimation(animation1)
        }
        imageM3.setOnClickListener {
            imageM3.startAnimation(animation1)
        }
        imageM4.setOnClickListener {
            imageM4.startAnimation(animation1)
        }
        imageM5.setOnClickListener {
            imageM5.startAnimation(animation1)
        }
        imageM6.setOnClickListener {
            imageM6.startAnimation(animation1)
        }
        imageM7.setOnClickListener {
            imageM7.startAnimation(animation1)
        }
        imageM8.setOnClickListener {
            imageM8.startAnimation(animation1)
        }
        imageM9.setOnClickListener {
            imageM9.startAnimation(animation1)
        }
        imageM10.setOnClickListener {
            imageM10.startAnimation(animation1)
        }
        imageM11.setOnClickListener {
            imageM11.startAnimation(animation1)
        }
        imageM12.setOnClickListener {
            imageM12.startAnimation(animation1)
        }


    }

    override fun onAnimationStart(p0: Animation?) {

    }

    override fun onAnimationEnd(p0: Animation?) {
        if (i1) {
            imageM1.setImageResource(R.drawable.ic_i1)
            var animation2 = AnimationUtils.loadAnimation(this, R.anim.animation2)
            imageM1.startAnimation(animation2)
            i1 = false
            counter++
        } else {
            imageM2.setImageResource(R.drawable.ic_i1)
            var animation2 = AnimationUtils.loadAnimation(this, R.anim.animation2)
            imageM2.startAnimation(animation2)
            i2 = false
            counter++
        }
        animation2?.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(p0: Animation?) {

            }

            override fun onAnimationEnd(p0: Animation?) {
                if (counter == 2) {
                    if (imageM1.drawable.constantState == imageM2.drawable.constantState) {
                        card1.visibility = View.INVISIBLE
                        card2.visibility = View.INVISIBLE
                    } else {
                        var animation1 =
                            AnimationUtils.loadAnimation(this@MainActivity, R.anim.animation1)
                        imageM1.startAnimation(animation1)
                        imageM2.startAnimation(animation1)
                    }
                }
            }

            override fun onAnimationRepeat(p0: Animation?) {

            }
        })


    }

    override fun onAnimationRepeat(p0: Animation?) {

    }

}

