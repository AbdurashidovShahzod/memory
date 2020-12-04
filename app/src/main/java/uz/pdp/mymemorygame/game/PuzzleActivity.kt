package uz.pdp.mymemorygame.game

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_puzzle.*
import uz.pdp.mymemorygame.R

class PuzzleActivity : AppCompatActivity(), Animation.AnimationListener {
    var f1 = false
    var f2 = false
    var f3 = false
    var f4 = false
    var counter = 0
    var animation1: Animation? = null
    var animation2: Animation? = null
    var listPhoto = listOf(
        R.drawable.ic_i1,
        R.drawable.ic_i2,
        R.drawable.ic_i3,
        R.drawable.ic_i4,
        R.drawable.ic_i5,
        R.drawable.ic_i6,
        R.drawable.ic_i01,
        R.drawable.ic_i02,
        R.drawable.ic_i03,
        R.drawable.ic_i04,
        R.drawable.ic_i05,
        R.drawable.ic_i06
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puzzle)

        animation1 = AnimationUtils.loadAnimation(this, R.anim.anim1)
        animation2 = AnimationUtils.loadAnimation(this, R.anim.anim2)
        animation1?.setAnimationListener(this)

        var arrayImage = listOf(
            imageM1, imageM2, imageM3, imageM4, imageM5,
            imageM6, imageM7, imageM8, imageM9, imageM10, imageM10, imageM11, imageM12
        )
        imageM1.setOnClickListener {
            imageM1.startAnimation(animation1)
            f1 = true
            counter++
        }
        imageM2.setOnClickListener {
            imageM2.startAnimation(animation1)
            f2 = true
            counter++
        }
        imageM3.setOnClickListener {
            f3 = true
            imageM3.startAnimation(animation1)
            counter++
        }
        imageM4.setOnClickListener {
            f4 = true
            imageM4.startAnimation(animation1)
            counter++

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
        when {
            f1 -> {
                imageM1.setImageResource(R.drawable.ic_i1)
                imageM1.startAnimation(animation2)
                f1 = false
            }
            f2 -> {
                imageM2.setImageResource(R.drawable.ic_i1)
                imageM2.startAnimation(animation2)
                f2 = false
            }
            f3 -> {
                imageM3.setImageResource(R.drawable.ic_i2)
                imageM3.startAnimation(animation2)
                f3 = false
            }
            f4 -> {
                imageM4.setImageResource(R.drawable.ic_i2)
                imageM4.startAnimation(animation2)
                f4 = false
            }


        }

        animation2?.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(p0: Animation?) {

            }

            override fun onAnimationEnd(p0: Animation?) {
                /*  if (counter==2)
                    if (imageM1.drawable.constantState == imageM2.drawable.constantState) {
                        card1.visibility = View.INVISIBLE
                        card2.visibility = View.INVISIBLE
                    }
                }*/
                if (counter == 2) {
                    if (imageM1.drawable.constantState == imageM2.drawable.constantState) {
                        card1.visibility = View.INVISIBLE
                        card2.visibility = View.INVISIBLE
                    } else if (imageM3.drawable.constantState == imageM4.drawable.constantState) {
                        card3.visibility = View.INVISIBLE
                        card4.visibility = View.INVISIBLE
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