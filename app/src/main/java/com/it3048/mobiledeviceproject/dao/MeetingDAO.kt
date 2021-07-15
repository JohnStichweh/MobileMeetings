package com.it3048.mobiledeviceproject.dao

import com.it3048.mobiledeviceproject.dto.Meeting
import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface MeetingDAO {
    @Insert
    fun createMeeting(meetings: Meeting)

    @Query("SELECT * FROM meetings")
    fun getAll(): LiveData<List<Meeting>>

    @Query("SELECT * FROM meetings WHERE meetingCode LIKE :meetingCode")
    fun getMeetingDetails(meetingCode: String): Meeting
}