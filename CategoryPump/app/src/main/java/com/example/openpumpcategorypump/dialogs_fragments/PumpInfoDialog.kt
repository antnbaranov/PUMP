package com.example.openpumpcategorypump.dialogs_fragments

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.example.openpumpcategorypump.R
import java.lang.IllegalStateException

class PumpInfoDialog : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        return activity?.let {
            val builder = AlertDialog.Builder(it)

            builder.setMessage("По истечении таймера, мы показываем лучшую валюту недели, выбранную в результате голосования пользователей, с ссылкой на ее покупку на маркете")
                .setTitle("Памп")
                .setPositiveButton("OK",
                    DialogInterface.OnClickListener { dialog, id ->
                        dialog.cancel()
                        dialog.dismiss()
                    })
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }

}