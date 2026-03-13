package R6;

import K6.T;
import android.location.Location;
import android.os.Bundle;
import android.os.SystemClock;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DecimalFormat f14831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DecimalFormat f14832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final StringBuilder f14833c;

    static {
        Locale locale = Locale.ROOT;
        f14831a = new DecimalFormat(".000000", DecimalFormatSymbols.getInstance(locale));
        DecimalFormat decimalFormat = new DecimalFormat(".##", DecimalFormatSymbols.getInstance(locale));
        f14832b = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        f14833c = new StringBuilder();
    }

    public static StringBuilder a(Location location, StringBuilder sb2) {
        sb2.ensureCapacity(100);
        if (location == null) {
            sb2.append((String) null);
            return sb2;
        }
        sb2.append("{");
        sb2.append(location.getProvider());
        sb2.append(", ");
        if (R0.a.h(location)) {
            sb2.append("mock, ");
        }
        DecimalFormat decimalFormat = f14831a;
        sb2.append(decimalFormat.format(location.getLatitude()));
        sb2.append(",");
        sb2.append(decimalFormat.format(location.getLongitude()));
        if (location.hasAccuracy()) {
            sb2.append("±");
            sb2.append(f14832b.format(location.getAccuracy()));
            sb2.append("m");
        }
        if (location.hasAltitude()) {
            sb2.append(", alt=");
            DecimalFormat decimalFormat2 = f14832b;
            sb2.append(decimalFormat2.format(location.getAltitude()));
            if (R0.a.g(location)) {
                sb2.append("±");
                sb2.append(decimalFormat2.format(R0.a.d(location)));
            }
            sb2.append("m");
        }
        if (location.hasSpeed()) {
            sb2.append(", spd=");
            DecimalFormat decimalFormat3 = f14832b;
            sb2.append(decimalFormat3.format(location.getSpeed()));
            if (R0.a.f(location)) {
                sb2.append("±");
                sb2.append(decimalFormat3.format(R0.a.c(location)));
            }
            sb2.append("m/s");
        }
        if (location.hasBearing()) {
            sb2.append(", brg=");
            DecimalFormat decimalFormat4 = f14832b;
            sb2.append(decimalFormat4.format(location.getBearing()));
            if (R0.a.e(location)) {
                sb2.append("±");
                sb2.append(decimalFormat4.format(R0.a.a(location)));
            }
            sb2.append("°");
        }
        Bundle extras = location.getExtras();
        String string = extras != null ? extras.getString("floorLabel") : null;
        if (string != null) {
            sb2.append(", fl=");
            sb2.append(string);
        }
        Bundle extras2 = location.getExtras();
        String string2 = extras2 != null ? extras2.getString("levelId") : null;
        if (string2 != null) {
            sb2.append(", lv=");
            sb2.append(string2);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        sb2.append(", ert=");
        sb2.append(T.a(R0.a.b(location) + jCurrentTimeMillis));
        sb2.append('}');
        return sb2;
    }
}
