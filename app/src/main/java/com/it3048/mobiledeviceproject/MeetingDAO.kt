package com.it3048.mobiledeviceproject

import java.text.DateFormat

data class MeetingDAO(
    var meetingTitle: String,
    var meetingDate: DateFormat,
    var meetingDescription: String,
    var meetingLocLink: String
) {
}