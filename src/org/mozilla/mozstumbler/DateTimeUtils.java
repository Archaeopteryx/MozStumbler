package org.mozilla.mozstumbler;

import android.annotation.SuppressLint;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

@SuppressLint("SimpleDateFormat")
final class DateTimeUtils {
    private static final DateFormat mISO8601Format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");

    static final long MILLISECONDS_PER_DAY = 86400000; // milliseconds/day

    private DateTimeUtils() {
    }

    static String formatDate(Date date) {
        return mISO8601Format.format(date);
    }

    static String formatTime(long time) {
        return formatDate(new Date(time));
    }

    static String formatCurrentTime() {
        return formatTime(System.currentTimeMillis());
    }
}
