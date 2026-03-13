package n2;

import i2.AbstractC4325e;
import i2.InterfaceC4337q;
import i2.v;
import i2.y;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC4325e {

    /* JADX INFO: renamed from: n2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0534b implements AbstractC4325e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y f40520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f40521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v.a f40522c;

        @Override // i2.AbstractC4325e.f
        public AbstractC4325e.C0484e a(InterfaceC4337q interfaceC4337q, long j10) {
            long position = interfaceC4337q.getPosition();
            long jC = c(interfaceC4337q);
            long jM = interfaceC4337q.m();
            interfaceC4337q.o(Math.max(6, this.f40520a.f37054c));
            long jC2 = c(interfaceC4337q);
            return (jC > j10 || jC2 <= j10) ? jC2 <= j10 ? AbstractC4325e.C0484e.f(jC2, interfaceC4337q.m()) : AbstractC4325e.C0484e.d(jC, position) : AbstractC4325e.C0484e.e(jM);
        }

        public final long c(InterfaceC4337q interfaceC4337q) {
            while (interfaceC4337q.m() < interfaceC4337q.getLength() - 6 && !v.h(interfaceC4337q, this.f40520a, this.f40521b, this.f40522c)) {
                interfaceC4337q.o(1);
            }
            if (interfaceC4337q.m() < interfaceC4337q.getLength() - 6) {
                return this.f40522c.f37048a;
            }
            interfaceC4337q.o((int) (interfaceC4337q.getLength() - interfaceC4337q.m()));
            return this.f40520a.f37061j;
        }

        public C0534b(y yVar, int i10) {
            this.f40520a = yVar;
            this.f40521b = i10;
            this.f40522c = new v.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(final y yVar, int i10, long j10, long j11) {
        super(new AbstractC4325e.d() { // from class: n2.a
            @Override // i2.AbstractC4325e.d
            public final long a(long j12) {
                return yVar.i(j12);
            }
        }, new C0534b(yVar, i10), yVar.f(), 0L, yVar.f37061j, j10, j11, yVar.d(), Math.max(6, yVar.f37054c));
        Objects.requireNonNull(yVar);
    }
}
