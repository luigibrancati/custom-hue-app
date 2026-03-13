package X5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class k extends e {
    public k(i iVar, d dVar, long j10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(dVar.f18119a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = dVar.f18121c + (j10 * ((long) dVar.f18123e));
        this.f18128a = iVar.j(byteBufferAllocate, j11);
        this.f18129b = iVar.h(byteBufferAllocate, 8 + j11);
        this.f18130c = iVar.h(byteBufferAllocate, 16 + j11);
        this.f18131d = iVar.h(byteBufferAllocate, j11 + 40);
    }
}
