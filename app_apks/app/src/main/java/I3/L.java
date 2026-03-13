package I3;

import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f5556m = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f5557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f5558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f5559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.work.b f5560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.work.b f5561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0874d f5564h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f5565i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f5566j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f5567k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f5568l;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f5569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f5570b;

        public b(long j10, long j11) {
            this.f5569a = j10;
            this.f5570b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && AbstractC4862t.a(b.class, obj.getClass())) {
                b bVar = (b) obj;
                if (bVar.f5569a == this.f5569a && bVar.f5570b == this.f5570b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (Long.hashCode(this.f5569a) * 31) + Long.hashCode(this.f5570b);
        }

        public String toString() {
            return "PeriodicityInfo{repeatIntervalMillis=" + this.f5569a + ", flexIntervalMillis=" + this.f5570b + '}';
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {
        private static final /* synthetic */ InterfaceC5276a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c ENQUEUED = new c("ENQUEUED", 0);
        public static final c RUNNING = new c("RUNNING", 1);
        public static final c SUCCEEDED = new c("SUCCEEDED", 2);
        public static final c FAILED = new c("FAILED", 3);
        public static final c BLOCKED = new c("BLOCKED", 4);
        public static final c CANCELLED = new c("CANCELLED", 5);

        static {
            c[] cVarArrA = a();
            $VALUES = cVarArrA;
            $ENTRIES = AbstractC5277b.a(cVarArrA);
        }

        public c(String str, int i10) {
        }

        public static final /* synthetic */ c[] a() {
            return new c[]{ENQUEUED, RUNNING, SUCCEEDED, FAILED, BLOCKED, CANCELLED};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        public final boolean b() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public L(UUID id2, c state, Set tags, androidx.work.b outputData, androidx.work.b progress, int i10, int i11, C0874d constraints, long j10, b bVar, long j11, int i12) {
        AbstractC4862t.e(id2, "id");
        AbstractC4862t.e(state, "state");
        AbstractC4862t.e(tags, "tags");
        AbstractC4862t.e(outputData, "outputData");
        AbstractC4862t.e(progress, "progress");
        AbstractC4862t.e(constraints, "constraints");
        this.f5557a = id2;
        this.f5558b = state;
        this.f5559c = tags;
        this.f5560d = outputData;
        this.f5561e = progress;
        this.f5562f = i10;
        this.f5563g = i11;
        this.f5564h = constraints;
        this.f5565i = j10;
        this.f5566j = bVar;
        this.f5567k = j11;
        this.f5568l = i12;
    }

    public final UUID a() {
        return this.f5557a;
    }

    public final c b() {
        return this.f5558b;
    }

    public final Set c() {
        return this.f5559c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC4862t.a(L.class, obj.getClass())) {
            return false;
        }
        L l10 = (L) obj;
        if (this.f5562f == l10.f5562f && this.f5563g == l10.f5563g && AbstractC4862t.a(this.f5557a, l10.f5557a) && this.f5558b == l10.f5558b && AbstractC4862t.a(this.f5560d, l10.f5560d) && AbstractC4862t.a(this.f5564h, l10.f5564h) && this.f5565i == l10.f5565i && AbstractC4862t.a(this.f5566j, l10.f5566j) && this.f5567k == l10.f5567k && this.f5568l == l10.f5568l && AbstractC4862t.a(this.f5559c, l10.f5559c)) {
            return AbstractC4862t.a(this.f5561e, l10.f5561e);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.f5557a.hashCode() * 31) + this.f5558b.hashCode()) * 31) + this.f5560d.hashCode()) * 31) + this.f5559c.hashCode()) * 31) + this.f5561e.hashCode()) * 31) + this.f5562f) * 31) + this.f5563g) * 31) + this.f5564h.hashCode()) * 31) + Long.hashCode(this.f5565i)) * 31;
        b bVar = this.f5566j;
        return ((((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31) + Long.hashCode(this.f5567k)) * 31) + Integer.hashCode(this.f5568l);
    }

    public String toString() {
        return "WorkInfo{id='" + this.f5557a + "', state=" + this.f5558b + ", outputData=" + this.f5560d + ", tags=" + this.f5559c + ", progress=" + this.f5561e + ", runAttemptCount=" + this.f5562f + ", generation=" + this.f5563g + ", constraints=" + this.f5564h + ", initialDelayMillis=" + this.f5565i + ", periodicityInfo=" + this.f5566j + ", nextScheduleTimeMillis=" + this.f5567k + "}, stopReason=" + this.f5568l;
    }
}
