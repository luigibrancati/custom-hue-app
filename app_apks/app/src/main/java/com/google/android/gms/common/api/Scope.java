package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import t6.C5853k;
import v6.AbstractC6056k;
import w6.AbstractC6157a;
import w6.c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Scope extends AbstractC6157a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C5853k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29018b;

    public Scope(int i10, String str) {
        AbstractC6056k.g(str, "scopeUri must not be null or empty");
        this.f29017a = i10;
        this.f29018b = str;
    }

    public String d() {
        return this.f29018b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f29018b.equals(((Scope) obj).f29018b);
        }
        return false;
    }

    public int hashCode() {
        return this.f29018b.hashCode();
    }

    public String toString() {
        return this.f29018b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f29017a;
        int iA = c.a(parcel);
        c.n(parcel, 1, i11);
        c.w(parcel, 2, d(), false);
        c.b(parcel, iA);
    }

    public Scope(String str) {
        this(1, str);
    }
}
