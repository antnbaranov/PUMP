package com.example.openpumpcategorypump.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.openpumpcategorypump.R
import com.example.openpumpcategorypump.api.ApiInterface
import com.example.openpumpcategorypump.api.apiItem
import com.example.openpumpcategorypump.dialogs_fragments.PumpInfoDialog
import org.jetbrains.anko.doAsync
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PumpFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pump, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var vote_button: ImageView = view.findViewById(R.id.btn_vote_for_pump)
        var question_button: ImageView = view.findViewById(R.id.icon_question)

        question_button.setOnClickListener {
            showDialog()
        }
        vote_button.setOnClickListener {
            getData()
            Toast.makeText(context?.applicationContext, "Clicked Vote", Toast.LENGTH_SHORT).show()

        }
    }

    fun showDialog() {
        val dialogFragment = PumpInfoDialog()
        val manager = fragmentManager
        dialogFragment.show(manager!!, "dialog_pump_info")
    }

    private fun getData() {

        doAsync {
            var BASE_URL =
                "https://api.coingecko.com/api/v3/"
            val retrofitBuilder = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
                .create(ApiInterface::class.java)
            val retrofitData = retrofitBuilder.getData()
            retrofitData.enqueue(object : Callback<List<apiItem>?> {
                @SuppressLint("SetTextI18n")
                override fun onResponse(
                    call: Call<List<apiItem>?>,
                    response: Response<List<apiItem>?>
                ) {
                    val responseBody = response.body()!!
                    val myStringBuilder = StringBuilder()
                    for (myData in responseBody) {
                        myStringBuilder.append(myData.name)
                        myStringBuilder.append("\n")
                    }
                    var text: TextView = view!!.findViewById(R.id.text_waiting_pump)
                    text.text = myStringBuilder
                }

                override fun onFailure(call: Call<List<apiItem>?>, t: Throwable) {
                    Log.d("PumpFragment", "onFailure: " + t.message)
                }

            })
        }



    }

}