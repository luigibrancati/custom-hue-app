package X6;

import android.os.Parcel;
import android.os.Parcelable;
import v6.AbstractC6056k;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class W6 extends AbstractC6157a {
    public static final Parcelable.Creator<W6> CREATOR = new X6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f18642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f18644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f18645g;

    public W6(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f18639a = i10;
        this.f18640b = str;
        this.f18641c = j10;
        this.f18642d = l10;
        this.f18645g = i10 == 1 ? f10 != null ? Double.valueOf(f10.doubleValue()) : null : d10;
        this.f18643e = str2;
        this.f18644f = str3;
    }

    public final Object d() {
        Long l10 = this.f18642d;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f18645g;
        if (d10 != null) {
            return d10;
        }
        String str = this.f18643e;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        X6.a(this, parcel, i10);
    }

    public W6(Y6 y62) {
        this(y62.f18661c, y62.f18662d, y62.f18663e, y62.f18660b);
    }

    public W6(String str, long j10, Object obj, String str2) {
        AbstractC6056k.f(str);
        this.f18639a = 2;
        this.f18640b = str;
        this.f18641c = j10;
        this.f18644f = str2;
        if (obj == null) {
            this.f18642d = null;
            this.f18645g = null;
            this.f18643e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f18642d = (Long) obj;
            this.f18645g = null;
            this.f18643e = null;
        } else if (obj instanceof String) {
            this.f18642d = null;
            this.f18645g = null;
            this.f18643e = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f18642d = null;
                this.f18645g = (Double) obj;
                this.f18643e = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
