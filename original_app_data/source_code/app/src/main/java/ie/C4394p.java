package ie;

import fc.C4025h;
import fe.AbstractC4045a;
import he.AbstractC4304b;
import je.AbstractC4771b;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ie.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4394p extends AbstractC4045a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC4379a f37540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC4771b f37541c;

    public C4394p(AbstractC4379a lexer, AbstractC4304b json) {
        AbstractC4862t.e(lexer, "lexer");
        AbstractC4862t.e(json, "json");
        this.f37540b = lexer;
        this.f37541c = json.d();
    }

    @Override // fe.AbstractC4045a, fe.InterfaceC4049e
    public byte G() {
        AbstractC4379a abstractC4379a = this.f37540b;
        String strS = abstractC4379a.s();
        try {
            return Od.I.a(strS);
        } catch (IllegalArgumentException unused) {
            AbstractC4379a.z(abstractC4379a, "Failed to parse type 'UByte' for input '" + strS + '\'', 0, null, 6, null);
            throw new C4025h();
        }
    }

    @Override // fe.InterfaceC4047c
    public AbstractC4771b b() {
        return this.f37541c;
    }

    @Override // fe.AbstractC4045a, fe.InterfaceC4049e
    public int h() {
        AbstractC4379a abstractC4379a = this.f37540b;
        String strS = abstractC4379a.s();
        try {
            return Od.I.d(strS);
        } catch (IllegalArgumentException unused) {
            AbstractC4379a.z(abstractC4379a, "Failed to parse type 'UInt' for input '" + strS + '\'', 0, null, 6, null);
            throw new C4025h();
        }
    }

    @Override // fe.InterfaceC4047c
    public int j(ee.e descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // fe.AbstractC4045a, fe.InterfaceC4049e
    public long m() {
        AbstractC4379a abstractC4379a = this.f37540b;
        String strS = abstractC4379a.s();
        try {
            return Od.I.g(strS);
        } catch (IllegalArgumentException unused) {
            AbstractC4379a.z(abstractC4379a, "Failed to parse type 'ULong' for input '" + strS + '\'', 0, null, 6, null);
            throw new C4025h();
        }
    }

    @Override // fe.AbstractC4045a, fe.InterfaceC4049e
    public short t() {
        AbstractC4379a abstractC4379a = this.f37540b;
        String strS = abstractC4379a.s();
        try {
            return Od.I.j(strS);
        } catch (IllegalArgumentException unused) {
            AbstractC4379a.z(abstractC4379a, "Failed to parse type 'UShort' for input '" + strS + '\'', 0, null, 6, null);
            throw new C4025h();
        }
    }
}
