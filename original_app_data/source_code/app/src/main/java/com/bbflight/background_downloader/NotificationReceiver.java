package com.bbflight.background_downloader;

import Q4.B;
import Q4.ResumeData;
import Q4.Task;
import Rd.AbstractC2130h;
import Rd.AbstractC2132i;
import Rd.C2123d0;
import Rd.M;
import Rd.N;
import android.app.ForegroundServiceStartNotAllowedException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.core.app.NotificationManagerCompat;
import com.bbflight.background_downloader.a;
import fc.AbstractC4036s;
import fc.C4015H;
import gc.C4207u;
import he.AbstractC4304b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5158b;
import nc.AbstractC5160d;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0082@¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbflight/background_downloader/NotificationReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "", "taskId", "LQ4/O;", "resumeData", "notificationConfigJsonString", "Lfc/H;", "attemptResume", "(Landroid/content/Context;Ljava/lang/String;LQ4/O;Ljava/lang/String;Llc/e;)Ljava/lang/Object;", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Companion", "a", "background_downloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NotificationReceiver extends BroadcastReceiver {
    public static final String actionCancelActive = "com.bbflight.background_downloader.cancelActive";
    public static final String actionCancelInactive = "com.bbflight.background_downloader.cancelInactive";
    public static final String actionPause = "com.bbflight.background_downloader.pause";
    public static final String actionResume = "com.bbflight.background_downloader.resume";
    public static final String actionTap = "com.bbflight.background_downloader.tap";
    public static final String keyBundle = "com.bbflight.background_downloader.bundle";
    public static final String keyGroupNotificationName = "com.bbflight.background_downloader.groupNotificationName";
    public static final String keyNotificationConfig = "com.bbflight.background_downloader.notificationConfig";
    public static final String keyNotificationId = "com.bbflight.background_downloader.notificationId";
    public static final String keyNotificationType = "com.bbflight.background_downloader.notificationType";
    public static final String keyTask = "com.bbflight.background_downloader.task";
    public static final String keyTaskId = "com.bbflight.background_downloader.taskId";

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f26644j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f26645k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f26646l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f26647m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f26648n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f26650p;

        public b(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f26648n = obj;
            this.f26650p |= Integer.MIN_VALUE;
            return NotificationReceiver.this.attemptResume(null, null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f26651j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f26652k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f26653l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Intent f26654m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Context f26655n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f26656o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Bundle f26657p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ NotificationReceiver f26658q;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends nc.m implements p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f26659j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ Context f26660k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Intent f26661l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ NotificationReceiver f26662m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final /* synthetic */ String f26663n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public final /* synthetic */ ResumeData f26664o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public final /* synthetic */ String f26665p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, Intent intent, NotificationReceiver notificationReceiver, String str, ResumeData resumeData, String str2, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f26660k = context;
                this.f26661l = intent;
                this.f26662m = notificationReceiver;
                this.f26663n = str;
                this.f26664o = resumeData;
                this.f26665p = str2;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                return new a(this.f26660k, this.f26661l, this.f26662m, this.f26663n, this.f26664o, this.f26665p, interfaceC4988e);
            }

            @Override // vc.p
            public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
                return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(2:46|(1:(3:6|42|43)(2:14|15))(1:16))(5:18|47|19|(1:21)|26)|22|23|44|24|(1:(0))) */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
            
                if (r6.attemptResume(r7, r8, r9, r10, r11) == r0) goto L26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
            
                r0 = e;
             */
            @Override // nc.AbstractC5157a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 213
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.NotificationReceiver.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Intent intent, Context context, String str, Bundle bundle, NotificationReceiver notificationReceiver, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f26654m = intent;
            this.f26655n = context;
            this.f26656o = str;
            this.f26657p = bundle;
            this.f26658q = notificationReceiver;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new c(this.f26654m, this.f26655n, this.f26656o, this.f26657p, this.f26658q, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((c) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Task task;
            ResumeData resumeData;
            String str;
            ResumeData resumeData2;
            String str2;
            ResumeData resumeData3;
            String str3;
            Object objF = C5046c.f();
            int i10 = this.f26653l;
            if (i10 != 0) {
                if (i10 == 1) {
                    AbstractC4036s.b(obj);
                    return obj;
                }
                if (i10 == 2) {
                    task = (Task) this.f26652k;
                    AbstractC4036s.b(obj);
                    NotificationManagerCompat.from(this.f26655n).cancel(task.getTaskId().hashCode());
                    return C4015H.f34254a;
                }
                if (i10 != 3) {
                    if (i10 == 4) {
                    } else if (i10 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4036s.b(obj);
                    return obj;
                }
                str3 = (String) this.f26652k;
                resumeData3 = (ResumeData) this.f26651j;
                try {
                    AbstractC4036s.b(obj);
                    return C4015H.f34254a;
                } catch (Exception e10) {
                    e = e10;
                    str2 = str3;
                    resumeData2 = resumeData3;
                    if (Build.VERSION.SDK_INT > 31 || !(e instanceof ForegroundServiceStartNotAllowedException)) {
                        return AbstractC5158b.c(Log.e("BackgroundDownloader", "Error resuming taskId " + this.f26656o + ": " + e.getMessage(), e));
                    }
                    Intent launchIntentForPackage = this.f26655n.getPackageManager().getLaunchIntentForPackage(this.f26655n.getPackageName());
                    if (launchIntentForPackage != null) {
                        launchIntentForPackage.addFlags(268435456);
                    } else {
                        launchIntentForPackage = null;
                    }
                    Intent intent = launchIntentForPackage;
                    if (intent != null) {
                        return AbstractC2132i.d(N.a(C2123d0.c()), null, null, new a(this.f26655n, intent, this.f26658q, this.f26656o, resumeData2, str2, null), 3, null);
                    }
                    return AbstractC5158b.c(Log.e("BackgroundDownloader", "When resuming taskId " + this.f26656o + ", could not get launch intent for package " + this.f26655n.getPackageName()));
                }
            }
            AbstractC4036s.b(obj);
            String action = this.f26654m.getAction();
            if (action != null) {
                switch (action.hashCode()) {
                    case -1549397763:
                        if (action.equals(NotificationReceiver.actionPause)) {
                            return AbstractC5158b.a(com.bbflight.background_downloader.a.INSTANCE.A(this.f26656o));
                        }
                        break;
                    case -1333239330:
                        if (action.equals(NotificationReceiver.actionCancelInactive)) {
                            String string = this.f26657p.getString(NotificationReceiver.keyTask);
                            if (string == null) {
                                return AbstractC5158b.c(Log.d("BackgroundDownloader", "task was null"));
                            }
                            AbstractC4304b.a aVar = AbstractC4304b.f36582d;
                            aVar.d();
                            Task task2 = (Task) aVar.a(Task.INSTANCE.serializer(), string);
                            a.Companion companion = com.bbflight.background_downloader.a.INSTANCE;
                            Context context = this.f26655n;
                            this.f26651j = nc.l.a(string);
                            this.f26652k = task2;
                            this.f26653l = 2;
                            if (companion.d(context, task2, this) != objF) {
                                task = task2;
                                NotificationManagerCompat.from(this.f26655n).cancel(task.getTaskId().hashCode());
                                return C4015H.f34254a;
                            }
                        }
                        break;
                    case -725795322:
                        if (action.equals(NotificationReceiver.actionResume)) {
                            a.Companion companion2 = com.bbflight.background_downloader.a.INSTANCE;
                            ResumeData resumeData4 = (ResumeData) companion2.q().get(this.f26656o);
                            if (resumeData4 != null) {
                                String string2 = this.f26657p.getString(NotificationReceiver.keyNotificationConfig);
                                if (string2 != null) {
                                    try {
                                        NotificationReceiver notificationReceiver = this.f26658q;
                                        Context context2 = this.f26655n;
                                        String str4 = this.f26656o;
                                        this.f26651j = resumeData4;
                                        this.f26652k = string2;
                                        this.f26653l = 3;
                                        resumeData = resumeData4;
                                        str = string2;
                                        try {
                                            if (notificationReceiver.attemptResume(context2, str4, resumeData, str, this) != objF) {
                                                resumeData3 = resumeData;
                                                str3 = str;
                                                return C4015H.f34254a;
                                            }
                                        } catch (Exception e11) {
                                            e = e11;
                                            resumeData2 = resumeData;
                                            str2 = str;
                                            if (Build.VERSION.SDK_INT > 31) {
                                                break;
                                            }
                                            return AbstractC5158b.c(Log.e("BackgroundDownloader", "Error resuming taskId " + this.f26656o + ": " + e.getMessage(), e));
                                        }
                                    } catch (Exception e12) {
                                        e = e12;
                                        resumeData = resumeData4;
                                        str = string2;
                                    }
                                } else {
                                    Context context3 = this.f26655n;
                                    String str5 = this.f26656o;
                                    I3.M mA = I3.M.f5571a.a(context3);
                                    this.f26651j = nc.l.a(resumeData4);
                                    this.f26652k = nc.l.a(string2);
                                    this.f26653l = 4;
                                    Object objC = companion2.c(context3, str5, mA, this);
                                    if (objC != objF) {
                                        return objC;
                                    }
                                }
                            } else {
                                Context context4 = this.f26655n;
                                String str6 = this.f26656o;
                                I3.M mA2 = I3.M.f5571a.a(context4);
                                this.f26651j = nc.l.a(resumeData4);
                                this.f26653l = 5;
                                Object objC2 = companion2.c(context4, str6, mA2, this);
                                if (objC2 != objF) {
                                    return objC2;
                                }
                            }
                        }
                        break;
                    case 1096303929:
                        if (action.equals(NotificationReceiver.actionCancelActive)) {
                            a.Companion companion3 = com.bbflight.background_downloader.a.INSTANCE;
                            Context context5 = this.f26655n;
                            String str7 = this.f26656o;
                            I3.M mA3 = I3.M.f5571a.a(context5);
                            this.f26653l = 1;
                            Object objC3 = companion3.c(context5, str7, mA3, this);
                            return objC3 == objF ? objF : objC3;
                        }
                        break;
                }
            }
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f26666j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Context f26667k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ B f26668l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, B b10, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f26667k = context;
            this.f26668l = b10;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new d(this.f26667k, this.f26668l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((d) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f26666j;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                return obj;
            }
            AbstractC4036s.b(obj);
            a.Companion companion = a.INSTANCE;
            Context context = this.f26667k;
            Set setJ = this.f26668l.j();
            ArrayList arrayList = new ArrayList(C4207u.v(setJ, 10));
            Iterator it = setJ.iterator();
            while (it.hasNext()) {
                arrayList.add(((Task) it.next()).getTaskId());
            }
            this.f26666j = 1;
            Object objE = companion.e(context, arrayList, this);
            return objE == objF ? objF : objE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e4, code lost:
    
        if (r15.A(r5, r10) == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object attemptResume(android.content.Context r16, java.lang.String r17, Q4.ResumeData r18, java.lang.String r19, lc.InterfaceC4988e r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.NotificationReceiver.attemptResume(android.content.Context, java.lang.String, Q4.O, java.lang.String, lc.e):java.lang.Object");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        B b10;
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(intent, "intent");
        Bundle bundleExtra = intent.getBundleExtra(keyBundle);
        String string = bundleExtra != null ? bundleExtra.getString(keyTaskId) : null;
        if (string != null) {
            AbstractC2130h.b(null, new c(intent, context, string, bundleExtra, this, null), 1, null);
            return;
        }
        String string2 = bundleExtra != null ? bundleExtra.getString(keyGroupNotificationName) : null;
        if (string2 == null || (b10 = (B) g.f27137a.n().get(string2)) == null) {
            return;
        }
        AbstractC2130h.b(null, new d(context, b10, null), 1, null);
    }
}
