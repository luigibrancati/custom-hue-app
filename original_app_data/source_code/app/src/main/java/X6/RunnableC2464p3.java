package X6;

import com.google.android.gms.measurement.internal.zzjd;
import java.util.Objects;

/* JADX INFO: renamed from: X6.p3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2464p3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2404i f19153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzjd f19154b;

    public RunnableC2464p3(zzjd zzjdVar, C2404i c2404i) {
        this.f19153a = c2404i;
        Objects.requireNonNull(zzjdVar);
        this.f19154b = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjd zzjdVar = this.f19154b;
        zzjdVar.N6().E();
        C2404i c2404i = this.f19153a;
        if (c2404i.f18979c.d() == null) {
            zzjdVar.N6().l0(c2404i);
        } else {
            zzjdVar.N6().j0(c2404i);
        }
    }
}
