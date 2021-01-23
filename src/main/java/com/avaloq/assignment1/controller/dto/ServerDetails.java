package com.avaloq.assignment1.controller.dto;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class ServerDetails {
    private String serverTime;
    private String serverDate;
    private String serverTimeZone;

    public ServerDetails() {
        this.serverTime = String.valueOf(System.nanoTime());
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        this.serverDate = dateFormat.format(new Date());
        this.serverTimeZone = Calendar.getInstance().getTimeZone().getID();
    }

    public void setServerTime(String serverTime) {
        this.serverTime = serverTime;
    }

    public void setServerDate(String serverDate) {
        this.serverDate = serverDate;
    }

    public void setServerTimeZone(String serverTimeZone) {
        this.serverTimeZone = serverTimeZone;
    }

    public String getServerTime() {
        return serverTime;
    }

    public String getServerDate() {
        return serverDate;
    }

    public String getServerTimeZone() {
        return serverTimeZone;
    }

    @Override
    public String toString() {
        return "ServerDetails{" +
                "serverTime='" + serverTime + '\'' +
                ", serverDate='" + serverDate + '\'' +
                ", serverTimeZone='" + serverTimeZone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServerDetails that = (ServerDetails) o;

        if (serverTime != null ? !serverTime.equals(that.serverTime) : that.serverTime != null) return false;
        if (serverDate != null ? !serverDate.equals(that.serverDate) : that.serverDate != null) return false;
        return serverTimeZone != null ? serverTimeZone.equals(that.serverTimeZone) : that.serverTimeZone == null;
    }

    @Override
    public int hashCode() {
        int result = serverTime != null ? serverTime.hashCode() : 0;
        result = 31 * result + (serverDate != null ? serverDate.hashCode() : 0);
        result = 31 * result + (serverTimeZone != null ? serverTimeZone.hashCode() : 0);
        return result;
    }
}
