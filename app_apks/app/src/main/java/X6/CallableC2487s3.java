package X6;

import com.google.android.gms.measurement.internal.zzjd;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X6.s3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC2487s3 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f19208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f19209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f19210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzjd f19211d;

    public CallableC2487s3(zzjd zzjdVar, String str, String str2, String str3) {
        this.f19208a = str;
        this.f19209b = str2;
        this.f19210c = str3;
        Objects.requireNonNull(zzjdVar);
        this.f19211d = zzjdVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzjd zzjdVar = this.f19211d;
        zzjdVar.N6().E();
        return zzjdVar.N6().F0().H0(this.f19208a, this.f19209b, this.f19210c);
    }
}
