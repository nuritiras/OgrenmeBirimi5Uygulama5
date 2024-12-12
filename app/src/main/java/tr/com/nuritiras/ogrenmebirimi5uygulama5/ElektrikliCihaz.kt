package tr.com.nuritiras.ogrenmebirimi5uygulama5

class ElektrikliCihaz {
    var cihazAdi: String? = null
    var cihazKW: Int? = null
    var gunlukSaatKullanim: Int? = null
    fun aylikTuketim():Int {
        return cihazKW!! * gunlukSaatKullanim!!*30
    }
}