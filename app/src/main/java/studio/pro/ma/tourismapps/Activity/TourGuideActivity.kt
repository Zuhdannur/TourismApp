package studio.pro.ma.tourismapps.Activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_tour_guide.*
import studio.pro.ma.tourismapp.Model.Guide
import studio.pro.ma.tourismapps.Adapter.GridViewAdapter
import studio.pro.ma.tourismapps.Adapter.ViewPagerAdapter
import studio.pro.ma.tourismapps.R

class TourGuideActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tour_guide)
        var adapter = GridViewAdapter(this,initGuide())
        gridData.adapter = adapter
        gridData.setOnItemClickListener(object : AdapterView.OnItemClickListener{
            override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val bundle = Bundle()
                bundle.putInt("position",position)
                val intent = Intent(this@TourGuideActivity,BookActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }

        })
    }

    fun init(){
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = "Choose Your Tour Guide"



    }

    fun initGuide() : ArrayList<Guide>{
        var data : ArrayList<Guide> = ArrayList()
        data.add(Guide(1,"Donald Trump","https://thenypost.files.wordpress.com/2018/08/081418-trump-feature.jpg?quality=90&strip=all&w=618&h=410&crop=1","Saya adalah orang bertipe pekerja keras,tekun dan percaya diri dalam melakukan segala sesuatu,sehingga dari SD sampai SMK selalu masuk dalam 5 besar juara kelas,\n" +
                "Dalam urusan pekerjaan saya sangat profesional,teliti dan bertanggung jawab .\n" +
                "Dapat bekerja baik dalam tim maupun individu.        \n" +
                "Menerima kritik yang membangun dan senang untuk terus belajar.",200000))
        data.add(Guide(2,"James Brockmolde","https://news.nd.edu/assets/113411/james_brockmole_300.jpg","Saya adalah orang bertipe pekerja keras,tekun dan percaya diri dalam melakukan segala sesuatu,sehingga dari SD sampai SMK selalu masuk dalam 5 besar juara kelas,\n" +
                "Dalam urusan pekerjaan saya sangat profesional,teliti dan bertanggung jawab .\n" +
                "Dapat bekerja baik dalam tim maupun individu.        \n" +
                "Menerima kritik yang membangun dan senang untuk terus belajar.",150000))
        data.add(Guide(3,"Decker","https://news.stanford.edu/wp-content/uploads/sites/2/2016/10/Decker.jpg","Saya adalah orang bertipe pekerja keras,tekun dan percaya diri dalam melakukan segala sesuatu,sehingga dari SD sampai SMK selalu masuk dalam 5 besar juara kelas,\n" +
                "Dalam urusan pekerjaan saya sangat profesional,teliti dan bertanggung jawab .\n" +
                "Dapat bekerja baik dalam tim maupun individu.        \n" +
                "Menerima kritik yang membangun dan senang untuk terus belajar.",80000))
        data.add(Guide(4,"Roy","https://www.gannett-cdn.com/-mm-/ca811f813c992a0e5a2abc6796ca33b3cc74d726/c=0-6-154-211/local/-/media/2015/10/02/Poughkeepsie/B9319016391Z.1_20151002114850_000_GGAC3DL2J.1-0.jpg?width=534&height=712&fit=crop","Saya adalah orang bertipe pekerja keras,tekun dan percaya diri dalam melakukan segala sesuatu,sehingga dari SD sampai SMK selalu masuk dalam 5 besar juara kelas,\n" +
                "Dalam urusan pekerjaan saya sangat profesional,teliti dan bertanggung jawab .\n" +
                "Dapat bekerja baik dalam tim maupun individu.        \n" +
                "Menerima kritik yang membangun dan senang untuk terus belajar.",20000))
        data.add(Guide(5,"Selena","https://bqhfpnuv66xza-cdn-storage.azureedge.net/cache/4/8/4/9/9/d/48499d1b39bb5edf93e5be28f6ae6a76581087bc.jpg","Saya adalah orang bertipe pekerja keras,tekun dan percaya diri dalam melakukan segala sesuatu,sehingga dari SD sampai SMK selalu masuk dalam 5 besar juara kelas,\n" +
                "Dalam urusan pekerjaan saya sangat profesional,teliti dan bertanggung jawab .\n" +
                "Dapat bekerja baik dalam tim maupun individu.        \n" +
                "Menerima kritik yang membangun dan senang untuk terus belajar.",60000))
        return data
    }
}
