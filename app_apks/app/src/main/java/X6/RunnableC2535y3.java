package X6;

import com.google.android.gms.measurement.internal.zzjd;
import java.util.Objects;

/* JADX INFO: renamed from: X6.y3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2535y3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f19318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c7 f19319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzjd f19320c;

    public RunnableC2535y3(zzjd zzjdVar, I i10, c7 c7Var) {
        this.f19318a = i10;
        this.f19319b = c7Var;
        Objects.requireNonNull(zzjdVar);
        this.f19320c = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I i10 = this.f19318a;
        c7 c7Var = this.f19319b;
        zzjd zzjdVar = this.f19320c;
        zzjdVar.R6(zzjdVar.S6(i10, c7Var), c7Var);
    }
}
