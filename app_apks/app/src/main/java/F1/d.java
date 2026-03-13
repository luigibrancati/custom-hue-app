package F1;

import G1.AbstractC0853a;
import G1.M;
import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3642a = M.z0(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f3643b = M.z0(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f3644c = M.z0(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f3645d = M.z0(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f3646e = M.z0(4);

    public static ArrayList a(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
            arrayList.add(b(spanned, fVar, 1, fVar.b()));
        }
        for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
            arrayList.add(b(spanned, hVar, 2, hVar.b()));
        }
        for (e eVar : (e[]) spanned.getSpans(0, spanned.length(), e.class)) {
            arrayList.add(b(spanned, eVar, 3, null));
        }
        for (i iVar : (i[]) spanned.getSpans(0, spanned.length(), i.class)) {
            arrayList.add(b(spanned, iVar, 4, iVar.b()));
        }
        return arrayList;
    }

    public static Bundle b(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f3642a, spanned.getSpanStart(obj));
        bundle2.putInt(f3643b, spanned.getSpanEnd(obj));
        bundle2.putInt(f3644c, spanned.getSpanFlags(obj));
        bundle2.putInt(f3645d, i10);
        if (bundle != null) {
            bundle2.putBundle(f3646e, bundle);
        }
        return bundle2;
    }

    public static void c(Bundle bundle, Spannable spannable) {
        int i10 = bundle.getInt(f3642a);
        int i11 = bundle.getInt(f3643b);
        int i12 = bundle.getInt(f3644c);
        int i13 = bundle.getInt(f3645d, -1);
        Bundle bundle2 = bundle.getBundle(f3646e);
        if (i13 == 1) {
            spannable.setSpan(f.a((Bundle) AbstractC0853a.e(bundle2)), i10, i11, i12);
            return;
        }
        if (i13 == 2) {
            spannable.setSpan(h.a((Bundle) AbstractC0853a.e(bundle2)), i10, i11, i12);
        } else if (i13 == 3) {
            spannable.setSpan(new e(), i10, i11, i12);
        } else {
            if (i13 != 4) {
                return;
            }
            spannable.setSpan(i.a((Bundle) AbstractC0853a.e(bundle2)), i10, i11, i12);
        }
    }
}
