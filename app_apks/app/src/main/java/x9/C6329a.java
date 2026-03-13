package x9;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import u9.w;
import u9.x;
import w9.AbstractC6173b;

/* JADX INFO: renamed from: x9.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6329a extends w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f47937c = new C0666a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f47938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f47939b;

    /* JADX INFO: renamed from: x9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0666a implements x {
        @Override // u9.x
        public w create(u9.e eVar, B9.a aVar) {
            Type typeD = aVar.d();
            if (!(typeD instanceof GenericArrayType) && (!(typeD instanceof Class) || !((Class) typeD).isArray())) {
                return null;
            }
            Type typeG = AbstractC6173b.g(typeD);
            return new C6329a(eVar, eVar.k(B9.a.b(typeG)), AbstractC6173b.k(typeG));
        }
    }

    public C6329a(u9.e eVar, w wVar, Class cls) {
        this.f47939b = new C6343o(eVar, wVar, cls);
        this.f47938a = cls;
    }

    @Override // u9.w
    public Object c(C9.a aVar) throws IOException {
        if (aVar.C() == C9.b.NULL) {
            aVar.nextNull();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.beginArray();
        while (aVar.hasNext()) {
            arrayList.add(this.f47939b.c(aVar));
        }
        aVar.endArray();
        int size = arrayList.size();
        if (!this.f47938a.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.f47938a, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) this.f47938a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override // u9.w
    public void e(C9.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.C();
            return;
        }
        cVar.d();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f47939b.e(cVar, Array.get(obj, i10));
        }
        cVar.h();
    }
}
