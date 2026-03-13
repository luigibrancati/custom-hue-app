package jd;

import hd.AbstractC4297a;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: jd.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4764e extends AbstractC4297a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f39165h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C4764e f39166i = new C4764e(1, 8, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C4764e f39167j = new C4764e(new int[0]);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f39168g;

    /* JADX INFO: renamed from: jd.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4764e(int[] versionArray, boolean z10) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        AbstractC4862t.e(versionArray, "versionArray");
        this.f39168g = z10;
    }

    public boolean h() {
        boolean zF;
        if (a() != 1 || b() != 0) {
            if (this.f39168g) {
                zF = f(f39166i);
            } else {
                int iA = a();
                C4764e c4764e = f39166i;
                zF = iA == c4764e.a() && b() <= c4764e.b() + 1;
            }
            if (zF) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4764e(int... numbers) {
        this(numbers, false);
        AbstractC4862t.e(numbers, "numbers");
    }
}
