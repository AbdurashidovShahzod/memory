package uz.pdp.mymemorygame.game

import android.os.Bundle
import uz.pdp.mymemorygame.R
import android.content.Intent
import android.os.CountDownTimer
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_my_memory.*
import kotlinx.android.synthetic.main.activity_puzzle.*

class MyMemoryActivity : AppCompatActivity(), Animation.AnimationListener {
    var animation1: Animation? = null
    var animation2: Animation? = null
    var animation3: Animation? = null
    var index1 = 0
    private var resultImage = 0
    var first = 0
    var second = 0
    var three = 0
    var four = 0
    var counter = 0
    private lateinit var list: List<ImageButton>
    private lateinit var arrayImage: List<ImageButton>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_memory)

        animation1 = AnimationUtils.loadAnimation(this, R.anim.anim1)
        animation2 = AnimationUtils.loadAnimation(this, R.anim.anim2)
        animation3 = AnimationUtils.loadAnimation(this, R.anim.anim3)
        animation1?.setAnimationListener(this)

        arrayImage = listOf(
            imageButton1, imageButton2, imageButton3, imageButton4,
            imageButton5, imageButton6, imageButton7, imageButton8,
            imageButton9, imageButton10, imageButton11, imageButton12
        )


        object : CountDownTimer(70000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                countDown.text = "" + millisUntilFinished / 1000
            }

            override fun onFinish() {
                countDown.text = "0"
            }

        }.start()

        arrayImage.forEachIndexed { index, imageButton ->
            imageButton.setOnClickListener {
                imageButton.startAnimation(animation1)
                when (index) {
                    0 -> {
                        counter++
                        index1 = index
                        resultImage++
                    }
                    1 -> {
                        index1 = index
                        resultImage++
                        counter++
                    }
                    2 -> {
                        index1 = index
                        counter++
                        resultImage++
                    }
                    3 -> {
                        index1 = index
                        counter++
                        resultImage++
                    }
                    4 -> {
                        index1 = index
                        counter++
                        resultImage++
                    }
                    5 -> {
                        resultImage++
                        counter++
                        index1 = index
                    }
                    6 -> {
                        index1 = index
                        counter++
                        resultImage++
                    }
                    7 -> {
                        index1 = index
                        counter++
                        resultImage++
                    }
                    8 -> {
                        index1 = index
                        counter++
                        resultImage++
                    }
                    9 -> {
                        index1 = index
                        counter++
                        resultImage++
                    }
                    10 -> {
                        index1 = index
                        counter++
                        resultImage++
                    }
                    11 -> {
                        index1 = index
                        counter++
                        resultImage++
                    }

                }
            }
        }

    }

    override fun onAnimationStart(animation: Animation?) {

    }

    override fun onAnimationEnd(animation: Animation?) {
        when (index1) {
            0 -> {
                imageButton1.setImageResource(R.drawable.ic_i1)
                imageButton1.startAnimation(animation2)
            }
            1 -> {
                imageButton2.setImageResource(R.drawable.ic_i2)
                imageButton2.startAnimation(animation2)
            }
            2 -> {
                imageButton3.setImageResource(R.drawable.ic_i3)
                imageButton3.startAnimation(animation2)
            }
            3 -> {
                imageButton4.setImageResource(R.drawable.ic_i4)
                imageButton4.startAnimation(animation2)
            }
            4 -> {
                imageButton5.setImageResource(R.drawable.ic_i5)
                imageButton5.startAnimation(animation2)
            }
            5 -> {
                imageButton6.setImageResource(R.drawable.ic_i1)
                imageButton6.startAnimation(animation2)
            }
            6 -> {
                imageButton7.setImageResource(R.drawable.ic_i3)
                imageButton7.startAnimation(animation2)
            }
            7 -> {
                imageButton8.setImageResource(R.drawable.ic_i2)
                imageButton8.startAnimation(animation2)
            }
            8 -> {
                imageButton9.setImageResource(R.drawable.ic_i5)
                imageButton9.startAnimation(animation2)
            }
            9 -> {
                imageButton10.setImageResource(R.drawable.ic_i4)
                imageButton10.startAnimation(animation2)
            }
            10 -> {
                imageButton11.setImageResource(R.drawable.ic_i6)
                imageButton11.startAnimation(animation2)
            }
            11 -> {
                imageButton12.setImageResource(R.drawable.ic_i6)
                imageButton12.startAnimation(animation2)
            }

        }

        animation2?.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {

            }

            override fun onAnimationEnd(animation: Animation?) {
                if (counter == 1) {
                    first = index1
                    list = listOf(arrayImage[first])
                }
                if (counter == 2) {
                    second = index1
                    if (arrayImage[first].drawable.constantState == arrayImage[second].drawable.constantState &&
                        arrayImage[first].id != arrayImage[index1].id
                    ) {
                        arrayImage[first].startAnimation(animation3)
                        arrayImage[first].visibility = View.INVISIBLE
                        arrayImage[second].startAnimation(animation3)
                        arrayImage[second].visibility = View.INVISIBLE
                        three++
                    } else if (arrayImage[first].id != arrayImage[index1].id) {
                        Thread.sleep(400)
                        arrayImage[first].setImageResource(R.drawable.ic_light_bulb)
                        arrayImage[first].startAnimation(animation2)
                        arrayImage[second].setImageResource(R.drawable.ic_light_bulb)
                        arrayImage[second].startAnimation(animation2)
                        four++
                    } else if (arrayImage[first].id == arrayImage[index1].id) {
                        arrayImage[second].setImageResource(R.drawable.ic_light_bulb)
                        arrayImage[second].startAnimation(animation2)
                    }
                    counter = 0
                }


                if (countDown.text != "0") {
                    if (three == 12 && four == 0) {
                        firstText.startAnimation(animation3)
                        Toast.makeText(
                            applicationContext,
                            "Urrra g'alaba!!!",
                            Toast.LENGTH_LONG
                        )
                        var intent = Intent(this@MyMemoryActivity, SecondMemoryActivity::class.java)
                        startActivity(intent)
//                        text2.visibility = View.INVISIBLE
                    } else if (three == 12 && four > 0) {
                        firstText.startAnimation(animation3)
                        Toast.makeText(
                            applicationContext,
                            "Afsuski xatolar bor!!!",
                            Toast.LENGTH_LONG
                        )
                        var intent = Intent(this@MyMemoryActivity, SecondMemoryActivity::class.java)
                        startActivity(intent)
                        countDown.visibility = View.INVISIBLE
//                        image3.visibility = View.INVISIBLE

                    }
                } else if (countDown.text == "0" && three != 12) {
                    textName.startAnimation(animation3)
                    Toast.makeText(
                        applicationContext,
                        "Exxxx mag'lubiyat",
                        Toast.LENGTH_LONG
                    )
                    var intent = Intent(this@MyMemoryActivity, ThreeMemoryActivity::class.java)
                    startActivity(intent)
                }
            }

            override fun onAnimationRepeat(animation: Animation?) {

            }

        })
    }

    override fun onAnimationRepeat(animation: Animation?) {

    }
}
