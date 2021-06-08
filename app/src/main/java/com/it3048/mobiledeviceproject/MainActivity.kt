package com.it3048.mobiledeviceproject

import android.content.DialogInterface
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { addForm() }
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

    private fun addForm() {
        val dialog: android.app.AlertDialog.Builder = android.app.AlertDialog.Builder(this)
        dialog.setMessage("Input meeting details")
        dialog.setTitle("New Meeting")
        //TODO: @RUAIRI insert inputs here
        //title
        //date/time
        //description
        //location/link
        //color

        dialog.setPositiveButton("Submit",
            DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(applicationContext, "Submitted", Toast.LENGTH_LONG)
                    .show()
            })
        dialog.setNegativeButton("cancel",
            DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(applicationContext, "Cancelled", Toast.LENGTH_LONG)
                    .show()
            })
        val alertDialog: android.app.AlertDialog? = dialog.create()
        alertDialog?.show()
    }
}