package studio.pro.ma.tourismapps.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import kotlinx.android.synthetic.main.activity_home.*
import studio.pro.ma.tourismapps.Fragment.ProfileFragment
import studio.pro.ma.tourismapps.Fragment.ReferencesFragment
import studio.pro.ma.tourismapps.Model.DiscoverFragment
import studio.pro.ma.tourismapps.R

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        init()
        bot_nav_home.itemIconTintList= null
        bot_nav_home.setOnNavigationItemSelectedListener(mOnNavigationClick)
    }

    fun init(){
        supportFragmentManager.beginTransaction().replace(R.id.container, DiscoverFragment(),javaClass.simpleName).commit()
    }

    private val mOnNavigationClick = BottomNavigationView.OnNavigationItemSelectedListener{
            menu->
        when(menu.itemId){
            R.id.discover -> {
                val fragment = DiscoverFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container,fragment,fragment.javaClass.simpleName).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.rekomendasi_page -> {
                val fragment = ReferencesFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container,fragment,fragment.javaClass.simpleName).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.profile -> {
                val fragment = ProfileFragment()
                supportFragmentManager.beginTransaction().replace(R.id.container,fragment,fragment.javaClass.simpleName).commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
}
