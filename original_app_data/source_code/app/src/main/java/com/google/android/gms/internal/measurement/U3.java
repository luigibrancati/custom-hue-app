package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class U3 implements R3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static U3 f29355d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f29356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContentObserver f29357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f29358c;

    public U3() {
        this.f29358c = false;
        this.f29356a = null;
        this.f29357b = null;
    }

    public static U3 c(Context context) {
        U3 u32;
        synchronized (U3.class) {
            try {
                if (f29355d == null) {
                    f29355d = L0.f.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new U3(context) : new U3();
                }
                U3 u33 = f29355d;
                if (u33 != null && u33.f29357b != null && !u33.f29358c) {
                    try {
                        context.getContentResolver().registerContentObserver(D3.f29155a, true, f29355d.f29357b);
                        ((U3) J7.n.j(f29355d)).f29358c = true;
                    } catch (SecurityException e10) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e10);
                    }
                }
                u32 = (U3) J7.n.j(f29355d);
            } catch (Throwable th) {
                throw th;
            }
        }
        return u32;
    }

    public static synchronized void e() {
        Context context;
        try {
            U3 u32 = f29355d;
            if (u32 != null && (context = u32.f29356a) != null && u32.f29357b != null && u32.f29358c) {
                context.getContentResolver().unregisterContentObserver(f29355d.f29357b);
            }
            f29355d = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.measurement.R3
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final String b(final String str) {
        Context context = this.f29356a;
        if (context != null && !J3.b(context)) {
            try {
                return (String) R3.a(new Q3() { // from class: com.google.android.gms.internal.measurement.T3
                    @Override // com.google.android.gms.internal.measurement.Q3
                    public final /* synthetic */ Object zza() {
                        return this.f29341a.f(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e10) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e10);
            }
        }
        return null;
    }

    public final /* synthetic */ String f(String str) {
        return C3.a(((Context) J7.n.j(this.f29356a)).getContentResolver(), str, null);
    }

    public U3(Context context) {
        this.f29358c = false;
        this.f29356a = context;
        this.f29357b = new S3(this, null);
    }
}
