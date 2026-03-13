package N6;

import android.content.Context;
import android.os.SystemClock;
import b7.InterfaceC2873g;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import v6.AbstractC6061p;
import v6.C6054i;
import v6.C6060o;
import v6.InterfaceC6062q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Ua {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC6062q f10089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f10090b = new AtomicLong(-1);

    public Ua(Context context, String str) {
        this.f10089a = AbstractC6061p.b(context, v6.r.a().b("mlkit:vision").a());
    }

    public static Ua a(Context context) {
        return new Ua(context, "mlkit:vision");
    }

    public final /* synthetic */ void b(long j10, Exception exc) {
        this.f10090b.set(j10);
    }

    public final synchronized void c(int i10, int i11, long j10, long j11) {
        AtomicLong atomicLong = this.f10090b;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (atomicLong.get() != -1 && jElapsedRealtime - this.f10090b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f10089a.e(new C6060o(0, Arrays.asList(new C6054i(i10, i11, 0, j10, j11, null, null, 0, -1)))).e(new InterfaceC2873g() { // from class: N6.Ta
            @Override // b7.InterfaceC2873g
            public final void c(Exception exc) {
                this.f10072a.b(jElapsedRealtime, exc);
            }
        });
    }
}
