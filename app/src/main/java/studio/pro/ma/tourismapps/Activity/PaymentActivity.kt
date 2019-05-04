package studio.pro.ma.tourismapps.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_payment.*
import studio.pro.ma.tourismapps.Adapter.ViewPagerAdapter
import studio.pro.ma.tourismapps.R

class PaymentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        init()
    }

    fun init(){
        val adapter = ViewPagerAdapter(supportFragmentManager)
        viewPage.adapter = adapter

        viewPagerTab.setViewPager(viewPage)
    }
}
