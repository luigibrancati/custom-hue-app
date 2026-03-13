package dd;

import bd.InterfaceC2915g;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: dd.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3911p extends yd.u {

    /* JADX INFO: renamed from: dd.p$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class a {

        /* JADX INFO: renamed from: dd.p$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0413a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterfaceC3913r f33454a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final byte[] f33455b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0413a(InterfaceC3913r kotlinJvmBinaryClass, byte[] bArr) {
                super(null);
                AbstractC4862t.e(kotlinJvmBinaryClass, "kotlinJvmBinaryClass");
                this.f33454a = kotlinJvmBinaryClass;
                this.f33455b = bArr;
            }

            public final InterfaceC3913r b() {
                return this.f33454a;
            }

            public /* synthetic */ C0413a(InterfaceC3913r interfaceC3913r, byte[] bArr, int i10, AbstractC4854k abstractC4854k) {
                this(interfaceC3913r, (i10 & 2) != 0 ? null : bArr);
            }
        }

        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final InterfaceC3913r a() {
            C0413a c0413a = this instanceof C0413a ? (C0413a) this : null;
            if (c0413a != null) {
                return c0413a.b();
            }
            return null;
        }

        public a() {
        }
    }

    a a(InterfaceC2915g interfaceC2915g);

    a b(kd.b bVar);
}
