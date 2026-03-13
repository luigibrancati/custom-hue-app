package X6;

import com.google.android.gms.measurement.internal.zzjd;
import java.util.Objects;

/* JADX INFO: renamed from: X6.n3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2448n3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f19125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f19126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f19127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f19128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzjd f19129e;

    public RunnableC2448n3(zzjd zzjdVar, String str, String str2, String str3, long j10) {
        this.f19125a = str;
        this.f19126b = str2;
        this.f19127c = str3;
        this.f19128d = j10;
        Objects.requireNonNull(zzjdVar);
        this.f19129e = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f19125a;
        if (str == null) {
            zzjd zzjdVar = this.f19129e;
            zzjdVar.N6().t0(this.f19126b, null);
        } else {
            C2362c5 c2362c5 = new C2362c5(this.f19127c, str, this.f19128d);
            zzjd zzjdVar2 = this.f19129e;
            zzjdVar2.N6().t0(this.f19126b, c2362c5);
        }
    }
}
