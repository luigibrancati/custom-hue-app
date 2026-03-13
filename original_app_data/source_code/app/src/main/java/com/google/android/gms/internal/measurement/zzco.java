package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class zzco extends zzct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f29735a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f29736b;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
    
        r2 = r2.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object zzf(android.os.Bundle r2, java.lang.Class r3) {
        /*
            r0 = 0
            if (r2 == 0) goto L2d
            java.lang.String r1 = "r"
            java.lang.Object r2 = r2.get(r1)
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r3.cast(r2)     // Catch: java.lang.ClassCastException -> L10
            return r2
        L10:
            r0 = move-exception
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getCanonicalName()
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}
            java.lang.String r3 = "Unexpected object type. Expected, Received: %s, %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.String r3 = "AM"
            android.util.Log.w(r3, r2, r0)
            throw r0
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzco.zzf(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    public final Bundle I6(long j10) {
        Bundle bundle;
        AtomicReference atomicReference = this.f29735a;
        synchronized (atomicReference) {
            if (!this.f29736b) {
                try {
                    atomicReference.wait(j10);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f29735a.get();
        }
        return bundle;
    }

    public final String K(long j10) {
        return (String) zzf(I6(j10), String.class);
    }

    public final Long X(long j10) {
        return (Long) zzf(I6(j10), Long.class);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3304s0
    public final void Z(Bundle bundle) {
        AtomicReference atomicReference = this.f29735a;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.f29736b = true;
                } finally {
                    this.f29735a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
