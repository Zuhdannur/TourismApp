package studio.pro.ma.tourismapps.Model.Responses

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class MessageResponses {
    @SerializedName("status")
    @Expose
    open val status: String? = null
    @SerializedName("message")
    @Expose
    open val message: String? = null
    @SerializedName("result")
    @Expose
    open val result: List<Result>? = null
}