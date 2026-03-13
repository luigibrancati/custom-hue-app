package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class NotificationManagerCompat {
    public static final String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    private static final String CHECK_OP_NO_THROW = "checkOpNoThrow";
    public static final String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    public static final int INTERRUPTION_FILTER_ALARMS = 4;
    public static final int INTERRUPTION_FILTER_ALL = 1;
    public static final int INTERRUPTION_FILTER_NONE = 3;
    public static final int INTERRUPTION_FILTER_PRIORITY = 2;
    public static final int INTERRUPTION_FILTER_UNKNOWN = 0;
    static final int MAX_SIDE_CHANNEL_SDK_VERSION = 19;
    private static final String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
    private static final String SETTING_ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final int SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS = 1000;
    private static final int SIDE_CHANNEL_RETRY_MAX_COUNT = 6;
    private static final String TAG = "NotifManCompat";
    private static String sEnabledNotificationListeners;
    private static j sSideChannelManager;
    private final Context mContext;
    private final NotificationManager mNotificationManager;
    private static final Object sEnabledNotificationListenersLock = new Object();
    private static Set<String> sEnabledNotificationListenerPackages = new HashSet();
    private static final Object sLock = new Object();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static List a(NotificationManager notificationManager) {
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            return activeNotifications == null ? new ArrayList() : Arrays.asList(activeNotifications);
        }

        public static int b(NotificationManager notificationManager) {
            return notificationManager.getCurrentInterruptionFilter();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        public static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {
        public static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        public static void b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        public static void c(NotificationManager notificationManager, List list) {
            notificationManager.createNotificationChannelGroups(list);
        }

        public static void d(NotificationManager notificationManager, List list) {
            notificationManager.createNotificationChannels(list);
        }

        public static void e(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        public static void f(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        public static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        public static NotificationChannel h(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        public static List i(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        public static List j(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d {
        public static NotificationChannelGroup a(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannelGroup(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class e {
        public static NotificationChannel a(NotificationManager notificationManager, String str, String str2) {
            return notificationManager.getNotificationChannel(str, str2);
        }

        public static String b(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class f {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.canUseFullScreenIntent();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class g {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.canPostPromotedNotifications();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class h implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f22456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f22457c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Notification f22458d;

        public h(String str, int i10, String str2, Notification notification) {
            this.f22455a = str;
            this.f22456b = i10;
            this.f22457c = str2;
            this.f22458d = notification;
        }

        @Override // androidx.core.app.NotificationManagerCompat.k
        public void a(INotificationSideChannel iNotificationSideChannel) {
            iNotificationSideChannel.v6(this.f22455a, this.f22456b, this.f22457c, this.f22458d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f22455a + ", id:" + this.f22456b + ", tag:" + this.f22457c + "]";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ComponentName f22459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final IBinder f22460b;

        public i(ComponentName componentName, IBinder iBinder) {
            this.f22459a = componentName;
            this.f22460b = iBinder;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class j implements Handler.Callback, ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f22461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HandlerThread f22462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f22463c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Map f22464d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Set f22465e = new HashSet();

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ComponentName f22466a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public INotificationSideChannel f22468c;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f22467b = false;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public ArrayDeque f22469d = new ArrayDeque();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f22470e = 0;

            public a(ComponentName componentName) {
                this.f22466a = componentName;
            }
        }

        public j(Context context) {
            this.f22461a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f22462b = handlerThread;
            handlerThread.start();
            this.f22463c = new Handler(handlerThread.getLooper(), this);
        }

        public final boolean a(a aVar) {
            if (aVar.f22467b) {
                return true;
            }
            boolean zBindService = this.f22461a.bindService(new Intent(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL).setComponent(aVar.f22466a), this, 33);
            aVar.f22467b = zBindService;
            if (zBindService) {
                aVar.f22470e = 0;
            } else {
                Log.w(NotificationManagerCompat.TAG, "Unable to bind to listener " + aVar.f22466a);
                this.f22461a.unbindService(this);
            }
            return aVar.f22467b;
        }

        public final void b(a aVar) {
            if (aVar.f22467b) {
                this.f22461a.unbindService(this);
                aVar.f22467b = false;
            }
            aVar.f22468c = null;
        }

        public final void c(k kVar) {
            j();
            for (a aVar : this.f22464d.values()) {
                aVar.f22469d.add(kVar);
                g(aVar);
            }
        }

        public final void d(ComponentName componentName) {
            a aVar = (a) this.f22464d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        public final void e(ComponentName componentName, IBinder iBinder) {
            a aVar = (a) this.f22464d.get(componentName);
            if (aVar != null) {
                aVar.f22468c = INotificationSideChannel.Stub.asInterface(iBinder);
                aVar.f22470e = 0;
                g(aVar);
            }
        }

        public final void f(ComponentName componentName) {
            a aVar = (a) this.f22464d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        public final void g(a aVar) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                Log.d(NotificationManagerCompat.TAG, "Processing component " + aVar.f22466a + ", " + aVar.f22469d.size() + " queued tasks");
            }
            if (aVar.f22469d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.f22468c == null) {
                i(aVar);
                return;
            }
            while (true) {
                k kVar = (k) aVar.f22469d.peek();
                if (kVar == null) {
                    break;
                }
                try {
                    if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                        Log.d(NotificationManagerCompat.TAG, "Sending task " + kVar);
                    }
                    kVar.a(aVar.f22468c);
                    aVar.f22469d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                        Log.d(NotificationManagerCompat.TAG, "Remote service has died: " + aVar.f22466a);
                    }
                } catch (RemoteException e10) {
                    Log.w(NotificationManagerCompat.TAG, "RemoteException communicating with " + aVar.f22466a, e10);
                }
            }
            if (aVar.f22469d.isEmpty()) {
                return;
            }
            i(aVar);
        }

        public void h(k kVar) {
            this.f22463c.obtainMessage(0, kVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c((k) message.obj);
                return true;
            }
            if (i10 == 1) {
                i iVar = (i) message.obj;
                e(iVar.f22459a, iVar.f22460b);
                return true;
            }
            if (i10 == 2) {
                f((ComponentName) message.obj);
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            d((ComponentName) message.obj);
            return true;
        }

        public final void i(a aVar) {
            if (this.f22463c.hasMessages(3, aVar.f22466a)) {
                return;
            }
            int i10 = aVar.f22470e;
            int i11 = i10 + 1;
            aVar.f22470e = i11;
            if (i11 <= 6) {
                int i12 = (1 << i10) * 1000;
                if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                    Log.d(NotificationManagerCompat.TAG, "Scheduling retry for " + i12 + " ms");
                }
                this.f22463c.sendMessageDelayed(this.f22463c.obtainMessage(3, aVar.f22466a), i12);
                return;
            }
            Log.w(NotificationManagerCompat.TAG, "Giving up on delivering " + aVar.f22469d.size() + " tasks to " + aVar.f22466a + " after " + aVar.f22470e + " retries");
            aVar.f22469d.clear();
        }

        public final void j() {
            Set<String> enabledListenerPackages = NotificationManagerCompat.getEnabledListenerPackages(this.f22461a);
            if (enabledListenerPackages.equals(this.f22465e)) {
                return;
            }
            this.f22465e = enabledListenerPackages;
            List<ResolveInfo> listQueryIntentServices = this.f22461a.getPackageManager().queryIntentServices(new Intent().setAction(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (enabledListenerPackages.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w(NotificationManagerCompat.TAG, "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f22464d.containsKey(componentName2)) {
                    if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                        Log.d(NotificationManagerCompat.TAG, "Adding listener record for " + componentName2);
                    }
                    this.f22464d.put(componentName2, new a(componentName2));
                }
            }
            Iterator it = this.f22464d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                        Log.d(NotificationManagerCompat.TAG, "Removing listener record for " + entry.getKey());
                    }
                    b((a) entry.getValue());
                    it.remove();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                Log.d(NotificationManagerCompat.TAG, "Connected to service " + componentName);
            }
            this.f22463c.obtainMessage(1, new i(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                Log.d(NotificationManagerCompat.TAG, "Disconnected from service " + componentName);
            }
            this.f22463c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface k {
        void a(INotificationSideChannel iNotificationSideChannel);
    }

    private NotificationManagerCompat(Context context) {
        this.mContext = context;
        this.mNotificationManager = (NotificationManager) context.getSystemService("notification");
    }

    public static NotificationManagerCompat from(Context context) {
        return new NotificationManagerCompat(context);
    }

    public static Set<String> getEnabledListenerPackages(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), SETTING_ENABLED_NOTIFICATION_LISTENERS);
        synchronized (sEnabledNotificationListenersLock) {
            if (string != null) {
                try {
                    if (!string.equals(sEnabledNotificationListeners)) {
                        String[] strArrSplit = string.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        sEnabledNotificationListenerPackages = hashSet;
                        sEnabledNotificationListeners = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            set = sEnabledNotificationListenerPackages;
        }
        return set;
    }

    private void pushSideChannelQueue(k kVar) {
        synchronized (sLock) {
            try {
                if (sSideChannelManager == null) {
                    sSideChannelManager = new j(this.mContext.getApplicationContext());
                }
                sSideChannelManager.h(kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean useSideChannelForNotification(Notification notification) {
        Bundle bundleA = m.a(notification);
        return bundleA != null && bundleA.getBoolean(EXTRA_USE_SIDE_CHANNEL);
    }

    public boolean areNotificationsEnabled() {
        return b.a(this.mNotificationManager);
    }

    public boolean canPostPromotedNotifications() {
        if (Build.VERSION.SDK_INT >= 36) {
            return g.a(this.mNotificationManager);
        }
        return false;
    }

    public boolean canUseFullScreenIntent() {
        return Build.VERSION.SDK_INT < 34 ? this.mContext.checkSelfPermission("android.permission.USE_FULL_SCREEN_INTENT") == 0 : f.a(this.mNotificationManager);
    }

    public void cancel(int i10) {
        cancel(null, i10);
    }

    public void cancelAll() {
        this.mNotificationManager.cancelAll();
    }

    public void createNotificationChannel(NotificationChannel notificationChannel) {
        c.a(this.mNotificationManager, notificationChannel);
    }

    public void createNotificationChannelGroup(NotificationChannelGroup notificationChannelGroup) {
        c.b(this.mNotificationManager, notificationChannelGroup);
    }

    public void createNotificationChannelGroups(List<NotificationChannelGroup> list) {
        c.c(this.mNotificationManager, list);
    }

    public void createNotificationChannelGroupsCompat(List<l> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<l> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b());
        }
        c.c(this.mNotificationManager, arrayList);
    }

    public void createNotificationChannels(List<NotificationChannel> list) {
        c.d(this.mNotificationManager, list);
    }

    public void createNotificationChannelsCompat(List<androidx.core.app.k> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<androidx.core.app.k> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        c.d(this.mNotificationManager, arrayList);
    }

    public void deleteNotificationChannel(String str) {
        c.e(this.mNotificationManager, str);
    }

    public void deleteNotificationChannelGroup(String str) {
        c.f(this.mNotificationManager, str);
    }

    public void deleteUnlistedNotificationChannels(Collection<String> collection) {
        for (NotificationChannel notificationChannel : c.j(this.mNotificationManager)) {
            if (!collection.contains(c.g(notificationChannel)) && !collection.contains(e.b(notificationChannel))) {
                c.e(this.mNotificationManager, c.g(notificationChannel));
            }
        }
    }

    public List<StatusBarNotification> getActiveNotifications() {
        return a.a(this.mNotificationManager);
    }

    public int getCurrentInterruptionFilter() {
        return a.b(this.mNotificationManager);
    }

    public int getImportance() {
        return b.b(this.mNotificationManager);
    }

    public NotificationChannel getNotificationChannel(String str) {
        return c.h(this.mNotificationManager, str);
    }

    public androidx.core.app.k getNotificationChannelCompat(String str) {
        NotificationChannel notificationChannel = getNotificationChannel(str);
        if (notificationChannel != null) {
            return new androidx.core.app.k(notificationChannel);
        }
        return null;
    }

    public NotificationChannelGroup getNotificationChannelGroup(String str) {
        return d.a(this.mNotificationManager, str);
    }

    public l getNotificationChannelGroupCompat(String str) {
        NotificationChannelGroup notificationChannelGroup = getNotificationChannelGroup(str);
        if (notificationChannelGroup != null) {
            return new l(notificationChannelGroup);
        }
        return null;
    }

    public List<NotificationChannelGroup> getNotificationChannelGroups() {
        return c.i(this.mNotificationManager);
    }

    public List<l> getNotificationChannelGroupsCompat() {
        List<NotificationChannelGroup> notificationChannelGroups = getNotificationChannelGroups();
        if (notificationChannelGroups.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(notificationChannelGroups.size());
        Iterator<NotificationChannelGroup> it = notificationChannelGroups.iterator();
        while (it.hasNext()) {
            arrayList.add(new l(it.next()));
        }
        return arrayList;
    }

    public List<NotificationChannel> getNotificationChannels() {
        return c.j(this.mNotificationManager);
    }

    public List<androidx.core.app.k> getNotificationChannelsCompat() {
        List<NotificationChannel> notificationChannels = getNotificationChannels();
        if (notificationChannels.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(notificationChannels.size());
        Iterator<NotificationChannel> it = notificationChannels.iterator();
        while (it.hasNext()) {
            arrayList.add(new androidx.core.app.k(it.next()));
        }
        return arrayList;
    }

    public void notify(int i10, Notification notification) {
        notify(null, i10, notification);
    }

    public void cancel(String str, int i10) {
        this.mNotificationManager.cancel(str, i10);
    }

    public void createNotificationChannel(androidx.core.app.k kVar) {
        createNotificationChannel(kVar.a());
    }

    public void createNotificationChannelGroup(l lVar) {
        createNotificationChannelGroup(lVar.b());
    }

    public NotificationChannel getNotificationChannel(String str, String str2) {
        return e.a(this.mNotificationManager, str, str2);
    }

    public void notify(String str, int i10, Notification notification) {
        if (!useSideChannelForNotification(notification)) {
            this.mNotificationManager.notify(str, i10, notification);
        } else {
            pushSideChannelQueue(new h(this.mContext.getPackageName(), i10, str, notification));
            this.mNotificationManager.cancel(str, i10);
        }
    }

    public androidx.core.app.k getNotificationChannelCompat(String str, String str2) {
        NotificationChannel notificationChannel = getNotificationChannel(str, str2);
        if (notificationChannel != null) {
            return new androidx.core.app.k(notificationChannel);
        }
        return null;
    }

    public NotificationManagerCompat(NotificationManager notificationManager, Context context) {
        this.mContext = context;
        this.mNotificationManager = notificationManager;
    }

    public void notify(List<Object> list) {
        if (list.size() <= 0) {
            return;
        }
        android.support.v4.media.session.a.a(list.get(0));
        throw null;
    }
}
