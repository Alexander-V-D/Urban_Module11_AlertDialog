package com.example.urban_module11_alertdialog

import android.content.Context
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AlertDialog

class MyDialog {
    companion object {
        fun createDialog(context: Context, adapter: ArrayAdapter<User>) =
            AdapterView.OnItemClickListener { _, _, position, _ ->
                val builder = AlertDialog.Builder(context)
                builder.setTitle("Внимание")
                    .setMessage("Удалить пользователя?")
                    .setPositiveButton("Да") { _, _ ->
                        val user = adapter.getItem(position)
                        adapter.remove(user)
                    }
                    .setNegativeButton("Нет") { dialog, _ ->
                        dialog.cancel()
                    }
                    .show()
            }
    }
}