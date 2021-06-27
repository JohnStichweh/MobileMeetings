package com.it3048.mobiledeviceproject

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.add_meeting_form.view.*

class AddMeetingForm: DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       var rootView: View = inflater.inflate(R.layout.add_meeting_form, container, false)

        rootView.cancelButton.setOnClickListener{
            dismiss()
            clearFields(rootView)
        }



        rootView.submitButton.setOnClickListener{
            //this is where the inputs get saved to state
            var meetingTitle = rootView.editTextMeetingTitle.text.toString()
            var meetingColor = rootView.meetingColor.selectedItem.toString()
            var meetingDate = rootView.meetingDate.text.toString()
            var meetingDescription = rootView.editTextDescripton.text.toString()
            var meetingLocLink = rootView.editTextLocLink.text.toString()

            Toast.makeText(context, "submitted", Toast.LENGTH_LONG).show()
            Log.i(meetingTitle, "meetingTitle")
            Log.i(meetingColor, "meetingColor")
            Log.i(meetingDate, "meetingDate")
            Log.i(meetingDescription, "meetingDescription")
            Log.i(meetingLocLink, "meetingLocLink")


            dismiss()
            clearFields(rootView)
        }



        return rootView
    }
    // clear the fields in the new meeting form
    private fun clearFields(rootView: View) {
        rootView.editTextMeetingTitle.setText("")
        rootView.meetingColor.selectedItem.toString()
        rootView.meetingDate.setText("")
        rootView.editTextDescripton.setText("")
        rootView.editTextLocLink.setText("")
    }
}