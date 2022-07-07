package com.moseswilliamsiii.myrestfulservice.exceptions;

import java.util.Date;

public class ExceptionResponse {
    //timestamp
    private Date timestamp;
    //message
    private String message;
    //detail
    private String details;

    public ExceptionResponse(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
