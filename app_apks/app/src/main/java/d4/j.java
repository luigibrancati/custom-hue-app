package d4;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC4862t;
import pe.InterfaceC5469e;
import pe.v;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j extends i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(InterfaceC5469e.a callFactory) {
        super(callFactory);
        AbstractC4862t.e(callFactory, "callFactory");
    }

    @Override // d4.i, d4.InterfaceC3824g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri data) {
        AbstractC4862t.e(data, "data");
        return AbstractC4862t.a(data.getScheme(), "http") || AbstractC4862t.a(data.getScheme(), "https");
    }

    @Override // d4.InterfaceC3824g
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public String b(Uri data) {
        AbstractC4862t.e(data, "data");
        String string = data.toString();
        AbstractC4862t.d(string, "data.toString()");
        return string;
    }

    @Override // d4.i
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public v f(Uri uri) {
        AbstractC4862t.e(uri, "<this>");
        v vVarG = v.g(uri.toString());
        AbstractC4862t.d(vVarG, "get(toString())");
        return vVarG;
    }
}
