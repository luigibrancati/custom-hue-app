package io.flutter.plugins.googlemaps;

import S6.C2197c;
import U6.C2280g;
import U6.C2287n;
import U6.C2295w;
import U6.C2297y;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
interface GoogleMapListener extends C2197c.InterfaceC0186c, C2197c.d, C2197c.e, C2197c.h, C2197c.l, C2197c.n, C2197c.o, C2197c.f, C2197c.j, C2197c.k, C2197c.m, C2197c.g {
    @Override // S6.C2197c.InterfaceC0186c
    /* synthetic */ void onCameraIdle();

    /* synthetic */ void onCameraMove();

    /* synthetic */ void onCameraMoveStarted(int i10);

    /* synthetic */ void onCircleClick(C2280g c2280g);

    /* synthetic */ void onGroundOverlayClick(C2287n c2287n);

    /* synthetic */ void onInfoWindowClick(U6.r rVar);

    /* synthetic */ void onMapClick(LatLng latLng);

    /* synthetic */ void onMapLongClick(LatLng latLng);

    /* synthetic */ boolean onMarkerClick(U6.r rVar);

    /* synthetic */ void onMarkerDrag(U6.r rVar);

    /* synthetic */ void onMarkerDragEnd(U6.r rVar);

    /* synthetic */ void onMarkerDragStart(U6.r rVar);

    /* synthetic */ void onPolygonClick(C2295w c2295w);

    /* synthetic */ void onPolylineClick(C2297y c2297y);
}
