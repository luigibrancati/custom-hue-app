package r2;

import D1.u;
import G1.AbstractC0853a;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements InterfaceC5527a {
    @Override // r2.InterfaceC5527a
    public final u a(b bVar) {
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC0853a.e(bVar.f5878d);
        AbstractC0853a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return b(bVar, byteBuffer);
    }

    public abstract u b(b bVar, ByteBuffer byteBuffer);
}
