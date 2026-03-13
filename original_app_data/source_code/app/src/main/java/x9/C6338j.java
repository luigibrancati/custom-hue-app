package x9;

import java.io.IOException;
import u9.q;
import u9.u;
import u9.v;
import u9.w;
import u9.x;

/* JADX INFO: renamed from: x9.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6338j extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f47976b = g(u.LAZILY_PARSED_NUMBER);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f47977a;

    /* JADX INFO: renamed from: x9.j$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements x {
        public a() {
        }

        @Override // u9.x
        public w create(u9.e eVar, B9.a aVar) {
            if (aVar.c() == Number.class) {
                return C6338j.this;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: x9.j$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47979a;

        static {
            int[] iArr = new int[C9.b.values().length];
            f47979a = iArr;
            try {
                iArr[C9.b.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47979a[C9.b.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47979a[C9.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C6338j(v vVar) {
        this.f47977a = vVar;
    }

    public static x f(v vVar) {
        return vVar == u.LAZILY_PARSED_NUMBER ? f47976b : g(vVar);
    }

    public static x g(v vVar) {
        return new C6338j(vVar).new a();
    }

    @Override // u9.w
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Number c(C9.a aVar) throws IOException {
        C9.b bVarC = aVar.C();
        int i10 = b.f47979a[bVarC.ordinal()];
        if (i10 == 1) {
            aVar.nextNull();
            return null;
        }
        if (i10 == 2 || i10 == 3) {
            return this.f47977a.a(aVar);
        }
        throw new q("Expecting number, got: " + bVarC + "; at path " + aVar.getPath());
    }

    @Override // u9.w
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void e(C9.c cVar, Number number) throws IOException {
        cVar.x0(number);
    }
}
