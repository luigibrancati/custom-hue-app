package Pd;

import java.util.concurrent.TimeUnit;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    private final TimeUnit timeUnit;
    public static final d NANOSECONDS = new d("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
    public static final d MICROSECONDS = new d("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    public static final d MILLISECONDS = new d("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    public static final d SECONDS = new d("SECONDS", 3, TimeUnit.SECONDS);
    public static final d MINUTES = new d("MINUTES", 4, TimeUnit.MINUTES);
    public static final d HOURS = new d("HOURS", 5, TimeUnit.HOURS);
    public static final d DAYS = new d("DAYS", 6, TimeUnit.DAYS);

    static {
        d[] dVarArrA = a();
        $VALUES = dVarArrA;
        $ENTRIES = AbstractC5277b.a(dVarArrA);
    }

    public d(String str, int i10, TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public static final /* synthetic */ d[] a() {
        return new d[]{NANOSECONDS, MICROSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS, DAYS};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final TimeUnit b() {
        return this.timeUnit;
    }
}
