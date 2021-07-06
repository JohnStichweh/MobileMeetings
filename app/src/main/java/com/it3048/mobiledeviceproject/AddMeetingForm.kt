package com.it3048.mobiledeviceproject

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import dto.Meeting
import kotlinx.android.synthetic.main.add_meeting_form.*
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
            rootView.editTextMeetingTitle.setText("")
            rootView.meetingColor.selectedItem.toString()
            rootView.meetingDate.setText("")
            rootView.editTextDescripton.setText("")
            rootView.editTextLocLink.setText("")
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

        }

        return rootView

        submitButton.setOnClickListener(){
            saveMeeting()
        }
    }
    private fun saveMeeting() {
        var meeting = Meeting().apply{
            meetingTitle = editTextMeetingTitle.text.toString();
            color = meetingColor.selectedItem.toString();
            dateAndTime = meetingDate.text.toString();
            description = editTextDescripton.text.toString();
            location = editTextLocLink.text.toString();
        }

    }
}