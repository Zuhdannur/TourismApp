package studio.pro.ma.tourismapps.Model

import io.realm.RealmObject
import ninja.sakib.pultusorm.annotations.AutoIncrement
import ninja.sakib.pultusorm.annotations.PrimaryKey

class Transaction : RealmObject() {
    @PrimaryKey
    var idTransaction: Int = 0
    var nameGuide: String? = null
    var priceGuide: Int? = null
    var place: String? = null
    var pricePlace: Int? = null
    var paymentMethod: String? = null
}