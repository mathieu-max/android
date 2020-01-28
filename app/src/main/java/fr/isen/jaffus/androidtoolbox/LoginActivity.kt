/*package fr.isen.jaffus.androidtoolbox

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_login.*

const val GOOD_IDENTIFIANT = "admin"
const val GOOD_MDP = "123"

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.contact_list_items.activity_login)

        val loggedInput: SharedPreferences = getSharedPreferences("LoggedInfo", Context.MODE_PRIVATE)
        val savedIdentifiant = SharedPreferences.getString("admin", "")
        val saveMdp = SharedPreferences.getString("123", "")

        if (savedIdentifiant == GOOD_IDENTIFIANT && saveMdp == GOOD_MDP) {
            goToHome(savedIdentifiant, true)
        }

        idButtonLog.setOnClickListener {
            loginButton(intent, loggedInput)
        }
    }

        fun loginButton(intent: Intent, loggedInput: SharedPreferences){
            if (GOOD_IDENTIFIANT == Ident && GOOD_MDP == mdp){
                saveUserCredential(ident, mdp)
                goToHome(ident, true)
            }
        }

    private fun saveUserCredential(identifiant: String, mdp: String){
        val editor = sharedPreferences.edit()
        editor.putString(USER_ID_KEY, identifiant)
        editor.putString(USER_PASS_KEY, mdp)
        editor.apply()
    }

    private fun goToHome(identifiant: String, mdp: string){
        val intent = Intent(this@LoginActivity, HomeActivity:class.java)
        intent.putExtra("strIdentifiant", identifiant)
        if (clearCache) intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP OR Intent.FLAG_ACTIVITY_NEW_TASK)
    }
}
*/