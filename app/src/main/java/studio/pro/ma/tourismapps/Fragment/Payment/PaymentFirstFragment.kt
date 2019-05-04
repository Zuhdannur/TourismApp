package studio.pro.ma.tourismapps.Fragment.Payment

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_payment_first.view.*

import studio.pro.ma.tourismapps.R

//
class PaymentFirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val view = inflater.inflate(R.layout.fragment_payment_first, container, false)
        view.btnMakePayment.setOnClickListener {
           val fragment = fragmentManager!!.beginTransaction()
            fragment.replace(R.id.first_page,PaymentSecondFragment())
            fragment.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            fragment.addToBackStack(null)
            fragment.commit()
        }
        return view
    }

}
