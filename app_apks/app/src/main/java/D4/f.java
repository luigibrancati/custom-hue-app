package D4;

import K4.i;
import Rd.I;
import Rd.M;
import io.sentry.protocol.App;
import java.util.List;
import lc.InterfaceC4988e;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface f {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        private static final /* synthetic */ InterfaceC5276a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        private final String rawVal;
        public static final a LAST_EVENT_ID = new a("LAST_EVENT_ID", 0, "last_event_id");
        public static final a PREVIOUS_SESSION_ID = new a("PREVIOUS_SESSION_ID", 1, "previous_session_id");
        public static final a LAST_EVENT_TIME = new a("LAST_EVENT_TIME", 2, "last_event_time");
        public static final a OPT_OUT = new a("OPT_OUT", 3, "opt_out");
        public static final a Events = new a("Events", 4, "events");
        public static final a APP_VERSION = new a("APP_VERSION", 5, App.JsonKeys.APP_VERSION);
        public static final a APP_BUILD = new a("APP_BUILD", 6, App.JsonKeys.APP_BUILD);
        public static final a REMOTE_CONFIG = new a("REMOTE_CONFIG", 7, "remote_config");
        public static final a REMOTE_CONFIG_TIMESTAMP = new a("REMOTE_CONFIG_TIMESTAMP", 8, "remote_config_timestamp");

        static {
            a[] aVarArrA = a();
            $VALUES = aVarArrA;
            $ENTRIES = AbstractC5277b.a(aVarArrA);
        }

        public a(String str, int i10, String str2) {
            this.rawVal = str2;
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{LAST_EVENT_ID, PREVIOUS_SESSION_ID, LAST_EVENT_TIME, OPT_OUT, Events, APP_VERSION, APP_BUILD, REMOTE_CONFIG, REMOTE_CONFIG_TIMESTAMP};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final String b() {
            return this.rawVal;
        }
    }

    List a();

    Object b(Object obj, InterfaceC4988e interfaceC4988e);

    Object c(InterfaceC4988e interfaceC4988e);

    i d(F4.b bVar, b bVar2, M m10, I i10);

    String i(a aVar);

    Object k(a aVar, String str, InterfaceC4988e interfaceC4988e);

    Object l(E4.a aVar, InterfaceC4988e interfaceC4988e);
}
