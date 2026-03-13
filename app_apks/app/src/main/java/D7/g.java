package D7;

import A7.C0685i;
import A7.I;
import B7.K;
import B7.N;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N f2303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N f2304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N f2305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final N f2306d;

    public g(N n10, N n11, N n12, N n13) {
        this.f2303a = n10;
        this.f2304b = n11;
        this.f2305c = n12;
        this.f2306d = n13;
    }

    @Override // B7.N
    public final /* bridge */ /* synthetic */ Object zza() {
        return new a(((C0685i) this.f2303a).a(), (File) this.f2304b.zza(), (I) this.f2305c.zza(), K.a(this.f2306d));
    }
}
