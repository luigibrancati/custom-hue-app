package s6;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: s6.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5771A extends AbstractC6157a {
    public static final Parcelable.Creator<C5771A> CREATOR = new C5772B();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f44116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f44117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f44118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f44119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f44120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f44121g;

    public C5771A(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12, boolean z13, boolean z14) {
        this.f44115a = str;
        this.f44116b = z10;
        this.f44117c = z11;
        this.f44118d = (Context) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.f44119e = z12;
        this.f44120f = z13;
        this.f44121g = z14;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [android.os.IBinder, com.google.android.gms.dynamic.IObjectWrapper] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f44115a;
        int iA = w6.c.a(parcel);
        w6.c.w(parcel, 1, str, false);
        w6.c.c(parcel, 2, this.f44116b);
        w6.c.c(parcel, 3, this.f44117c);
        w6.c.m(parcel, 4, ObjectWrapper.wrap(this.f44118d), false);
        w6.c.c(parcel, 5, this.f44119e);
        w6.c.c(parcel, 6, this.f44120f);
        w6.c.c(parcel, 8, this.f44121g);
        w6.c.b(parcel, iA);
    }
}
