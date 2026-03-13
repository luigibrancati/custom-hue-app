package U1;

import D1.o;
import r2.InterfaceC5527a;
import s2.C5711b;
import t2.C5829b;
import v2.C6035a;
import w2.h;
import y2.C6386c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f16580a = new C0203a();

    /* JADX INFO: renamed from: U1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0203a implements a {
        @Override // U1.a
        public boolean a(o oVar) {
            String str = oVar.f1805o;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // U1.a
        public InterfaceC5527a b(o oVar) {
            String str = oVar.f1805o;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new C5711b();
                    case "application/x-icy":
                        return new C6035a();
                    case "application/id3":
                        return new h();
                    case "application/x-emsg":
                        return new C5829b();
                    case "application/x-scte35":
                        return new C6386c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean a(o oVar);

    InterfaceC5527a b(o oVar);
}
