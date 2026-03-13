package j9;

import android.content.Context;
import o8.C5233c;
import o8.InterfaceC5234d;
import o8.q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        String extract(Object obj);
    }

    public static C5233c b(String str, String str2) {
        return C5233c.l(f.a(str, str2), f.class);
    }

    public static C5233c c(final String str, final a aVar) {
        return C5233c.m(f.class).b(q.k(Context.class)).f(new o8.g() { // from class: j9.g
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return f.a(str, aVar.extract((Context) interfaceC5234d.get(Context.class)));
            }
        }).d();
    }
}
