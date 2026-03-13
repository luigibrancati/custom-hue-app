package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import w6.AbstractC6157a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C0 extends AbstractC6157a {
    public static final Parcelable.Creator<C0> CREATOR = new D0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f29148c;

    public C0(int i10, String str, Intent intent) {
        this.f29146a = i10;
        this.f29147b = str;
        this.f29148c = intent;
    }

    public static C0 d(Activity activity) {
        return new C0(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c02 = (C0) obj;
        return this.f29146a == c02.f29146a && Objects.equals(this.f29147b, c02.f29147b) && Objects.equals(this.f29148c, c02.f29148c);
    }

    public final int hashCode() {
        return this.f29146a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f29146a;
        int iA = w6.c.a(parcel);
        w6.c.n(parcel, 1, i11);
        w6.c.w(parcel, 2, this.f29147b, false);
        w6.c.u(parcel, 3, this.f29148c, i10, false);
        w6.c.b(parcel, iA);
    }
}
