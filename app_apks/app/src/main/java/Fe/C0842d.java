package Fe;

import java.io.EOFException;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Fe.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C0842d implements H {
    @Override // Fe.H
    public void J(C0843e source, long j10) throws EOFException {
        AbstractC4862t.e(source, "source");
        source.skip(j10);
    }

    @Override // Fe.H
    public K n() {
        return K.f4081e;
    }

    @Override // Fe.H, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    @Override // Fe.H, java.io.Flushable
    public void flush() {
    }
}
