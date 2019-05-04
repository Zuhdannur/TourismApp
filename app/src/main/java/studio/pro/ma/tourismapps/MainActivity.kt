package studio.pro.ma.tourismapps

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.content.ContextCompat
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import studio.pro.ma.tourismapps.Activity.HomeActivity
import studio.pro.ma.tourismapps.Activity.Login.LoginPresenter
import studio.pro.ma.tourismapps.Activity.Login.LoginView
import studio.pro.ma.tourismapps.Model.Responses.Result

class MainActivity : AppCompatActivity(),LoginView {
    override fun onLoading() {
    }

    override fun hideLoading() {
    }

    override fun showData(data: Result) {
        if(data.apiKey !== null){

        } else {
            Toast.makeText(this,"Failed To login!",Toast.LENGTH_LONG).show()
        }
    }
    lateinit var presenter:LoginPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initLayout()
        setContentView(R.layout.activity_main)

        presenter = LoginPresenter(this)

        btnSigIn.setOnClickListener {
            startActivity(Intent(this@MainActivity, HomeActivity::class.java))
        }
    }

    public fun signIn(view: View){
        setVisible(singView)
        setInvisible(singUpView)
        setColorPrimary(singIn)
        setDefaultColor(singUp)
    }

    public fun signUp(view: View){
        setVisible(singUpView)
        setInvisible(singView)
        setColorPrimary(singUp)
        setDefaultColor(singIn)
    }

    fun setVisible(view: View){
        view.visibility = View.VISIBLE
    }
    fun setInvisible(view: View){
        view.visibility = View.INVISIBLE
    }

    fun setColorPrimary(view: TextView){
        view.setTextColor(ContextCompat.getColor(applicationContext,R.color.signColor))
    }
    fun setDefaultColor(view: TextView){
        view.setTextColor(resources.getColor(android.R.color.darker_gray))
    }
    fun initLayout(){
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
//        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
    }
}
