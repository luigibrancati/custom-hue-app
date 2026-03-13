package U6;

import android.os.Parcel;
import android.os.Parcelable;
import v6.AbstractC6056k;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: U6.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2290q extends AbstractC6157a {
    public static final Parcelable.Creator<C2290q> CREATOR = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16705a;

    public C2290q(String str) {
        AbstractC6056k.m(str, "json must not be null");
        this.f16705a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        String str = this.f16705a;
        int iA = w6.c.a(parcel);
        w6.c.w(parcel, 2, str, false);
        w6.c.b(parcel, iA);
    }
}
