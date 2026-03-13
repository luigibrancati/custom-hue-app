package he;

import de.AbstractC3918a;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.S;

/* JADX INFO: renamed from: he.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4299B implements ce.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4299B f36575a = new C4299B();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ee.e f36576b = a.f36577b;

    /* JADX INFO: renamed from: he.B$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements ee.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f36577b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f36578c = "kotlinx.serialization.json.JsonObject";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ee.e f36579a = AbstractC3918a.i(AbstractC3918a.G(S.f39781a), p.f36609a).getDescriptor();

        @Override // ee.e
        public boolean b() {
            return this.f36579a.b();
        }

        @Override // ee.e
        public int c(String name) {
            AbstractC4862t.e(name, "name");
            return this.f36579a.c(name);
        }

        @Override // ee.e
        public int d() {
            return this.f36579a.d();
        }

        @Override // ee.e
        public String e(int i10) {
            return this.f36579a.e(i10);
        }

        @Override // ee.e
        public ee.k f() {
            return this.f36579a.f();
        }

        @Override // ee.e
        public List g(int i10) {
            return this.f36579a.g(i10);
        }

        @Override // ee.e
        public List getAnnotations() {
            return this.f36579a.getAnnotations();
        }

        @Override // ee.e
        public ee.e h(int i10) {
            return this.f36579a.h(i10);
        }

        @Override // ee.e
        public String i() {
            return f36578c;
        }

        @Override // ee.e
        public boolean isInline() {
            return this.f36579a.isInline();
        }

        @Override // ee.e
        public boolean j(int i10) {
            return this.f36579a.j(i10);
        }
    }

    @Override // ce.InterfaceC3118a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C4298A deserialize(InterfaceC4049e decoder) {
        AbstractC4862t.e(decoder, "decoder");
        q.g(decoder);
        return new C4298A((Map) AbstractC3918a.i(AbstractC3918a.G(S.f39781a), p.f36609a).deserialize(decoder));
    }

    @Override // ce.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC4050f encoder, C4298A value) {
        AbstractC4862t.e(encoder, "encoder");
        AbstractC4862t.e(value, "value");
        q.h(encoder);
        AbstractC3918a.i(AbstractC3918a.G(S.f39781a), p.f36609a).serialize(encoder, value);
    }

    @Override // ce.b, ce.g, ce.InterfaceC3118a
    public ee.e getDescriptor() {
        return f36576b;
    }
}
