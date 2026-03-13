package com.braze.support;

import android.os.Build;
import android.os.SystemClock;
import com.braze.enums.BrazeDateFormat;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import fc.C4029l;
import fc.InterfaceC4028k;
import io.sentry.metrics.MetricsUnit;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\r\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0002\u001a\r\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0002\u001a\u0019\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u0010\u001a\u00020\b*\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013\u001aE\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a'\u0010\u001d\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0011\u0010\u001b\u001a\u00020\u000b*\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001f\u001a\u0011\u0010 \u001a\u00020\u0000*\u00020\u000b¢\u0006\u0004\b \u0010!\"\u001c\u0010#\u001a\n \"*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\"\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)\"!\u00101\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.¨\u00062"}, d2 = {"", "nowInSeconds", "()J", "", "nowInSecondsPrecise", "()D", "nowInMilliseconds", "nowInMillisecondsSystemClock", "", "Lcom/braze/enums/BrazeDateFormat;", "dateFormat", "Ljava/util/Date;", "parseDate", "(Ljava/lang/String;Lcom/braze/enums/BrazeDateFormat;)Ljava/util/Date;", "Ljava/util/TimeZone;", "timeZone", "formatDate", "(Ljava/util/Date;Lcom/braze/enums/BrazeDateFormat;Ljava/util/TimeZone;)Ljava/lang/String;", "formatDateNow", "(Lcom/braze/enums/BrazeDateFormat;)Ljava/lang/String;", "", "year", "month", MetricsUnit.Duration.DAY, "hours", "minutes", "seconds", "createDate", "(IIIIII)Ljava/util/Date;", "formatDateFromMillis", "(JLcom/braze/enums/BrazeDateFormat;Ljava/util/TimeZone;)Ljava/lang/String;", "(J)Ljava/util/Date;", "getTimeFromEpochInSeconds", "(Ljava/util/Date;)J", "kotlin.jvm.PlatformType", "UTC_TIME_ZONE", "Ljava/util/TimeZone;", "TAG", "Ljava/lang/String;", "", "shouldUseNetworkTimeClock", "Z", "Ljava/time/Clock;", "networkTimeClock$delegate", "Lfc/k;", "getNetworkTimeClock", "()Ljava/time/Clock;", "getNetworkTimeClock$annotations", "()V", "networkTimeClock", "android-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class DateTimeUtils {
    private static final TimeZone UTC_TIME_ZONE = TimeZone.getTimeZone("UTC");
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("DateTimeUtils");
    private static boolean shouldUseNetworkTimeClock = true;
    private static final InterfaceC4028k networkTimeClock$delegate = C4029l.b(new InterfaceC6082a() { // from class: s5.N
        @Override // vc.InterfaceC6082a
        public final Object invoke() {
            return SystemClock.currentNetworkTimeClock();
        }
    });

    public static final Date createDate(int i10, int i11, int i12, int i13, int i14, int i15) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        gregorianCalendar.setTimeZone(UTC_TIME_ZONE);
        Date time = gregorianCalendar.getTime();
        AbstractC4862t.d(time, "getTime(...)");
        return time;
    }

    public static /* synthetic */ Date createDate$default(int i10, int i11, int i12, int i13, int i14, int i15, int i16, Object obj) {
        if ((i16 & 8) != 0) {
            i13 = 0;
        }
        if ((i16 & 16) != 0) {
            i14 = 0;
        }
        if ((i16 & 32) != 0) {
            i15 = 0;
        }
        return createDate(i10, i11, i12, i13, i14, i15);
    }

    public static final String formatDate(Date date, BrazeDateFormat dateFormat, TimeZone timeZone) {
        AbstractC4862t.e(date, "<this>");
        AbstractC4862t.e(dateFormat, "dateFormat");
        AbstractC4862t.e(timeZone, "timeZone");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat.getFormat(), Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        String str = simpleDateFormat.format(date);
        AbstractC4862t.d(str, "format(...)");
        return str;
    }

    public static /* synthetic */ String formatDate$default(Date date, BrazeDateFormat brazeDateFormat, TimeZone timeZone, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            timeZone = UTC_TIME_ZONE;
        }
        return formatDate(date, brazeDateFormat, timeZone);
    }

    public static final String formatDateFromMillis(long j10, BrazeDateFormat dateFormat, TimeZone timeZone) {
        AbstractC4862t.e(dateFormat, "dateFormat");
        AbstractC4862t.e(timeZone, "timeZone");
        return formatDate(new Date(j10), dateFormat, timeZone);
    }

    public static /* synthetic */ String formatDateFromMillis$default(long j10, BrazeDateFormat brazeDateFormat, TimeZone timeZone, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            brazeDateFormat = BrazeDateFormat.ANDROID_LOGCAT;
        }
        if ((i10 & 2) != 0) {
            timeZone = TimeZone.getDefault();
        }
        return formatDateFromMillis(j10, brazeDateFormat, timeZone);
    }

    public static final String formatDateNow(BrazeDateFormat dateFormat) {
        AbstractC4862t.e(dateFormat, "dateFormat");
        Date dateCreateDate = createDate(nowInSeconds());
        TimeZone timeZone = TimeZone.getDefault();
        AbstractC4862t.d(timeZone, "getDefault(...)");
        return formatDate(dateCreateDate, dateFormat, timeZone);
    }

    private static final Clock getNetworkTimeClock() {
        return (Clock) networkTimeClock$delegate.getValue();
    }

    public static final long getTimeFromEpochInSeconds(Date date) {
        AbstractC4862t.e(date, "<this>");
        return TimeUnit.MILLISECONDS.toSeconds(date.getTime());
    }

    public static final long nowInMilliseconds() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (Build.VERSION.SDK_INT >= 33 && shouldUseNetworkTimeClock) {
                long jMillis = getNetworkTimeClock().millis();
                if (jMillis >= 1691768838316L) {
                    return jMillis;
                }
            }
            return jCurrentTimeMillis;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28624D, (Throwable) e10, false, new InterfaceC6082a() { // from class: s5.O
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return DateTimeUtils.nowInMilliseconds$lambda$1();
                }
            }, 8, (Object) null);
            shouldUseNetworkTimeClock = false;
            return jCurrentTimeMillis;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String nowInMilliseconds$lambda$1() {
        return "Error reading date and time from network. Using system time instead.";
    }

    public static final long nowInMillisecondsSystemClock() {
        return System.currentTimeMillis();
    }

    public static final long nowInSeconds() {
        return TimeUnit.MILLISECONDS.toSeconds(nowInMilliseconds());
    }

    public static final double nowInSecondsPrecise() {
        return nowInMilliseconds() / 1000.0d;
    }

    public static final Date parseDate(final String str, BrazeDateFormat dateFormat) throws Exception {
        AbstractC4862t.e(str, "<this>");
        AbstractC4862t.e(dateFormat, "dateFormat");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat.getFormat(), Locale.US);
        simpleDateFormat.setTimeZone(UTC_TIME_ZONE);
        try {
            Date date = simpleDateFormat.parse(str);
            AbstractC4862t.b(date);
            return date;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: s5.P
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return DateTimeUtils.parseDate$lambda$2(str);
                }
            }, 8, (Object) null);
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parseDate$lambda$2(String str) {
        return "Exception parsing date " + str + ". Returning null";
    }

    public static final Date createDate(long j10) {
        return new Date(j10 * 1000);
    }
}
