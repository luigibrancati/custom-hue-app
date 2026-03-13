package N3;

import I3.AbstractC0890u;
import I3.EnumC0891v;
import Q3.I;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f9601c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f9602d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9603b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    static {
        String strI = AbstractC0890u.i("NetworkMeteredCtrlr");
        AbstractC4862t.d(strI, "tagWithPrefix(...)");
        f9602d = strI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(O3.h tracker) {
        super(tracker);
        AbstractC4862t.e(tracker, "tracker");
        this.f9603b = 7;
    }

    @Override // N3.e
    public boolean a(I workSpec) {
        AbstractC4862t.e(workSpec, "workSpec");
        return workSpec.f13597j.f() == EnumC0891v.METERED;
    }

    @Override // N3.b
    public int d() {
        return this.f9603b;
    }

    @Override // N3.b
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean e(M3.f value) {
        AbstractC4862t.e(value, "value");
        return (value.a() && value.b()) ? false : true;
    }
}
