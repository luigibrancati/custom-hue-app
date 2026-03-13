package x;

import E.AbstractC0807p0;
import E.AbstractC0819w;
import L.J;
import androidx.lifecycle.AbstractC2763t;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L.Z f46825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.w f46826b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46827a;

        static {
            int[] iArr = new int[J.a.values().length];
            f46827a = iArr;
            try {
                iArr[J.a.PENDING_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46827a[J.a.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46827a[J.a.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46827a[J.a.CONFIGURED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46827a[J.a.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46827a[J.a.RELEASING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46827a[J.a.CLOSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f46827a[J.a.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public V0(L.Z z10) {
        this.f46825a = z10;
        androidx.lifecycle.w wVar = new androidx.lifecycle.w();
        this.f46826b = wVar;
        wVar.postValue(AbstractC0819w.a(AbstractC0819w.b.CLOSED));
    }

    public AbstractC2763t a() {
        return this.f46826b;
    }

    public final AbstractC0819w b() {
        return this.f46825a.c() ? AbstractC0819w.a(AbstractC0819w.b.OPENING) : AbstractC0819w.a(AbstractC0819w.b.PENDING_OPEN);
    }

    public void c(J.a aVar, AbstractC0819w.a aVar2) {
        AbstractC0819w abstractC0819wB;
        if (aVar2 == null || aVar2.d() != 8) {
            switch (a.f46827a[aVar.ordinal()]) {
                case 1:
                    abstractC0819wB = b();
                    break;
                case 2:
                    abstractC0819wB = AbstractC0819w.b(AbstractC0819w.b.OPENING, aVar2);
                    break;
                case 3:
                case 4:
                    abstractC0819wB = AbstractC0819w.b(AbstractC0819w.b.OPEN, aVar2);
                    break;
                case 5:
                case 6:
                    abstractC0819wB = AbstractC0819w.b(AbstractC0819w.b.CLOSING, aVar2);
                    break;
                case 7:
                case 8:
                    abstractC0819wB = AbstractC0819w.b(AbstractC0819w.b.CLOSED, aVar2);
                    break;
                default:
                    throw new IllegalStateException("Unknown internal camera state: " + aVar);
            }
        } else {
            abstractC0819wB = AbstractC0819w.b(AbstractC0819w.b.CLOSED, aVar2);
        }
        AbstractC0807p0.a("CameraStateMachine", "New public camera state " + abstractC0819wB + " from " + aVar + " and " + aVar2);
        if (Objects.equals((AbstractC0819w) this.f46826b.getValue(), abstractC0819wB)) {
            return;
        }
        AbstractC0807p0.a("CameraStateMachine", "Publishing new public camera state " + abstractC0819wB);
        this.f46826b.postValue(abstractC0819wB);
    }
}
