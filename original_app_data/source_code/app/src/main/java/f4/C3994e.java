package f4;

import android.net.Uri;
import f4.InterfaceC3991b;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: f4.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C3994e implements InterfaceC3991b {
    @Override // f4.InterfaceC3991b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(String str) {
        return InterfaceC3991b.a.a(this, str);
    }

    @Override // f4.InterfaceC3991b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Uri map(String data) {
        AbstractC4862t.e(data, "data");
        Uri uri = Uri.parse(data);
        AbstractC4862t.d(uri, "parse(this)");
        return uri;
    }
}
