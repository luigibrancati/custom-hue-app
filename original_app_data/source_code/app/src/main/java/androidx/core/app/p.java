package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.m;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class p implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Notification.Builder f22620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m.e f22621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RemoteViews f22622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RemoteViews f22623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f22624f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f22625g = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22626h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RemoteViews f22627i;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        public static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        public static Notification.Builder e(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        public static Notification.Builder f(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        public static Notification.Builder g(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        public static Notification.Builder h(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        public static Notification.Builder c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        public static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        public static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        public static Notification.Builder f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {
        public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        public static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        public static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        public static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        public static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        public static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class e {
        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        public static Notification.Builder c(Notification.Builder builder, boolean z10) {
            return builder.setColorized(z10);
        }

        public static Notification.Builder d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        public static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        public static Notification.Builder g(Notification.Builder builder, long j10) {
            return builder.setTimeoutAfter(j10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class f {
        public static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class g {
        public static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setAllowSystemGeneratedContextualActions(z10);
        }

        public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
            return builder.setContextual(z10);
        }

        public static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class h {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        public static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class i {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.setShortCriticalText(str);
        }
    }

    public p(m.e eVar) {
        this.f22621c = eVar;
        Context context = eVar.f22557a;
        this.f22619a = context;
        Notification.Builder builderA = e.a(context, eVar.f22545M);
        this.f22620b = builderA;
        Notification notification = eVar.f22553U;
        builderA.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f22566j).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f22561e).setContentText(eVar.f22562f).setContentInfo(eVar.f22568l).setContentIntent(eVar.f22564h).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f22565i, (notification.flags & 128) != 0).setNumber(eVar.f22569m).setProgress(eVar.f22578v, eVar.f22579w, eVar.f22580x);
        IconCompat iconCompat = eVar.f22567k;
        c.b(builderA, iconCompat == null ? null : iconCompat.t(context));
        builderA.setSubText(eVar.f22575s).setUsesChronometer(eVar.f22572p).setPriority(eVar.f22570n);
        m.k kVar = eVar.f22574r;
        if (kVar instanceof m.f) {
            Iterator it = ((m.f) kVar).d().iterator();
            while (it.hasNext()) {
                b((m.a) it.next());
            }
        } else {
            Iterator it2 = eVar.f22558b.iterator();
            while (it2.hasNext()) {
                b((m.a) it2.next());
            }
        }
        Bundle bundle = eVar.f22538F;
        if (bundle != null) {
            this.f22625g.putAll(bundle);
        }
        this.f22622d = eVar.f22542J;
        this.f22623e = eVar.f22543K;
        this.f22620b.setShowWhen(eVar.f22571o);
        a.g(this.f22620b, eVar.f22534B);
        a.e(this.f22620b, eVar.f22581y);
        a.h(this.f22620b, eVar.f22533A);
        a.f(this.f22620b, eVar.f22582z);
        this.f22626h = eVar.f22550R;
        b.b(this.f22620b, eVar.f22537E);
        b.c(this.f22620b, eVar.f22539G);
        b.f(this.f22620b, eVar.f22540H);
        b.d(this.f22620b, eVar.f22541I);
        b.e(this.f22620b, notification.sound, notification.audioAttributes);
        ArrayList arrayList = eVar.f22556X;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                b.a(this.f22620b, (String) it3.next());
            }
        }
        this.f22627i = eVar.f22544L;
        if (eVar.f22560d.size() > 0) {
            Bundle bundle2 = eVar.e().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i10 = 0; i10 < eVar.f22560d.size(); i10++) {
                bundle4.putBundle(Integer.toString(i10), q.a((m.a) eVar.f22560d.get(i10)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.e().putBundle("android.car.EXTENSIONS", bundle2);
            this.f22625g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        Object obj = eVar.f22555W;
        if (obj != null) {
            c.c(this.f22620b, obj);
        }
        this.f22620b.setExtras(eVar.f22538F);
        d.e(this.f22620b, eVar.f22577u);
        RemoteViews remoteViews = eVar.f22542J;
        if (remoteViews != null) {
            d.c(this.f22620b, remoteViews);
        }
        RemoteViews remoteViews2 = eVar.f22543K;
        if (remoteViews2 != null) {
            d.b(this.f22620b, remoteViews2);
        }
        RemoteViews remoteViews3 = eVar.f22544L;
        if (remoteViews3 != null) {
            d.d(this.f22620b, remoteViews3);
        }
        e.b(this.f22620b, eVar.f22546N);
        e.e(this.f22620b, eVar.f22576t);
        e.f(this.f22620b, eVar.f22547O);
        e.g(this.f22620b, eVar.f22549Q);
        e.d(this.f22620b, eVar.f22550R);
        if (eVar.f22536D) {
            e.c(this.f22620b, eVar.f22535C);
        }
        if (!TextUtils.isEmpty(eVar.f22545M)) {
            this.f22620b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator it4 = eVar.f22559c.iterator();
        while (it4.hasNext()) {
            f.a(this.f22620b, ((u) it4.next()).i());
        }
        int i11 = Build.VERSION.SDK_INT;
        g.a(this.f22620b, eVar.f22552T);
        g.b(this.f22620b, m.d.a(null));
        L0.c cVar = eVar.f22548P;
        if (cVar != null) {
            g.d(this.f22620b, cVar.b());
        }
        int i12 = eVar.f22551S;
        if (i12 != 0) {
            h.b(this.f22620b, i12);
        }
        if (i11 >= 36) {
            i.a(this.f22620b, eVar.f22563g);
        }
        if (eVar.f22554V) {
            if (this.f22621c.f22582z) {
                this.f22626h = 2;
            } else {
                this.f22626h = 1;
            }
            this.f22620b.setVibrate(null);
            this.f22620b.setSound(null);
            int i13 = notification.defaults & (-4);
            notification.defaults = i13;
            this.f22620b.setDefaults(i13);
            if (TextUtils.isEmpty(this.f22621c.f22581y)) {
                a.e(this.f22620b, "silent");
            }
            e.d(this.f22620b, this.f22626h);
        }
    }

    @Override // androidx.core.app.j
    public Notification.Builder a() {
        return this.f22620b;
    }

    public final void b(m.a aVar) {
        IconCompat iconCompatD = aVar.d();
        Notification.Action.Builder builderA = c.a(iconCompatD != null ? iconCompatD.s() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : w.b(aVar.e())) {
                a.c(builderA, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        d.a(builderA, aVar.b());
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        f.b(builderA, aVar.f());
        g.c(builderA, aVar.j());
        h.a(builderA, aVar.i());
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        a.b(builderA, bundle);
        a.a(this.f22620b, a.d(builderA));
    }

    public Notification c() {
        Bundle bundleA;
        RemoteViews remoteViewsMakeHeadsUpContentView;
        RemoteViews remoteViewsMakeBigContentView;
        m.k kVar = this.f22621c.f22574r;
        if (kVar != null) {
            kVar.apply(this);
        }
        RemoteViews remoteViewsMakeContentView = kVar != null ? kVar.makeContentView(this) : null;
        Notification notificationD = d();
        if (remoteViewsMakeContentView != null) {
            notificationD.contentView = remoteViewsMakeContentView;
        } else {
            RemoteViews remoteViews = this.f22621c.f22542J;
            if (remoteViews != null) {
                notificationD.contentView = remoteViews;
            }
        }
        if (kVar != null && (remoteViewsMakeBigContentView = kVar.makeBigContentView(this)) != null) {
            notificationD.bigContentView = remoteViewsMakeBigContentView;
        }
        if (kVar != null && (remoteViewsMakeHeadsUpContentView = this.f22621c.f22574r.makeHeadsUpContentView(this)) != null) {
            notificationD.headsUpContentView = remoteViewsMakeHeadsUpContentView;
        }
        if (kVar != null && (bundleA = m.a(notificationD)) != null) {
            kVar.addCompatExtras(bundleA);
        }
        return notificationD;
    }

    public Notification d() {
        return this.f22620b.build();
    }

    public Context e() {
        return this.f22619a;
    }
}
