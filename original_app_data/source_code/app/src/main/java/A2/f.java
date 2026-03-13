package A2;

import G1.C;
import i2.InterfaceC4337q;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f135a = new C(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f136b;

    public final long a(InterfaceC4337q interfaceC4337q) {
        int i10 = 0;
        interfaceC4337q.s(this.f135a.f(), 0, 1);
        int i11 = this.f135a.f()[0] & ForkServer.ERROR;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        interfaceC4337q.s(this.f135a.f(), 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (this.f135a.f()[i10] & ForkServer.ERROR) + (i14 << 8);
        }
        this.f136b += i13 + 1;
        return i14;
    }

    public boolean b(InterfaceC4337q interfaceC4337q) {
        long length = interfaceC4337q.getLength();
        long j10 = 1024;
        if (length != -1 && length <= 1024) {
            j10 = length;
        }
        int i10 = (int) j10;
        interfaceC4337q.s(this.f135a.f(), 0, 4);
        long jN = this.f135a.N();
        this.f136b = 4;
        while (jN != 440786851) {
            int i11 = this.f136b + 1;
            this.f136b = i11;
            if (i11 == i10) {
                return false;
            }
            interfaceC4337q.s(this.f135a.f(), 0, 1);
            jN = ((jN << 8) & (-256)) | ((long) (this.f135a.f()[0] & ForkServer.ERROR));
        }
        long jA = a(interfaceC4337q);
        long j11 = this.f136b;
        if (jA != Long.MIN_VALUE && (length == -1 || j11 + jA < length)) {
            while (true) {
                int i12 = this.f136b;
                long j12 = j11 + jA;
                if (i12 < j12) {
                    if (a(interfaceC4337q) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jA2 = a(interfaceC4337q);
                    if (jA2 < 0 || jA2 > 2147483647L) {
                        break;
                    }
                    if (jA2 != 0) {
                        int i13 = (int) jA2;
                        interfaceC4337q.o(i13);
                        this.f136b += i13;
                    }
                } else if (i12 == j12) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
