package X6;

import com.google.android.gms.measurement.internal.zzjd;
import java.util.Objects;

/* JADX INFO: renamed from: X6.o3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2456o3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2404i f19138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c7 f19139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzjd f19140c;

    public RunnableC2456o3(zzjd zzjdVar, C2404i c2404i, c7 c7Var) {
        this.f19138a = c2404i;
        this.f19139b = c7Var;
        Objects.requireNonNull(zzjdVar);
        this.f19140c = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjd zzjdVar = this.f19140c;
        zzjdVar.N6().E();
        C2404i c2404i = this.f19138a;
        if (c2404i.f18979c.d() == null) {
            zzjdVar.N6().m0(c2404i, this.f19139b);
        } else {
            zzjdVar.N6().k0(c2404i, this.f19139b);
        }
    }
}
