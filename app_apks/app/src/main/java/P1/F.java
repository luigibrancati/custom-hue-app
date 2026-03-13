package P1;

import D1.AbstractC0747e;
import G1.AbstractC0853a;
import G1.M;
import I1.f;
import I1.j;
import K7.AbstractC1083x;
import P1.A;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.mime.MimeTypes;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class F implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f.a f12559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f12562d;

    public F(String str, boolean z10, f.a aVar) {
        AbstractC0853a.a((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f12559a = aVar;
        this.f12560b = str;
        this.f12561c = z10;
        this.f12562d = new HashMap();
    }

    @Override // P1.H
    public byte[] a(UUID uuid, A.a aVar) throws I {
        String strB = aVar.b();
        if (this.f12561c || TextUtils.isEmpty(strB)) {
            strB = this.f12560b;
        }
        if (TextUtils.isEmpty(strB)) {
            j.b bVar = new j.b();
            Uri uri = Uri.EMPTY;
            throw new I(bVar.i(uri).a(), uri, AbstractC1083x.j(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = AbstractC0747e.f1688e;
        map.put(HttpHeaders.CONTENT_TYPE, uuid2.equals(uuid) ? "text/xml" : AbstractC0747e.f1686c.equals(uuid) ? "application/json" : MimeTypes.OCTET_STREAM);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f12562d) {
            map.putAll(this.f12562d);
        }
        return x.a(this.f12559a.a(), strB, aVar.a(), map);
    }

    @Override // P1.H
    public byte[] b(UUID uuid, A.d dVar) {
        return x.a(this.f12559a.a(), dVar.b() + "&signedRequest=" + M.H(dVar.a()), null, Collections.EMPTY_MAP);
    }

    public void c(String str, String str2) {
        AbstractC0853a.e(str);
        AbstractC0853a.e(str2);
        synchronized (this.f12562d) {
            this.f12562d.put(str, str2);
        }
    }
}
