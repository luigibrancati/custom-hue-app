package io.flutter.plugins.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.T;
import io.sentry.ProfileChunk;
import io.sentry.SentryLogEvent;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class FlutterFirebaseMessagingUtils {
    static final String EXTRA_REMOTE_MESSAGE = "notification";
    static final String IS_AUTO_INIT_ENABLED = "isAutoInitEnabled";
    static final int JOB_ID = 2020;
    private static final String KEY_COLLAPSE_KEY = "collapseKey";
    private static final String KEY_DATA = "data";
    private static final String KEY_FROM = "from";
    private static final String KEY_MESSAGE_ID = "messageId";
    private static final String KEY_MESSAGE_TYPE = "messageType";
    private static final String KEY_SENT_TIME = "sentTime";
    private static final String KEY_TO = "to";
    private static final String KEY_TTL = "ttl";
    static final String SHARED_PREFERENCES_KEY = "io.flutter.firebase.messaging.callback";

    public static FirebaseMessaging getFirebaseMessagingForArguments(Map<String, Object> map) {
        return FirebaseMessaging.getInstance();
    }

    public static T getRemoteMessageForArguments(Map<String, Object> map) {
        Object obj = map.get("message");
        Objects.requireNonNull(obj);
        Map map2 = (Map) obj;
        Object obj2 = map2.get(KEY_TO);
        Objects.requireNonNull(obj2);
        T.b bVar = new T.b((String) obj2);
        String str = (String) map2.get(KEY_COLLAPSE_KEY);
        String str2 = (String) map2.get(KEY_MESSAGE_ID);
        String str3 = (String) map2.get(KEY_MESSAGE_TYPE);
        Integer num = (Integer) map2.get(KEY_TTL);
        Map map3 = (Map) map2.get("data");
        if (str != null) {
            bVar.b(str);
        }
        if (str3 != null) {
            bVar.e(str3);
        }
        if (str2 != null) {
            bVar.d(str2);
        }
        if (num != null) {
            bVar.f(num.intValue());
        }
        if (map3 != null) {
            bVar.c(map3);
        }
        return bVar.a();
    }

    public static Map<String, Object> getRemoteMessageNotificationForArguments(Map<String, Object> map) {
        Object obj = map.get("message");
        Objects.requireNonNull(obj);
        Map map2 = (Map) obj;
        if (map2.get(EXTRA_REMOTE_MESSAGE) == null) {
            return null;
        }
        return (Map) map2.get(EXTRA_REMOTE_MESSAGE);
    }

    public static boolean isApplicationForeground(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if ((keyguardManager != null && keyguardManager.isKeyguardLocked()) || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        String packageName = context.getPackageName();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                return true;
            }
        }
        return false;
    }

    private static Map<String, Object> remoteMessageNotificationToMap(T.c cVar) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (cVar.p() != null) {
            map.put("title", cVar.p());
        }
        if (cVar.r() != null) {
            map.put("titleLocKey", cVar.r());
        }
        if (cVar.q() != null) {
            map.put("titleLocArgs", Arrays.asList(cVar.q()));
        }
        if (cVar.a() != null) {
            map.put(SentryLogEvent.JsonKeys.BODY, cVar.a());
        }
        if (cVar.c() != null) {
            map.put("bodyLocKey", cVar.c());
        }
        if (cVar.b() != null) {
            map.put("bodyLocArgs", Arrays.asList(cVar.b()));
        }
        if (cVar.d() != null) {
            map2.put("channelId", cVar.d());
        }
        if (cVar.e() != null) {
            map2.put("clickAction", cVar.e());
        }
        if (cVar.f() != null) {
            map2.put("color", cVar.f());
        }
        if (cVar.g() != null) {
            map2.put("smallIcon", cVar.g());
        }
        if (cVar.h() != null) {
            map2.put("imageUrl", cVar.h().toString());
        }
        if (cVar.i() != null) {
            map2.put("link", cVar.i().toString());
        }
        if (cVar.k() != null) {
            map2.put("count", cVar.k());
        }
        if (cVar.l() != null) {
            map2.put("priority", cVar.l());
        }
        if (cVar.m() != null) {
            map2.put("sound", cVar.m());
        }
        if (cVar.o() != null) {
            map2.put("ticker", cVar.o());
        }
        if (cVar.s() != null) {
            map2.put(ViewHierarchyNode.JsonKeys.VISIBILITY, cVar.s());
        }
        if (cVar.n() != null) {
            map2.put("tag", cVar.n());
        }
        map.put(ProfileChunk.PLATFORM_ANDROID, map2);
        return map;
    }

    public static Map<String, Object> remoteMessageToMap(T t10) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (t10.d() != null) {
            map.put(KEY_COLLAPSE_KEY, t10.d());
        }
        if (t10.f() != null) {
            map.put(KEY_FROM, t10.f());
        }
        if (t10.v() != null) {
            map.put(KEY_TO, t10.v());
        }
        if (t10.h() != null) {
            map.put(KEY_MESSAGE_ID, t10.h());
        }
        if (t10.l() != null) {
            map.put(KEY_MESSAGE_TYPE, t10.l());
        }
        if (!t10.e().isEmpty()) {
            for (Map.Entry entry : t10.e().entrySet()) {
                map2.put((String) entry.getKey(), entry.getValue());
            }
        }
        map.put("data", map2);
        map.put(KEY_TTL, Integer.valueOf(t10.w()));
        map.put(KEY_SENT_TIME, Long.valueOf(t10.t()));
        if (t10.n() != null) {
            map.put(EXTRA_REMOTE_MESSAGE, remoteMessageNotificationToMap(t10.n()));
        }
        return map;
    }
}
