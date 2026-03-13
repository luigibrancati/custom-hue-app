package X6;

import com.google.android.gms.measurement.internal.zzjd;
import java.util.Objects;

/* JADX INFO: renamed from: X6.l3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2432l3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c7 f19078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzjd f19079b;

    public RunnableC2432l3(zzjd zzjdVar, c7 c7Var) {
        this.f19078a = c7Var;
        Objects.requireNonNull(zzjdVar);
        this.f19079b = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjd zzjdVar = this.f19079b;
        zzjdVar.N6().E();
        zzjdVar.N6().h0(this.f19078a);
    }
}
