package studio.pro.ma.tourismapps.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_time_line.view.*
import studio.pro.ma.tourismapp.Model.Guide
import studio.pro.ma.tourismapps.R

class TimeLineAdapter(context: Context,data:ArrayList<Guide>) : RecyclerView.Adapter<TimeLineAdapter.ViewHolder>() {
    lateinit var context: Context
    lateinit var data: ArrayList<Guide>
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindItem(item:Guide,context: Context){
//            val mTimeLine = TimelineView(context)
        }
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): TimeLineAdapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_time_line,p0,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(p0: TimeLineAdapter.ViewHolder, p1: Int) {
        p0.bindItem(data[p1],context)
    }
}