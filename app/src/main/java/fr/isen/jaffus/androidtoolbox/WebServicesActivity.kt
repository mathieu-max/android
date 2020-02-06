/*package fr.isen.jaffus.androidtoolbox

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_home.view.*
import kotlinx.android.synthetic.main.contact_list_items.view.*
import kotlinx.android.synthetic.main.web_contact_list.view.*


class WebServicesActivity(private val items2 : List<Name>, val context: Context) : RecyclerView.Adapter<ViewHolderDos>() {

    private var list2:List<Name> = items2

    val url = "https://randomuser.me/api/?inc=email,location,picture,name"


    override fun onBindViewHolder(holder: ViewHolderDos, position: Int) {
        TODO("not implemented")
    }
    override fun getItemCount(): Int {
        return items2.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderDos {
        return ViewHolderDos(LayoutInflater.from(context).inflate(R.layout.web_contact_list, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolderDos, position: Int, payloads: MutableList<Any>) {
        holder.nomPerson.text = list2[position].last
        //holder.address.text = list[position].webaddress
        //holder.mail.text = list[position].webmail
        //holder.image.image = list[position].webimage
    }
}

class ViewHolderDos (view: View) : RecyclerView.ViewHolder(view) {
    val nomPerson: TextView = view.nomWeb
    //val address: TextView = view.addressWeb
    //val mail: TextView = view.mailWeb
    //val image: ImageView = view.imageWeb
}*/