package w4;

import android.content.SharedPreferences;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5160d;
import q4.C5485a;
import q4.C5488d;
import y4.h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5485a f46187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f46188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5488d f46189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A4.a f46190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f46191e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f46192j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f46193k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f46194l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f46196n;

        public a(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f46194l = obj;
            this.f46196n |= Integer.MIN_VALUE;
            return f.this.b(this);
        }
    }

    public f(C5485a amplitude) {
        AbstractC4862t.e(amplitude, "amplitude");
        this.f46187a = amplitude;
        D4.b bVarL = amplitude.l();
        AbstractC4862t.c(bVarL, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        C5488d c5488d = (C5488d) bVarL;
        this.f46189c = c5488d;
        this.f46190d = amplitude.r();
        SharedPreferences sharedPreferences = c5488d.C().getSharedPreferences("amplitude-android-" + c5488d.l(), 0);
        AbstractC4862t.d(sharedPreferences, "getSharedPreferences(...)");
        this.f46188b = sharedPreferences;
        this.f46191e = sharedPreferences.getInt("storage_version", 0);
    }

    public final Object a(InterfaceC4988e interfaceC4988e) throws Throwable {
        int i10 = this.f46191e;
        h hVar = h.f48419V3;
        if (i10 >= hVar.b()) {
            this.f46187a.r().a("Storage already at version " + hVar.b());
            return C4015H.f34254a;
        }
        this.f46190d.a("Migrating storage to version " + hVar.b());
        Object objB = b(interfaceC4988e);
        return objB == C5046c.f() ? objB : C4015H.f34254a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00af, code lost:
    
        if (r2.c(r0) != r1) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(lc.InterfaceC4988e r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.f.b(lc.e):java.lang.Object");
    }
}
