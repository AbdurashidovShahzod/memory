package uz.pdp.mymemorygame.game


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_my_memory_hard.*
import kotlinx.android.synthetic.main.activity_puzzle.*
import uz.pdp.mymemorygame.R

class MyMemoryHardActivity : AppCompatActivity(), Animation.AnimationListener {
    var animation1: Animation? = null
    var animation2: Animation? = null
    var animation3: Animation? = null
    var indexImage = 0
    var resultImage = 0
    var first = 0
    var second = 0
    var three = 0
    var four = 0
    var countable = 0
    private lateinit var list: List<ImageButton>
    private lateinit var arrayImage: List<ImageButton>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_memory_hard)
        animation1 = AnimationUtils.loadAnimation(this, R.anim.animation1)
        animation2 = AnimationUtils.loadAnimation(this, R.anim.animation2)
        animation3 = AnimationUtils.loadAnimation(this, R.anim.animation3)
        animation1?.setAnimationListener(this)

        arrayImage = listOf(
            img1, img2, img3, img4,
            img5, img6, img7, img8, img9,
            img10, img11, img12, img13, img14,
            img15, img16, img17, img18, img19,
            img20, img21, img22, img23, img24
        )


        object : CountDownTimer(100000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                countDownHard.text = "" + millisUntilFinished / 1000
            }

            override fun onFinish() {
                countDownHard.text = "0"
            }

        }.start()
        arrayImage.forEachIndexed { index, imageButton ->
            imageButton.setOnClickListener {
                imageButton.startAnimation(animation1)
                when (index) {
                    0 -> {
                        countable++
                        indexImage = index
                        resultImage++
                    }
                    1 -> {
                        indexImage = index
                        resultImage++
                        countable++
                    }
                    2 -> {
                        indexImage = index
                        countable++
                        resultImage++
                    }
                    3 -> {
                        indexImage = index
                        countable++
                        resultImage++
                    }
                    4 -> {
                        indexImage = index
                        countable++
                        resultImage++
                    }
                    5 -> {
                        resultImage++
                        countable++
                        indexImage = index
                    }
                    6 -> {
                        indexImage = index
                        countable++
                        resultImage++
                    }
                    7 -> {
                        indexImage = index
                        countable++
                        resultImage++
                    }
                    8 -> {
                        indexImage = index
                        countable++
                        resultImage++
                    }
                    9 -> {
                        indexImage = index
                        countable++
                        resultImage++
                    }
                    10 -> {
                        indexImage = index
                        countable++
                        resultImage++
                    }
                    11 -> {
                        indexImage = index
                        countable++
                        resultImage++
                    }
                    12 -> {
                        resultImage++
                        indexImage = index
                        countable++
                    }
                    13 -> {
                        indexImage = index
                        countable++
                        resultImage++
                    }
                    14 -> {
                        indexImage = index
                        countable++
                        resultImage++
                    }
                    15 -> {
                        resultImage++
                        indexImage = index
                        countable++
                    }
                    16 -> {
                        indexImage = index
                        countable++
                        resultImage++
                    }
                    17 -> {
                        indexImage = index
                        countable++
                        resultImage++
                    }
                    18 -> {
                        indexImage = index
                        countable++
                        resultImage++
                    }
                    19 -> {
                        indexImage = index
                        countable++
                        resultImage++
                    }
                    20 -> {
                        indexImage = index
                        countable++
                        resultImage++
                    }
                    21 -> {
                        indexImage = index
                        countable++
                        resultImage++
                    }
                    22 -> {
                        indexImage = index
                        countable++
                        resultImage++
                    }
                    23 -> {
                        resultImage++
                        indexImage = index
                        countable++
                    }
                }
            }
        }

    }

    override fun onAnimationStart(animation: Animation?) {

    }

    override fun onAnimationEnd(animation: Animation?) {
        when (indexImage) {
            0 -> {
                img1.setImageResource(R.drawable.ic_i1)
                img1.startAnimation(animation2)
            }
            1 -> {
                img2.setImageResource(R.drawable.ic_i2)
                img2.startAnimation(animation2)
            }
            2 -> {
                img3.setImageResource(R.drawable.ic_i3)
                img3.startAnimation(animation2)
            }
            3 -> {
                img4.setImageResource(R.drawable.ic_i4)
                img4.startAnimation(animation2)
            }
            4 -> {
                img5.setImageResource(R.drawable.ic_i5)
                img5.startAnimation(animation2)
            }
            5 -> {
                img6.setImageResource(R.drawable.ic_i1)
                img6.startAnimation(animation2)
            }
            6 -> {
                img7.setImageResource(R.drawable.ic_i3)
                img7.startAnimation(animation2)
            }
            7 -> {
                img8.setImageResource(R.drawable.ic_i2)
                img8.startAnimation(animation2)
            }
            8 -> {
                img9.setImageResource(R.drawable.ic_i5)
                img9.startAnimation(animation2)
            }
            9 -> {
                img10.setImageResource(R.drawable.ic_i4)
                img10.startAnimation(animation2)
            }
            10 -> {
                img11.setImageResource(R.drawable.ic_i6)
                img11.startAnimation(animation2)
            }
            11 -> {
                img12.setImageResource(R.drawable.ic_i6)
                img12.startAnimation(animation2)
            }
            12 -> {
                img13.setImageResource(R.drawable.ic_7)
                img13.startAnimation(animation2)
            }
            13 -> {
                img14.setImageResource(R.drawable.ic_8)
                img14.startAnimation(animation2)
            }
            14 -> {
                img15.setImageResource(R.drawable.ic_7)
                img15.startAnimation(animation2)
            }
            15 -> {
                img16.setImageResource(R.drawable.ic_9)
                img16.startAnimation(animation2)
            }
            16 -> {
                img17.setImageResource(R.drawable.ic_8)
                img17.startAnimation(animation2)
            }
            17 -> {
                img18.setImageResource(R.drawable.ic_11)
                img18.startAnimation(animation2)
            }
            18 -> {
                img19.setImageResource(R.drawable.ic_10)
                img19.startAnimation(animation2)
            }
            19 -> {
                img20.setImageResource(R.drawable.ic_9)
                img20.startAnimation(animation2)
            }
            20 -> {
                img21.setImageResource(R.drawable.ic_10)
                img21.startAnimation(animation2)
            }
            21 -> {
                img22.setImageResource(R.drawable.ic_12)
                img22.startAnimation(animation2)
            }
            22 -> {
                img23.setImageResource(R.drawable.ic_11)
                img23.startAnimation(animation2)
            }
            23 -> {
                img24.setImageResource(R.drawable.ic_12)
                img24.startAnimation(animation2)
            }
        }
        animation2?.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {

            }

            override fun onAnimationEnd(animation: Animation?) {
                if (countable == 1) {
                    first = indexImage
                    list = listOf(arrayImage[first])
                }
                if (countable == 2) {
                    second = indexImage
                    if (arrayImage[first].drawable.constantState == arrayImage[second].drawable.constantState &&
                        arrayImage[first].id != arrayImage[indexImage].id
                    ) {
                        arrayImage[first].startAnimation(animation3)
                        arrayImage[first].visibility = View.INVISIBLE
                        arrayImage[second].startAnimation(animation3)
                        arrayImage[second].visibility = View.INVISIBLE
                        three++
                    } else if (arrayImage[first].id != arrayImage[indexImage].id) {
                        Thread.sleep(400)
                        arrayImage[first].setImageResource(R.drawable.ic_light_bulb)
                        arrayImage[first].startAnimation(animation2)
                        arrayImage[second].setImageResource(R.drawable.ic_light_bulb)
                        arrayImage[second].startAnimation(animation2)
                        four++
                    } else if (arrayImage[first].id == arrayImage[indexImage].id) {
                        arrayImage[second].setImageResource(R.drawable.ic_light_bulb)
                        arrayImage[second].startAnimation(animation2)
                    }
                    countable = 0
                }


                if (countDownHard.text != "0") {
                    if (three == 12 && four == 0) {
                        txt.startAnimation(animation3)
                        Toast.makeText(
                            applicationContext,
                            "Urrra g'alaba!!!",
                            Toast.LENGTH_LONG
                        )
                        var intent =
                            Intent(this@MyMemoryHardActivity, SecondMemoryActivity::class.java)
                        startActivity(intent)
                        countDownHard.visibility = View.INVISIBLE
                    } else if (three == 12 && four > 0) {
                        txt.startAnimation(animation3)
                        Toast.makeText(
                            applicationContext,
                            "Afsuski xatolar bor!!!",
                            Toast.LENGTH_LONG
                        )
                        var intent =
                            Intent(this@MyMemoryHardActivity, SecondMemoryActivity::class.java)
                        startActivity(intent)
                        countDownHard.visibility = View.INVISIBLE

                    }
                } else if (countDownHard.text == "0" && three != 12) {
                    txt.startAnimation(animation3)
                    Toast.makeText(
                        applicationContext,
                        "Exxxx mag'lubiyat",
                        Toast.LENGTH_LONG
                    )
                    var intent = Intent(this@MyMemoryHardActivity, ThreeMemoryActivity::class.java)
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