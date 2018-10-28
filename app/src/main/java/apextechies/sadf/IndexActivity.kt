package apextechies.sadf

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_index.*

class IndexActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_index)

        payTV.setOnClickListener {
            startActivity(Intent(this, PayActivity::class.java))
        }
    }
}