package fr.isen.jaffus.androidtoolbox

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        idButton.setOnClickListener {
            val log = idLog.text.toString()
            val motdp = idMdp.text.toString()
            if(log.equals("admin") && motdp.equals("123")) {
                //val message = "GG"
                //Toast.makeText(this, message, Toast.LENGTH_LONG).show()
                startActivity( Intent (this@LoginActivity, HomeActivity::class.java))
            }
        }
    }
}
