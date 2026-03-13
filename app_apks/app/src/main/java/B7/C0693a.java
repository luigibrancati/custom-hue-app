package B7;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: renamed from: B7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C0693a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f711a;

    public C0693a(ByteBuffer byteBuffer) {
        this.f711a = byteBuffer.slice();
    }

    @Override // B7.r
    public final void a(MessageDigest[] messageDigestArr, long j10, int i10) {
        ByteBuffer byteBufferSlice;
        synchronized (this.f711a) {
            int i11 = (int) j10;
            this.f711a.position(i11);
            this.f711a.limit(i11 + i10);
            byteBufferSlice = this.f711a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    @Override // B7.r
    public final long zza() {
        return this.f711a.capacity();
    }
}
