package X6;

import com.google.android.gms.measurement.internal.zzjd;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: X6.w3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2519w3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c7 f19283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzjd f19284b;

    public RunnableC2519w3(zzjd zzjdVar, c7 c7Var) {
        this.f19283a = c7Var;
        Objects.requireNonNull(zzjdVar);
        this.f19284b = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjd zzjdVar = this.f19284b;
        zzjdVar.N6().E();
        R6 r6N6 = zzjdVar.N6();
        r6N6.b().h();
        r6N6.O0();
        c7 c7Var = this.f19283a;
        AbstractC6056k.f(c7Var.f18743a);
        r6N6.P0(c7Var);
        r6N6.Q0(c7Var);
    }
}
