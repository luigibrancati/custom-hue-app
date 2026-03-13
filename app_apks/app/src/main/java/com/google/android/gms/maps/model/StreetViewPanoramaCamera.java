package com.google.android.gms.maps.model;

import U6.m0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.a;
import v6.AbstractC6055j;
import v6.AbstractC6056k;
import w6.AbstractC6157a;
import w6.c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class StreetViewPanoramaCamera extends AbstractC6157a implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaCamera> CREATOR = new m0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f30358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f30359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f30360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f30361d;

    public StreetViewPanoramaCamera(float f10, float f11, float f12) {
        boolean z10 = false;
        if (f11 >= -90.0f && f11 <= 90.0f) {
            z10 = true;
        }
        AbstractC6056k.b(z10, "Tilt needs to be between -90 and 90 inclusive: " + f11);
        this.f30358a = ((double) f10) <= 0.0d ? 0.0f : f10;
        this.f30359b = 0.0f + f11;
        this.f30360c = (((double) f12) <= 0.0d ? (f12 % 360.0f) + 360.0f : f12) % 360.0f;
        a.C0358a c0358a = new a.C0358a();
        c0358a.c(f11);
        c0358a.a(f12);
        this.f30361d = c0358a.b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        return Float.floatToIntBits(this.f30358a) == Float.floatToIntBits(streetViewPanoramaCamera.f30358a) && Float.floatToIntBits(this.f30359b) == Float.floatToIntBits(streetViewPanoramaCamera.f30359b) && Float.floatToIntBits(this.f30360c) == Float.floatToIntBits(streetViewPanoramaCamera.f30360c);
    }

    public int hashCode() {
        return AbstractC6055j.b(Float.valueOf(this.f30358a), Float.valueOf(this.f30359b), Float.valueOf(this.f30360c));
    }

    public String toString() {
        return AbstractC6055j.c(this).a("zoom", Float.valueOf(this.f30358a)).a("tilt", Float.valueOf(this.f30359b)).a("bearing", Float.valueOf(this.f30360c)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        float f10 = this.f30358a;
        int iA = c.a(parcel);
        c.j(parcel, 2, f10);
        c.j(parcel, 3, this.f30359b);
        c.j(parcel, 4, this.f30360c);
        c.b(parcel, iA);
    }
}
