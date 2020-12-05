package uz.pdp.mymemorygame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*
import uz.pdp.mymemorygame.game.MyMemoryActivity
import uz.pdp.mymemorygame.game.MyMemoryHardActivity
import uz.pdp.mymemorygame.game.PuzzleActivity

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        playEasyBtn.setOnClickListener {
            startActivity(Intent(this, MyMemoryActivity::class.java))
        }
        playHardBtn.setOnClickListener {
            startActivity(Intent(this, MyMemoryHardActivity::class.java))
        }
        aboutBtn.setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }
        exitBtn.setOnClickListener {
            finish()
        }
    }
}