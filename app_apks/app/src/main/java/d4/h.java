package d4;

import Fe.v;
import a4.InterfaceC2641a;
import android.webkit.MimeTypeMap;
import d4.InterfaceC3824g;
import j4.AbstractC4689h;
import java.io.File;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h implements InterfaceC3824g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33111a;

    public h(boolean z10) {
        this.f33111a = z10;
    }

    @Override // d4.InterfaceC3824g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(InterfaceC2641a interfaceC2641a, File file, AbstractC4689h abstractC4689h, c4.i iVar, InterfaceC4988e interfaceC4988e) {
        return new m(v.c(v.i(file)), MimeTypeMap.getSingleton().getMimeTypeFromExtension(sc.l.o(file)), c4.b.DISK);
    }

    @Override // d4.InterfaceC3824g
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean a(File file) {
        return InterfaceC3824g.a.a(this, file);
    }

    @Override // d4.InterfaceC3824g
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public String b(File data) {
        AbstractC4862t.e(data, "data");
        if (!this.f33111a) {
            String path = data.getPath();
            AbstractC4862t.d(path, "data.path");
            return path;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) data.getPath());
        sb2.append(':');
        sb2.append(data.lastModified());
        return sb2.toString();
    }
}
