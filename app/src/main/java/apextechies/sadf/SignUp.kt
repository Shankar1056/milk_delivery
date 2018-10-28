package apextechies.sadf

import android.content.Intent
import android.os.Bundle
import android.support.v4.content.res.ResourcesCompat
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_signup.*

class SignUp:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        fiveml.setTypeface(ResourcesCompat.getFont(this, R.font.typoupright_bt));
        oneLtrCB.setTypeface(ResourcesCompat.getFont(this, R.font.typoupright_bt));
        oneHalfLtrCB.setTypeface(ResourcesCompat.getFont(this, R.font.typoupright_bt));
        moremilkCB.setTypeface(ResourcesCompat.getFont(this, R.font.typoupright_bt));

        newuser.setOnClickListener {
            startActivity(Intent(this, IndexActivity::class.java))
        }
    }
}