package com.ozanyazici.retrofitcompose.service

import com.ozanyazici.retrofitcompose.model.CryptoModel
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {
    //https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/master/crypto.json
    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    fun getData() : Call<List<CryptoModel>>
    //asıl amaç compose ile örnek yapmak olduğu için burada rxjava ve coroutine kullanmayıp basit olsun diye retrofitin call unu kullanıyoruz.


}