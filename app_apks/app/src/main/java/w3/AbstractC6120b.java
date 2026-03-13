package w3;

import android.webkit.WebSettings;
import x3.AbstractC6295a;
import x3.j;
import x3.k;
import x3.l;

/* JADX INFO: renamed from: w3.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6120b {
    public static j a(WebSettings webSettings) {
        return l.c().a(webSettings);
    }

    public static void b(WebSettings webSettings, int i10) {
        AbstractC6295a.h hVar = k.f47378T;
        if (hVar.b()) {
            x3.d.a(webSettings, i10);
        } else {
            if (!hVar.c()) {
                throw k.a();
            }
            a(webSettings).a(i10);
        }
    }

    public static void c(WebSettings webSettings, int i10) {
        if (!k.f47379U.c()) {
            throw k.a();
        }
        a(webSettings).b(i10);
    }

    public static void d(WebSettings webSettings, boolean z10) {
        if (!k.f47424t0.c()) {
            throw k.a();
        }
        a(webSettings).c(z10);
    }
}
