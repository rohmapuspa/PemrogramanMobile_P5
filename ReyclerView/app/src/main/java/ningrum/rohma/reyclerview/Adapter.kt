package ningrum.rohma.reyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list.*
import kotlinx.android.synthetic.main.list.view.*

class Adapter (private val list: ArrayList<Users>) :  RecyclerView.Adapter<Adapter.Holder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
            return Holder(LayoutInflater.from(parent.context).inflate(R.layout.list, parent,false))
        }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.view.lbList.text= list.get(position).name
        }
    class Holder(val view: View) : RecyclerView.ViewHolder(view)
    }