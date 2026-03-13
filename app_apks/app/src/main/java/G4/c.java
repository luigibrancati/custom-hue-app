package G4;

import D4.f;
import J4.h;
import J4.l;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f4490a = a.f4491a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f4491a = new a();

        public final c a(f storage, A4.a logger, D4.a amplitude) {
            AbstractC4862t.e(storage, "storage");
            AbstractC4862t.e(logger, "logger");
            AbstractC4862t.e(amplitude, "amplitude");
            if (storage instanceof h) {
                return new G4.a((h) storage, logger, amplitude);
            }
            if (storage instanceof l) {
                return new b((l) storage);
            }
            logger.c("Custom storage, identify intercept not started");
            return null;
        }
    }

    Object a(InterfaceC4988e interfaceC4988e);

    Object b(InterfaceC4988e interfaceC4988e);
}
