package w7;

import io.sentry.protocol.SentryStackFrame;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f46322a;

    static {
        new HashSet(Arrays.asList(SentryStackFrame.JsonKeys.NATIVE, "unity"));
        f46322a = new HashMap();
        new x7.f("PlayCoreVersion");
    }

    public static synchronized Map a() {
        Map map;
        map = f46322a;
        map.put("java", 20002);
        return map;
    }
}
