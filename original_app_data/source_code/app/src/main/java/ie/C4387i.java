package ie;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ie.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4387i extends C4386h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f37535c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4387i(InterfaceC4393o writer, boolean z10) {
        super(writer);
        AbstractC4862t.e(writer, "writer");
        this.f37535c = z10;
    }

    @Override // ie.C4386h
    public void n(String value) {
        AbstractC4862t.e(value, "value");
        if (this.f37535c) {
            super.n(value);
        } else {
            super.k(value);
        }
    }
}
