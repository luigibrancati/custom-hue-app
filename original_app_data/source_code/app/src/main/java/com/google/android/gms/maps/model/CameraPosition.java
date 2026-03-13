package com.google.android.gms.maps.model;

import U6.N;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import v6.AbstractC6055j;
import v6.AbstractC6056k;
import w6.AbstractC6157a;
import w6.c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class CameraPosition extends AbstractC6157a implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new N();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f30342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f30343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f30344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f30345d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LatLng f30346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f30347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f30348c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f30349d;

        public a a(float f10) {
            this.f30349d = f10;
            return this;
        }

        public CameraPosition b() {
            return new CameraPosition(this.f30346a, this.f30347b, this.f30348c, this.f30349d);
        }

        public a c(LatLng latLng) {
            this.f30346a = (LatLng) AbstractC6056k.m(latLng, "location must not be null.");
            return this;
        }

        public a d(float f10) {
            this.f30348c = f10;
            return this;
        }

        public a e(float f10) {
            this.f30347b = f10;
            return this;
        }
    }

    public CameraPosition(LatLng latLng, float f10, float f11, float f12) {
        AbstractC6056k.m(latLng, "camera target must not be null.");
        boolean z10 = false;
        if (f11 >= 0.0f && f11 <= 90.0f) {
            z10 = true;
        }
        AbstractC6056k.c(z10, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f11));
        this.f30342a = latLng;
        this.f30343b = f10;
        this.f30344c = f11 + 0.0f;
        this.f30345d = (((double) f12) <= 0.0d ? (f12 % 360.0f) + 360.0f : f12) % 360.0f;
    }

    public static a d() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f30342a.equals(cameraPosition.f30342a) && Float.floatToIntBits(this.f30343b) == Float.floatToIntBits(cameraPosition.f30343b) && Float.floatToIntBits(this.f30344c) == Float.floatToIntBits(cameraPosition.f30344c) && Float.floatToIntBits(this.f30345d) == Float.floatToIntBits(cameraPosition.f30345d);
    }

    public int hashCode() {
        return AbstractC6055j.b(this.f30342a, Float.valueOf(this.f30343b), Float.valueOf(this.f30344c), Float.valueOf(this.f30345d));
    }

    public String toString() {
        return AbstractC6055j.c(this).a("target", this.f30342a).a("zoom", Float.valueOf(this.f30343b)).a("tilt", Float.valueOf(this.f30344c)).a("bearing", Float.valueOf(this.f30345d)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        LatLng latLng = this.f30342a;
        int iA = c.a(parcel);
        c.u(parcel, 2, latLng, i10, false);
        c.j(parcel, 3, this.f30343b);
        c.j(parcel, 4, this.f30344c);
        c.j(parcel, 5, this.f30345d);
        c.b(parcel, iA);
    }
}
