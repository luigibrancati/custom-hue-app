package x9;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import u9.w;
import x9.C6340l;

/* JADX INFO: renamed from: x9.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6343o extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u9.e f48022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f48023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type f48024c;

    public C6343o(u9.e eVar, w wVar, Type type) {
        this.f48022a = eVar;
        this.f48023b = wVar;
        this.f48024c = type;
    }

    public static Type f(Type type, Object obj) {
        return obj != null ? ((type instanceof Class) || (type instanceof TypeVariable)) ? obj.getClass() : type : type;
    }

    public static boolean g(w wVar) {
        w wVarF;
        while ((wVar instanceof AbstractC6341m) && (wVarF = ((AbstractC6341m) wVar).f()) != wVar) {
            wVar = wVarF;
        }
        return wVar instanceof C6340l.c;
    }

    @Override // u9.w
    public Object c(C9.a aVar) {
        return this.f48023b.c(aVar);
    }

    @Override // u9.w
    public void e(C9.c cVar, Object obj) {
        w wVarK = this.f48023b;
        Type typeF = f(this.f48024c, obj);
        if (typeF != this.f48024c) {
            wVarK = this.f48022a.k(B9.a.b(typeF));
            if ((wVarK instanceof C6340l.c) && !g(this.f48023b)) {
                wVarK = this.f48023b;
            }
        }
        wVarK.e(cVar, obj);
    }
}
