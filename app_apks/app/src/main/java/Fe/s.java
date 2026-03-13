package Fe;

import java.io.RandomAccessFile;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends AbstractC0847i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RandomAccessFile f4156e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(boolean z10, RandomAccessFile randomAccessFile) {
        super(z10);
        AbstractC4862t.e(randomAccessFile, "randomAccessFile");
        this.f4156e = randomAccessFile;
    }

    @Override // Fe.AbstractC0847i
    public synchronized void g() {
        this.f4156e.close();
    }

    @Override // Fe.AbstractC0847i
    public synchronized int h(long j10, byte[] array, int i10, int i11) {
        AbstractC4862t.e(array, "array");
        this.f4156e.seek(j10);
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            int i13 = this.f4156e.read(array, i10, i11 - i12);
            if (i13 != -1) {
                i12 += i13;
            } else if (i12 == 0) {
                return -1;
            }
        }
        return i12;
    }

    @Override // Fe.AbstractC0847i
    public synchronized long i() {
        return this.f4156e.length();
    }
}
