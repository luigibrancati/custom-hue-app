package com.google.android.gms.location;

import K6.C1038c;
import K6.C1042g;
import K6.C1049n;
import K6.C1050o;
import K6.C1054t;
import K6.r;
import R6.InterfaceC2067b;
import R6.InterfaceC2068c;
import R6.InterfaceC2071f;
import R6.InterfaceC2072g;
import R6.p;
import R6.q;
import android.app.Activity;
import android.content.Context;
import t6.C5843a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class LocationServices {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5843a f30317a = C1042g.f7548m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC2067b f30318b = new C1038c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InterfaceC2071f f30319c = new C1049n();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f30320d = new r();

    public static InterfaceC2068c a(Activity activity) {
        return new C1042g(activity);
    }

    public static InterfaceC2068c b(Context context) {
        return new C1042g(context);
    }

    public static InterfaceC2072g c(Activity activity) {
        return new C1050o(activity);
    }

    public static InterfaceC2072g d(Context context) {
        return new C1050o(context);
    }

    public static q e(Activity activity) {
        return new C1054t(activity);
    }
}
