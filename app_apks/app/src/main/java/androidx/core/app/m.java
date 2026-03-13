package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.app.u;
import androidx.core.graphics.drawable.IconCompat;
import io.sentry.SentryEnvelopeItemHeader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f22505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public IconCompat f22506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final w[] f22507c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final w[] f22508d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f22509e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f22510f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f22511g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f22512h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f22513i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CharSequence f22514j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public PendingIntent f22515k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f22516l;

        /* JADX INFO: renamed from: androidx.core.app.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0283a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IconCompat f22517a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CharSequence f22518b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final PendingIntent f22519c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f22520d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final Bundle f22521e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public ArrayList f22522f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f22523g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public boolean f22524h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public boolean f22525i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public boolean f22526j;

            public C0283a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public C0283a a(Bundle bundle) {
                if (bundle != null) {
                    this.f22521e.putAll(bundle);
                }
                return this;
            }

            public C0283a b(w wVar) {
                if (this.f22522f == null) {
                    this.f22522f = new ArrayList();
                }
                if (wVar != null) {
                    this.f22522f.add(wVar);
                }
                return this;
            }

            public a c() {
                d();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<w> arrayList3 = this.f22522f;
                if (arrayList3 != null) {
                    for (w wVar : arrayList3) {
                        if (wVar.k()) {
                            arrayList.add(wVar);
                        } else {
                            arrayList2.add(wVar);
                        }
                    }
                }
                return new a(this.f22517a, this.f22518b, this.f22519c, this.f22521e, arrayList2.isEmpty() ? null : (w[]) arrayList2.toArray(new w[arrayList2.size()]), arrayList.isEmpty() ? null : (w[]) arrayList.toArray(new w[arrayList.size()]), this.f22520d, this.f22523g, this.f22524h, this.f22525i, this.f22526j);
            }

            public final void d() {
                if (this.f22525i && this.f22519c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public C0283a e(boolean z10) {
                this.f22520d = z10;
                return this;
            }

            public C0283a f(boolean z10) {
                this.f22525i = z10;
                return this;
            }

            public C0283a g(int i10) {
                this.f22523g = i10;
                return this;
            }

            public C0283a h(boolean z10) {
                this.f22524h = z10;
                return this;
            }

            public C0283a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i10 != 0 ? IconCompat.k(null, "", i10) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public C0283a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, w[] wVarArr, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
                this.f22520d = true;
                this.f22524h = true;
                this.f22517a = iconCompat;
                this.f22518b = e.f(charSequence);
                this.f22519c = pendingIntent;
                this.f22521e = bundle;
                this.f22522f = wVarArr == null ? null : new ArrayList(Arrays.asList(wVarArr));
                this.f22520d = z10;
                this.f22523g = i10;
                this.f22524h = z11;
                this.f22525i = z12;
                this.f22526j = z13;
            }
        }

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.k(null, "", i10) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f22515k;
        }

        public boolean b() {
            return this.f22509e;
        }

        public Bundle c() {
            return this.f22505a;
        }

        public IconCompat d() {
            int i10;
            if (this.f22506b == null && (i10 = this.f22513i) != 0) {
                this.f22506b = IconCompat.k(null, "", i10);
            }
            return this.f22506b;
        }

        public w[] e() {
            return this.f22507c;
        }

        public int f() {
            return this.f22511g;
        }

        public boolean g() {
            return this.f22510f;
        }

        public CharSequence h() {
            return this.f22514j;
        }

        public boolean i() {
            return this.f22516l;
        }

        public boolean j() {
            return this.f22512h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, w[] wVarArr, w[] wVarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f22510f = true;
            this.f22506b = iconCompat;
            if (iconCompat != null && iconCompat.n() == 2) {
                this.f22513i = iconCompat.l();
            }
            this.f22514j = e.f(charSequence);
            this.f22515k = pendingIntent;
            this.f22505a = bundle == null ? new Bundle() : bundle;
            this.f22507c = wVarArr;
            this.f22508d = wVarArr2;
            this.f22509e = z10;
            this.f22511g = i10;
            this.f22510f = z11;
            this.f22512h = z12;
            this.f22516l = z13;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public IconCompat f22527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public IconCompat f22528b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f22529c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CharSequence f22530d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f22531e;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* JADX INFO: renamed from: androidx.core.app.m$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class C0284b {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        public static IconCompat b(Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (parcelable instanceof Icon) {
                return IconCompat.c((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.f((Bitmap) parcelable);
            }
            return null;
        }

        public static IconCompat e(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable("android.picture");
            return parcelable != null ? b(parcelable) : b(bundle.getParcelable("android.pictureIcon"));
        }

        @Override // androidx.core.app.m.k
        public void apply(androidx.core.app.j jVar) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(jVar.a()).setBigContentTitle(this.mBigContentTitle);
            if (this.f22527a != null) {
                C0284b.a(bigContentTitle, this.f22527a.t(jVar instanceof p ? ((p) jVar).e() : null));
            }
            if (this.f22529c) {
                if (this.f22528b == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.a(bigContentTitle, this.f22528b.t(jVar instanceof p ? ((p) jVar).e() : null));
                }
            }
            if (this.mSummaryTextSet) {
                bigContentTitle.setSummaryText(this.mSummaryText);
            }
            C0284b.c(bigContentTitle, this.f22531e);
            C0284b.b(bigContentTitle, this.f22530d);
        }

        public b c(Bitmap bitmap) {
            this.f22528b = bitmap == null ? null : IconCompat.f(bitmap);
            this.f22529c = true;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.f22527a = bitmap == null ? null : IconCompat.f(bitmap);
            return this;
        }

        public b f(CharSequence charSequence) {
            this.mBigContentTitle = e.f(charSequence);
            return this;
        }

        public b g(CharSequence charSequence) {
            this.mSummaryText = e.f(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        @Override // androidx.core.app.m.k
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        @Override // androidx.core.app.m.k
        public void restoreFromCompatExtras(Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            if (bundle.containsKey("android.largeIcon.big")) {
                this.f22528b = b(bundle.getParcelable("android.largeIcon.big"));
                this.f22529c = true;
            }
            this.f22527a = e(bundle);
            this.f22531e = bundle.getBoolean("android.showBigPictureWhenCollapsed");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CharSequence f22532a;

        @Override // androidx.core.app.m.k
        public void addCompatExtras(Bundle bundle) {
            super.addCompatExtras(bundle);
        }

        @Override // androidx.core.app.m.k
        public void apply(androidx.core.app.j jVar) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(jVar.a()).setBigContentTitle(this.mBigContentTitle).bigText(this.f22532a);
            if (this.mSummaryTextSet) {
                bigTextStyleBigText.setSummaryText(this.mSummaryText);
            }
        }

        public c b(CharSequence charSequence) {
            this.f22532a = e.f(charSequence);
            return this;
        }

        public c c(CharSequence charSequence) {
            this.mBigContentTitle = e.f(charSequence);
            return this;
        }

        public c d(CharSequence charSequence) {
            this.mSummaryText = e.f(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        @Override // androidx.core.app.m.k
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        @Override // androidx.core.app.m.k
        public void restoreFromCompatExtras(Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.f22532a = bundle.getCharSequence("android.bigText");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class f extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public u f22584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public PendingIntent f22585c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public PendingIntent f22586d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public PendingIntent f22587e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f22588f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Integer f22589g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Integer f22590h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public IconCompat f22591i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CharSequence f22592j;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class c {
            public static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            public static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            public static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            public static Notification.CallStyle d(Notification.CallStyle callStyle, int i10) {
                return callStyle.setAnswerButtonColorHint(i10);
            }

            public static Notification.CallStyle e(Notification.CallStyle callStyle, int i10) {
                return callStyle.setDeclineButtonColorHint(i10);
            }

            public static Notification.CallStyle f(Notification.CallStyle callStyle, boolean z10) {
                return callStyle.setIsVideo(z10);
            }

            public static Notification.CallStyle g(Notification.CallStyle callStyle, Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            public static Notification.CallStyle h(Notification.CallStyle callStyle, CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        public f() {
        }

        public static f b(u uVar, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "declineIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new f(1, uVar, null, pendingIntent, pendingIntent2);
        }

        public static f c(u uVar, PendingIntent pendingIntent) {
            Objects.requireNonNull(pendingIntent, "hangUpIntent is required");
            return new f(2, uVar, pendingIntent, null, null);
        }

        @Override // androidx.core.app.m.k
        public void addCompatExtras(Bundle bundle) {
            super.addCompatExtras(bundle);
            bundle.putInt("android.callType", this.f22583a);
            bundle.putBoolean("android.callIsVideo", this.f22588f);
            u uVar = this.f22584b;
            if (uVar != null) {
                bundle.putParcelable("android.callPerson", b.a(uVar.i()));
            }
            IconCompat iconCompat = this.f22591i;
            if (iconCompat != null) {
                bundle.putParcelable("android.verificationIcon", a.a(iconCompat.t(this.mBuilder.f22557a)));
            }
            bundle.putCharSequence("android.verificationText", this.f22592j);
            bundle.putParcelable("android.answerIntent", this.f22585c);
            bundle.putParcelable("android.declineIntent", this.f22586d);
            bundle.putParcelable("android.hangUpIntent", this.f22587e);
            Integer num = this.f22589g;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.f22590h;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        @Override // androidx.core.app.m.k
        public void apply(androidx.core.app.j jVar) {
            Notification.CallStyle callStyleA;
            int i10 = this.f22583a;
            if (i10 == 1) {
                callStyleA = c.a(this.f22584b.i(), this.f22586d, this.f22585c);
            } else if (i10 == 2) {
                callStyleA = c.b(this.f22584b.i(), this.f22587e);
            } else if (i10 != 3) {
                if (Log.isLoggable("NotifCompat", 3)) {
                    Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f22583a));
                }
                callStyleA = null;
            } else {
                callStyleA = c.c(this.f22584b.i(), this.f22587e, this.f22585c);
            }
            if (callStyleA != null) {
                callStyleA.setBuilder(jVar.a());
                Integer num = this.f22589g;
                if (num != null) {
                    c.d(callStyleA, num.intValue());
                }
                Integer num2 = this.f22590h;
                if (num2 != null) {
                    c.e(callStyleA, num2.intValue());
                }
                c.h(callStyleA, this.f22592j);
                IconCompat iconCompat = this.f22591i;
                if (iconCompat != null) {
                    c.g(callStyleA, iconCompat.t(this.mBuilder.f22557a));
                }
                c.f(callStyleA, this.f22588f);
            }
        }

        public ArrayList d() {
            a aVarH = h();
            a aVarG = g();
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(aVarH);
            ArrayList<a> arrayList2 = this.mBuilder.f22558b;
            int i10 = 2;
            if (arrayList2 != null) {
                for (a aVar : arrayList2) {
                    if (aVar.j()) {
                        arrayList.add(aVar);
                    } else if (!e(aVar)) {
                        arrayList.add(aVar);
                        i10--;
                    }
                    if (aVarG != null && i10 == 1) {
                        arrayList.add(aVarG);
                        i10--;
                    }
                }
            }
            if (aVarG != null && i10 >= 1) {
                arrayList.add(aVarG);
            }
            return arrayList;
        }

        public final boolean e(a aVar) {
            return aVar != null && aVar.c().getBoolean("key_action_priority");
        }

        public final a f(int i10, int i11, Integer num, int i12, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(L0.a.d(this.mBuilder.f22557a, i12));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.mBuilder.f22557a.getResources().getString(i11));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            a aVarC = new a.C0283a(IconCompat.j(this.mBuilder.f22557a, i10), spannableStringBuilder, pendingIntent).c();
            aVarC.c().putBoolean("key_action_priority", true);
            return aVarC;
        }

        public final a g() {
            int i10 = K0.c.f6659b;
            int i11 = K0.c.f6658a;
            PendingIntent pendingIntent = this.f22585c;
            if (pendingIntent == null) {
                return null;
            }
            boolean z10 = this.f22588f;
            return f(z10 ? i10 : i11, z10 ? K0.e.f6703b : K0.e.f6702a, this.f22589g, K0.b.f6656a, pendingIntent);
        }

        @Override // androidx.core.app.m.k
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        public final a h() {
            int i10 = K0.c.f6660c;
            PendingIntent pendingIntent = this.f22586d;
            return pendingIntent == null ? f(i10, K0.e.f6705d, this.f22590h, K0.b.f6657b, this.f22587e) : f(i10, K0.e.f6704c, this.f22590h, K0.b.f6657b, pendingIntent);
        }

        public f i(boolean z10) {
            this.f22588f = z10;
            return this;
        }

        public f j(CharSequence charSequence) {
            this.f22592j = charSequence;
            return this;
        }

        @Override // androidx.core.app.m.k
        public void restoreFromCompatExtras(Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.f22583a = bundle.getInt("android.callType");
            this.f22588f = bundle.getBoolean("android.callIsVideo");
            if (bundle.containsKey("android.callPerson")) {
                this.f22584b = u.a((Person) bundle.getParcelable("android.callPerson"));
            } else if (bundle.containsKey("android.callPersonCompat")) {
                this.f22584b = u.b(bundle.getBundle("android.callPersonCompat"));
            }
            if (bundle.containsKey("android.verificationIcon")) {
                this.f22591i = IconCompat.c((Icon) bundle.getParcelable("android.verificationIcon"));
            } else if (bundle.containsKey("android.verificationIconCompat")) {
                this.f22591i = IconCompat.b(bundle.getBundle("android.verificationIconCompat"));
            }
            this.f22592j = bundle.getCharSequence("android.verificationText");
            this.f22585c = (PendingIntent) bundle.getParcelable("android.answerIntent");
            this.f22586d = (PendingIntent) bundle.getParcelable("android.declineIntent");
            this.f22587e = (PendingIntent) bundle.getParcelable("android.hangUpIntent");
            this.f22589g = bundle.containsKey("android.answerColor") ? Integer.valueOf(bundle.getInt("android.answerColor")) : null;
            this.f22590h = bundle.containsKey("android.declineColor") ? Integer.valueOf(bundle.getInt("android.declineColor")) : null;
        }

        public f(int i10, u uVar, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3) {
            if (uVar == null || TextUtils.isEmpty(uVar.e())) {
                throw new IllegalArgumentException("person must have a non-empty a name");
            }
            this.f22583a = i10;
            this.f22584b = uVar;
            this.f22585c = pendingIntent3;
            this.f22586d = pendingIntent2;
            this.f22587e = pendingIntent;
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a {
            public static Parcelable a(Icon icon) {
                return icon;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class b {
            public static Parcelable a(Person person) {
                return person;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class g extends k {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a {
            public static Notification.Style a() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        @Override // androidx.core.app.m.k
        public void apply(androidx.core.app.j jVar) {
            jVar.a().setStyle(a.a());
        }

        @Override // androidx.core.app.m.k
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        @Override // androidx.core.app.m.k
        public RemoteViews makeBigContentView(androidx.core.app.j jVar) {
            return null;
        }

        @Override // androidx.core.app.m.k
        public RemoteViews makeContentView(androidx.core.app.j jVar) {
            return null;
        }

        @Override // androidx.core.app.m.k
        public RemoteViews makeHeadsUpContentView(androidx.core.app.j jVar) {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class h extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList f22593a = new ArrayList();

        @Override // androidx.core.app.m.k
        public void apply(androidx.core.app.j jVar) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(jVar.a()).setBigContentTitle(this.mBigContentTitle);
            if (this.mSummaryTextSet) {
                bigContentTitle.setSummaryText(this.mSummaryText);
            }
            Iterator it = this.f22593a.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine((CharSequence) it.next());
            }
        }

        public h b(CharSequence charSequence) {
            if (charSequence != null) {
                this.f22593a.add(e.f(charSequence));
            }
            return this;
        }

        public h c(CharSequence charSequence) {
            this.mBigContentTitle = e.f(charSequence);
            return this;
        }

        public h d(CharSequence charSequence) {
            this.mSummaryText = e.f(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        @Override // androidx.core.app.m.k
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        @Override // androidx.core.app.m.k
        public void restoreFromCompatExtras(Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.f22593a.clear();
            if (bundle.containsKey("android.textLines")) {
                Collections.addAll(this.f22593a, bundle.getCharSequenceArray("android.textLines"));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class j extends k {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f22608d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public IconCompat f22610f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public IconCompat f22611g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public IconCompat f22612h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f22605a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f22606b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22607c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f22609e = true;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a {
            public static void a(Notification.ProgressStyle progressStyle, int i10) {
                progressStyle.setProgress(i10);
            }

            public static void b(Notification.ProgressStyle progressStyle, Icon icon) {
                progressStyle.setProgressEndIcon(icon);
            }

            public static void c(Notification.ProgressStyle progressStyle, boolean z10) {
                progressStyle.setProgressIndeterminate(z10);
            }

            public static void d(Notification.ProgressStyle progressStyle, List<b> list) {
                for (b bVar : list) {
                    progressStyle.addProgressPoint(new Notification.ProgressStyle.Point(bVar.c()).setColor(bVar.a()).setId(bVar.b()));
                }
            }

            public static void e(Notification.ProgressStyle progressStyle, List<c> list) {
                for (c cVar : list) {
                    progressStyle.addProgressSegment(new Notification.ProgressStyle.Segment(cVar.c()).setColor(cVar.a()).setId(cVar.b()));
                }
            }

            public static void f(Notification.ProgressStyle progressStyle, Icon icon) {
                progressStyle.setProgressStartIcon(icon);
            }

            public static void g(Notification.ProgressStyle progressStyle, Icon icon) {
                progressStyle.setProgressTrackerIcon(icon);
            }

            public static void h(Notification.ProgressStyle progressStyle, boolean z10) {
                progressStyle.setStyledByProgress(z10);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f22613a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f22614b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f22615c = 0;

            public b(int i10) {
                this.f22613a = i10;
            }

            public int a() {
                return this.f22615c;
            }

            public int b() {
                return this.f22614b;
            }

            public int c() {
                return this.f22613a;
            }

            public b d(int i10) {
                this.f22615c = i10;
                return this;
            }

            public b e(int i10) {
                this.f22614b = i10;
                return this;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f22616a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f22617b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f22618c = 0;

            public c(int i10) {
                this.f22616a = i10;
            }

            public int a() {
                return this.f22618c;
            }

            public int b() {
                return this.f22617b;
            }

            public int c() {
                return this.f22616a;
            }

            public c d(int i10) {
                this.f22618c = i10;
                return this;
            }

            public c e(int i10) {
                this.f22617b = i10;
                return this;
            }
        }

        private static IconCompat b(Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (parcelable instanceof Icon) {
                return IconCompat.c((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.f((Bitmap) parcelable);
            }
            return null;
        }

        public static ArrayList d(List list) {
            ArrayList arrayList = new ArrayList();
            if (list != null && !list.isEmpty()) {
                for (int i10 = 0; i10 < list.size(); i10++) {
                    b bVar = (b) list.get(i10);
                    if (bVar.c() >= 0) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("position", bVar.c());
                        bundle.putInt("id", bVar.b());
                        bundle.putInt("colorInt", bVar.a());
                        arrayList.add(bundle);
                    }
                }
            }
            return arrayList;
        }

        public static List e(List list) {
            ArrayList arrayList = new ArrayList();
            if (list != null && !list.isEmpty()) {
                for (int i10 = 0; i10 < list.size(); i10++) {
                    Bundle bundle = (Bundle) list.get(i10);
                    int i11 = bundle.getInt("position");
                    if (i11 >= 0) {
                        arrayList.add(new b(i11).e(bundle.getInt("id")).d(bundle.getInt("colorInt", 0)));
                    }
                }
            }
            return arrayList;
        }

        public static ArrayList f(List list) {
            ArrayList arrayList = new ArrayList();
            if (list != null && !list.isEmpty()) {
                for (int i10 = 0; i10 < list.size(); i10++) {
                    c cVar = (c) list.get(i10);
                    if (cVar.c() > 0) {
                        Bundle bundle = new Bundle();
                        bundle.putInt(SentryEnvelopeItemHeader.JsonKeys.LENGTH, cVar.c());
                        bundle.putInt("id", cVar.b());
                        bundle.putInt("colorInt", cVar.a());
                        arrayList.add(bundle);
                    }
                }
            }
            return arrayList;
        }

        public static List g(List list) {
            ArrayList arrayList = new ArrayList();
            if (list != null && !list.isEmpty()) {
                for (int i10 = 0; i10 < list.size(); i10++) {
                    Bundle bundle = (Bundle) list.get(i10);
                    int i11 = bundle.getInt(SentryEnvelopeItemHeader.JsonKeys.LENGTH);
                    if (i11 > 0) {
                        arrayList.add(new c(i11).e(bundle.getInt("id")).d(bundle.getInt("colorInt", 0)));
                    }
                }
            }
            return arrayList;
        }

        @Override // androidx.core.app.m.k
        public void addCompatExtras(Bundle bundle) {
            super.addCompatExtras(bundle);
            if (Build.VERSION.SDK_INT < 36) {
                bundle.putParcelableArrayList("android.progressSegments", f(this.f22605a));
                bundle.putParcelableArrayList("android.progressPoints", d(this.f22606b));
                bundle.putInt("android.progress", this.f22607c);
                bundle.putBoolean("android.progressIndeterminate", this.f22608d);
                bundle.putInt("android.progressMax", c());
                bundle.putBoolean("android.styledByProgress", this.f22609e);
                e eVar = this.mBuilder;
                Context context = eVar != null ? eVar.f22557a : null;
                if (context != null) {
                    IconCompat iconCompat = this.f22610f;
                    if (iconCompat != null) {
                        bundle.putParcelable("android.progressTrackerIcon", iconCompat.t(context));
                    } else {
                        bundle.remove("android.progressTrackerIcon");
                    }
                    IconCompat iconCompat2 = this.f22611g;
                    if (iconCompat2 != null) {
                        bundle.putParcelable("android.progressStartIcon", iconCompat2.t(context));
                    } else {
                        bundle.remove("android.progressStartIcon");
                    }
                    IconCompat iconCompat3 = this.f22612h;
                    if (iconCompat3 != null) {
                        bundle.putParcelable("android.progressEndIcon", iconCompat3.t(context));
                    } else {
                        bundle.remove("android.progressEndIcon");
                    }
                }
            }
        }

        @Override // androidx.core.app.m.k
        public void apply(androidx.core.app.j jVar) {
            Notification.Builder builderA = jVar.a();
            if (Build.VERSION.SDK_INT < 36) {
                int iC = c();
                builderA.setProgress(iC, Math.min(this.f22607c, iC), this.f22608d);
                return;
            }
            Context contextE = jVar instanceof p ? ((p) jVar).e() : null;
            Notification.ProgressStyle progressStyleA = n.a();
            a.h(progressStyleA, this.f22609e);
            a.a(progressStyleA, this.f22607c);
            a.c(progressStyleA, this.f22608d);
            IconCompat iconCompat = this.f22611g;
            a.f(progressStyleA, iconCompat != null ? iconCompat.t(contextE) : null);
            IconCompat iconCompat2 = this.f22612h;
            a.b(progressStyleA, iconCompat2 != null ? iconCompat2.t(contextE) : null);
            IconCompat iconCompat3 = this.f22610f;
            a.g(progressStyleA, iconCompat3 != null ? iconCompat3.t(contextE) : null);
            a.d(progressStyleA, this.f22606b);
            a.e(progressStyleA, this.f22605a);
            builderA.setStyle(progressStyleA);
        }

        public int c() {
            List list = this.f22605a;
            if (list == null || list.isEmpty()) {
                return 100;
            }
            int i10 = 0;
            int iAddExact = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                int iC = ((c) list.get(i11)).c();
                if (iC > 0) {
                    try {
                        iAddExact = Math.addExact(iAddExact, iC);
                        i10++;
                    } catch (ArithmeticException unused) {
                        return 100;
                    }
                }
            }
            if (i10 == 0) {
                return 100;
            }
            return iAddExact;
        }

        @Override // androidx.core.app.m.k
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$ProgressStyle";
        }

        @Override // androidx.core.app.m.k
        public void restoreFromCompatExtras(Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.f22605a = g(U0.b.b(bundle, "android.progressSegments", Bundle.class));
            this.f22607c = bundle.getInt("android.progress", 0);
            this.f22608d = bundle.getBoolean("android.progressIndeterminate", false);
            this.f22609e = bundle.getBoolean("android.styledByProgress", true);
            this.f22606b = e(U0.b.b(bundle, "android.progressPoints", Bundle.class));
            this.f22610f = b((Parcelable) U0.b.a(bundle, "android.progressTrackerIcon", Icon.class));
            this.f22611g = b((Parcelable) U0.b.a(bundle, "android.progressStartIcon", Icon.class));
            this.f22612h = b((Parcelable) U0.b.a(bundle, "android.progressEndIcon", Icon.class));
        }
    }

    @Deprecated
    public m() {
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class i extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f22594a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f22595b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public u f22596c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CharSequence f22597d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Boolean f22598e;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a {
            public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class b {
            public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class c {
            public static Notification.MessagingStyle a(Person person) {
                return new Notification.MessagingStyle(person);
            }

            public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z10) {
                return messagingStyle.setGroupConversation(z10);
            }
        }

        public i() {
        }

        public static i d(Notification notification) {
            k kVarExtractStyleFromNotification = k.extractStyleFromNotification(notification);
            if (kVarExtractStyleFromNotification instanceof i) {
                return (i) kVarExtractStyleFromNotification;
            }
            return null;
        }

        @Override // androidx.core.app.m.k
        public void addCompatExtras(Bundle bundle) {
            super.addCompatExtras(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f22596c.e());
            bundle.putBundle("android.messagingStyleUser", this.f22596c.j());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f22597d);
            if (this.f22597d != null && this.f22598e.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f22597d);
            }
            if (!this.f22594a.isEmpty()) {
                bundle.putParcelableArray("android.messages", d.a(this.f22594a));
            }
            if (!this.f22595b.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", d.a(this.f22595b));
            }
            Boolean bool = this.f22598e;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        @Override // androidx.core.app.m.k
        public void apply(androidx.core.app.j jVar) {
            j(h());
            Notification.MessagingStyle messagingStyleA = c.a(this.f22596c.i());
            Iterator it = this.f22594a.iterator();
            while (it.hasNext()) {
                a.a(messagingStyleA, ((d) it.next()).k());
            }
            Iterator it2 = this.f22595b.iterator();
            while (it2.hasNext()) {
                b.a(messagingStyleA, ((d) it2.next()).k());
            }
            this.f22598e.booleanValue();
            a.b(messagingStyleA, this.f22597d);
            c.b(messagingStyleA, this.f22598e.booleanValue());
            messagingStyleA.setBuilder(jVar.a());
        }

        public i b(d dVar) {
            if (dVar != null) {
                this.f22594a.add(dVar);
                if (this.f22594a.size() > 25) {
                    this.f22594a.remove(0);
                }
            }
            return this;
        }

        public i c(CharSequence charSequence, long j10, u uVar) {
            b(new d(charSequence, j10, uVar));
            return this;
        }

        public CharSequence e() {
            return this.f22597d;
        }

        public List f() {
            return this.f22594a;
        }

        public u g() {
            return this.f22596c;
        }

        @Override // androidx.core.app.m.k
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        public boolean h() {
            e eVar = this.mBuilder;
            if (eVar != null && eVar.f22557a.getApplicationInfo().targetSdkVersion < 28 && this.f22598e == null) {
                return this.f22597d != null;
            }
            Boolean bool = this.f22598e;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public i i(CharSequence charSequence) {
            this.f22597d = charSequence;
            return this;
        }

        public i j(boolean z10) {
            this.f22598e = Boolean.valueOf(z10);
            return this;
        }

        @Override // androidx.core.app.m.k
        public void restoreFromCompatExtras(Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.f22594a.clear();
            if (bundle.containsKey("android.messagingStyleUser")) {
                this.f22596c = u.b(bundle.getBundle("android.messagingStyleUser"));
            } else {
                this.f22596c = new u.b().f(bundle.getString("android.selfDisplayName")).a();
            }
            CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
            this.f22597d = charSequence;
            if (charSequence == null) {
                this.f22597d = bundle.getCharSequence("android.hiddenConversationTitle");
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
            if (parcelableArray != null) {
                this.f22594a.addAll(d.f(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
            if (parcelableArray2 != null) {
                this.f22595b.addAll(d.f(parcelableArray2));
            }
            if (bundle.containsKey("android.isGroupConversation")) {
                this.f22598e = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
            }
        }

        public i(u uVar) {
            if (!TextUtils.isEmpty(uVar.e())) {
                this.f22596c = uVar;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CharSequence f22599a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f22600b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final u f22601c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Bundle f22602d = new Bundle();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public String f22603e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public Uri f22604f;

            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public static class a {
                public static Notification.MessagingStyle.Message a(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            public d(CharSequence charSequence, long j10, u uVar) {
                this.f22599a = charSequence;
                this.f22600b = j10;
                this.f22601c = uVar;
            }

            public static Bundle[] a(List list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    bundleArr[i10] = ((d) list.get(i10)).l();
                }
                return bundleArr;
            }

            public static d e(Bundle bundle) {
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        d dVar = new d(bundle.getCharSequence("text"), bundle.getLong("time"), bundle.containsKey("person") ? u.b(bundle.getBundle("person")) : bundle.containsKey("sender_person") ? u.a((Person) bundle.getParcelable("sender_person")) : bundle.containsKey("sender") ? new u.b().f(bundle.getCharSequence("sender")).a() : null);
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            dVar.j(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                        }
                        if (bundle.containsKey("extras")) {
                            dVar.d().putAll(bundle.getBundle("extras"));
                        }
                        return dVar;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            public static List f(Parcelable[] parcelableArr) {
                d dVarE;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Parcelable parcelable : parcelableArr) {
                    if ((parcelable instanceof Bundle) && (dVarE = e((Bundle) parcelable)) != null) {
                        arrayList.add(dVarE);
                    }
                }
                return arrayList;
            }

            public String b() {
                return this.f22603e;
            }

            public Uri c() {
                return this.f22604f;
            }

            public Bundle d() {
                return this.f22602d;
            }

            public u g() {
                return this.f22601c;
            }

            public CharSequence h() {
                return this.f22599a;
            }

            public long i() {
                return this.f22600b;
            }

            public d j(String str, Uri uri) {
                this.f22603e = str;
                this.f22604f = uri;
                return this;
            }

            public Notification.MessagingStyle.Message k() {
                u uVarG = g();
                Notification.MessagingStyle.Message messageB = b.b(h(), i(), uVarG == null ? null : uVarG.i());
                if (b() != null) {
                    a.a(messageB, b(), c());
                }
                return messageB;
            }

            public final Bundle l() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f22599a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f22600b);
                u uVar = this.f22601c;
                if (uVar != null) {
                    bundle.putCharSequence("sender", uVar.e());
                    bundle.putParcelable("sender_person", b.a(this.f22601c.i()));
                }
                String str = this.f22603e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f22604f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f22602d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public static class b {
                public static Notification.MessagingStyle.Message b(CharSequence charSequence, long j10, Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j10, person);
                }

                public static Parcelable a(Person person) {
                    return person;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class e {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public String f22533A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public boolean f22534B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public boolean f22535C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public boolean f22536D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public String f22537E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public Bundle f22538F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public int f22539G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public int f22540H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public Notification f22541I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public RemoteViews f22542J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public RemoteViews f22543K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public RemoteViews f22544L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public String f22545M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public int f22546N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public String f22547O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public L0.c f22548P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public long f22549Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public int f22550R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public int f22551S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public boolean f22552T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public Notification f22553U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public boolean f22554V;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        public Object f22555W;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public ArrayList f22556X;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f22557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f22558b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList f22559c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList f22560d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence f22561e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f22562f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f22563g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public PendingIntent f22564h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public PendingIntent f22565i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public RemoteViews f22566j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public IconCompat f22567k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f22568l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f22569m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f22570n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f22571o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f22572p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f22573q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public k f22574r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public CharSequence f22575s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public CharSequence f22576t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public CharSequence[] f22577u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f22578v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f22579w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f22580x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public String f22581y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public boolean f22582z;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a {
            public static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            public static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i10) {
                return builder.setContentType(i10);
            }

            public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i10) {
                return builder.setUsage(i10);
            }
        }

        public e(Context context, String str) {
            this.f22558b = new ArrayList();
            this.f22559c = new ArrayList();
            this.f22560d = new ArrayList();
            this.f22571o = true;
            this.f22534B = false;
            this.f22539G = 0;
            this.f22540H = 0;
            this.f22546N = 0;
            this.f22550R = 0;
            this.f22551S = 0;
            Notification notification = new Notification();
            this.f22553U = notification;
            this.f22557a = context;
            this.f22545M = str;
            notification.when = System.currentTimeMillis();
            this.f22553U.audioStreamType = -1;
            this.f22570n = 0;
            this.f22556X = new ArrayList();
            this.f22552T = true;
        }

        public static CharSequence f(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public e A(int i10, int i11, int i12) {
            Notification notification = this.f22553U;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e B(boolean z10) {
            this.f22534B = z10;
            return this;
        }

        public e C(int i10) {
            this.f22569m = i10;
            return this;
        }

        public e D(boolean z10) {
            u(2, z10);
            return this;
        }

        public e E(boolean z10) {
            u(8, z10);
            return this;
        }

        public e F(int i10) {
            this.f22570n = i10;
            return this;
        }

        public e G(int i10, int i11, boolean z10) {
            this.f22578v = i10;
            this.f22579w = i11;
            this.f22580x = z10;
            return this;
        }

        public e H(Notification notification) {
            this.f22541I = notification;
            return this;
        }

        public e I(String str) {
            this.f22547O = str;
            return this;
        }

        public e J(boolean z10) {
            this.f22571o = z10;
            return this;
        }

        public e K(boolean z10) {
            this.f22554V = z10;
            return this;
        }

        public e L(int i10) {
            this.f22553U.icon = i10;
            return this;
        }

        public e M(Uri uri) {
            Notification notification = this.f22553U;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder builderD = a.d(a.c(a.b(), 4), 5);
            this.f22553U.audioAttributes = a.a(builderD);
            return this;
        }

        public e N(k kVar) {
            if (this.f22574r != kVar) {
                this.f22574r = kVar;
                if (kVar != null) {
                    kVar.setBuilder(this);
                }
            }
            return this;
        }

        public e O(CharSequence charSequence) {
            this.f22575s = f(charSequence);
            return this;
        }

        public e P(CharSequence charSequence) {
            this.f22553U.tickerText = f(charSequence);
            return this;
        }

        public e Q(long j10) {
            this.f22549Q = j10;
            return this;
        }

        public e R(boolean z10) {
            this.f22572p = z10;
            return this;
        }

        public e S(long[] jArr) {
            this.f22553U.vibrate = jArr;
            return this;
        }

        public e T(int i10) {
            this.f22540H = i10;
            return this;
        }

        public e U(long j10) {
            this.f22553U.when = j10;
            return this;
        }

        public e a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f22558b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public e b(a aVar) {
            if (aVar != null) {
                this.f22558b.add(aVar);
            }
            return this;
        }

        public e c(a aVar) {
            if (aVar != null) {
                this.f22560d.add(aVar);
            }
            return this;
        }

        public Notification d() {
            return new p(this).c();
        }

        public Bundle e() {
            if (this.f22538F == null) {
                this.f22538F = new Bundle();
            }
            return this.f22538F;
        }

        public e g(boolean z10) {
            u(16, z10);
            return this;
        }

        public e h(String str) {
            this.f22537E = str;
            return this;
        }

        public e i(String str) {
            this.f22545M = str;
            return this;
        }

        public e j(boolean z10) {
            this.f22573q = z10;
            e().putBoolean("android.chronometerCountDown", z10);
            return this;
        }

        public e k(int i10) {
            this.f22539G = i10;
            return this;
        }

        public e l(boolean z10) {
            this.f22535C = z10;
            this.f22536D = true;
            return this;
        }

        public e m(PendingIntent pendingIntent) {
            this.f22564h = pendingIntent;
            return this;
        }

        public e n(CharSequence charSequence) {
            this.f22562f = f(charSequence);
            return this;
        }

        public e o(CharSequence charSequence) {
            this.f22561e = f(charSequence);
            return this;
        }

        public e p(RemoteViews remoteViews) {
            this.f22543K = remoteViews;
            return this;
        }

        public e q(RemoteViews remoteViews) {
            this.f22542J = remoteViews;
            return this;
        }

        public e r(RemoteViews remoteViews) {
            this.f22544L = remoteViews;
            return this;
        }

        public e s(int i10) {
            Notification notification = this.f22553U;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e t(PendingIntent pendingIntent) {
            this.f22553U.deleteIntent = pendingIntent;
            return this;
        }

        public final void u(int i10, boolean z10) {
            if (z10) {
                Notification notification = this.f22553U;
                notification.flags = i10 | notification.flags;
            } else {
                Notification notification2 = this.f22553U;
                notification2.flags = (~i10) & notification2.flags;
            }
        }

        public e v(PendingIntent pendingIntent, boolean z10) {
            this.f22565i = pendingIntent;
            u(128, z10);
            return this;
        }

        public e w(String str) {
            this.f22581y = str;
            return this;
        }

        public e x(int i10) {
            this.f22550R = i10;
            return this;
        }

        public e y(boolean z10) {
            this.f22582z = z10;
            return this;
        }

        public e z(Bitmap bitmap) {
            this.f22567k = bitmap == null ? null : IconCompat.f(m.b(this.f22557a, bitmap));
            return this;
        }

        public e(Context context) {
            this(context, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class k {
        CharSequence mBigContentTitle;
        protected e mBuilder;
        CharSequence mSummaryText;
        boolean mSummaryTextSet = false;

        public static k a(String str) {
            if (str == null) {
                return null;
            }
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new b();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new c();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new h();
            }
            if (Build.VERSION.SDK_INT >= 36 && str.equals(o.a().getName())) {
                return new j();
            }
            if (str.equals(Notification.MessagingStyle.class.getName())) {
                return new i();
            }
            if (str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                return new g();
            }
            return null;
        }

        public static k constructCompatStyleByName(String str) {
            if (str == null) {
                return null;
            }
            switch (str) {
                case "androidx.core.app.NotificationCompat$ProgressStyle":
                    return new j();
                case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle":
                    return new g();
                case "androidx.core.app.NotificationCompat$BigPictureStyle":
                    return new b();
                case "androidx.core.app.NotificationCompat$CallStyle":
                    return new f();
                case "androidx.core.app.NotificationCompat$InboxStyle":
                    return new h();
                case "androidx.core.app.NotificationCompat$BigTextStyle":
                    return new c();
                case "androidx.core.app.NotificationCompat$MessagingStyle":
                    return new i();
                default:
                    return null;
            }
        }

        public static k constructCompatStyleForBundle(Bundle bundle) {
            k kVarConstructCompatStyleByName = constructCompatStyleByName(bundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE"));
            return kVarConstructCompatStyleByName != null ? kVarConstructCompatStyleByName : (bundle.containsKey("android.selfDisplayName") || bundle.containsKey("android.messagingStyleUser")) ? new i() : (bundle.containsKey("android.picture") || bundle.containsKey("android.pictureIcon")) ? new b() : bundle.containsKey("android.bigText") ? new c() : bundle.containsKey("android.textLines") ? new h() : bundle.containsKey("android.callType") ? new f() : (bundle.containsKey("android.progressSegments") || bundle.containsKey("android.progressPoints")) ? new j() : a(bundle.getString("android.template"));
        }

        public static k constructStyleForExtras(Bundle bundle) {
            k kVarConstructCompatStyleForBundle = constructCompatStyleForBundle(bundle);
            if (kVarConstructCompatStyleForBundle == null) {
                return null;
            }
            try {
                kVarConstructCompatStyleForBundle.restoreFromCompatExtras(bundle);
                return kVarConstructCompatStyleForBundle;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        public static k extractStyleFromNotification(Notification notification) {
            Bundle bundleA = m.a(notification);
            if (bundleA == null) {
                return null;
            }
            return constructStyleForExtras(bundleA);
        }

        public void addCompatExtras(Bundle bundle) {
            if (this.mSummaryTextSet) {
                bundle.putCharSequence("android.summaryText", this.mSummaryText);
            }
            CharSequence charSequence = this.mBigContentTitle;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String className = getClassName();
            if (className != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", className);
            }
        }

        public String getClassName() {
            return null;
        }

        public RemoteViews makeBigContentView(androidx.core.app.j jVar) {
            return null;
        }

        public RemoteViews makeContentView(androidx.core.app.j jVar) {
            return null;
        }

        public RemoteViews makeHeadsUpContentView(androidx.core.app.j jVar) {
            return null;
        }

        public void restoreFromCompatExtras(Bundle bundle) {
            if (bundle.containsKey("android.summaryText")) {
                this.mSummaryText = bundle.getCharSequence("android.summaryText");
                this.mSummaryTextSet = true;
            }
            this.mBigContentTitle = bundle.getCharSequence("android.title.big");
        }

        public void setBuilder(e eVar) {
            if (this.mBuilder != eVar) {
                this.mBuilder = eVar;
                if (eVar != null) {
                    eVar.N(this);
                }
            }
        }

        public void apply(androidx.core.app.j jVar) {
        }
    }

    public static Bitmap b(Context context, Bitmap bitmap) {
        return bitmap;
    }
}
