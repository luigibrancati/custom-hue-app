package androidx.camera.core.internal.compat.quirk;

import L.T0;
import android.os.Build;
import androidx.camera.core.d;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class IncorrectJpegMetadataQuirk implements T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f22018a = new HashSet(Arrays.asList("A24", "BEYOND0", "BEYOND2"));

    public static boolean f() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && f22018a.contains(Build.DEVICE.toUpperCase(Locale.US));
    }

    public static boolean h() {
        return f();
    }

    public final boolean d(byte[] bArr) {
        byte b10;
        int i10 = 2;
        while (i10 + 4 <= bArr.length && (b10 = bArr[i10]) == -1) {
            if (b10 == -1 && bArr[i10 + 1] == -38) {
                return true;
            }
            i10 += (((bArr[i10 + 2] & ForkServer.ERROR) << 8) | (bArr[i10 + 3] & ForkServer.ERROR)) + 2;
        }
        return false;
    }

    public final int e(byte[] bArr) {
        int i10 = 2;
        while (true) {
            int i11 = i10 + 1;
            if (i11 > bArr.length) {
                return -1;
            }
            if (bArr[i10] == -1 && bArr[i11] == -40) {
                return i10;
            }
            i10 = i11;
        }
    }

    public byte[] g(d dVar) {
        int iE = 0;
        ByteBuffer byteBufferE = dVar.n0()[0].e();
        byte[] bArr = new byte[byteBufferE.capacity()];
        byteBufferE.rewind();
        byteBufferE.get(bArr);
        return (d(bArr) || (iE = e(bArr)) != -1) ? Arrays.copyOfRange(bArr, iE, byteBufferE.limit()) : bArr;
    }
}
