package apextechies.sadf

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Window
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_signup.*

class AfterSplash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aftersplash)

        newuser.setOnClickListener {
            startActivity(Intent(this, SignUp::class.java))
        }
    }
}