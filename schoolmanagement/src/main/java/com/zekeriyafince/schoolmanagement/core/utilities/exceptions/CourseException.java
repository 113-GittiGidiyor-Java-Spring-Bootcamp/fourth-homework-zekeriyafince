package com.zekeriyafince.schoolmanagement.core.utilities.exceptions;

public class CourseException extends RuntimeException {
    public int errorCode;

    public String errorMsg;

    public CourseException(int errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public CourseException(int errorCode) {
        this.errorCode = errorCode;
        if (ErrorCodes.ResultDesc.containsKey(Integer.valueOf(errorCode)))
            this.errorMsg = ErrorCodes.ResultDesc.get(Integer.valueOf(errorCode));
    }

}
