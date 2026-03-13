package d9;

import b9.C2898a;
import com.google.firebase.perf.v1.TraceMetric;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: d9.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3843d extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2898a f33172c = C2898a.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TraceMetric f33173b;

    public C3843d(TraceMetric traceMetric) {
        this.f33173b = traceMetric;
    }

    @Override // d9.e
    public boolean c() {
        if (!o(this.f33173b, 0)) {
            f33172c.j("Invalid Trace:" + this.f33173b.getName());
            return false;
        }
        if (!j(this.f33173b) || h(this.f33173b)) {
            return true;
        }
        f33172c.j("Invalid Counters for Trace:" + this.f33173b.getName());
        return false;
    }

    public final boolean g(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            try {
                e.d((String) entry.getKey(), (String) entry.getValue());
            } catch (IllegalArgumentException e10) {
                f33172c.j(e10.getLocalizedMessage());
                return false;
            }
        }
        return true;
    }

    public final boolean h(TraceMetric traceMetric) {
        return i(traceMetric, 0);
    }

    public final boolean i(TraceMetric traceMetric, int i10) {
        if (traceMetric == null) {
            return false;
        }
        if (i10 > 1) {
            f33172c.j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry<String, Long> entry : traceMetric.getCountersMap().entrySet()) {
            if (!l(entry.getKey())) {
                f33172c.j("invalid CounterId:" + entry.getKey());
                return false;
            }
            if (!m(entry.getValue())) {
                f33172c.j("invalid CounterValue:" + entry.getValue());
                return false;
            }
        }
        Iterator<TraceMetric> it = traceMetric.getSubtracesList().iterator();
        while (it.hasNext()) {
            if (!i(it.next(), i10 + 1)) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(TraceMetric traceMetric) {
        if (traceMetric.getCountersCount() > 0) {
            return true;
        }
        Iterator<TraceMetric> it = traceMetric.getSubtracesList().iterator();
        while (it.hasNext()) {
            if (it.next().getCountersCount() > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(TraceMetric traceMetric) {
        return traceMetric.getName().startsWith("_st_");
    }

    public final boolean l(String str) {
        if (str == null) {
            return false;
        }
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            f33172c.j("counterId is empty");
            return false;
        }
        if (strTrim.length() <= 100) {
            return true;
        }
        f33172c.j("counterId exceeded max length 100");
        return false;
    }

    public final boolean m(Long l10) {
        return l10 != null;
    }

    public final boolean n(TraceMetric traceMetric) {
        Long l10 = traceMetric.getCountersMap().get(com.google.firebase.perf.util.b.FRAMES_TOTAL.toString());
        return l10 != null && l10.compareTo((Long) 0L) > 0;
    }

    public final boolean o(TraceMetric traceMetric, int i10) {
        if (traceMetric == null) {
            f33172c.j("TraceMetric is null");
            return false;
        }
        if (i10 > 1) {
            f33172c.j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        if (!q(traceMetric.getName())) {
            f33172c.j("invalid TraceId:" + traceMetric.getName());
            return false;
        }
        if (!p(traceMetric)) {
            f33172c.j("invalid TraceDuration:" + traceMetric.getDurationUs());
            return false;
        }
        if (!traceMetric.hasClientStartTimeUs()) {
            f33172c.j("clientStartTimeUs is null.");
            return false;
        }
        if (!k(traceMetric) || n(traceMetric)) {
            Iterator<TraceMetric> it = traceMetric.getSubtracesList().iterator();
            while (it.hasNext()) {
                if (!o(it.next(), i10 + 1)) {
                    return false;
                }
            }
            return g(traceMetric.getCustomAttributesMap());
        }
        f33172c.j("non-positive totalFrames in screen trace " + traceMetric.getName());
        return false;
    }

    public final boolean p(TraceMetric traceMetric) {
        return traceMetric != null && traceMetric.getDurationUs() > 0;
    }

    public final boolean q(String str) {
        if (str == null) {
            return false;
        }
        String strTrim = str.trim();
        return !strTrim.isEmpty() && strTrim.length() <= 100;
    }
}
