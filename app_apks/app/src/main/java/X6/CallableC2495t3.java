package X6;

import com.google.android.gms.measurement.internal.zzjd;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X6.t3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC2495t3 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f19225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f19226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f19227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzjd f19228d;

    public CallableC2495t3(zzjd zzjdVar, String str, String str2, String str3) {
        this.f19225a = str;
        this.f19226b = str2;
        this.f19227c = str3;
        Objects.requireNonNull(zzjdVar);
        this.f19228d = zzjdVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzjd zzjdVar = this.f19228d;
        zzjdVar.N6().E();
        return zzjdVar.N6().F0().H0(this.f19225a, this.f19226b, this.f19227c);
    }
}
