package ca.mcgill.ecse321.eventregistration.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;
import javax.persistence.ManyToOne;

@Entity
public class Event{
private String name;
   
   public void setName(String value) {
this.name = value;
    }
@Id
public String getName() {
return this.name;
    }
private Date eventDate;

public void setEventDate(Date value) {
this.eventDate = value;
    }
public Date getEventDate() {
return this.eventDate;
    }
private Time startTime;

public void setStartTime(Time value) {
this.startTime = value;
    }
public Time getStartTime() {
return this.startTime;
    }
private Time endTime;

public void setEndTime(Time value) {
this.endTime = value;
    }
public Time getEndTime() {
return this.endTime;
    }
private RegistrationManager registrationManager;

@ManyToOne(optional=false)
public RegistrationManager getRegistrationManager() {
   return this.registrationManager;
}

public void setRegistrationManager(RegistrationManager registrationManager) {
   this.registrationManager = registrationManager;
}
public void setDate(Date date) {
	// TODO Auto-generated method stub
	
}

}
