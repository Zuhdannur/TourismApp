package studio.pro.ma.tourismapps.Activity.Login

import studio.pro.ma.tourismapps.Model.Responses.Result

interface LoginView {
    fun onLoading()
    fun hideLoading()
    fun showData(data:Result)
}