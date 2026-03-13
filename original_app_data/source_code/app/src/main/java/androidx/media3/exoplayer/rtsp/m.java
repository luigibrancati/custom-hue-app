package androidx.media3.exoplayer.rtsp;

import androidx.media3.exoplayer.rtsp.a;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class m implements a.InterfaceC0301a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23838a;

    public m(long j10) {
        this.f23838a = j10;
    }

    @Override // androidx.media3.exoplayer.rtsp.a.InterfaceC0301a
    public a a(int i10) throws IOException {
        l lVar = new l(this.f23838a);
        l lVar2 = new l(this.f23838a);
        try {
            lVar.f(W1.h.a(0));
            int iC = lVar.c();
            boolean z10 = iC % 2 == 0;
            lVar2.f(W1.h.a(z10 ? iC + 1 : iC - 1));
            if (z10) {
                lVar.l(lVar2);
                return lVar;
            }
            lVar2.l(lVar);
            return lVar2;
        } catch (IOException e10) {
            I1.i.a(lVar);
            I1.i.a(lVar2);
            throw e10;
        }
    }

    @Override // androidx.media3.exoplayer.rtsp.a.InterfaceC0301a
    public a.InterfaceC0301a b() {
        return new k(this.f23838a);
    }
}
