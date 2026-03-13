package com.google.android.gms.maps;

import S6.n;
import T6.AbstractC2235h;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import v6.AbstractC6055j;
import w6.AbstractC6157a;
import w6.c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class GoogleMapOptions extends AbstractC6157a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new n();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Integer f30321u = Integer.valueOf(Color.argb(255, 236, 233, 225));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f30322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f30323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CameraPosition f30325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f30326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f30327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f30328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f30329h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f30330i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f30331j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Boolean f30332k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Boolean f30333l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Boolean f30334m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Float f30335n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Float f30336o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LatLngBounds f30337p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Boolean f30338q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Integer f30339r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f30340s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f30341t;

    public GoogleMapOptions() {
        this.f30324c = -1;
        this.f30335n = null;
        this.f30336o = null;
        this.f30337p = null;
        this.f30339r = null;
        this.f30340s = null;
    }

    public GoogleMapOptions A(boolean z10) {
        this.f30333l = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions B(int i10) {
        this.f30324c = i10;
        return this;
    }

    public GoogleMapOptions E(float f10) {
        this.f30336o = Float.valueOf(f10);
        return this;
    }

    public GoogleMapOptions H(float f10) {
        this.f30335n = Float.valueOf(f10);
        return this;
    }

    public GoogleMapOptions I(boolean z10) {
        this.f30331j = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions J(boolean z10) {
        this.f30328g = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions L(boolean z10) {
        this.f30330i = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions M(boolean z10) {
        this.f30326e = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions N(boolean z10) {
        this.f30329h = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions d(CameraPosition cameraPosition) {
        this.f30325d = cameraPosition;
        return this;
    }

    public GoogleMapOptions e(boolean z10) {
        this.f30327f = Boolean.valueOf(z10);
        return this;
    }

    public Integer f() {
        return this.f30339r;
    }

    public CameraPosition h() {
        return this.f30325d;
    }

    public LatLngBounds k() {
        return this.f30337p;
    }

    public Boolean l() {
        return this.f30332k;
    }

    public int n() {
        return this.f30341t;
    }

    public String r() {
        return this.f30340s;
    }

    public int t() {
        return this.f30324c;
    }

    public String toString() {
        return AbstractC6055j.c(this).a("MapType", Integer.valueOf(this.f30324c)).a("LiteMode", this.f30332k).a("Camera", this.f30325d).a("CompassEnabled", this.f30327f).a("ZoomControlsEnabled", this.f30326e).a("ScrollGesturesEnabled", this.f30328g).a("ZoomGesturesEnabled", this.f30329h).a("TiltGesturesEnabled", this.f30330i).a("RotateGesturesEnabled", this.f30331j).a("ScrollGesturesEnabledDuringRotateOrZoom", this.f30338q).a("MapToolbarEnabled", this.f30333l).a("AmbientEnabled", this.f30334m).a("MinZoomPreference", this.f30335n).a("MaxZoomPreference", this.f30336o).a("BackgroundColor", this.f30339r).a("LatLngBoundsForCameraTarget", this.f30337p).a("ZOrderOnTop", this.f30322a).a("UseViewLifecycleInFragment", this.f30323b).a("mapColorScheme", Integer.valueOf(this.f30341t)).toString();
    }

    public Float v() {
        return this.f30336o;
    }

    public Float w() {
        return this.f30335n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.f(parcel, 2, AbstractC2235h.a(this.f30322a));
        c.f(parcel, 3, AbstractC2235h.a(this.f30323b));
        c.n(parcel, 4, t());
        c.u(parcel, 5, h(), i10, false);
        c.f(parcel, 6, AbstractC2235h.a(this.f30326e));
        c.f(parcel, 7, AbstractC2235h.a(this.f30327f));
        c.f(parcel, 8, AbstractC2235h.a(this.f30328g));
        c.f(parcel, 9, AbstractC2235h.a(this.f30329h));
        c.f(parcel, 10, AbstractC2235h.a(this.f30330i));
        c.f(parcel, 11, AbstractC2235h.a(this.f30331j));
        c.f(parcel, 12, AbstractC2235h.a(this.f30332k));
        c.f(parcel, 14, AbstractC2235h.a(this.f30333l));
        c.f(parcel, 15, AbstractC2235h.a(this.f30334m));
        c.l(parcel, 16, w(), false);
        c.l(parcel, 17, v(), false);
        c.u(parcel, 18, k(), i10, false);
        c.f(parcel, 19, AbstractC2235h.a(this.f30338q));
        c.q(parcel, 20, f(), false);
        c.w(parcel, 21, r(), false);
        c.n(parcel, 23, n());
        c.b(parcel, iA);
    }

    public GoogleMapOptions x(LatLngBounds latLngBounds) {
        this.f30337p = latLngBounds;
        return this;
    }

    public GoogleMapOptions y(boolean z10) {
        this.f30332k = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions z(String str) {
        this.f30340s = str;
        return this;
    }

    public GoogleMapOptions(byte b10, byte b11, int i10, CameraPosition cameraPosition, byte b12, byte b13, byte b14, byte b15, byte b16, byte b17, byte b18, byte b19, byte b20, Float f10, Float f11, LatLngBounds latLngBounds, byte b21, Integer num, String str, int i11) {
        this.f30324c = -1;
        this.f30335n = null;
        this.f30336o = null;
        this.f30337p = null;
        this.f30339r = null;
        this.f30340s = null;
        this.f30322a = AbstractC2235h.b(b10);
        this.f30323b = AbstractC2235h.b(b11);
        this.f30324c = i10;
        this.f30325d = cameraPosition;
        this.f30326e = AbstractC2235h.b(b12);
        this.f30327f = AbstractC2235h.b(b13);
        this.f30328g = AbstractC2235h.b(b14);
        this.f30329h = AbstractC2235h.b(b15);
        this.f30330i = AbstractC2235h.b(b16);
        this.f30331j = AbstractC2235h.b(b17);
        this.f30332k = AbstractC2235h.b(b18);
        this.f30333l = AbstractC2235h.b(b19);
        this.f30334m = AbstractC2235h.b(b20);
        this.f30335n = f10;
        this.f30336o = f11;
        this.f30337p = latLngBounds;
        this.f30338q = AbstractC2235h.b(b21);
        this.f30339r = num;
        this.f30340s = str;
        this.f30341t = i11;
    }
}
