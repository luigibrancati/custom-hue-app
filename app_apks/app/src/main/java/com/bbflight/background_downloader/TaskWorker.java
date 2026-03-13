package com.bbflight.background_downloader;

import I3.C0880j;
import Q4.NotificationConfig;
import Q4.Task;
import Q4.Y;
import Q4.b0;
import Q4.g0;
import android.app.Notification;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import fc.C4015H;
import fc.C4033p;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5160d;
import org.apache.tika.metadata.OfficeOpenXMLExtended;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0016\u0018\u0000 12\u00020\u00012\u00020\u0002:\u0001JB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J0\u0010 \u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&H\u0096@¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.R\"\u0010\u001a\u001a\u00020\u00198\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010<\u001a\u0004\u0018\u0001058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010\u0012\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010I\u001a\u00020\u001d8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010K\u001a\u00020\u001d8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010D\u001a\u0004\bJ\u0010F\"\u0004\b=\u0010HR\"\u0010R\u001a\u00020L8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\b6\u0010QR$\u0010W\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b?\u0010S\u001a\u0004\bT\u0010U\"\u0004\bM\u0010VR\"\u0010Y\u001a\u00020L8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b8\u0010N\u001a\u0004\bX\u0010P\"\u0004\bC\u0010QR\u0014\u0010[\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010.R\u0014\u0010\\\u001a\u00020L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010PR\u0014\u0010^\u001a\u00020L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010P¨\u0006_"}, d2 = {"Lcom/bbflight/background_downloader/TaskWorker;", "Landroidx/work/CoroutineWorker;", "LQ4/b0;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "", "key", "", "defaultValue", "r", "(Ljava/lang/String;J)J", "g", "(Ljava/lang/String;)Ljava/lang/String;", "", "notificationId", "Landroid/app/Notification;", "notification", "notificationType", "Lfc/H;", "s", "(ILandroid/app/Notification;ILlc/e;)Ljava/lang/Object;", "LQ4/X;", "task", "LQ4/g0;", "status", "", "progress", "timeRemaining", "l", "(LQ4/X;LQ4/g0;DJLlc/e;)Ljava/lang/Object;", "downloadBytes", "uploadBytes", "f", "(JJ)V", "Landroidx/work/c$a;", "K", "(Llc/e;)Ljava/lang/Object;", "Lcom/bbflight/background_downloader/l;", "N", "()Lcom/bbflight/background_downloader/l;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "h", "LQ4/X;", "p", "()LQ4/X;", "v", "(LQ4/X;)V", "LQ4/E;", "i", "LQ4/E;", "o", "()LQ4/E;", "u", "(LQ4/E;)V", "notificationConfig", "j", "I", "n", "()I", OfficeOpenXMLExtended.WORD_PROCESSING_PREFIX, "(I)V", "k", "D", "q", "()D", "x", "(D)V", "notificationProgress", "a", "networkSpeed", "", "m", "Z", "b", "()Z", "(Z)V", "taskCanResume", "Ljava/lang/String;", "y", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "notificationConfigJsonString", "d", "runInForeground", "t", "appContext", "isTaskStopped", "c", "isActive", "background_downloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class TaskWorker extends CoroutineWorker implements b0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final Context context;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public Task task;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public NotificationConfig notificationConfig;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int notificationId;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public double notificationProgress;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public double networkSpeed;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean taskCanResume;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public String notificationConfigJsonString;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public boolean runInForeground;

    /* JADX INFO: renamed from: com.bbflight.background_downloader.TaskWorker$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        public static /* synthetic */ Object b(Companion companion, Task task, g0 g0Var, SharedPreferences sharedPreferences, Y y10, String str, Map map, Integer num, String str2, String str3, Context context, InterfaceC4988e interfaceC4988e, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                y10 = null;
            }
            if ((i10 & 16) != 0) {
                str = null;
            }
            if ((i10 & 32) != 0) {
                map = null;
            }
            if ((i10 & 64) != 0) {
                num = null;
            }
            if ((i10 & 128) != 0) {
                str2 = null;
            }
            if ((i10 & 256) != 0) {
                str3 = null;
            }
            return companion.a(task, g0Var, sharedPreferences, y10, str, map, num, str2, str3, context, interfaceC4988e);
        }

        public final Object a(Task task, g0 g0Var, SharedPreferences sharedPreferences, Y y10, String str, Map map, Integer num, String str2, String str3, Context context, InterfaceC4988e interfaceC4988e) {
            Object objI = l.f27291t.i(task, g0Var, sharedPreferences, y10, str, map, num, str2, str3, context, interfaceC4988e);
            return objI == C5046c.f() ? objI : C4015H.f34254a;
        }

        public final String c(Task task) {
            AbstractC4862t.e(task, "task");
            return l.f27291t.l(task);
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f26679j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f26680k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f26681l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f26682m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f26683n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f26684o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f26686q;

        public b(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f26684o = obj;
            this.f26686q |= Integer.MIN_VALUE;
            return TaskWorker.O(TaskWorker.this, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskWorker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(workerParams, "workerParams");
        this.context = context;
        this.notificationProgress = 2.0d;
        this.networkSpeed = -1.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object O(com.bbflight.background_downloader.TaskWorker r7, lc.InterfaceC4988e r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.TaskWorker.O(com.bbflight.background_downloader.TaskWorker, lc.e):java.lang.Object");
    }

    public static /* synthetic */ Object P(TaskWorker taskWorker, int i10, Notification notification, int i11, InterfaceC4988e interfaceC4988e) {
        Object objM = taskWorker.M(new C0880j(i10, notification, i11), interfaceC4988e);
        return objM == C5046c.f() ? objM : C4015H.f34254a;
    }

    public static /* synthetic */ Object Q(TaskWorker taskWorker, Task task, g0 g0Var, double d10, long j10, InterfaceC4988e interfaceC4988e) {
        Object objW = g.f27137a.w(taskWorker, g0Var, d10, j10, interfaceC4988e);
        return objW == C5046c.f() ? objW : C4015H.f34254a;
    }

    @Override // androidx.work.CoroutineWorker
    public Object K(InterfaceC4988e interfaceC4988e) {
        return O(this, interfaceC4988e);
    }

    public l N() {
        throw new C4033p("Subclasses must override createRunner");
    }

    @Override // Q4.b0
    /* JADX INFO: renamed from: a, reason: from getter */
    public double getNetworkSpeed() {
        return this.networkSpeed;
    }

    @Override // Q4.b0
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getTaskCanResume() {
        return this.taskCanResume;
    }

    @Override // Q4.b0
    public boolean c() {
        return !h();
    }

    @Override // Q4.b0
    /* JADX INFO: renamed from: d, reason: from getter */
    public boolean getRunInForeground() {
        return this.runInForeground;
    }

    @Override // Q4.b0
    public String g(String key) {
        AbstractC4862t.e(key, "key");
        return C().f(key);
    }

    @Override // Q4.b0
    public boolean h() {
        return D();
    }

    @Override // Q4.b0
    public void i(boolean z10) {
        this.taskCanResume = z10;
    }

    @Override // Q4.b0
    public void j(double d10) {
        this.networkSpeed = d10;
    }

    @Override // Q4.b0
    public void k(boolean z10) {
        this.runInForeground = z10;
    }

    @Override // Q4.b0
    public Object l(Task task, g0 g0Var, double d10, long j10, InterfaceC4988e interfaceC4988e) {
        return Q(this, task, g0Var, d10, j10, interfaceC4988e);
    }

    @Override // Q4.b0
    public void m(String str) {
        this.notificationConfigJsonString = str;
    }

    @Override // Q4.b0
    /* JADX INFO: renamed from: n, reason: from getter */
    public int getNotificationId() {
        return this.notificationId;
    }

    @Override // Q4.b0
    /* JADX INFO: renamed from: o, reason: from getter */
    public NotificationConfig getNotificationConfig() {
        return this.notificationConfig;
    }

    @Override // Q4.b0
    public Task p() {
        Task task = this.task;
        if (task != null) {
            return task;
        }
        AbstractC4862t.p("task");
        return null;
    }

    @Override // Q4.b0
    /* JADX INFO: renamed from: q, reason: from getter */
    public double getNotificationProgress() {
        return this.notificationProgress;
    }

    @Override // Q4.b0
    public long r(String key, long defaultValue) {
        AbstractC4862t.e(key, "key");
        return C().e(key, defaultValue);
    }

    @Override // Q4.b0
    public Object s(int i10, Notification notification, int i11, InterfaceC4988e interfaceC4988e) {
        return P(this, i10, notification, i11, interfaceC4988e);
    }

    @Override // Q4.b0
    public Context t() {
        Context contextZ = z();
        AbstractC4862t.d(contextZ, "getApplicationContext(...)");
        return contextZ;
    }

    @Override // Q4.b0
    public void u(NotificationConfig notificationConfig) {
        this.notificationConfig = notificationConfig;
    }

    @Override // Q4.b0
    public void v(Task task) {
        AbstractC4862t.e(task, "<set-?>");
        this.task = task;
    }

    @Override // Q4.b0
    public void w(int i10) {
        this.notificationId = i10;
    }

    @Override // Q4.b0
    public void x(double d10) {
        this.notificationProgress = d10;
    }

    @Override // Q4.b0
    /* JADX INFO: renamed from: y, reason: from getter */
    public String getNotificationConfigJsonString() {
        return this.notificationConfigJsonString;
    }

    @Override // Q4.b0
    public void f(long downloadBytes, long uploadBytes) {
    }
}
