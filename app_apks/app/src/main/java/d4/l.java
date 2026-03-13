package d4;

import Fe.v;
import Od.B;
import Od.F;
import a4.InterfaceC2641a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import com.fasterxml.jackson.core.JsonPointer;
import fc.C4025h;
import gc.C4179C;
import j4.AbstractC4689h;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import n4.AbstractC5087c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class l implements InterfaceC3824g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f33122c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f33123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c4.f f33124b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public l(Context context, c4.f drawableDecoder) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(drawableDecoder, "drawableDecoder");
        this.f33123a = context;
        this.f33124b = drawableDecoder;
    }

    @Override // d4.InterfaceC3824g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(InterfaceC2641a interfaceC2641a, Uri uri, AbstractC4689h abstractC4689h, c4.i iVar, InterfaceC4988e interfaceC4988e) throws PackageManager.NameNotFoundException {
        String authority = uri.getAuthority();
        if (authority == null || F.k0(authority)) {
            authority = null;
        }
        if (authority == null) {
            g(uri);
            throw new C4025h();
        }
        List<String> pathSegments = uri.getPathSegments();
        AbstractC4862t.d(pathSegments, "data.pathSegments");
        String str = (String) C4179C.u0(pathSegments);
        Integer numU = str != null ? B.u(str) : null;
        if (numU == null) {
            g(uri);
            throw new C4025h();
        }
        int iIntValue = numU.intValue();
        Context contextE = iVar.e();
        Resources resourcesForApplication = contextE.getPackageManager().getResourcesForApplication(authority);
        AbstractC4862t.d(resourcesForApplication, "context.packageManager.g…rApplication(packageName)");
        TypedValue typedValue = new TypedValue();
        resourcesForApplication.getValue(iIntValue, typedValue, true);
        CharSequence path = typedValue.string;
        AbstractC4862t.d(path, "path");
        String string = path.subSequence(F.n0(path, JsonPointer.SEPARATOR, 0, false, 6, null), path.length()).toString();
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        AbstractC4862t.d(singleton, "getSingleton()");
        String strE = n4.e.e(singleton, string);
        if (!AbstractC4862t.a(strE, "text/xml")) {
            InputStream inputStreamOpenRawResource = resourcesForApplication.openRawResource(iIntValue);
            AbstractC4862t.d(inputStreamOpenRawResource, "resources.openRawResource(resId)");
            return new m(v.c(v.j(inputStreamOpenRawResource)), strE, c4.b.DISK);
        }
        Drawable drawableA = AbstractC4862t.a(authority, contextE.getPackageName()) ? AbstractC5087c.a(contextE, iIntValue) : AbstractC5087c.d(contextE, resourcesForApplication, iIntValue);
        boolean zK = n4.e.k(drawableA);
        if (zK) {
            Bitmap bitmapA = this.f33124b.a(drawableA, iVar.d(), abstractC4689h, iVar.j(), iVar.a());
            Resources resources = contextE.getResources();
            AbstractC4862t.d(resources, "context.resources");
            drawableA = new BitmapDrawable(resources, bitmapA);
        }
        return new C3822e(drawableA, zK, c4.b.DISK);
    }

    @Override // d4.InterfaceC3824g
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri data) {
        AbstractC4862t.e(data, "data");
        return AbstractC4862t.a(data.getScheme(), "android.resource");
    }

    @Override // d4.InterfaceC3824g
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public String b(Uri data) {
        AbstractC4862t.e(data, "data");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(data);
        sb2.append('-');
        Configuration configuration = this.f33123a.getResources().getConfiguration();
        AbstractC4862t.d(configuration, "context.resources.configuration");
        sb2.append(n4.e.f(configuration));
        return sb2.toString();
    }

    public final Void g(Uri uri) {
        throw new IllegalStateException(AbstractC4862t.k("Invalid android.resource URI: ", uri));
    }
}
