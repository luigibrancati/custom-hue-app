package y6;

import android.os.Parcel;
import android.os.Parcelable;
import v6.AbstractC6056k;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class h extends AbstractC6157a {
    public static final Parcelable.Creator<h> CREATOR = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f48488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f48489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f48490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f48491f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f48492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f48493b;

        public a(long j10, long j11) {
            AbstractC6056k.o(j11);
            this.f48492a = j10;
            this.f48493b = j11;
        }
    }

    public h(int i10, int i11, Long l10, Long l11, int i12) {
        this.f48486a = i10;
        this.f48487b = i11;
        this.f48488c = l10;
        this.f48489d = l11;
        this.f48490e = i12;
        this.f48491f = (l10 == null || l11 == null || l11.longValue() == 0) ? null : new a(l10.longValue(), l11.longValue());
    }

    public int d() {
        return this.f48490e;
    }

    public int e() {
        return this.f48487b;
    }

    public int f() {
        return this.f48486a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, f());
        w6.c.n(parcel, 2, e());
        w6.c.t(parcel, 3, this.f48488c, false);
        w6.c.t(parcel, 4, this.f48489d, false);
        w6.c.n(parcel, 5, d());
        w6.c.b(parcel, iA);
    }
}
