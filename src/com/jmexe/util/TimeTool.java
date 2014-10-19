package com.jmexe.util;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Jmexe on 10/10/14.
 */
public class TimeTool {
    public static long GetUTC() {
        TimeZone timeZoneUTC = TimeZone.getTimeZone("UTC");
        Calendar cal = Calendar.getInstance(timeZoneUTC);
        cal.setTime(new Date());
        return cal.getTimeInMillis()/1000;
    }
}
