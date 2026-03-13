package com.google.android.gms.maps.model;

import U6.O;
import android.os.Parcel;
import android.os.Parcelable;
import v6.AbstractC6055j;
import v6.AbstractC6056k;
import w6.AbstractC6157a;
import w6.c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class a extends AbstractC6157a {
    public static final Parcelable.Creator<a> CREATOR = new O();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f30362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f30363b;

    /* JADX INFO: renamed from: com.google.android.gms.maps.model.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0358a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f30364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f30365b;

        public C0358a a(float f10) {
            this.f30364a = f10;
            return this;
        }

        public a b() {
            return new a(this.f30365b, this.f30364a);
        }

        public C0358a c(float f10) {
            this.f30365b = f10;
            return this;
        }
    }

    public a(float f10, float f11) {
        boolean z10 = false;
        if (f10 >= -90.0f && f10 <= 90.0f) {
            z10 = true;
        }
        AbstractC6056k.b(z10, "Tilt needs to be between -90 and 90 inclusive: " + f10);
        this.f30362a = f10 + 0.0f;
        this.f30363b = (((double) f11) <= 0.0d ? (f11 % 360.0f) + 360.0f : f11) % 360.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.floatToIntBits(this.f30362a) == Float.floatToIntBits(aVar.f30362a) && Float.floatToIntBits(this.f30363b) == Float.floatToIntBits(aVar.f30363b);
    }

    public int hashCode() {
        return AbstractC6055j.b(Float.valueOf(this.f30362a), Float.valueOf(this.f30363b));
    }

    public String toString() {
        return AbstractC6055j.c(this).a("tilt", Float.valueOf(this.f30362a)).a("bearing", Float.valueOf(this.f30363b)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        float f10 = this.f30362a;
        int iA = c.a(parcel);
        c.j(parcel, 2, f10);
        c.j(parcel, 3, this.f30363b);
        c.b(parcel, iA);
    }
}
