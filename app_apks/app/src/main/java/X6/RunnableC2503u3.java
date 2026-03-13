package X6;

import com.google.android.gms.measurement.internal.zzjd;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: X6.u3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2503u3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c7 f19241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzjd f19242b;

    public RunnableC2503u3(zzjd zzjdVar, c7 c7Var) {
        this.f19241a = c7Var;
        Objects.requireNonNull(zzjdVar);
        this.f19242b = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjd zzjdVar = this.f19242b;
        zzjdVar.N6().E();
        R6 r6N6 = zzjdVar.N6();
        r6N6.b().h();
        r6N6.O0();
        c7 c7Var = this.f19241a;
        AbstractC6056k.f(c7Var.f18743a);
        r6N6.o0(c7Var);
    }
}
