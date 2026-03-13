package qe;

import Fe.C0843e;
import Fe.InterfaceC0845g;
import kotlin.jvm.internal.AbstractC4862t;
import pe.D;
import pe.x;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends D {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x f43467b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f43468c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0845g f43469d;

        public a(x xVar, long j10, InterfaceC0845g interfaceC0845g) {
            this.f43467b = xVar;
            this.f43468c = j10;
            this.f43469d = interfaceC0845g;
        }

        @Override // pe.D
        public long a() {
            return this.f43468c;
        }

        @Override // pe.D
        public x b() {
            return this.f43467b;
        }

        @Override // pe.D
        public InterfaceC0845g c() {
            return this.f43469d;
        }
    }

    public static final D a(InterfaceC0845g interfaceC0845g, x xVar, long j10) {
        AbstractC4862t.e(interfaceC0845g, "<this>");
        return new a(xVar, j10, interfaceC0845g);
    }

    public static final void b(D d10) {
        AbstractC4862t.e(d10, "<this>");
        m.f(d10.c());
    }

    public static final D c(byte[] bArr, x xVar) {
        AbstractC4862t.e(bArr, "<this>");
        return D.f42596a.a(new C0843e().write(bArr), xVar, bArr.length);
    }
}
