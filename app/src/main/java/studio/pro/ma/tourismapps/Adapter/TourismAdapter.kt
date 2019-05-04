package studio.pro.ma.tourismapp.Adapter

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.tourism_items.view.*
import studio.pro.ma.tourismapp.Model.Guide
import studio.pro.ma.tourismapp.Model.Tourism
import studio.pro.ma.tourismapps.Activity.Detail.DetailActivity
import studio.pro.ma.tourismapps.R

class TourismAdapter(context: Context,data:ArrayList<Tourism>) : RecyclerView.Adapter<TourismAdapter.ViewHolder>() {

    lateinit var data:ArrayList<Tourism>
    lateinit var context: Context
    init{
        this.data = data
        this.context = context
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindItem(value:Tourism,context: Context){
            Picasso.with(context).load(value.url).into(itemView.imagePariwisata)
            itemView.vication_name.text = value.name
            itemView.btnDetail.setOnClickListener {
                val bundle =Bundle()
                bundle.putInt("id",value.id)
                val intent = Intent(context,DetailActivity::class.java)
                intent.putExtras(bundle)
                context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TourismAdapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.tourism_items,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: TourismAdapter.ViewHolder, position: Int) {
        holder.bindItem(data[position],context)
    }
}