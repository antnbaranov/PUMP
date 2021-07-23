package com.example.openpumpcategorypump.api


import com.google.gson.annotations.SerializedName

data class apiItem(
    @SerializedName("ath") //абсолютный максимум
    var ath: Int,
    @SerializedName("ath_change_percentage")
    var athChangePercentage: Double,
    @SerializedName("ath_date")
    var athDate: String,
    @SerializedName("atl") //абсолютный минимум
    var atl: Double,
    @SerializedName("atl_change_percentage")
    var atlChangePercentage: Double,
    @SerializedName("atl_date")
    var atlDate: String,
    @SerializedName("circulating_supply") //циркулирующее предложение
    var circulatingSupply: Double,
    @SerializedName("current_price")
    var currentPrice: Int,
    @SerializedName("fully_diluted_valuation")
    var fullyDilutedValuation: Long,
    @SerializedName("high_24h")
    var high24h: Int,
    @SerializedName("id")
    var id: String,
    @SerializedName("image")
    var image: String,
    @SerializedName("last_updated")
    var lastUpdated: String,
    @SerializedName("low_24h")
    var low24h: Int,
    @SerializedName("market_cap")
    var marketCap: Long,
    @SerializedName("market_cap_change_24h")
    var marketCapChange24h: Long,
    @SerializedName("market_cap_change_percentage_24h")
    var marketCapChangePercentage24h: Double,
    @SerializedName("market_cap_rank")
    var marketCapRank: Int,
    @SerializedName("max_supply")
    var maxSupply: Double,
    @SerializedName("name")
    var name: String,
    @SerializedName("price_change_24h")
    var priceChange24h: Double,
    @SerializedName("price_change_percentage_24h")
    var priceChangePercentage24h: Double,
    @SerializedName("roi") //коэфициент доходности
    var roi: Any,
    @SerializedName("symbol")
    var symbol: String,
    @SerializedName("total_supply")
    var totalSupply: Double,
    @SerializedName("total_volume")
    var totalVolume: Long
)