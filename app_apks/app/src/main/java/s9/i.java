package s9;

import Od.C;
import fc.C4015H;
import g1.C4094d;
import g1.InterfaceC4087W;
import he.AbstractC4304b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import lc.InterfaceC4988e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements InterfaceC4087W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f44370a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SessionConfigs f44371b = new SessionConfigs(null, null, null, null, null);

    @Override // g1.InterfaceC4087W
    public Object a(InputStream inputStream, InterfaceC4988e interfaceC4988e) throws C4094d {
        try {
            AbstractC4304b.a aVar = AbstractC4304b.f36582d;
            String strA = C.A(sc.b.c(inputStream));
            aVar.d();
            return (SessionConfigs) aVar.a(SessionConfigs.INSTANCE.serializer(), strA);
        } catch (Exception e10) {
            throw new C4094d("Cannot parse session configs", e10);
        }
    }

    @Override // g1.InterfaceC4087W
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SessionConfigs b() {
        return f44371b;
    }

    @Override // g1.InterfaceC4087W
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object c(SessionConfigs sessionConfigs, OutputStream outputStream, InterfaceC4988e interfaceC4988e) throws IOException {
        outputStream.write(C.B(AbstractC4304b.f36582d.b(SessionConfigs.INSTANCE.serializer(), sessionConfigs)));
        return C4015H.f34254a;
    }
}
