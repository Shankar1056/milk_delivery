package apextechies.sadf

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_pay.*

class PayActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pay)

        preapaidTV.setOnClickListener {
            startActivity(Intent(this, PrePayActivity::class.java))
        }
        postpaidTV.setOnClickListener {
            startActivity(Intent(this, PackagePayActivity::class.java))
        }
    }
}