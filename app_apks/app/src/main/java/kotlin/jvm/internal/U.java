package kotlin.jvm.internal;

import fc.C4015H;
import fc.C4032o;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class U implements Cc.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39782a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: kotlin.jvm.internal.U$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final /* synthetic */ class C0519a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f39783a;

            static {
                int[] iArr = new int[Cc.s.values().length];
                try {
                    iArr[Cc.s.INVARIANT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Cc.s.IN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Cc.s.OUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f39783a = iArr;
            }
        }

        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final String a(Cc.q typeParameter) {
            AbstractC4862t.e(typeParameter, "typeParameter");
            StringBuilder sb2 = new StringBuilder();
            int i10 = C0519a.f39783a[typeParameter.m().ordinal()];
            if (i10 == 1) {
                C4015H c4015h = C4015H.f34254a;
            } else if (i10 == 2) {
                sb2.append("in ");
            } else {
                if (i10 != 3) {
                    throw new C4032o();
                }
                sb2.append("out ");
            }
            sb2.append(typeParameter.getName());
            return sb2.toString();
        }

        public a() {
        }
    }
}
