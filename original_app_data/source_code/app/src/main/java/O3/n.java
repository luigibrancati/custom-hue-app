package O3;

import android.content.Context;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f10932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f10933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f10934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f10935e;

    public n(Context context, S3.b taskExecutor, h batteryChargingTracker, c batteryNotLowTracker, h networkStateTracker, h storageNotLowTracker) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(taskExecutor, "taskExecutor");
        AbstractC4862t.e(batteryChargingTracker, "batteryChargingTracker");
        AbstractC4862t.e(batteryNotLowTracker, "batteryNotLowTracker");
        AbstractC4862t.e(networkStateTracker, "networkStateTracker");
        AbstractC4862t.e(storageNotLowTracker, "storageNotLowTracker");
        this.f10931a = context;
        this.f10932b = batteryChargingTracker;
        this.f10933c = batteryNotLowTracker;
        this.f10934d = networkStateTracker;
        this.f10935e = storageNotLowTracker;
    }

    public final h a() {
        return this.f10932b;
    }

    public final c b() {
        return this.f10933c;
    }

    public final Context c() {
        return this.f10931a;
    }

    public final h d() {
        return this.f10934d;
    }

    public final h e() {
        return this.f10935e;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ n(android.content.Context r8, S3.b r9, O3.h r10, O3.c r11, O3.h r12, O3.h r13, int r14, kotlin.jvm.internal.AbstractC4854k r15) {
        /*
            r7 = this;
            r0 = r14 & 4
            java.lang.String r1 = "getApplicationContext(...)"
            if (r0 == 0) goto L14
            O3.a r0 = new O3.a
            android.content.Context r3 = r8.getApplicationContext()
            kotlin.jvm.internal.AbstractC4862t.d(r3, r1)
            r0.<init>(r3, r9)
            r3 = r0
            goto L15
        L14:
            r3 = r10
        L15:
            r0 = r14 & 8
            if (r0 == 0) goto L27
            O3.c r0 = new O3.c
            android.content.Context r4 = r8.getApplicationContext()
            kotlin.jvm.internal.AbstractC4862t.d(r4, r1)
            r0.<init>(r4, r9)
            r4 = r0
            goto L28
        L27:
            r4 = r11
        L28:
            r0 = r14 & 16
            if (r0 == 0) goto L39
            android.content.Context r0 = r8.getApplicationContext()
            kotlin.jvm.internal.AbstractC4862t.d(r0, r1)
            O3.h r0 = O3.k.a(r0, r9)
            r5 = r0
            goto L3a
        L39:
            r5 = r12
        L3a:
            r0 = r14 & 32
            if (r0 == 0) goto L4f
            O3.l r0 = new O3.l
            android.content.Context r6 = r8.getApplicationContext()
            kotlin.jvm.internal.AbstractC4862t.d(r6, r1)
            r0.<init>(r6, r9)
            r6 = r0
            r1 = r8
            r2 = r9
            r0 = r7
            goto L53
        L4f:
            r6 = r13
            r0 = r7
            r1 = r8
            r2 = r9
        L53:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.n.<init>(android.content.Context, S3.b, O3.h, O3.c, O3.h, O3.h, int, kotlin.jvm.internal.k):void");
    }
}
