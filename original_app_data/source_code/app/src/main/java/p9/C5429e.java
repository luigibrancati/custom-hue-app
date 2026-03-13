package p9;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: p9.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5429e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC5428d f42470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC5428d f42471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f42472c;

    public C5429e() {
        this(null, null, 0.0d, 7, null);
    }

    public final EnumC5428d a() {
        return this.f42471b;
    }

    public final EnumC5428d b() {
        return this.f42470a;
    }

    public final double c() {
        return this.f42472c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5429e)) {
            return false;
        }
        C5429e c5429e = (C5429e) obj;
        return this.f42470a == c5429e.f42470a && this.f42471b == c5429e.f42471b && Double.compare(this.f42472c, c5429e.f42472c) == 0;
    }

    public int hashCode() {
        return (((this.f42470a.hashCode() * 31) + this.f42471b.hashCode()) * 31) + Double.hashCode(this.f42472c);
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.f42470a + ", crashlytics=" + this.f42471b + ", sessionSamplingRate=" + this.f42472c + ')';
    }

    public C5429e(EnumC5428d performance, EnumC5428d crashlytics, double d10) {
        AbstractC4862t.e(performance, "performance");
        AbstractC4862t.e(crashlytics, "crashlytics");
        this.f42470a = performance;
        this.f42471b = crashlytics;
        this.f42472c = d10;
    }

    public /* synthetic */ C5429e(EnumC5428d enumC5428d, EnumC5428d enumC5428d2, double d10, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? EnumC5428d.COLLECTION_SDK_NOT_INSTALLED : enumC5428d, (i10 & 2) != 0 ? EnumC5428d.COLLECTION_SDK_NOT_INSTALLED : enumC5428d2, (i10 & 4) != 0 ? 1.0d : d10);
    }
}
