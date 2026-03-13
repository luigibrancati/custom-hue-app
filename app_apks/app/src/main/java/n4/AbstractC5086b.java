package n4;

import Fe.InterfaceC0845g;
import d4.InterfaceC3824g;
import f4.InterfaceC3991b;
import fc.C4034q;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: n4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5086b {
    public static final Object a(Y3.a aVar, Object data) {
        AbstractC4862t.e(aVar, "<this>");
        AbstractC4862t.e(data, "data");
        List listD = aVar.d();
        int size = listD.size() - 1;
        if (size < 0) {
            return data;
        }
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            C4034q c4034q = (C4034q) listD.get(i10);
            InterfaceC3991b interfaceC3991b = (InterfaceC3991b) c4034q.a();
            if (((Class) c4034q.b()).isAssignableFrom(data.getClass()) && interfaceC3991b.a(data)) {
                data = interfaceC3991b.map(data);
            }
            if (i11 > size) {
                return data;
            }
            i10 = i11;
        }
    }

    public static final c4.e b(Y3.a aVar, Object data, InterfaceC0845g source, String str) {
        Object obj;
        AbstractC4862t.e(aVar, "<this>");
        AbstractC4862t.e(data, "data");
        AbstractC4862t.e(source, "source");
        List listA = aVar.a();
        int size = listA.size() - 1;
        if (size >= 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                obj = listA.get(i10);
                if (((c4.e) obj).b(source, str)) {
                    break;
                }
                if (i11 > size) {
                    break;
                }
                i10 = i11;
            }
            obj = null;
        } else {
            obj = null;
        }
        c4.e eVar = (c4.e) obj;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalStateException(AbstractC4862t.k("Unable to decode data. No decoder supports: ", data).toString());
    }

    public static final InterfaceC3824g c(Y3.a aVar, Object data) {
        Object obj;
        AbstractC4862t.e(aVar, "<this>");
        AbstractC4862t.e(data, "data");
        List listB = aVar.b();
        int size = listB.size() - 1;
        if (size >= 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                obj = listB.get(i10);
                C4034q c4034q = (C4034q) obj;
                InterfaceC3824g interfaceC3824g = (InterfaceC3824g) c4034q.a();
                if (((Class) c4034q.b()).isAssignableFrom(data.getClass()) && interfaceC3824g.a(data)) {
                    break;
                }
                if (i11 > size) {
                    break;
                }
                i10 = i11;
            }
            obj = null;
        } else {
            obj = null;
        }
        C4034q c4034q2 = (C4034q) obj;
        if (c4034q2 != null) {
            return (InterfaceC3824g) c4034q2.e();
        }
        throw new IllegalStateException(AbstractC4862t.k("Unable to fetch data. No fetcher supports: ", data).toString());
    }
}
