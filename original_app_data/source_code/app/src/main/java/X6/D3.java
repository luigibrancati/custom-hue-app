package X6;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzjd;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class D3 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c7 f18209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f18210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzjd f18211c;

    public D3(zzjd zzjdVar, c7 c7Var, Bundle bundle) {
        this.f18209a = c7Var;
        this.f18210b = bundle;
        Objects.requireNonNull(zzjdVar);
        this.f18211c = zzjdVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzjd zzjdVar = this.f18211c;
        zzjdVar.N6().E();
        return zzjdVar.N6().q0(this.f18209a, this.f18210b);
    }
}
