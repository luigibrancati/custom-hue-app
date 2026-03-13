package T1;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class o extends J1.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f15956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15958c;

    public o(Throwable th, p pVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Decoder failed: ");
        sb2.append(pVar == null ? null : pVar.f15959a);
        super(sb2.toString(), th);
        this.f15956a = pVar;
        this.f15957b = th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null;
        this.f15958c = a(th);
    }

    public static int a(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getErrorCode();
        }
        return 0;
    }
}
