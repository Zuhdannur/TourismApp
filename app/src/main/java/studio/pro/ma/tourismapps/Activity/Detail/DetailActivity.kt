package studio.pro.ma.tourismapps.Activity.Detail

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.graphics.Palette
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail.*
import studio.pro.ma.tourismapp.Model.Tourism
import studio.pro.ma.tourismapps.Activity.TourGuideActivity
import studio.pro.ma.tourismapps.R

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        init()
        if(intent.extras != null){
            val bundle = intent.extras
            for(data:Tourism in initData()){
                if(data.id === bundle.getInt("id")){
                    Picasso.with(this).load(data.url).into(iv_header)
                    title_place.text = data.name
                    desc.text = data.des
                }
            }
        }
        btnTour.setOnClickListener {
            startActivity(Intent(this@DetailActivity,TourGuideActivity::class.java))
        }
    }
    fun init(){
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = ""
        var bitmap: Bitmap = BitmapFactory.decodeResource(getResources(),
            R.drawable.example_image)

        Palette.from(bitmap).generate(object : Palette.PaletteAsyncListener{
            override fun onGenerated(palette: Palette?) {
                val muted = palette!!.getMutedColor(R.attr.colorPrimary)
                collapsing.setContentScrimColor(muted)
            }

        })

    }

    fun initData() : ArrayList<Tourism>{
        var data : ArrayList<Tourism> = ArrayList()
        data.add(Tourism(1,"Kampung Barongsai","https://touredapi.derazu.tech/uploads/kampungbarongsai.jpg","Kawasan pemukiman etnis china selalu menampilkan pertunjukan barongsai lengkap dengan pembuatan barongsai."))
        data.add(Tourism(2,"Situs Sejarah Soekarno","https://touredapi.derazu.tech/uploads/situssejarahsoekarno.jpg","Situs ini awal mulanya ada sebuah penjara yang bernama Penjara Banceuy. Penjara Banceuy merupakan penjara di kota Bandung yang identik dengan Presiden Pertama Indonesia Soekarno, Aktivitas Soekarno di PNI menyebabkannya ditangkap Belanda pada bulan Desember 1929 dan dipenjara di Penjara Banceuy ini, sehingga Penjara ini identik dengan nama nya. \n Pada tahun 1983 penjara Banceuy pun dipindahkan ke Jalan Soekarno-Hatta. Lantaran semua tahu penjara itu pindahan dari Banceuy, orang masih saja menyebutnya Lapas Banceuy. Kemudian penjara Banceuy ini sendiri dibongkar untuk dijadikan komplek pertokoan dan disisakan hanyalah sel penjara Bung Karno dan menara pos penjaga saja. Perlahan, sebutan Penjara Banceuy pun hilang. Apalagi penjara di Banceuy kemudian dirobohkan untuk menjadi pusat perkantoran dan perbelanjaan bernama Banceuy Permai. Kawasan Banceuy sendiri kemudian lebih dikenal sebagai pusat elektronik, semacam Glodok-nya orang Bandung. \\n Di area monumen, pengunjung bisa membaca jejak sejarah Soekarno dalam merintis pergerakan kemerdekaan Republik Indonesia, juga tentunya sel asli berisi barang mock-up yang dulu pernah ada saat Soekarno di dalamnya."))
        data.add(Tourism(3,"Kampung Tahu","https://touredapi.derazu.tech/uploads/kampungtahu.jpg","Sebagian besar penduduk di wilayah tersebut bermata pencaharian membuat tahu yang akan didistribusikan se kota Bandung. \\n Walaupun sekarang banyak tahu made in Bandung, tahu cibuntu tetaplah jadi primadona dan menjadi andalan perekonomian penduduk Cibuntu. Anda bisa menemukan tahu cibuntu masih laris di pasar-pasar tradisional. Tahu dengan ciri warna kuning alami itu masih terus bertahan puluhan tahun (sekitar 30 tahunan). \\n Cibuntu, sebuah tempat di Kelurahan Babakan Ciparay, Kecamatan Bandung Kulon adalah sentra pembuat tahu. Bagi yang belum mengenal, Cibuntu terletak di daerah ke arah barat Bandung (dekat gerbang tol Pasirkoja, antara Jln. Soekarno-Hatta-Jln. Soedirman, menuju arah Jln. Holis/Jln. Elang/Cibeureum). \\n Para pelaku industri tahu di daerah ini sudah turun-temurun puluhan tahun yang lalu. Selain di pasar-pasar, tahu cibuntu juga tidak jarang didagangkan secara langsung oleh pedagang sayur atau pedagang tahu keliling (biasanya menggunakan sepeda). Tahu cibuntu memiliki keunggulan yang lebih dari tahu tahu yang lain, kelebihan tahu cibuntu ini tidak berbau, gurih alami, hal ini karena di buat secara manual dengan pengawasan ketat dan air yang digunakan untuk tahu cibuntu ini berasal dari air sumur/artesis yang berkualitas baik. Selain itu, tahu ini menggunakan pengawet alami koneng (kunyit). \\n Persaingan antara produsen tahu kini kian ketat. Banyak di antara para pedagang keliling yang kini juga beralih menjadi produsen dan memproduksi tahu sendiri dengan menyewa pabrik tahu untuk pembuatannya. Namun, persaingan tersebut masih bisa dibilang sehat. \"Kesehatan\" para perajin tahu justru kadang terganggu jika ada kenaikan harga kedelai. Namun, tahu cibuntu tetaplah eksis. Para pedagang batagor, tukang kupat tahu, hingga ibu-ibu masih mengandalkan tahu cibuntu sebagai bagian dari bahan makanan sehari-hari."))
        data.add(Tourism(4,"Dago Pojok","https://touredapi.derazu.tech/uploads/dagopojok.jpg","Kampung Dago Pojok bisa dibilang merupakan satu lagi bukti nyata betapa kreatifnya warga Bandung. Berawal dari keinginan untuk maju, warga kampung sekitar bahu-membahu membuat tempat tinggal mereka memiliki nilai lebih di mata wisatawan. Hasilnya, pengunjung kini terus ramai berdatangan. \\n Keberadaan Kampung Dago Pojok di Kelurahan Dago, Kecamatan Coblong tak bisa dilepaskan dari sosok seniman lokal bernama Rahmat Jabaril. Rahmat adalah seorang pemuda yang punya rasa apresiasi tinggi terhadap karya seni. Beberapa tahun silam, ia sempat prihatin melihat kampung tempat tinggalnya kurang berkembang. \\n Berawal dari hal tersebut, ditambah rasa cintanya terhadap karya seni, Rahmat lantas mencoba berinovasi dengan mempercantik dinding-dinding dan jalanan kampung. Rahmat tentunya tak berusaha seorang diri dalam menerapkan konsep Kampung Seni di Dago Pojok. Ia juga mendapat bantuan dari warga sekitar dan juga dinas pariwisata dan budaya setempat. Hasilnya, puluhan mural indah kini menghiasi dinding-dinding rumah warga. \\n Tak cuma sekedar menjadi galeri atas karya mural yang sudah dibuat para seniman lokal. Kampung Dago Pojok juga berperan aktif dalam menumbuhkan apresiasi seni di masyarakat. Pengunjung yang datang diajak menyelami langsung proses pembuatan karya dan juga proses berkesenian warga setempat."))
        data.add(Tourism(5,"Kampung Wayang","https://touredapi.derazu.tech/uploads/kampungwayang.jpg","Kecamatan Lengkong sejak beberapa tahun terakhir telah mencanangkan potensi RW 08, Jalan Pangaran, Kelurahan Cikawao menjadi Kampung Wayang Urban Urang Bandung.  Camat Lengkong, TB Agus Mulyadi mengungkapkan asal usul kampung wayang Urban ini telah berdiri sejak 1964. Konon, seorang warga asli Lengkong, Ruhiyat (Alm) yang mendirikan kampung tersebut. Kini, upaya mempertahankan budaya itu pun masih diteruskan oleh sang anak, Tatang yang konsisten menjadi pengrajin wayang golek urban.\n Selain itu, digagasnya Kampung Wayang Urban Urang Bandung ini bertujuan untuk membudayakan edukasi kepada anak-anak di wilayah Jalan Pangaran dan sekitarnya, agar lebih kenal dengan wayang. Bahkan diakui Agus, saat pulang sekolah, para pelajar sering mencoba membuat dan mewarnai wayang. \\n Bukan hanya itu, di Kampung Wayang Urban Urang Bandung tersebut juga dihasilkan berbagai hiasan sejenis seperti topeng, cenderamata, hingga berbagai souvenir khas lainnya, yang diharapkan bisa menjadi alternatif cendramata Kota Bandung."))
        return data
    }
}
