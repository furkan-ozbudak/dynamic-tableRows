package com.furkan.tablelayouttest

import android.R.attr.left
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.ViewGroup.MarginLayoutParams
import android.widget.Space
import android.widget.TableRow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(view : View) {
        val tableRow = TableRow(applicationContext)
        var layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
        tableRow.setPadding(tableRow.paddingLeft,28, tableRow.paddingRight, tableRow.paddingBottom)
        tableRow.layoutParams = layoutParams
        var versionNewText = TextView(this)
        versionNewText.setText(versionTextBox.text)
        versionNewText.setBackgroundColor(Color.parseColor("#C73355"))
        var codenameNewText = TextView(this)
        codenameNewText.setText("|${codenameTextBox.text}")
        codenameNewText.setBackgroundColor(Color.parseColor("#C73355"))
        tableRow.addView(versionNewText)
        tableRow.addView(codenameNewText)
        tableLayout.addView(tableRow)




//        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
//        params.setMargins(10,10,10,10);
//        tv1.setLayoutParams(params)
    }


}
