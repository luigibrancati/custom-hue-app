package ge;

import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ge.F, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4217F {

    /* JADX INFO: renamed from: ge.F$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements InterfaceC4215D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ce.b f35645a;

        public a(ce.b bVar) {
            this.f35645a = bVar;
        }

        @Override // ge.InterfaceC4215D
        public ce.b[] a() {
            return super.a();
        }

        @Override // ge.InterfaceC4215D
        public ce.b[] childSerializers() {
            return new ce.b[]{this.f35645a};
        }

        @Override // ce.InterfaceC3118a
        public Object deserialize(InterfaceC4049e decoder) {
            AbstractC4862t.e(decoder, "decoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // ce.b, ce.g, ce.InterfaceC3118a
        public ee.e getDescriptor() {
            throw new IllegalStateException("unsupported");
        }

        @Override // ce.g
        public void serialize(InterfaceC4050f encoder, Object obj) {
            AbstractC4862t.e(encoder, "encoder");
            throw new IllegalStateException("unsupported");
        }
    }

    public static final ee.e a(String name, ce.b primitiveSerializer) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(primitiveSerializer, "primitiveSerializer");
        return new C4216E(name, new a(primitiveSerializer));
    }
}
