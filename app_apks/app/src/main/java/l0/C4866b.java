package l0;

import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import l0.InterfaceC4869e;
import vc.p;

/* JADX INFO: renamed from: l0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4866b implements InterfaceC4869e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4869e f39799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4869e f39800c;

    /* JADX INFO: renamed from: l0.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f39801a = new a();

        public a() {
            super(2);
        }

        @Override // vc.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, InterfaceC4869e.b bVar) {
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public C4866b(InterfaceC4869e interfaceC4869e, InterfaceC4869e interfaceC4869e2) {
        this.f39799b = interfaceC4869e;
        this.f39800c = interfaceC4869e2;
    }

    @Override // l0.InterfaceC4869e
    public Object a(Object obj, p pVar) {
        return this.f39800c.a(this.f39799b.a(obj, pVar), pVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4866b)) {
            return false;
        }
        C4866b c4866b = (C4866b) obj;
        return AbstractC4862t.a(this.f39799b, c4866b.f39799b) && AbstractC4862t.a(this.f39800c, c4866b.f39800c);
    }

    public int hashCode() {
        return this.f39799b.hashCode() + (this.f39800c.hashCode() * 31);
    }

    public String toString() {
        return '[' + ((String) a("", a.f39801a)) + ']';
    }
}
