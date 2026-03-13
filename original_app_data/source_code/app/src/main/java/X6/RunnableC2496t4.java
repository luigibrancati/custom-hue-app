package X6;

import com.google.android.gms.internal.measurement.InterfaceC3304s0;
import java.util.Objects;

/* JADX INFO: renamed from: X6.t4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2496t4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3304s0 f19229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R4 f19230b;

    public RunnableC2496t4(R4 r42, InterfaceC3304s0 interfaceC3304s0) {
        this.f19229a = interfaceC3304s0;
        Objects.requireNonNull(r42);
        this.f19230b = r42;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r8 = this;
            X6.R4 r0 = r8.f19230b
            X6.j3 r1 = r0.f18400a
            X6.m6 r1 = r1.z()
            X6.j3 r1 = r1.f18400a
            X6.N2 r2 = r1.x()
            X6.S3 r2 = r2.w()
            X6.R3 r3 = X6.R3.ANALYTICS_STORAGE
            boolean r2 = r2.o(r3)
            r3 = 0
            if (r2 != 0) goto L2a
            X6.z2 r1 = r1.a()
            X6.x2 r1 = r1.t()
            java.lang.String r2 = "Analytics storage consent denied; will not get session id"
            r1.a(r2)
        L28:
            r1 = r3
            goto L5b
        L2a:
            X6.N2 r2 = r1.x()
            B6.e r4 = r1.e()
            long r4 = r4.a()
            boolean r2 = r2.A(r4)
            if (r2 != 0) goto L28
            X6.N2 r2 = r1.x()
            X6.K2 r2 = r2.f18437r
            long r4 = r2.a()
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L4d
            goto L28
        L4d:
            X6.N2 r1 = r1.x()
            X6.K2 r1 = r1.f18437r
            long r1 = r1.a()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L5b:
            if (r1 == 0) goto L6d
            X6.j3 r0 = r0.f18400a
            com.google.android.gms.internal.measurement.s0 r8 = r8.f19229a
            X6.a7 r0 = r0.C()
            long r1 = r1.longValue()
            r0.b0(r8, r1)
            return
        L6d:
            com.google.android.gms.internal.measurement.s0 r0 = r8.f19229a     // Catch: android.os.RemoteException -> L73
            r0.Z(r3)     // Catch: android.os.RemoteException -> L73
            return
        L73:
            r0 = move-exception
            X6.R4 r8 = r8.f19230b
            X6.j3 r8 = r8.f18400a
            X6.z2 r8 = r8.a()
            X6.x2 r8 = r8.o()
            java.lang.String r1 = "getSessionId failed with exception"
            r8.b(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X6.RunnableC2496t4.run():void");
    }
}
