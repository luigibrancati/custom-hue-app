package S;

import L.X0;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncorrectJpegMetadataQuirk f15222a;

    public d(X0 x02) {
        this.f15222a = (IncorrectJpegMetadataQuirk) x02.b(IncorrectJpegMetadataQuirk.class);
    }

    public byte[] a(androidx.camera.core.d dVar) {
        IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk = this.f15222a;
        if (incorrectJpegMetadataQuirk != null) {
            return incorrectJpegMetadataQuirk.g(dVar);
        }
        ByteBuffer byteBufferE = dVar.n0()[0].e();
        byte[] bArr = new byte[byteBufferE.capacity()];
        byteBufferE.rewind();
        byteBufferE.get(bArr);
        return bArr;
    }
}
