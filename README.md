# MobileMeetings

Bradon Zachary\
Sara Barnes\
Chevaux Beasley\
Ruairi Blake\
Mark Rankey


## Introduction
Do you have trouble keeping track of meetings and events? Are you often confused about where or within what application a meeting will take place? (App name) can help you:
* Schedule meetings and events
* Remember the details of upcoming meetings and events
* RSVP to a meeting or event

Create a calendar on your Android device. Get notifications reminding you of upcoming meetings and events. View details of meetings and events. Respond to meetings and events with “Able to attend”, “Unable to attend”, or “Might be able to attend”.

## Storyboard
<img width="221" alt="Storyboard" src="https://user-images.githubusercontent.com/47151930/120106480-0c5b5a00-c12b-11eb-99cf-66b9a6c08b49.PNG">
[Storyboard](https://projects.invisionapp.com/prototype/MobileMeetings-Storyboard-ckpb84jqb0045i901s8itkwb2/play/6702777a)

## Functional Requirements

### Requirement 100.0 Schedule meeting or event
#### Scenario
As a user interested in scheduling meetings or events, I want to be able to schedule a meeting or event

#### Dependencies
Calendar data

#### Assumptions
Language set to English

#### Examples
1.1

**Given** I want to schedule a meeting

**When** I schedule a meeting at 3pm on July 20th using Zoom

**Then** This meeting should appear in my calendar:

Date: July 20th, Time 3:00pm, Location: Zoom

1.2

**Given** I want to schedule an event

**When** I schedule an event for noon on August 12th at Summit Park

**Then** This event should appear in my calendar:

Date: August 12th, Time: 12:00pm, Location: Summit Park

### Requirement 101 View upcoming meetings and events
#### Scenario
As a user with potential upcoming meetings or events, I want to be able to view my upcoming meetings and events

#### Dependencies
Calendar data

#### Assumptions
Language set to English

#### Examples
1.1

**Given** Calendar data is accessible

**When** I view my upcoming meetings/events for the day

**Then** I should see all of my upcoming meetings/events for the day

1.2

**Given** Calendar data is accessible

**When** I view my upcoming meetings/events for the week

**Then** I should see all of my upcoming meetings/events for the week

1.3

**Given** Calendar data is accessible

**When** I view my upcoming meetings/events for the month

**Then** I should see all of my upcoming meetings/events for the month


### Requirement 102 RSVP to upcoming meetings and events
#### Scenario
As a user with upcoming meetings or events, I want to be able to RSVP to my upcoming meetings and events

#### Dependencies
Calendar data

#### Assumptions
Language set to English

#### Examples
1.1

**Given** Calendar data is accessible

**When** I RSVP to someone's meeting/event

**Then** The owner of the meeting/event should see that I have RSVPd

1.2

**Given** Calendar data is accessible

**When** I decline someone's meeting/event

**Then** The owner of the meeting/event should see that I have declined and it should be removed from my calendar


## Class Diagram

![MobileMeetings Class Diagram](images/Mobile%20Meetings%20Class%20Diagram.png)

## Class Diagram Description

- **MainActivity**: The first screen a user sees, this will show an empty calendar, an option to create a new meeting, and the option to create an account.
- **RetrofitClientInstance**: Bootstrap class required for Retrofit.
- **MeetingDetailActivity**: A screen that will provide users with details of a meeting.
- **Calendar**: Noun that represents a date.
- **Meeting**: Noun that represents a meeting.
- **User**: Noun that represents a user.
- **ICalendarDAO**: Interface for Retrofit to find and parse Calendar JSON.
- **INewMeetingsDAO**: Interface for Room to persist meeting Data.
- **INewUserDAO**: Interface for Room to persist User Data.

## A Product Backlog
(see projects)

## kanban board
(see projects)

## Scrum Roles
- ProductOwner/Scrum Master: Brandon Zachary
- DevOps: Sara Barnes, Mark Rankey
- Frontend Developers: Ruairi Blake, Chevaux Beasley
- Backend Developer: Ruairi Blake

## Link to Standup

Friday at 5 PM. Use this Teams Link:

[Teams Meeting](https://teams.microsoft.com/dl/launcher/launcher.html?url=%2F_%23%2Fl%2Fmeetup-join%2F19%3Ameeting_OTNmZWYzZjItYWU3ZC00MzU1LTgzZTgtMjA0YTIwM2VhNWJm%40thread.v2%2F0%3Fcontext%3D%257b%2522Tid%2522%253a%2522f5222e6c-5fc6-48eb-8f03-73db18203b63%2522%252c%2522Oid%2522%253a%2522bb098382-c32b-4c7f-b88e-38b615eafb9b%2522%257d%26anon%3Dtrue&type=meetup-join&deeplinkId=b7dca148-db2a-41e2-a958-008e2b935268&directDl=true&msLaunch=true&enableMobilePage=true&suppressPrompt=true)
