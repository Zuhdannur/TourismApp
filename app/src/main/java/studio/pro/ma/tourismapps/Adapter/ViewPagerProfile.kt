package studio.pro.ma.tourismapps.Adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import studio.pro.ma.tourismapp.Adapter.FragmentAdapter
import studio.pro.ma.tourismapps.Fragment.DetailProfile.FavFragment
import studio.pro.ma.tourismapps.Fragment.DetailProfile.ListTripFragment
import studio.pro.ma.tourismapps.Fragment.Payment.PaymentFirstFragment
import studio.pro.ma.tourismapps.Fragment.Payment.PaymentSecondFragment
import studio.pro.ma.tourismapps.Fragment.Payment.PaymentThirdFragment

class ViewPagerProfile(fm:FragmentManager) : FragmentPagerAdapter(fm) {
    private val pages = listOf(
        ListTripFragment(),
        FavFragment(),
        FavFragment()
    )
    override fun getItem(p0: Int): Fragment {
        return pages[p0]
    }

    override fun getCount(): Int {
        return pages.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "My Trip"
            1 -> "Favorit Trip"
            else -> "Balance Rp 250.000"
        }
    }
}