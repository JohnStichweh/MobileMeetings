package com.it3048.mobiledeviceproject.dto

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo
/**
 * @param meetingCode: unique ID
 * @param meetingTitle: name of meeting
 * @param meetingColor: color code for meeting display
 * @param meetingDate: Date/time of meeting
 * @param meetingDescription: short description of meeting
 * @param meetingLocLink: location of meeting or link to meeting
 */
@Entity(tableName = "meetings")
data class Meeting (
    @PrimaryKey var meetingCode: Int,
    @ColumnInfo(name = "meetingTitle") var meetingTitle: String,
    @ColumnInfo(name = "meetingColor") var meetingColor: String,
    @ColumnInfo(name = "meetingDate") var meetingDate: String,
    @ColumnInfo(name = "meetingDescription") var meetingDescription: String,
    @ColumnInfo(name = "meetingLocLink") var meetingLocLink: String) {
    override fun toString(): String {
        return meetingTitle
    }
}