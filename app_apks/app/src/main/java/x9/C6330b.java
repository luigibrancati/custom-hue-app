package x9;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import u9.w;
import u9.x;
import w9.AbstractC6173b;
import w9.B;
import w9.u;

/* JADX INFO: renamed from: x9.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6330b implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f47940a;

    /* JADX INFO: renamed from: x9.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w f47941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final B f47942b;

        public a(u9.e eVar, Type type, w wVar, B b10) {
            this.f47941a = new C6343o(eVar, wVar, type);
            this.f47942b = b10;
        }

        @Override // u9.w
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Collection c(C9.a aVar) throws IOException {
            if (aVar.C() == C9.b.NULL) {
                aVar.nextNull();
                return null;
            }
            Collection collection = (Collection) this.f47942b.a();
            aVar.beginArray();
            while (aVar.hasNext()) {
                collection.add(this.f47941a.c(aVar));
            }
            aVar.endArray();
            return collection;
        }

        @Override // u9.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(C9.c cVar, Collection collection) throws IOException {
            if (collection == null) {
                cVar.C();
                return;
            }
            cVar.d();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                this.f47941a.e(cVar, it.next());
            }
            cVar.h();
        }
    }

    public C6330b(u uVar) {
        this.f47940a = uVar;
    }

    @Override // u9.x
    public w create(u9.e eVar, B9.a aVar) {
        Type typeD = aVar.d();
        Class clsC = aVar.c();
        if (!Collection.class.isAssignableFrom(clsC)) {
            return null;
        }
        Type typeH = AbstractC6173b.h(typeD, clsC);
        return new a(eVar, typeH, eVar.k(B9.a.b(typeH)), this.f47940a.t(aVar));
    }
}
