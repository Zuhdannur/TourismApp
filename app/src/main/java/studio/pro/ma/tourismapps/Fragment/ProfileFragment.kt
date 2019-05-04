package studio.pro.ma.tourismapps.Fragment

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_payment.*
import kotlinx.android.synthetic.main.fragment_profile.view.*
import studio.pro.ma.tourismapps.Adapter.ViewPagerAdapter
import studio.pro.ma.tourismapps.Adapter.ViewPagerProfile

import studio.pro.ma.tourismapps.R

// TODO: Rename parameter arguments, choose names that match


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [ProfileFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [ProfileFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class ProfileFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        val adapter = ViewPagerProfile(childFragmentManager)
        view.viewPage.adapter = adapter

        view.viewPagerTab.setViewPager(viewPage)
        return view
    }


}
