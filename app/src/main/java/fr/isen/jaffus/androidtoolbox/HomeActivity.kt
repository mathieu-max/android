package fr.isen.jaffus.androidtoolbox

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        idButtonCycle.setOnClickListener {
            startActivity( Intent (this@HomeActivity, LifeCycleActivity::class.java))
        }

        idSave.setOnClickListener {
            startActivity( Intent (this@HomeActivity, FormulaireActivity::class.java))
        }

        idBtnPermit.setOnClickListener {
            startActivity( Intent (this@HomeActivity, PermitActivity::class.java))
        }

        idBtnWebServices.setOnClickListener {
            startActivity( Intent (this@HomeActivity, WebServicesActivity::class.java))
        }

        idButtonDeco.setOnClickListener {
            setContentView(R.layout.activity_login)
            finish()
        }
    }
}
