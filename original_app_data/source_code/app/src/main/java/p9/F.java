package p9;

import fc.C4015H;
import g1.C4094d;
import g1.InterfaceC4087W;
import he.AbstractC4304b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class F implements InterfaceC4087W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N f42321a;

    public F(N sessionGenerator) {
        AbstractC4862t.e(sessionGenerator, "sessionGenerator");
        this.f42321a = sessionGenerator;
    }

    @Override // g1.InterfaceC4087W
    public Object a(InputStream inputStream, InterfaceC4988e interfaceC4988e) throws C4094d {
        try {
            AbstractC4304b.a aVar = AbstractC4304b.f36582d;
            String strA = Od.C.A(sc.b.c(inputStream));
            aVar.d();
            return (SessionData) aVar.a(SessionData.INSTANCE.serializer(), strA);
        } catch (Exception e10) {
            throw new C4094d("Cannot parse session data", e10);
        }
    }

    @Override // g1.InterfaceC4087W
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SessionData b() {
        return new SessionData(this.f42321a.a(null), (Time) null, (Map) null, 6, (AbstractC4854k) null);
    }

    @Override // g1.InterfaceC4087W
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object c(SessionData sessionData, OutputStream outputStream, InterfaceC4988e interfaceC4988e) throws IOException {
        outputStream.write(Od.C.B(AbstractC4304b.f36582d.b(SessionData.INSTANCE.serializer(), sessionData)));
        return C4015H.f34254a;
    }
}
