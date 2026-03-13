package X6;

import com.google.android.gms.measurement.internal.zzjd;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X6.q3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC2472q3 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f19165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f19166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f19167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzjd f19168d;

    public CallableC2472q3(zzjd zzjdVar, String str, String str2, String str3) {
        this.f19165a = str;
        this.f19166b = str2;
        this.f19167c = str3;
        Objects.requireNonNull(zzjdVar);
        this.f19168d = zzjdVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzjd zzjdVar = this.f19168d;
        zzjdVar.N6().E();
        return zzjdVar.N6().F0().D0(this.f19165a, this.f19166b, this.f19167c);
    }
}
