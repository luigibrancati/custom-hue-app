package X6;

import com.google.android.gms.measurement.internal.zzjd;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X6.k3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC2424k3 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f19047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzjd f19048b;

    public CallableC2424k3(zzjd zzjdVar, String str) {
        this.f19047a = str;
        Objects.requireNonNull(zzjdVar);
        this.f19048b = zzjdVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzjd zzjdVar = this.f19048b;
        zzjdVar.N6().E();
        return zzjdVar.N6().F0().C0(this.f19047a);
    }
}
