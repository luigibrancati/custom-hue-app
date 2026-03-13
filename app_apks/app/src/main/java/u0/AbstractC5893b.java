package u0;

import kotlin.jvm.internal.AbstractC4860q;
import xc.AbstractC6359b;

/* JADX INFO: renamed from: u0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5893b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5894c f45022a = new C5894c(a.f45024a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C5894c f45023b = new C5894c(C0616b.f45025a);

    /* JADX INFO: renamed from: u0.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class a extends AbstractC4860q implements vc.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f45024a = new a();

        public a() {
            super(2, AbstractC6359b.class, "min", "min(II)I", 1);
        }

        public final Integer i(int i10, int i11) {
            return Integer.valueOf(Math.min(i10, i11));
        }

        @Override // vc.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: renamed from: u0.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class C0616b extends AbstractC4860q implements vc.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0616b f45025a = new C0616b();

        public C0616b() {
            super(2, AbstractC6359b.class, "max", "max(II)I", 1);
        }

        public final Integer i(int i10, int i11) {
            return Integer.valueOf(Math.max(i10, i11));
        }

        @Override // vc.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    public static final int a(AbstractC5892a abstractC5892a, int i10, int i11) {
        return ((Number) abstractC5892a.a().invoke(Integer.valueOf(i10), Integer.valueOf(i11))).intValue();
    }
}
