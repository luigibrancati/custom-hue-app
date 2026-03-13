package androidx.media3.exoplayer.rtsp;

import D1.w;
import G1.M;
import android.net.Uri;
import android.util.Base64;
import androidx.media3.exoplayer.rtsp.h;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f23727d;

    public c(int i10, String str, String str2, String str3) {
        this.f23724a = i10;
        this.f23725b = str;
        this.f23726c = str2;
        this.f23727d = str3;
    }

    public String a(h.a aVar, Uri uri, int i10) throws w {
        int i11 = this.f23724a;
        if (i11 == 1) {
            return b(aVar);
        }
        if (i11 == 2) {
            return c(aVar, uri, i10);
        }
        throw w.d(null, new UnsupportedOperationException());
    }

    public final String b(h.a aVar) {
        return M.G("Basic %s", Base64.encodeToString(h.d(aVar.f23824a + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + aVar.f23825b), 0));
    }

    public final String c(h.a aVar, Uri uri, int i10) throws w {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            String strT = h.t(i10);
            String strL1 = M.l1(messageDigest.digest(h.d(aVar.f23824a + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + this.f23725b + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + aVar.f23825b)));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strT);
            sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            sb2.append(uri);
            String strL12 = M.l1(messageDigest.digest(h.d(strL1 + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + this.f23726c + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + M.l1(messageDigest.digest(h.d(sb2.toString()))))));
            return this.f23727d.isEmpty() ? M.G("Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", aVar.f23824a, this.f23725b, this.f23726c, uri, strL12) : M.G("Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", aVar.f23824a, this.f23725b, this.f23726c, uri, strL12, this.f23727d);
        } catch (NoSuchAlgorithmException e10) {
            throw w.d(null, e10);
        }
    }
}
