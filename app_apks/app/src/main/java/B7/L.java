package B7;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class L implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileChannel f697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f699c;

    public L(FileChannel fileChannel, long j10, long j11) {
        this.f697a = fileChannel;
        this.f698b = j10;
        this.f699c = j11;
    }

    @Override // B7.r
    public final void a(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
        MappedByteBuffer map = this.f697a.map(FileChannel.MapMode.READ_ONLY, this.f698b + j10, i10);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // B7.r
    public final long zza() {
        return this.f699c;
    }
}
