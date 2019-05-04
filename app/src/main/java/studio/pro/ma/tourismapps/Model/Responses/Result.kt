package studio.pro.ma.tourismapps.Model.Responses

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Result {
    @SerializedName("id")
    @Expose
    open val id: Int? = null
    @SerializedName("profile_picture")
    @Expose
    open val profilePicture: String? = null
    @SerializedName("username")
    @Expose
    open val username: String? = null
    @SerializedName("email")
    @Expose
    open val email: String? = null
    @SerializedName("password")
    @Expose
    open val password: String? = null
    @SerializedName("api_key")
    @Expose
    open val apiKey: String? = null
    @SerializedName("point")
    @Expose
    open val point: Any? = null
}