package v6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: v6.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C6060o extends AbstractC6157a {
    public static final Parcelable.Creator<C6060o> CREATOR = new C6064t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f45877b;

    public C6060o(int i10, List list) {
        this.f45876a = i10;
        this.f45877b = list;
    }

    public final int d() {
        return this.f45876a;
    }

    public final List e() {
        return this.f45877b;
    }

    public final void f(C6054i c6054i) {
        if (this.f45877b == null) {
            this.f45877b = new ArrayList();
        }
        this.f45877b.add(c6054i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, this.f45876a);
        w6.c.A(parcel, 2, this.f45877b, false);
        w6.c.b(parcel, iA);
    }
}
