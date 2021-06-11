package com.it3048.mobiledeviceproject

import android.content.DialogInterface
import android.os.Bundle
import android.view.ContextThemeWrapper
import android.widget.*
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.Spinner
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    var addMeetingForm = AddMeetingForm()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { addMeetingForm.show(supportFragmentManager, "addForm") }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

//    private fun addForm() {
//        val dialog: android.app.AlertDialog.Builder = android.app.AlertDialog.Builder(this)
//
//        //TODO: @RUAIRI create a style or layout for this form
////        val dialog: android.app.AlertDialog.Builder = android.app.AlertDialog.Builder(
////            ContextThemeWrapper(
////                this,
////                R.style.addForm
////            )
////        )
//
//        val colors = resources.getStringArray(R.array.colors)
//        //dialog.setMessage("Input meeting details")
//        dialog.setTitle("New Meeting")
//        val layout = LinearLayout(this)
//        layout.orientation = LinearLayout.VERTICAL
//
//        //TODO: @RUAIRI insert inputs here
//
//        //title
//        val meetingTitle = EditText(this)
//        meetingTitle.setSingleLine()
//        meetingTitle.hint = "Title"
//        layout.addView(meetingTitle)
//
//        //date/time
////        val today = Calendar.getInstance().time
////        val datePicker = DatePicker(
////            ContextThemeWrapper(
////                this,
////                R.style.datePicker
////            )
////        )
////        //datePicker.minDate = today
////        layout.addView(datePicker)
//
//        //description
//        val meetingDesc = EditText(this)
//        meetingDesc.hint = "Description"
//        layout.addView(meetingDesc)
//
//        //location/link
//        val meetingLoc = EditText(this)
//        meetingLoc.hint = "Location or link"
//        layout.addView(meetingLoc)
//
//        //color
//        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, colors)
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        val spinner = Spinner(this)
//        spinner.adapter = adapter
//        layout.addView(spinner)
//
//        dialog.setPositiveButton("Submit",
//            DialogInterface.OnClickListener { dialog, which ->
//                Toast.makeText(applicationContext, "Submitted", Toast.LENGTH_LONG)
//                    .show()
//            })
//        dialog.setNegativeButton("cancel",
//            DialogInterface.OnClickListener { dialog, which ->
//                Toast.makeText(applicationContext, "Cancelled", Toast.LENGTH_LONG)
//                    .show()
//            })
//        val alertDialog: android.app.AlertDialog? = dialog.create()
//        alertDialog?.setView(layout)
//        alertDialog?.show()
//    }
}