package d4;

import Fe.InterfaceC0845g;
import Fe.v;
import a4.InterfaceC2641a;
import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import gc.C4179C;
import io.flutter.plugins.firebase.crashlytics.Constants;
import j4.AbstractC4689h;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;

/* JADX INFO: renamed from: d4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C3818a implements InterfaceC3824g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0399a f33104b = new C0399a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f33105a;

    /* JADX INFO: renamed from: d4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0399a {
        public /* synthetic */ C0399a(AbstractC4854k abstractC4854k) {
            this();
        }

        public C0399a() {
        }
    }

    public C3818a(Context context) {
        AbstractC4862t.e(context, "context");
        this.f33105a = context;
    }

    @Override // d4.InterfaceC3824g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(InterfaceC2641a interfaceC2641a, Uri uri, AbstractC4689h abstractC4689h, c4.i iVar, InterfaceC4988e interfaceC4988e) throws IOException {
        List<String> pathSegments = uri.getPathSegments();
        AbstractC4862t.d(pathSegments, "data.pathSegments");
        String strQ0 = C4179C.q0(C4179C.b0(pathSegments, 1), "/", null, null, 0, null, null, 62, null);
        InputStream inputStreamOpen = this.f33105a.getAssets().open(strQ0);
        AbstractC4862t.d(inputStreamOpen, "context.assets.open(path)");
        InterfaceC0845g interfaceC0845gC = v.c(v.j(inputStreamOpen));
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        AbstractC4862t.d(singleton, "getSingleton()");
        return new m(interfaceC0845gC, n4.e.e(singleton, strQ0), c4.b.DISK);
    }

    @Override // d4.InterfaceC3824g
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri data) {
        AbstractC4862t.e(data, "data");
        return AbstractC4862t.a(data.getScheme(), Constants.FILE) && AbstractC4862t.a(n4.e.c(data), "android_asset");
    }

    @Override // d4.InterfaceC3824g
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public String b(Uri data) {
        AbstractC4862t.e(data, "data");
        String string = data.toString();
        AbstractC4862t.d(string, "data.toString()");
        return string;
    }
}
