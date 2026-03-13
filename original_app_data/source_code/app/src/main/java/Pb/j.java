package Pb;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j {
    public static boolean a(Ze.a aVar, Ze.b bVar, Jb.e eVar) {
        if (!(aVar instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) aVar).call();
            if (objCall == null) {
                Xb.d.a(bVar);
                return true;
            }
            try {
                Ze.a aVar2 = (Ze.a) Lb.b.e(eVar.apply(objCall), "The mapper returned a null Publisher");
                if (aVar2 instanceof Callable) {
                    try {
                        Object objCall2 = ((Callable) aVar2).call();
                        if (objCall2 == null) {
                            Xb.d.a(bVar);
                            return true;
                        }
                        bVar.d(new Xb.e(bVar, objCall2));
                    } catch (Throwable th) {
                        Ib.b.b(th);
                        Xb.d.b(th, bVar);
                        return true;
                    }
                } else {
                    aVar2.a(bVar);
                }
                return true;
            } catch (Throwable th2) {
                Ib.b.b(th2);
                Xb.d.b(th2, bVar);
                return true;
            }
        } catch (Throwable th3) {
            Ib.b.b(th3);
            Xb.d.b(th3, bVar);
            return true;
        }
    }
}
