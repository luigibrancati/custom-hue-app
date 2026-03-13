package s4;

import Od.C1821a;
import android.content.res.Resources;
import android.view.View;
import fc.AbstractC4036s;
import fc.C4035r;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: s4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5716b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5716b f44014a = new C5716b();

    public final String a(View view) {
        AbstractC4862t.e(view, "<this>");
        if (view.getId() == -1 || c(view)) {
            throw new Resources.NotFoundException();
        }
        Resources resources = view.getContext().getResources();
        String resourceEntryName = resources != null ? resources.getResourceEntryName(view.getId()) : null;
        return resourceEntryName == null ? "" : resourceEntryName;
    }

    public final String b(View view) {
        Object objB;
        AbstractC4862t.e(view, "<this>");
        try {
            C4035r.a aVar = C4035r.f34274b;
            objB = C4035r.b(f44014a.a(view));
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            objB = C4035r.b(AbstractC4036s.a(th));
        }
        if (C4035r.e(objB) != null) {
            if (view.getId() == -1) {
                objB = null;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("0x");
                String string = Integer.toString(view.getId(), C1821a.a(16));
                AbstractC4862t.d(string, "toString(...)");
                sb2.append(string);
                objB = sb2.toString();
            }
        }
        return (String) objB;
    }

    public final boolean c(View view) {
        return (view.getId() & (-16777216)) == 0 && (view.getId() & 16777215) != 0;
    }
}
