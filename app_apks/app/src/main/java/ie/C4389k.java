package ie;

import he.AbstractC4304b;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ie.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4389k extends C4386h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC4304b f37537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37538d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4389k(InterfaceC4393o writer, AbstractC4304b json) {
        super(writer);
        AbstractC4862t.e(writer, "writer");
        AbstractC4862t.e(json, "json");
        this.f37537c = json;
    }

    @Override // ie.C4386h
    public void b() {
        o(true);
        this.f37538d++;
    }

    @Override // ie.C4386h
    public void c() {
        o(false);
        k("\n");
        int i10 = this.f37538d;
        for (int i11 = 0; i11 < i10; i11++) {
            k(this.f37537c.c().n());
        }
    }

    @Override // ie.C4386h
    public void d() {
        if (a()) {
            o(false);
        } else {
            c();
        }
    }

    @Override // ie.C4386h
    public void p() {
        f(' ');
    }

    @Override // ie.C4386h
    public void q() {
        this.f37538d--;
    }
}
