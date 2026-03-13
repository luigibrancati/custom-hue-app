package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3449q extends AbstractC6157a {
    public static final Parcelable.Creator<C3449q> CREATOR = new J();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3468u f29899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3473v[] f29902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3458s[] f29903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f29904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3434n[] f29905g;

    public C3449q(C3468u c3468u, String str, String str2, C3473v[] c3473vArr, C3458s[] c3458sArr, String[] strArr, C3434n[] c3434nArr) {
        this.f29899a = c3468u;
        this.f29900b = str;
        this.f29901c = str2;
        this.f29902d = c3473vArr;
        this.f29903e = c3458sArr;
        this.f29904f = strArr;
        this.f29905g = c3434nArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C3468u c3468u = this.f29899a;
        int iA = w6.c.a(parcel);
        w6.c.u(parcel, 1, c3468u, i10, false);
        w6.c.w(parcel, 2, this.f29900b, false);
        w6.c.w(parcel, 3, this.f29901c, false);
        w6.c.z(parcel, 4, this.f29902d, i10, false);
        w6.c.z(parcel, 5, this.f29903e, i10, false);
        w6.c.x(parcel, 6, this.f29904f, false);
        w6.c.z(parcel, 7, this.f29905g, i10, false);
        w6.c.b(parcel, iA);
    }
}
