package studio.pro.ma.tourismapps.Model


import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_discover.view.*
import studio.pro.ma.tourismapp.Adapter.GuideAdapter
import studio.pro.ma.tourismapp.Adapter.TourismAdapter
import studio.pro.ma.tourismapp.Model.Guide
import studio.pro.ma.tourismapp.Model.Tourism
import studio.pro.ma.tourismapps.Adapter.TimeLineAdapter

import studio.pro.ma.tourismapps.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class DiscoverFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_discover, container, false)
        initRecylerView(view)
        return view
    }


    fun init() : ArrayList<Tourism>{
        var data : ArrayList<Tourism> = ArrayList()
        data.add(Tourism(1,"Kampung Barongsai","https://touredapi.derazu.tech/uploads/kampungbarongsai.jpg","Kawasan pemukiman etnis china selalu menampilkan pertunjukan barongsai lengkap dengan pembuatan barongsai."))
        data.add(Tourism(2,"Situs Sejarah Soekarno","https://touredapi.derazu.tech/uploads/situssejarahsoekarno.jpg","Situs ini awal mulanya ada sebuah penjara yang bernama Penjara Banceuy. Penjara Banceuy merupakan penjara di kota Bandung yang identik dengan Presiden Pertama Indonesia Soekarno, Aktivitas Soekarno di PNI menyebabkannya ditangkap Belanda pada bulan Desember 1929 dan dipenjara di Penjara Banceuy ini, sehingga Penjara ini identik dengan nama nya. \\n Pada tahun 1983 penjara Banceuy pun dipindahkan ke Jalan Soekarno-Hatta. Lantaran semua tahu penjara itu pindahan dari Banceuy, orang masih saja menyebutnya Lapas Banceuy. Kemudian penjara Banceuy ini sendiri dibongkar untuk dijadikan komplek pertokoan dan disisakan hanyalah sel penjara Bung Karno dan menara pos penjaga saja. Perlahan, sebutan Penjara Banceuy pun hilang. Apalagi penjara di Banceuy kemudian dirobohkan untuk menjadi pusat perkantoran dan perbelanjaan bernama Banceuy Permai. Kawasan Banceuy sendiri kemudian lebih dikenal sebagai pusat elektronik, semacam Glodok-nya orang Bandung. \\n Di area monumen, pengunjung bisa membaca jejak sejarah Soekarno dalam merintis pergerakan kemerdekaan Republik Indonesia, juga tentunya sel asli berisi barang mock-up yang dulu pernah ada saat Soekarno di dalamnya."))
        data.add(Tourism(3,"Kampung Tahu","https://touredapi.derazu.tech/uploads/kampungtahu.jpg","Sebagian besar penduduk di wilayah tersebut bermata pencaharian membuat tahu yang akan didistribusikan se kota Bandung. \\n Walaupun sekarang banyak tahu made in Bandung, tahu cibuntu tetaplah jadi primadona dan menjadi andalan perekonomian penduduk Cibuntu. Anda bisa menemukan tahu cibuntu masih laris di pasar-pasar tradisional. Tahu dengan ciri warna kuning alami itu masih terus bertahan puluhan tahun (sekitar 30 tahunan). \\n Cibuntu, sebuah tempat di Kelurahan Babakan Ciparay, Kecamatan Bandung Kulon adalah sentra pembuat tahu. Bagi yang belum mengenal, Cibuntu terletak di daerah ke arah barat Bandung (dekat gerbang tol Pasirkoja, antara Jln. Soekarno-Hatta-Jln. Soedirman, menuju arah Jln. Holis/Jln. Elang/Cibeureum). \\n Para pelaku industri tahu di daerah ini sudah turun-temurun puluhan tahun yang lalu. Selain di pasar-pasar, tahu cibuntu juga tidak jarang didagangkan secara langsung oleh pedagang sayur atau pedagang tahu keliling (biasanya menggunakan sepeda). Tahu cibuntu memiliki keunggulan yang lebih dari tahu tahu yang lain, kelebihan tahu cibuntu ini tidak berbau, gurih alami, hal ini karena di buat secara manual dengan pengawasan ketat dan air yang digunakan untuk tahu cibuntu ini berasal dari air sumur/artesis yang berkualitas baik. Selain itu, tahu ini menggunakan pengawet alami koneng (kunyit). \\n Persaingan antara produsen tahu kini kian ketat. Banyak di antara para pedagang keliling yang kini juga beralih menjadi produsen dan memproduksi tahu sendiri dengan menyewa pabrik tahu untuk pembuatannya. Namun, persaingan tersebut masih bisa dibilang sehat. \"Kesehatan\" para perajin tahu justru kadang terganggu jika ada kenaikan harga kedelai. Namun, tahu cibuntu tetaplah eksis. Para pedagang batagor, tukang kupat tahu, hingga ibu-ibu masih mengandalkan tahu cibuntu sebagai bagian dari bahan makanan sehari-hari."))
        data.add(Tourism(4,"Dago Pojok","https://touredapi.derazu.tech/uploads/dagopojok.jpg","Kampung Dago Pojok bisa dibilang merupakan satu lagi bukti nyata betapa kreatifnya warga Bandung. Berawal dari keinginan untuk maju, warga kampung sekitar bahu-membahu membuat tempat tinggal mereka memiliki nilai lebih di mata wisatawan. Hasilnya, pengunjung kini terus ramai berdatangan. \\n Keberadaan Kampung Dago Pojok di Kelurahan Dago, Kecamatan Coblong tak bisa dilepaskan dari sosok seniman lokal bernama Rahmat Jabaril. Rahmat adalah seorang pemuda yang punya rasa apresiasi tinggi terhadap karya seni. Beberapa tahun silam, ia sempat prihatin melihat kampung tempat tinggalnya kurang berkembang. \\n Berawal dari hal tersebut, ditambah rasa cintanya terhadap karya seni, Rahmat lantas mencoba berinovasi dengan mempercantik dinding-dinding dan jalanan kampung. Rahmat tentunya tak berusaha seorang diri dalam menerapkan konsep Kampung Seni di Dago Pojok. Ia juga mendapat bantuan dari warga sekitar dan juga dinas pariwisata dan budaya setempat. Hasilnya, puluhan mural indah kini menghiasi dinding-dinding rumah warga. \\n Tak cuma sekedar menjadi galeri atas karya mural yang sudah dibuat para seniman lokal. Kampung Dago Pojok juga berperan aktif dalam menumbuhkan apresiasi seni di masyarakat. Pengunjung yang datang diajak menyelami langsung proses pembuatan karya dan juga proses berkesenian warga setempat."))
        data.add(Tourism(5,"Kampung Wayang","https://touredapi.derazu.tech/uploads/kampungwayang.jpg","Kecamatan Lengkong sejak beberapa tahun terakhir telah mencanangkan potensi RW 08, Jalan Pangaran, Kelurahan Cikawao menjadi Kampung Wayang Urban Urang Bandung.  Camat Lengkong, TB Agus Mulyadi mengungkapkan asal usul kampung wayang Urban ini telah berdiri sejak 1964. Konon, seorang warga asli Lengkong, Ruhiyat (Alm) yang mendirikan kampung tersebut. Kini, upaya mempertahankan budaya itu pun masih diteruskan oleh sang anak, Tatang yang konsisten menjadi pengrajin wayang golek urban. \\n Selain itu, digagasnya Kampung Wayang Urban Urang Bandung ini bertujuan untuk membudayakan edukasi kepada anak-anak di wilayah Jalan Pangaran dan sekitarnya, agar lebih kenal dengan wayang. Bahkan diakui Agus, saat pulang sekolah, para pelajar sering mencoba membuat dan mewarnai wayang. \\n Bukan hanya itu, di Kampung Wayang Urban Urang Bandung tersebut juga dihasilkan berbagai hiasan sejenis seperti topeng, cenderamata, hingga berbagai souvenir khas lainnya, yang diharapkan bisa menjadi alternatif cendramata Kota Bandung."))
        return data
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


    fun initAdapterEvent() : ArrayList<Event>{
        var event = ArrayList<Event>()
        event.add(Event(1,"Liga Seni Budaya Kota Bandung", "http://jadwalevent.web.id/wp-content/uploads/2017/08/poster-liga-seni-budaya-ujung-berung.jpg","Liga seni budaya adalah sebuah acara tentang kesenian dan kebudayaan sunda yang di dalam nya terdapat kegiataan perlombaan helaran kesenian dan festival jaipong yang di ikuti oleh peserta dari perwakilan kecamatan se-kota Bandung. penilaian liga ini juga pun langsung di nilai oleh Dinas kebudyaan dan pariwisata kota Bandung dan Kompepar ( kelompok penggerak pariwisata ) Kota Bandung. Selain pagelaran helaran acara ini juga akan ada hiburan kontemporer serta kuliner tradisional dan non tradisional untuk memanjakan para pengunjung liga seni budaya. Acara liga seni budaya ini di selenggarakan secara roadshow di 6 tempat srategis dan puncak acara nya akan di selnggarakan di sepanjang jalan Asia Afrika – Bandung. untuk pembukaan acara ini akan di gelar di Taman alun-alun Ujungberung pada tanggal 19 – 20 agustus 2017 dan ikuti oleh peserta dari kecamataan ujungberung, Mandalajati, Arcamanik, Panyileukan,Cibiru, dan kecamataan Cinambo.",0,"19 - 20 Agustus 2019"))
        event.add(Event(2,"Festival Seni Budaya", "http://www.provoke-online.com/images/All_Articles/EVENT/gamarvani_sman_3_bandung/sman3.jpg","Buat lo yang bingung buat ngabisin malam minggu kalian pekan ini, acara keren garapannya temen-temen SMAN 3 Bandung bisa jadi soulusinya. Yup, tahun ini festival tersebut mereka beri nama GAMARVANI. Sebuah festival budaya yang memadukan antara seni kebudayaan tradisional dan modern. Festival tahunan ini mereka selenggarakan dalam rangka melestarikan dan menumbuhkan rasa kebanggaan masyarakat luas terhadap kebudayaan Jawa Barat, dan juga ikut memeriahkan perayaan ulang tahun Kota Bandung yang ke-205.\n" +
                "\n" +
                "Acaranya bakalan di gelar pada Sabtu, 19 September 2015 di Lapangan Bali, jalan Bali, Bandung. Nah,  kegiatan pokok yang dilaksanakan dalam acara ini antara lain upaya pencitraan budaya melalui suatu acara yang menarik dan interaktif bagi golongan muda. Dengan mengangkat tema legenda Jawa barat, Nyi Anteh dengan legendanya yang penuh klise, drama, dan juga pesan spititual tipikal cerita rakyat Jawa Barat.\n" +
                "\n" +
                "Dengan konsep yang nggak biasa, tentunya para pengisi acaranya pun nggak biasa dong. Nama-nama seperti HiVi dan Adera akan di sandingkan dengan Manggala Awi, Sasadana, dan juga Sobat Budaya. Belum lagi akan ada pementasan wayang golek oleh Giri Harja, pencak silat oleh perguruan Gadjah Putih Mega Pasksi Pusaka, dan masih banyak kesenian tradisional lainnya. Keren! Nah, kalau pengen dapet hiburan yang menyenagkan sekaligus bikin kita makin mengenal kebudayaan tradisional, siap-siap buat luangkan waktu akhir pekan kalian untuk berkunjung ke GAMARVANI!",40000,"19 - 20 Septemmber 2019"))
        event.add(Event(3,"CFD DAGO","http://yourbandung.com/wp-content/uploads/2018/07/IMG-20180721-WA0102.jpg","Akbar Bandung International Arts Festival (BIAF) kembali digelar. Acara yang telah berlangsung untuk keempat kalinya tersebut diselenggarakan atas kerja sama Masyarakat Seni Rakyat Indonesia (MaSRI) dengan Dinas Kebudayaan dan Pariwisata (Disbudpar) Kota Bandung, serta UPTD Pengelolaan Kebudayaan Daerah Jawa Barat.\n" +
                "\n" +
                "Untuk gelaran tahun ini, dengan mengusung tema “Seni, Doa, dan Alam”, agenda Bandung International Arts Festival akan berlangsung selama 27-29 Juli 2018 di berbagai ruang publik di bandung, seperti di Gedung Pengembangan Pusat Kebudayaan, Babakan Siliwangi, Curug Batu Templek, Cikapundung River Spot, dan Car Free Day dago. Acara Bandung International Arts Festival 2018 ini melibatkan pengisi acara yang berasal dari 11 daerah Kota/Kabupaten Provinsi (Indonesia) dan 10 Negara dengan beragam latar keseniannya.",0,"20 januari 2020"))
        event.add(Event(4,"Angklung Periode 6","http://jadwalevent.web.id/wp-content/uploads/2016/11/Angklung-Pride-6.jpg","]Angklung telah disahkan oleh UNESCO sebagai Intangible Cultural Heritage of Humanity sejak 16 November 2010. Untuk memaknai hari istimewa tersebut, Saung Angklung Udjo (SAU) sebagai salah satu komunitas angklung dan seni tradisional Jawa Barat setiap tahunnya menggelar rangkaian acara “Angklung Pride”.\n" +
                "\n" +
                "Tahun lalu, SAU diberi kehormatan sebagai perwakilan komunitas angklung untuk tampil di perhelatan 5 tahun pengesahan Angklung di kota Paris, Perancis. Pagelaran tersebut didukung oleh Kementerian Pendidikan dan Kebudayaan RI, Perwakilan UNESCO untuk Indonesia dan KBRI Paris. Untuk SAU sendiri, hal tersebut menjadi salah satu rangkaian acara Angklung Pride 5. Tahun ini, Saung Angklung Udjo akan kembali menggelar “Angklung Pride 6” yang akan berlangsung mulai tanggal 16 – 27 November 2016.\n" +
                "\n" +
                "Bersama tokoh masyarakat, budayawan, komunitas, sekolah-sekolah, dan warga sekitar dengan dukungan mitra, Angklung Pride 6 akan digelar dengan kegiatan sosial kemasyarakatan. Acara akan dimulai tanggal 16 hingga 27 November 2016, dengan rangkaian acara mini pameran angklung, pertunjukan khusus, serta penampilan komunitas dan kelompok angklung sekolah dalam pertunjukan reguler Saung Angklung Udjo.",0,"16 - 27 November 2019"))
        return event
    }

    fun initRecylerView(view:View){
//        pariwisata_location.addItemDecoration(DividerItemDecoration(this@HomeActivity,LinearLayoutManager.HORIZONTAL))
        var linearLayoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false)
        var adapter = TourismAdapter(context!!,init())
        var adapterGuide = GuideAdapter(context!!,initAdapterEvent())
//        var adapterTimeLine = TimeLineAdapter(context!!,initGuide())
        view.pariwisata_location.layoutManager = linearLayoutManager
        view.pariwisata_location.adapter = adapter
        linearLayoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false)
        view.list_guide.layoutManager = linearLayoutManager
        view.list_guide.adapter = adapterGuide
//        linearLayoutManager = LinearLayoutManager(context)
//        view.timeline.layoutManager = linearLayoutManager
//        view.timeline.adapter = adapterTimeLine


    }
}
