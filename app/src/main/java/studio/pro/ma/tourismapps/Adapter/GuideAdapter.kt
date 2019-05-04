package studio.pro.ma.tourismapp.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_guide.view.*
import studio.pro.ma.tourismapps.Model.Event
import studio.pro.ma.tourismapps.R

class GuideAdapter (context: Context, data:ArrayList<Event>) : RecyclerView.Adapter<GuideAdapter.ViewHolder>() {

    lateinit var data:ArrayList<Event>
    lateinit var context: Context
    init{
        this.data = data
        this.context = context
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bindItem(value: Event,context: Context){
            itemView.name_event.text = value.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GuideAdapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_guide,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: GuideAdapter.ViewHolder, position: Int) {
        holder.bindItem(data[position],context)
    }
}