package studio.pro.ma.tourismapps.Fragment

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_references.view.*
import studio.pro.ma.tourismapps.BlogActivity

import studio.pro.ma.tourismapps.R


class ReferencesFragment : Fragment() {
    // TODO: Rename and change types of parameters
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_references, container, false)
        view.post.setOnClickListener {
            startActivity(Intent(context,BlogActivity::class.java))
        }
        return view
    }

    // TODO: Rename method, update argument and hook method into UI event

}
