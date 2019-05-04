package studio.pro.ma.tourismapps.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_detail_trip.view.*
import studio.pro.ma.tourismapp.Model.Guide
import studio.pro.ma.tourismapps.Activity.BookActivity
import studio.pro.ma.tourismapps.R

class GridViewAdapter(context: Context,data:ArrayList<Guide>) : BaseAdapter() {
    lateinit var context: Context
    lateinit var data: ArrayList<Guide>
    init{
        this.context = context
        this.data = data
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(context).inflate(R.layout.item_detail_trip,null)
        view.name_guide.text = data[position].name
        Picasso.with(context).load(data[position].url).into(view.guide_pic)
        view.price.text = "Rp."+data[position].price+",-"
        return view
    }

    override fun getItem(position: Int): Any {
        return null as Any
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return data.size
    }
}