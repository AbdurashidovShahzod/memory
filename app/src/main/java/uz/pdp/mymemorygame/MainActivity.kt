package uz.pdp.mymemorygame


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
import uz.pdp.mymemorygame.game.SecondMemoryActivity
import uz.pdp.mymemorygame.game.ThreeMemoryActivity

class MainActivity : AppCompatActivity(), Animation.AnimationListener {
    private var animation1: Animation? = null
    private var animation2: Animation? = null
    private var animation3: Animation? = null
    private var indexImage = 0
    private var resultImage = 0
    private var first = 0
    private var second = 0
    private var three = 0
    private var four = 0
    private var countablee = 0
    private lateinit var list: List<ImageButton>
    private lateinit var arrayImage: List<ImageButton>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_memory_hard)
        Toast.makeText(
            this,
            "Sizga 20s vaqt belgilandi undan keyin hard bosqichiga o'tasiz",
            Toast.LENGTH_LONG
        ).show()

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


        object : CountDownTimer(60000, 1000) {
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
                        countablee++
                        indexImage = index
                        resultImage++
                    }
                    1 -> {
                        indexImage = index
                        resultImage++
                        countablee++
                    }
                    2 -> {
                        indexImage = index
                        countablee++
                        resultImage++
                    }
                    3 -> {
                        indexImage = index
                        countablee++
                        resultImage++
                    }
                    4 -> {
                        indexImage = index
                        countablee++
                        resultImage++
                    }
                    5 -> {
                        resultImage++
                        countablee++
                        indexImage = index
                    }
                    6 -> {
                        indexImage = index
                        countablee++
                        resultImage++
                    }
                    7 -> {
                        indexImage = index
                        countablee++
                        resultImage++
                    }
                    8 -> {
                        indexImage = index
                        countablee++
                        resultImage++
                    }
                    9 -> {
                        indexImage = index
                        countablee++
                        resultImage++
                    }
                    10 -> {
                        indexImage = index
                        countablee++
                        resultImage++
                    }
                    11 -> {
                        indexImage = index
                        countablee++
                        resultImage++
                    }
                    12 -> {
                        resultImage++
                        indexImage = index
                        countablee++
                    }
                    13 -> {
                        indexImage = index
                        countablee++
                        resultImage++
                    }
                    14 -> {
                        indexImage = index
                        countablee++
                        resultImage++
                    }
                    15 -> {
                        resultImage++
                        indexImage = index
                        countablee++
                    }
                    16 -> {
                        indexImage = index
                        countablee++
                        resultImage++
                    }
                    17 -> {
                        indexImage = index
                        countablee++
                        resultImage++
                    }
                    18 -> {
                        indexImage = index
                        countablee++
                        resultImage++
                    }
                    19 -> {
                        indexImage = index
                        countablee++
                        resultImage++
                    }
                    20 -> {
                        indexImage = index
                        countablee++
                        resultImage++
                    }
                    21 -> {
                        indexImage = index
                        countablee++
                        resultImage++
                    }
                    22 -> {
                        indexImage = index
                        countablee++
                        resultImage++
                    }
                    23 -> {
                        resultImage++
                        indexImage = index
                        countablee++
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
                if (countablee == 1) {
                    first = indexImage
                    list = listOf(arrayImage[first])
                }
                if (countablee == 2) {
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
                        Thread.sleep(200)
                        arrayImage[first].setImageResource(R.drawable.ic_light_bulb)
                        arrayImage[first].startAnimation(animation2)
                        arrayImage[second].setImageResource(R.drawable.ic_light_bulb)
                        arrayImage[second].startAnimation(animation2)
                        four++
                    } else if (arrayImage[first].id == arrayImage[indexImage].id) {
                        arrayImage[second].setImageResource(R.drawable.ic_light_bulb)
                        arrayImage[second].startAnimation(animation2)
                    }
                    countablee = 0
                }


                if (countDownHard.text != "0") {
                    if (three == 12 && four == 0) {
//                        textName.startAnimation(anim3)
                        Toast.makeText(
                            applicationContext,
                            "Juda zur siz hammasini bir urunishda topdingiz!",
                            Toast.LENGTH_LONG
                        )
                        var intent = Intent(this@MainActivity, SecondMemoryActivity::class.java)
                        startActivity(intent)
                        countDownHard.visibility = View.INVISIBLE
                    } else if (three == 12 && four > 0) {
                        Toast.makeText(
                            applicationContext,
                            "Siz $four ta xato qildingiz!",
                            Toast.LENGTH_LONG
                        )
                        var intent = Intent(this@MainActivity, SecondMemoryActivity::class.java)
                        startActivity(intent)
                        countDownHard.visibility = View.INVISIBLE


                    }
                } else if (countDownHard.text == "0" && three != 12) {
                    Toast.makeText(
                        applicationContext,
                        "Ishtirok uchun kattaraxmat Afsuski siz yutqazdingiz!",
                        Toast.LENGTH_LONG
                    )
                    var intent = Intent(this@MainActivity, ThreeMemoryActivity::class.java)
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
