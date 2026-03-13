package he;

import ce.InterfaceC3118a;
import ie.C4377A;
import ie.C4392n;
import ie.G;
import ie.J;
import ie.K;
import ie.O;
import je.AbstractC4771b;
import je.AbstractC4772c;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: he.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4304b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f36582d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f36583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC4771b f36584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4392n f36585c;

    /* JADX INFO: renamed from: he.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC4304b {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
            super(new f(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null), AbstractC4772c.a(), null);
        }
    }

    public /* synthetic */ AbstractC4304b(f fVar, AbstractC4771b abstractC4771b, AbstractC4854k abstractC4854k) {
        this(fVar, abstractC4771b);
    }

    public final Object a(InterfaceC3118a deserializer, String string) {
        AbstractC4862t.e(deserializer, "deserializer");
        AbstractC4862t.e(string, "string");
        J jA = K.a(this, string);
        Object objN = new G(this, O.OBJ, jA, deserializer.getDescriptor(), null).n(deserializer);
        jA.x();
        return objN;
    }

    public final String b(ce.g serializer, Object obj) {
        AbstractC4862t.e(serializer, "serializer");
        C4377A c4377a = new C4377A();
        try {
            ie.z.a(this, c4377a, serializer, obj);
            return c4377a.toString();
        } finally {
            c4377a.g();
        }
    }

    public final f c() {
        return this.f36583a;
    }

    public AbstractC4771b d() {
        return this.f36584b;
    }

    public final C4392n e() {
        return this.f36585c;
    }

    public AbstractC4304b(f fVar, AbstractC4771b abstractC4771b) {
        this.f36583a = fVar;
        this.f36584b = abstractC4771b;
        this.f36585c = new C4392n();
    }
}
