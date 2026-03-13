package X6;

import com.google.android.gms.measurement.internal.zzjd;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X6.x3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC2527x3 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c7 f19305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzjd f19306b;

    public CallableC2527x3(zzjd zzjdVar, c7 c7Var) {
        this.f19305a = c7Var;
        Objects.requireNonNull(zzjdVar);
        this.f19306b = zzjdVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzjd zzjdVar = this.f19306b;
        zzjdVar.N6().E();
        return new C2460p(zzjdVar.N6().S0(this.f19305a.f18743a));
    }
}
