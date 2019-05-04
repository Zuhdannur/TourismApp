package studio.pro.ma.tourismapps.Activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_book.*
import studio.pro.ma.tourismapp.Model.Guide
import studio.pro.ma.tourismapps.R

class BookActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)
        init()
        if(intent.extras != null){

            var data = initGuide()
            val bundle = intent.extras
            Picasso.with(this).load(data[bundle.getInt("position")].url).into(iv_header)
            title_guide.text = data[bundle.getInt("position")].name
            price.text = "Start From Rp "+data[bundle.getInt("position")].price + " /Day"
            desc.text  = data[bundle.getInt("position")].des
        }
        btnTour.setOnClickListener {
            startActivity(Intent(this@BookActivity,PaymentActivity::class.java))
        }
    }

    fun init(){
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    fun initGuide() : ArrayList<Guide>{
        var data : ArrayList<Guide> = ArrayList()
        data.add(
            Guide(1,"Donald Trump","https://thenypost.files.wordpress.com/2018/08/081418-trump-feature.jpg?quality=90&strip=all&w=618&h=410&crop=1","Saya adalah orang bertipe pekerja keras,tekun dan percaya diri dalam melakukan segala sesuatu,sehingga dari SD sampai SMK selalu masuk dalam 5 besar juara kelas,\n" +
                    "Dalam urusan pekerjaan saya sangat profesional,teliti dan bertanggung jawab .\n" +
                    "Dapat bekerja baik dalam tim maupun individu.        \n" +
                    "Menerima kritik yang membangun dan senang untuk terus belajar.",200000)
        )
        data.add(
            Guide(2,"James Brockmolde","https://news.nd.edu/assets/113411/james_brockmole_300.jpg","Saya adalah orang bertipe pekerja keras,tekun dan percaya diri dalam melakukan segala sesuatu,sehingga dari SD sampai SMK selalu masuk dalam 5 besar juara kelas,\n" +
                    "Dalam urusan pekerjaan saya sangat profesional,teliti dan bertanggung jawab .\n" +
                    "Dapat bekerja baik dalam tim maupun individu.        \n" +
                    "Menerima kritik yang membangun dan senang untuk terus belajar.",150000)
        )
        data.add(
            Guide(3,"Decker","https://news.stanford.edu/wp-content/uploads/sites/2/2016/10/Decker.jpg","Saya adalah orang bertipe pekerja keras,tekun dan percaya diri dalam melakukan segala sesuatu,sehingga dari SD sampai SMK selalu masuk dalam 5 besar juara kelas,\n" +
                    "Dalam urusan pekerjaan saya sangat profesional,teliti dan bertanggung jawab .\n" +
                    "Dapat bekerja baik dalam tim maupun individu.        \n" +
                    "Menerima kritik yang membangun dan senang untuk terus belajar.",80000)
        )
        data.add(
            Guide(4,"Roy","https://www.gannett-cdn.com/-mm-/ca811f813c992a0e5a2abc6796ca33b3cc74d726/c=0-6-154-211/local/-/media/2015/10/02/Poughkeepsie/B9319016391Z.1_20151002114850_000_GGAC3DL2J.1-0.jpg?width=534&height=712&fit=crop","Saya adalah orang bertipe pekerja keras,tekun dan percaya diri dalam melakukan segala sesuatu,sehingga dari SD sampai SMK selalu masuk dalam 5 besar juara kelas,\n" +
                    "Dalam urusan pekerjaan saya sangat profesional,teliti dan bertanggung jawab .\n" +
                    "Dapat bekerja baik dalam tim maupun individu.        \n" +
                    "Menerima kritik yang membangun dan senang untuk terus belajar.",20000)
        )
        data.add(
            Guide(5,"Selena","https://bqhfpnuv66xza-cdn-storage.azureedge.net/cache/4/8/4/9/9/d/48499d1b39bb5edf93e5be28f6ae6a76581087bc.jpg","Saya adalah orang bertipe pekerja keras,tekun dan percaya diri dalam melakukan segala sesuatu,sehingga dari SD sampai SMK selalu masuk dalam 5 besar juara kelas,\n" +
                    "Dalam urusan pekerjaan saya sangat profesional,teliti dan bertanggung jawab .\n" +
                    "Dapat bekerja baik dalam tim maupun individu.        \n" +
                    "Menerima kritik yang membangun dan senang untuk terus belajar.",60000)
        )
        return data
    }
}
