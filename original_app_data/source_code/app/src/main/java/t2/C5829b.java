package t2;

import D1.u;
import G1.AbstractC0853a;
import G1.C;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: t2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5829b extends r2.c {
    @Override // r2.c
    public u b(r2.b bVar, ByteBuffer byteBuffer) {
        return new u(c(new C(byteBuffer.array(), byteBuffer.limit())));
    }

    public C5828a c(C c10) {
        return new C5828a((String) AbstractC0853a.e(c10.F()), (String) AbstractC0853a.e(c10.F()), c10.E(), c10.E(), Arrays.copyOfRange(c10.f(), c10.g(), c10.j()));
    }
}
