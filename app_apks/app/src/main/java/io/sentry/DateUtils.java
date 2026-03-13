package io.sentry;

import io.sentry.vendor.gson.internal.bind.util.ISO8601Utils;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class DateUtils {
    private DateUtils() {
    }

    public static long dateToNanos(Date date) {
        return millisToNanos(date.getTime());
    }

    public static double dateToSeconds(Date date) {
        return millisToSeconds(date.getTime());
    }

    public static BigDecimal doubleToBigDecimal(Double d10) {
        return BigDecimal.valueOf(d10.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public static Date getCurrentDateTime() {
        return Calendar.getInstance(ISO8601Utils.TIMEZONE_UTC).getTime();
    }

    public static Date getDateTime(String str) {
        try {
            return ISO8601Utils.parse(str, new ParsePosition(0));
        } catch (ParseException unused) {
            throw new IllegalArgumentException("timestamp is not ISO format " + str);
        }
    }

    public static Date getDateTimeWithMillisPrecision(String str) {
        try {
            return getDateTime(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException("timestamp is not millis format " + str);
        }
    }

    public static String getTimestamp(Date date) {
        return ISO8601Utils.format(date, true);
    }

    public static long millisToNanos(long j10) {
        return j10 * 1000000;
    }

    public static double millisToSeconds(double d10) {
        return d10 / 1000.0d;
    }

    public static Date nanosToDate(long j10) {
        return getDateTime(Double.valueOf(nanosToMillis(j10)).longValue());
    }

    public static double nanosToMillis(double d10) {
        return d10 / 1000000.0d;
    }

    public static double nanosToSeconds(long j10) {
        return j10 / 1.0E9d;
    }

    public static long secondsToNanos(long j10) {
        return j10 * 1000000000;
    }

    public static Date toUtilDate(SentryDate sentryDate) {
        if (sentryDate == null) {
            return null;
        }
        return toUtilDateNotNull(sentryDate);
    }

    public static Date toUtilDateNotNull(SentryDate sentryDate) {
        return nanosToDate(sentryDate.nanoTimestamp());
    }

    public static Date getDateTime(long j10) {
        Calendar calendar = Calendar.getInstance(ISO8601Utils.TIMEZONE_UTC);
        calendar.setTimeInMillis(j10);
        return calendar.getTime();
    }
}
