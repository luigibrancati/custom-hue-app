package Uc;

import bd.InterfaceC2915g;
import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface p {
    bd.u a(kd.c cVar, boolean z10);

    Set b(kd.c cVar);

    InterfaceC2915g c(a aVar);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final kd.b f16932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f16933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterfaceC2915g f16934c;

        public a(kd.b classId, byte[] bArr, InterfaceC2915g interfaceC2915g) {
            AbstractC4862t.e(classId, "classId");
            this.f16932a = classId;
            this.f16933b = bArr;
            this.f16934c = interfaceC2915g;
        }

        public final kd.b a() {
            return this.f16932a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC4862t.a(this.f16932a, aVar.f16932a) && AbstractC4862t.a(this.f16933b, aVar.f16933b) && AbstractC4862t.a(this.f16934c, aVar.f16934c);
        }

        public int hashCode() {
            int iHashCode = this.f16932a.hashCode() * 31;
            byte[] bArr = this.f16933b;
            int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            InterfaceC2915g interfaceC2915g = this.f16934c;
            return iHashCode2 + (interfaceC2915g != null ? interfaceC2915g.hashCode() : 0);
        }

        public String toString() {
            return "Request(classId=" + this.f16932a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f16933b) + ", outerClass=" + this.f16934c + ')';
        }

        public /* synthetic */ a(kd.b bVar, byte[] bArr, InterfaceC2915g interfaceC2915g, int i10, AbstractC4854k abstractC4854k) {
            this(bVar, (i10 & 2) != 0 ? null : bArr, (i10 & 4) != 0 ? null : interfaceC2915g);
        }
    }
}
