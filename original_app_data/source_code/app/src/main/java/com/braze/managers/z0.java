package com.braze.managers;

import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DataStoreKey;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class z0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BrazeConfigurationProvider f28030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f28031b;

    public z0(Context context, BrazeConfigurationProvider configurationProvider) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(configurationProvider, "configurationProvider");
        this.f28030a = configurationProvider;
        this.f28031b = new a1(context);
    }

    public static final String a(Integer num, int i10) {
        return "Stored push registration ID version code " + num + " does not match live version code " + i10 + ". Not returning saved registration ID.";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r0 != r2.intValue()) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.lang.String b() {
        /*
            r9 = this;
            monitor-enter(r9)
            com.braze.configuration.BrazeConfigurationProvider r0 = r9.f28030a     // Catch: java.lang.Throwable -> L13
            boolean r0 = r0.isFirebaseCloudMessagingRegistrationEnabled()     // Catch: java.lang.Throwable -> L13
            r8 = 0
            if (r0 != 0) goto L16
            com.braze.configuration.BrazeConfigurationProvider r0 = r9.f28030a     // Catch: java.lang.Throwable -> L13
            boolean r0 = r0.isAdmMessagingRegistrationEnabled()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L50
            goto L16
        L13:
            r0 = move-exception
            goto L8c
        L16:
            com.braze.managers.a1 r0 = r9.f28031b     // Catch: java.lang.Throwable -> L13
            com.braze.enums.DataStoreKey r2 = com.braze.enums.DataStoreKey.PUSH_REGISTRATION_VERSION_CODE     // Catch: java.lang.Throwable -> L13
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L50
            com.braze.configuration.BrazeConfigurationProvider r0 = r9.f28030a     // Catch: java.lang.Throwable -> L13
            int r0 = r0.getVersionCode()     // Catch: java.lang.Throwable -> L13
            com.braze.managers.a1 r3 = r9.f28031b     // Catch: java.lang.Throwable -> L13
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L13
            java.lang.Integer r2 = r3.readInt(r2, r4)     // Catch: java.lang.Throwable -> L13
            if (r2 != 0) goto L35
            goto L3b
        L35:
            int r3 = r2.intValue()     // Catch: java.lang.Throwable -> L13
            if (r0 == r3) goto L50
        L3b:
            com.braze.support.BrazeLogger r3 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Throwable -> L13
            com.braze.support.BrazeLogger$Priority r4 = com.braze.support.BrazeLogger.Priority.f28627V     // Catch: java.lang.Throwable -> L13
            c5.b4 r5 = new c5.b4     // Catch: java.lang.Throwable -> L13
            r5.<init>()     // Catch: java.lang.Throwable -> L13
            r6 = 6
            r7 = 0
            r0 = r3
            r3 = 0
            r2 = r4
            r4 = 0
            r1 = r9
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r9)
            return r8
        L50:
            com.braze.managers.a1 r0 = r9.f28031b     // Catch: java.lang.Throwable -> L13
            com.braze.enums.DataStoreKey r2 = com.braze.enums.DataStoreKey.PUSH_REGISTRATION_PERSISTENT_DEVICE_ID     // Catch: java.lang.Throwable -> L13
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L82
            com.braze.managers.a1 r0 = r9.f28031b     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = ""
            java.lang.String r0 = r0.readString(r2, r3)     // Catch: java.lang.Throwable -> L13
            r2 = 722989291(0x2b17f0eb, float:5.398032E-13)
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L13
            boolean r0 = kotlin.jvm.internal.AbstractC4862t.a(r2, r0)     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L82
            com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Throwable -> L13
            com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.f28626I     // Catch: java.lang.Throwable -> L13
            c5.c4 r5 = new c5.c4     // Catch: java.lang.Throwable -> L13
            r5.<init>()     // Catch: java.lang.Throwable -> L13
            r6 = 6
            r7 = 0
            r3 = 0
            r4 = 0
            r1 = r9
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r9)
            return r8
        L82:
            com.braze.managers.a1 r0 = r9.f28031b     // Catch: java.lang.Throwable -> L13
            com.braze.enums.DataStoreKey r2 = com.braze.enums.DataStoreKey.PUSH_REGISTRATION_ID_KEY     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = r0.readString(r2, r8)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r9)
            return r0
        L8c:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L13
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.managers.z0.b():java.lang.String");
    }

    public static final String a() {
        return "Device identifier differs from saved device identifier. Returning null token.";
    }

    public final synchronized void a(String str) {
        if (str != null) {
            this.f28031b.writeData(DataStoreKey.PUSH_REGISTRATION_ID_KEY, str);
            this.f28031b.writeData(DataStoreKey.PUSH_REGISTRATION_VERSION_CODE, Integer.valueOf(this.f28030a.getVersionCode()));
            this.f28031b.writeData(DataStoreKey.PUSH_REGISTRATION_PERSISTENT_DEVICE_ID, String.valueOf(722989291));
        } else {
            throw new NullPointerException("Provided push token is null. Cannot set null push token.");
        }
    }
}
