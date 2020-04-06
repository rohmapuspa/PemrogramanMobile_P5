package ningrum.rohma.reyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list.view.*

class Adapter (private val exampleList: List<Users>) :
    RecyclerView.Adapter<Adapter.ExampleViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
            val itemView = LayoutInflater.from(parent.context).inflate(
                R.layout.list,
                parent, false
            )
            return ExampleViewHolder(itemView)
        }

        override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
            val currentItem = exampleList[position]

            holder.imageView.setImageResource(currentItem.imageResource)
            holder.textView1.text = currentItem.text1
        }

        override fun getItemCount() = exampleList.size

        class ExampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val imageView: ImageView = itemView.image_view
            val textView1: TextView = itemView.text_view_1
              }
    }