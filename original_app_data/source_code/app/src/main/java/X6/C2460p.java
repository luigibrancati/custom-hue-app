package X6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: X6.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2460p extends AbstractC6157a {
    public static final Parcelable.Creator<C2460p> CREATOR = new C2468q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f19147a;

    public C2460p(Bundle bundle) {
        this.f19147a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = this.f19147a;
        int iA = w6.c.a(parcel);
        w6.c.e(parcel, 1, bundle, false);
        w6.c.b(parcel, iA);
    }
}
