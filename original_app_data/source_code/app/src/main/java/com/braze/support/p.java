package com.braze.support;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.braze.support.BrazeLogger;
import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f28645a = new p();

    public static final boolean a(Context context) {
        AbstractC4862t.e(context, "context");
        final int iG = GoogleApiAvailability.m().g(context);
        if (iG == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f28645a, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.e1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.support.p.b();
                }
            }, 7, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f28645a, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: s5.f1
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.support.p.a(iG);
            }
        }, 7, (Object) null);
        return false;
    }

    public static final String b() {
        return "Google Play Services is available.";
    }

    public static final String c() {
        return "Unexpected exception while checking for com.google.android.gsf";
    }

    public static final boolean b(Context context) {
        AbstractC4862t.e(context, "context");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.getPackageManager().getPackageInfo("com.google.android.gsf", PackageManager.PackageInfoFlags.of(0L));
                return true;
            }
            context.getPackageManager().getPackageInfo("com.google.android.gsf", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f28645a, BrazeLogger.Priority.f28628W, (Throwable) e10, false, new InterfaceC6082a() { // from class: s5.d1
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.support.p.c();
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public static final String a(int i10) {
        return "Google Play Services is unavailable. Connection result: " + i10;
    }
}
