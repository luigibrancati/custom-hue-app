package X6;

import com.google.android.gms.measurement.internal.zzjd;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class B3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W6 f18162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c7 f18163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzjd f18164c;

    public B3(zzjd zzjdVar, W6 w62, c7 c7Var) {
        this.f18162a = w62;
        this.f18163b = c7Var;
        Objects.requireNonNull(zzjdVar);
        this.f18164c = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjd zzjdVar = this.f18164c;
        zzjdVar.N6().E();
        W6 w62 = this.f18162a;
        if (w62.d() != null) {
            zzjdVar.N6().c0(w62, this.f18163b);
        } else {
            c7 c7Var = this.f18163b;
            zzjdVar.N6().d0(w62.f18640b, c7Var);
        }
    }
}
