package studio.pro.ma.tourismapps.Activity.Login

import android.util.Log
import io.reactivex.schedulers.Schedulers
import studio.pro.ma.tourismapps.Api.ApiInterface

class LoginPresenter {
    lateinit var view:LoginView
    val api by lazy {
        ApiInterface.create()
    }
    constructor(view:LoginView){
        this.view =view
    }

    fun getData(email:String,password:String){
        api.login(email,password).subscribe({
            result ->
            if(result.status === "success"){
                view.showData(result!!.result!![0])
            }
        },{
            error->
            Log.e("error_mas",error.message)
        })
    }
}