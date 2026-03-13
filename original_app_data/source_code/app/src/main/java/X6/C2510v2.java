package X6;

import android.content.Context;
import b7.InterfaceC2873g;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import v6.AbstractC6061p;
import v6.C6054i;
import v6.C6060o;
import v6.InterfaceC6062q;

/* JADX INFO: renamed from: X6.v2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2510v2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C2510v2 f19251d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2416j3 f19252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC6062q f19253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f19254c = new AtomicLong(-1);

    public C2510v2(Context context, C2416j3 c2416j3) {
        this.f19253b = AbstractC6061p.b(context, v6.r.a().b("measurement:api").a());
        this.f19252a = c2416j3;
    }

    public static C2510v2 a(C2416j3 c2416j3) {
        if (f19251d == null) {
            f19251d = new C2510v2(c2416j3.d(), c2416j3);
        }
        return f19251d;
    }

    public final synchronized void b(int i10, int i11, long j10, long j11, int i12) {
        final long jC = this.f19252a.e().c();
        AtomicLong atomicLong = this.f19254c;
        if (atomicLong.get() != -1 && jC - atomicLong.get() <= 1800000) {
            return;
        }
        this.f19253b.e(new C6060o(0, Arrays.asList(new C6054i(36301, i11, 0, j10, j11, null, null, 0, i12)))).e(new InterfaceC2873g() { // from class: X6.u2
            @Override // b7.InterfaceC2873g
            public final /* synthetic */ void c(Exception exc) {
                this.f19239a.c(jC, exc);
            }
        });
    }

    public final /* synthetic */ void c(long j10, Exception exc) {
        this.f19254c.set(j10);
    }
}
