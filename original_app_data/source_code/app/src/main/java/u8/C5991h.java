package u8;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: u8.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5991h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f45335b = C5992i.A(UUID.randomUUID().toString() + System.currentTimeMillis());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicLong f45336c = new AtomicLong(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45337a;

    public C5991h() {
        byte[] bArr = new byte[10];
        f(bArr);
        e(bArr);
        d(bArr);
        String strU = C5992i.u(bArr);
        Locale locale = Locale.US;
        this.f45337a = String.format(locale, "%s%s%s%s", strU.substring(0, 12), strU.substring(12, 16), strU.subSequence(16, 20), f45335b.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] a(long j10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) j10);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public static byte[] b(long j10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j10);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public String c() {
        return this.f45337a;
    }

    public final void d(byte[] bArr) {
        byte[] bArrB = b(Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = bArrB[0];
        bArr[9] = bArrB[1];
    }

    public final void e(byte[] bArr) {
        byte[] bArrB = b(f45336c.incrementAndGet());
        bArr[6] = bArrB[0];
        bArr[7] = bArrB[1];
    }

    public final void f(byte[] bArr) {
        long time = new Date().getTime();
        byte[] bArrA = a(time / 1000);
        bArr[0] = bArrA[0];
        bArr[1] = bArrA[1];
        bArr[2] = bArrA[2];
        bArr[3] = bArrA[3];
        byte[] bArrB = b(time % 1000);
        bArr[4] = bArrB[0];
        bArr[5] = bArrB[1];
    }

    public String toString() {
        return this.f45337a;
    }
}
