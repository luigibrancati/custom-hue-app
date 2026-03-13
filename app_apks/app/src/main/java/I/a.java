package I;

import E.AbstractC0807p0;
import E.F0;
import E.J;
import E.W0;
import L.I;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a extends G.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0090a f5377i = new C0090a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final J f5378j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final J f5379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f5380h;

    /* JADX INFO: renamed from: I.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0090a {
        public /* synthetic */ C0090a(AbstractC4854k abstractC4854k) {
            this();
        }

        public C0090a() {
        }
    }

    static {
        J SDR = J.f2794d;
        AbstractC4862t.d(SDR, "SDR");
        f5378j = SDR;
    }

    public a(J dynamicRange) {
        AbstractC4862t.e(dynamicRange, "dynamicRange");
        this.f5379g = dynamicRange;
        this.f5380h = b.DYNAMIC_RANGE;
    }

    @Override // G.b
    public b c() {
        return this.f5380h;
    }

    @Override // G.b
    public boolean d(I cameraInfoInternal, F0 sessionConfig) {
        AbstractC4862t.e(cameraInfoInternal, "cameraInfoInternal");
        AbstractC4862t.e(sessionConfig, "sessionConfig");
        Set setB = cameraInfoInternal.b();
        AbstractC4862t.d(setB, "getSupportedDynamicRanges(...)");
        AbstractC0807p0.a("DynamicRangeFeature", "isSupportedIndividually: cameraInfoSupportedDynamicRanges = " + setB + ", this = " + this);
        if (!setB.contains(this.f5379g)) {
            return false;
        }
        for (W0 w02 : sessionConfig.k()) {
            Set setB2 = w02.B(cameraInfoInternal);
            AbstractC0807p0.a("DynamicRangeFeature", "isSupportedIndividually: useCaseSupportedDynamicRanges = " + setB2 + ", this = " + this + ", useCases = " + w02);
            if (setB2 != null && !setB2.contains(this.f5379g)) {
                return false;
            }
        }
        return true;
    }

    public final J f() {
        return this.f5379g;
    }

    public String toString() {
        return "DynamicRangeFeature(dynamicRange=" + this.f5379g + ')';
    }
}
