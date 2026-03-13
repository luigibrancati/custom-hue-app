package X6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class A6 extends AbstractC6157a {
    public static final Parcelable.Creator<A6> CREATOR = new B6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18156a;

    public A6(List list) {
        this.f18156a = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f18156a;
        int iA = w6.c.a(parcel);
        w6.c.A(parcel, 1, list, false);
        w6.c.b(parcel, iA);
    }
}
