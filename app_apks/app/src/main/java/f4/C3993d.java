package f4;

import Od.F;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import com.fasterxml.jackson.core.JsonPointer;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: f4.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C3993d implements InterfaceC3991b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f34135a;

    public C3993d(Context context) {
        AbstractC4862t.e(context, "context");
        this.f34135a = context;
    }

    @Override // f4.InterfaceC3991b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri data) {
        String authority;
        AbstractC4862t.e(data, "data");
        if (!AbstractC4862t.a(data.getScheme(), "android.resource") || (authority = data.getAuthority()) == null || F.k0(authority)) {
            return false;
        }
        List<String> pathSegments = data.getPathSegments();
        AbstractC4862t.d(pathSegments, "data.pathSegments");
        return pathSegments.size() == 2;
    }

    @Override // f4.InterfaceC3991b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Uri map(Uri data) throws PackageManager.NameNotFoundException {
        AbstractC4862t.e(data, "data");
        String authority = data.getAuthority();
        if (authority == null) {
            authority = "";
        }
        Resources resourcesForApplication = this.f34135a.getPackageManager().getResourcesForApplication(authority);
        AbstractC4862t.d(resourcesForApplication, "context.packageManager.g…rApplication(packageName)");
        List<String> pathSegments = data.getPathSegments();
        AbstractC4862t.d(pathSegments, "pathSegments");
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        if (!(identifier != 0)) {
            throw new IllegalStateException(AbstractC4862t.k("Invalid android.resource URI: ", data).toString());
        }
        Uri uri = Uri.parse("android.resource://" + authority + JsonPointer.SEPARATOR + identifier);
        AbstractC4862t.d(uri, "parse(this)");
        return uri;
    }
}
