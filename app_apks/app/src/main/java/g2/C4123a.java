package g2;

import H1.h;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: renamed from: g2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4123a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h.e f35142a;

    public final boolean a(h.d dVar, boolean z10) {
        h.e eVar;
        h.b bVarB;
        int i10 = dVar.f5215a;
        if (i10 == 2 || i10 == 15) {
            return true;
        }
        if (i10 != 3 || z10) {
            return ((i10 != 6 && i10 != 3) || (eVar = this.f35142a) == null || (bVarB = h.b.b(eVar, dVar)) == null || bVarB.a()) ? false : true;
        }
        return false;
    }

    public void b(ByteBuffer byteBuffer) {
        e(H1.h.e(byteBuffer));
    }

    public void c() {
        this.f35142a = null;
    }

    public int d(ByteBuffer byteBuffer, boolean z10) {
        List listE = H1.h.e(byteBuffer);
        e(listE);
        int size = listE.size() - 1;
        int i10 = 0;
        while (size >= 0 && a((h.d) listE.get(size), z10)) {
            if (((h.d) listE.get(size)).f5215a == 6 || ((h.d) listE.get(size)).f5215a == 3) {
                i10++;
            }
            size--;
        }
        return (i10 > 1 || size + 1 >= 8) ? byteBuffer.limit() : size >= 0 ? ((h.d) listE.get(size)).f5216b.limit() : byteBuffer.position();
    }

    public final void e(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((h.d) list.get(i10)).f5215a == 1) {
                this.f35142a = h.e.a((h.d) list.get(i10));
            }
        }
    }
}
