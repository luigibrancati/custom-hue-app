package Jd;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f6401a;

    public e(c arrayMap) {
        AbstractC4862t.e(arrayMap, "arrayMap");
        this.f6401a = arrayMap;
    }

    @Override // Jd.a
    public final c c() {
        return this.f6401a;
    }

    public final void e(Cc.d tClass, Object value) {
        AbstractC4862t.e(tClass, "tClass");
        AbstractC4862t.e(value, "value");
        int iD = d().d(tClass);
        int iC = this.f6401a.c();
        if (iC == 0) {
            this.f6401a = new o(value, iD);
            return;
        }
        if (iC == 1) {
            c cVar = this.f6401a;
            AbstractC4862t.c(cVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
            o oVar = (o) cVar;
            if (oVar.e() == iD) {
                this.f6401a = new o(value, iD);
                return;
            } else {
                d dVar = new d();
                this.f6401a = dVar;
                dVar.d(oVar.e(), oVar.f());
            }
        }
        this.f6401a.d(iD, value);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e() {
        i iVar = i.f6414a;
        AbstractC4862t.c(iVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
        this(iVar);
    }
}
