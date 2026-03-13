package ie;

import he.AbstractC4304b;
import he.C4305c;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C extends AbstractC4381c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C4305c f37469h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f37470i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f37471j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(AbstractC4304b json, C4305c value) {
        super(json, value, null, 4, null);
        AbstractC4862t.e(json, "json");
        AbstractC4862t.e(value, "value");
        this.f37469h = value;
        this.f37470i = D0().size();
        this.f37471j = -1;
    }

    @Override // ie.AbstractC4381c
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public C4305c D0() {
        return this.f37469h;
    }

    @Override // ge.U
    public String i0(ee.e descriptor, int i10) {
        AbstractC4862t.e(descriptor, "descriptor");
        return String.valueOf(i10);
    }

    @Override // fe.InterfaceC4047c
    public int j(ee.e descriptor) {
        AbstractC4862t.e(descriptor, "descriptor");
        int i10 = this.f37471j;
        if (i10 >= this.f37470i - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f37471j = i11;
        return i11;
    }

    @Override // ie.AbstractC4381c
    public he.h o0(String tag) {
        AbstractC4862t.e(tag, "tag");
        return D0().get(Integer.parseInt(tag));
    }
}
