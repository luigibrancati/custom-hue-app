package Q4;

import android.net.Uri;
import fc.C4034q;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0 f13895a = new s0();

    public final String a(String filename, Uri uri) {
        AbstractC4862t.e(filename, "filename");
        AbstractC4862t.e(uri, "uri");
        return ":::" + filename + "::::::" + uri + ":::";
    }

    public final C4034q b(String packedString) {
        AbstractC4862t.e(packedString, "packedString");
        Uri uri = null;
        Od.k kVarD = Od.o.d(new Od.o(":::([\\s\\S]*?)::::::([\\s\\S]*?):::"), packedString, 0, 2, null);
        if (kVarD == null || kVarD.b().size() != 3) {
            Uri uri2 = Uri.parse(packedString);
            String scheme = uri2 != null ? uri2.getScheme() : null;
            return (scheme == null || scheme.length() <= 0) ? new C4034q(packedString, null) : new C4034q(null, uri2);
        }
        String str = (String) kVarD.b().get(1);
        Uri uri3 = Uri.parse((String) kVarD.b().get(2));
        String scheme2 = uri3 != null ? uri3.getScheme() : null;
        if (scheme2 != null && scheme2.length() > 0) {
            uri = uri3;
        }
        return new C4034q(str, uri);
    }

    public final Uri c(String value) {
        AbstractC4862t.e(value, "value");
        return (Uri) b(value).b();
    }
}
