package X6;

import com.google.android.gms.measurement.internal.zzjd;
import java.util.Objects;

/* JADX INFO: renamed from: X6.z3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2543z3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f19343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f19344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzjd f19345c;

    public RunnableC2543z3(zzjd zzjdVar, I i10, String str) {
        this.f19343a = i10;
        this.f19344b = str;
        Objects.requireNonNull(zzjdVar);
        this.f19345c = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjd zzjdVar = this.f19345c;
        zzjdVar.N6().E();
        zzjdVar.N6().i(this.f19343a, this.f19344b);
    }
}
