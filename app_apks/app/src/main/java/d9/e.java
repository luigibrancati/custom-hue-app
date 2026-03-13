package d9;

import android.content.Context;
import b9.C2898a;
import com.google.firebase.perf.v1.PerfMetric;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f33174a = Pattern.compile("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*");

    public static List a(PerfMetric perfMetric, Context context) {
        ArrayList arrayList = new ArrayList();
        if (perfMetric.hasTraceMetric()) {
            arrayList.add(new C3843d(perfMetric.getTraceMetric()));
        }
        if (perfMetric.hasNetworkRequestMetric()) {
            arrayList.add(new C3842c(perfMetric.getNetworkRequestMetric(), context));
        }
        if (perfMetric.hasApplicationInfo()) {
            arrayList.add(new C3840a(perfMetric.getApplicationInfo()));
        }
        if (perfMetric.hasGaugeMetric()) {
            arrayList.add(new C3841b(perfMetric.getGaugeMetric()));
        }
        return arrayList;
    }

    public static boolean b(PerfMetric perfMetric, Context context) {
        List listA = a(perfMetric, context);
        if (listA.isEmpty()) {
            C2898a.e().a("No validators found for PerfMetric.");
            return false;
        }
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            if (!((e) it.next()).c()) {
                return false;
            }
        }
        return true;
    }

    public static void d(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Attribute key must not be null or empty");
        }
        if (str2 == null || str2.length() == 0) {
            throw new IllegalArgumentException("Attribute value must not be null or empty");
        }
        if (str.length() > 40) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute key length must not exceed %d characters", 40));
        }
        if (str2.length() > 100) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute value length must not exceed %d characters", 100));
        }
        if (!f33174a.matcher(str).matches()) {
            throw new IllegalArgumentException("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
        }
    }

    public static String e(String str) {
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Metric name must not exceed %d characters", 100);
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (com.google.firebase.perf.util.b bVar : com.google.firebase.perf.util.b.values()) {
            if (bVar.toString().equals(str)) {
                return null;
            }
        }
        return "Metric name must not start with '_'";
    }

    public static String f(String str) {
        if (str == null) {
            return "Trace name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Trace name must not exceed %d characters", 100);
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (com.google.firebase.perf.util.c cVar : com.google.firebase.perf.util.c.values()) {
            if (cVar.toString().equals(str)) {
                return null;
            }
        }
        if (str.startsWith("_st_")) {
            return null;
        }
        return "Trace name must not start with '_'";
    }

    public abstract boolean c();
}
