package Be;

import Od.F;
import Od.H;
import android.util.Log;
import gc.Q;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC4862t;
import pe.y;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f845a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CopyOnWriteArraySet f846b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f847c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = y.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = y.class.getName();
        AbstractC4862t.d(name2, "getName(...)");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = xe.f.class.getName();
        AbstractC4862t.d(name3, "getName(...)");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = te.d.class.getName();
        AbstractC4862t.d(name4, "getName(...)");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f847c = Q.u(linkedHashMap);
    }

    public final void a(String loggerName, int i10, String message, Throwable th) {
        int iMin;
        AbstractC4862t.e(loggerName, "loggerName");
        AbstractC4862t.e(message, "message");
        String strD = d(loggerName);
        if (Log.isLoggable(strD, i10)) {
            if (th != null) {
                message = message + '\n' + Log.getStackTraceString(th);
            }
            String str = message;
            int length = str.length();
            int i11 = 0;
            while (i11 < length) {
                int iH0 = F.h0(str, '\n', i11, false, 4, null);
                if (iH0 == -1) {
                    iH0 = length;
                }
                while (true) {
                    iMin = Math.min(iH0, i11 + 4000);
                    String strSubstring = str.substring(i11, iMin);
                    AbstractC4862t.d(strSubstring, "substring(...)");
                    Log.println(i10, strD, strSubstring);
                    if (iMin >= iH0) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
            }
        }
    }

    public final void b() {
        for (Map.Entry entry : f847c.entrySet()) {
            c((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public final void c(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f846b.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(d.f848a);
        }
    }

    public final String d(String str) {
        String str2 = (String) f847c.get(str);
        return str2 == null ? H.m1(str, 23) : str2;
    }
}
