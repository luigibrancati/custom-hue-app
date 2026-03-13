package ta;

import android.os.ParcelUuid;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.UUID;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UUID f44842a = UUID.fromString("00000000-0000-1000-8000-00805F9B34FB");

    public static ParcelUuid e(byte[] bArr) {
        long j10;
        if (bArr == null) {
            throw new IllegalArgumentException("uuidBytes cannot be null");
        }
        int length = bArr.length;
        if (length != 2 && length != 4 && length != 16) {
            throw new IllegalArgumentException("uuidBytes length invalid - " + length);
        }
        if (length == 16) {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            return new ParcelUuid(new UUID(byteBufferOrder.getLong(8), byteBufferOrder.getLong(0)));
        }
        if (length == 2) {
            j10 = ((long) (bArr[0] & ForkServer.ERROR)) + ((long) ((bArr[1] & ForkServer.ERROR) << 8));
        } else {
            j10 = ((long) ((bArr[3] & ForkServer.ERROR) << 24)) + ((long) (bArr[0] & ForkServer.ERROR)) + ((long) ((bArr[1] & ForkServer.ERROR) << 8)) + ((long) ((bArr[2] & ForkServer.ERROR) << 16));
        }
        UUID uuid = f44842a;
        return new ParcelUuid(new UUID(uuid.getMostSignificantBits() + (j10 << 32), uuid.getLeastSignificantBits()));
    }

    public final byte[] a(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ua.e b(byte[] r17) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ta.H.b(byte[]):ua.e");
    }

    public final int c(byte[] bArr, int i10, int i11, int i12, List list) {
        while (i11 > 0) {
            list.add(e(a(bArr, i10, i12)));
            i11 -= i12;
            i10 += i12;
        }
        return i10;
    }

    public final int d(byte[] bArr, int i10, int i11, int i12, List list) {
        while (i11 > 0) {
            list.add(e(a(bArr, i10, i12)));
            i11 -= i12;
            i10 += i12;
        }
        return i10;
    }
}
