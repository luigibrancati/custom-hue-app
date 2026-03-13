package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f22501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f22502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f22504e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static NotificationChannelGroup a(String str, CharSequence charSequence) {
            return new NotificationChannelGroup(str, charSequence);
        }

        public static List b(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getChannels();
        }

        public static String c(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        public static String d(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        public static CharSequence e(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getName();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {
        public static String a(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getDescription();
        }

        public static boolean b(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.isBlocked();
        }

        public static void c(NotificationChannelGroup notificationChannelGroup, String str) {
            notificationChannelGroup.setDescription(str);
        }
    }

    public l(String str) {
        this.f22504e = Collections.EMPTY_LIST;
        this.f22500a = (String) X0.h.g(str);
    }

    public final List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NotificationChannel notificationChannel = (NotificationChannel) it.next();
            if (this.f22500a.equals(a.c(notificationChannel))) {
                arrayList.add(new k(notificationChannel));
            }
        }
        return arrayList;
    }

    public NotificationChannelGroup b() {
        NotificationChannelGroup notificationChannelGroupA = a.a(this.f22500a, this.f22501b);
        b.c(notificationChannelGroupA, this.f22502c);
        return notificationChannelGroupA;
    }

    public l(NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.EMPTY_LIST);
    }

    public l(NotificationChannelGroup notificationChannelGroup, List list) {
        this(a.d(notificationChannelGroup));
        this.f22501b = a.e(notificationChannelGroup);
        this.f22502c = b.a(notificationChannelGroup);
        this.f22503d = b.b(notificationChannelGroup);
        this.f22504e = a(a.b(notificationChannelGroup));
    }
}
