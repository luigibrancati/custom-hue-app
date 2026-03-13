package j9;

import com.fasterxml.jackson.core.JsonPointer;
import java.util.Iterator;
import java.util.Set;
import o8.C5233c;
import o8.InterfaceC5234d;
import o8.q;

/* JADX INFO: renamed from: j9.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C4751c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f39100b;

    public C4751c(Set set, d dVar) {
        this.f39099a = d(set);
        this.f39100b = dVar;
    }

    public static /* synthetic */ i b(InterfaceC5234d interfaceC5234d) {
        return new C4751c(interfaceC5234d.c(f.class), d.a());
    }

    public static C5233c c() {
        return C5233c.c(i.class).b(q.o(f.class)).f(new o8.g() { // from class: j9.b
            @Override // o8.g
            public final Object a(InterfaceC5234d interfaceC5234d) {
                return C4751c.b(interfaceC5234d);
            }
        }).d();
    }

    public static String d(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            sb2.append(fVar.b());
            sb2.append(JsonPointer.SEPARATOR);
            sb2.append(fVar.c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // j9.i
    public String a() {
        if (this.f39100b.b().isEmpty()) {
            return this.f39099a;
        }
        return this.f39099a + ' ' + d(this.f39100b.b());
    }
}
