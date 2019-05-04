package studio.pro.ma.tourismapps.Adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import studio.pro.ma.tourismapps.Fragment.Payment.PaymentFirstFragment
import studio.pro.ma.tourismapps.Fragment.Payment.PaymentSecondFragment
import studio.pro.ma.tourismapps.Fragment.Payment.PaymentThirdFragment

class ViewPagerAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm) {
    private val pages = listOf(
        PaymentFirstFragment(),
        PaymentSecondFragment(),
        PaymentThirdFragment()
    )
    override fun getItem(p0: Int): Fragment {
        return pages[p0]
    }

    override fun getCount(): Int {
        return pages.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Detail"
            1 -> "Payment"
            else -> "Finish"
        }
    }
}