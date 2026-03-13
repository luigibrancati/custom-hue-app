package androidx.media3.exoplayer.rtsp;

import androidx.media3.exoplayer.rtsp.a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class k implements a.InterfaceC0301a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23835a;

    public k(long j10) {
        this.f23835a = j10;
    }

    @Override // androidx.media3.exoplayer.rtsp.a.InterfaceC0301a
    public a a(int i10) {
        j jVar = new j(this.f23835a);
        jVar.f(W1.h.a(i10 * 2));
        return jVar;
    }
}
