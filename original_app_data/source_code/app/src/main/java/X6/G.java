package X6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class G extends AbstractC6157a implements Iterable {
    public static final Parcelable.Creator<G> CREATOR = new H();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f18311a;

    public G(Bundle bundle) {
        this.f18311a = bundle;
    }

    public final Object d(String str) {
        return this.f18311a.get(str);
    }

    public final Long e(String str) {
        return Long.valueOf(this.f18311a.getLong(str));
    }

    public final Double f(String str) {
        return Double.valueOf(this.f18311a.getDouble("value"));
    }

    public final String h(String str) {
        return this.f18311a.getString(str);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new F(this);
    }

    public final int k() {
        return this.f18311a.size();
    }

    public final Bundle l() {
        return new Bundle(this.f18311a);
    }

    public final /* synthetic */ Bundle n() {
        return this.f18311a;
    }

    public final String toString() {
        return this.f18311a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.e(parcel, 2, l(), false);
        w6.c.b(parcel, iA);
    }
}
