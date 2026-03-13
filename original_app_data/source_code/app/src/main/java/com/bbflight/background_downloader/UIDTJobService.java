package com.bbflight.background_downloader;

import Q4.NotificationConfig;
import Q4.Task;
import Q4.b0;
import Q4.g0;
import Q4.r;
import Rd.AbstractC2132i;
import Rd.C2123d0;
import Rd.InterfaceC2166z0;
import Rd.M;
import Rd.N;
import android.app.Notification;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.util.Log;
import de.AbstractC3918a;
import fc.AbstractC4036s;
import fc.C4015H;
import he.AbstractC4304b;
import io.sentry.protocol.Message;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5158b;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\bR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/bbflight/background_downloader/UIDTJobService;", "Landroid/app/job/JobService;", "<init>", "()V", "Landroid/app/job/JobParameters;", Message.JsonKeys.PARAMS, "", "onStartJob", "(Landroid/app/job/JobParameters;)Z", "onStopJob", "Ljava/util/concurrent/ConcurrentHashMap;", "", "LRd/z0;", "a", "Ljava/util/concurrent/ConcurrentHashMap;", "jobs", "background_downloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UIDTJobService extends JobService {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final ConcurrentHashMap jobs = new ConcurrentHashMap();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JobService f26688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final JobParameters f26689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Task f26690c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public NotificationConfig f26691d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f26692e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public double f26693f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public double f26694g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f26695h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f26696i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f26697j;

        public a(JobService service, JobParameters params) {
            AbstractC4862t.e(service, "service");
            AbstractC4862t.e(params, "params");
            this.f26688a = service;
            this.f26689b = params;
            this.f26693f = 2.0d;
            this.f26694g = -1.0d;
            this.f26697j = true;
        }

        @Override // Q4.b0
        /* JADX INFO: renamed from: a */
        public double getNetworkSpeed() {
            return this.f26694g;
        }

        @Override // Q4.b0
        /* JADX INFO: renamed from: b */
        public boolean getTaskCanResume() {
            return this.f26695h;
        }

        @Override // Q4.b0
        public boolean c() {
            return true;
        }

        @Override // Q4.b0
        /* JADX INFO: renamed from: d */
        public boolean getRunInForeground() {
            return this.f26697j;
        }

        @Override // Q4.b0
        public void f(long j10, long j11) {
            if (Build.VERSION.SDK_INT >= 34) {
                this.f26688a.updateEstimatedNetworkBytes(this.f26689b, j10, j11);
            }
        }

        @Override // Q4.b0
        public String g(String key) {
            AbstractC4862t.e(key, "key");
            PersistableBundle extras = this.f26689b.getExtras();
            if (extras != null) {
                return extras.getString(key);
            }
            return null;
        }

        @Override // Q4.b0
        public boolean h() {
            return !c();
        }

        @Override // Q4.b0
        public void i(boolean z10) {
            this.f26695h = z10;
        }

        @Override // Q4.b0
        public void j(double d10) {
            this.f26694g = d10;
        }

        @Override // Q4.b0
        public void k(boolean z10) {
            this.f26697j = z10;
        }

        @Override // Q4.b0
        public Object l(Task task, g0 g0Var, double d10, long j10, InterfaceC4988e interfaceC4988e) {
            Object objW = g.f27137a.w(this, g0Var, d10, j10, interfaceC4988e);
            return objW == C5046c.f() ? objW : C4015H.f34254a;
        }

        @Override // Q4.b0
        public void m(String str) {
            this.f26696i = str;
        }

        @Override // Q4.b0
        /* JADX INFO: renamed from: n */
        public int getNotificationId() {
            return this.f26692e;
        }

        @Override // Q4.b0
        /* JADX INFO: renamed from: o */
        public NotificationConfig getNotificationConfig() {
            return this.f26691d;
        }

        @Override // Q4.b0
        public Task p() {
            Task task = this.f26690c;
            if (task != null) {
                return task;
            }
            AbstractC4862t.p("task");
            return null;
        }

        @Override // Q4.b0
        /* JADX INFO: renamed from: q */
        public double getNotificationProgress() {
            return this.f26693f;
        }

        @Override // Q4.b0
        public long r(String key, long j10) {
            AbstractC4862t.e(key, "key");
            PersistableBundle extras = this.f26689b.getExtras();
            return extras != null ? extras.getLong(key, j10) : j10;
        }

        @Override // Q4.b0
        public Object s(int i10, Notification notification, int i11, InterfaceC4988e interfaceC4988e) {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 < 34 && i12 < 34) {
                this.f26688a.startForeground(i10, notification, i11);
            } else {
                this.f26688a.setNotification(this.f26689b, i10, notification, i11);
            }
            return C4015H.f34254a;
        }

        @Override // Q4.b0
        public Context t() {
            Context applicationContext = this.f26688a.getApplicationContext();
            AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
            return applicationContext;
        }

        @Override // Q4.b0
        public void u(NotificationConfig notificationConfig) {
            this.f26691d = notificationConfig;
        }

        @Override // Q4.b0
        public void v(Task task) {
            AbstractC4862t.e(task, "<set-?>");
            this.f26690c = task;
        }

        @Override // Q4.b0
        public void w(int i10) {
            this.f26692e = i10;
        }

        @Override // Q4.b0
        public void x(double d10) {
            this.f26693f = d10;
        }

        @Override // Q4.b0
        /* JADX INFO: renamed from: y */
        public String getNotificationConfigJsonString() {
            return this.f26696i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f26698j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ l f26699k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ a f26700l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ UIDTJobService f26701m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ JobParameters f26702n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l lVar, a aVar, UIDTJobService uIDTJobService, JobParameters jobParameters, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f26699k = lVar;
            this.f26700l = aVar;
            this.f26701m = uIDTJobService;
            this.f26702n = jobParameters;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new b(this.f26699k, this.f26700l, this.f26701m, this.f26702n, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((b) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f26698j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                l lVar = this.f26699k;
                this.f26698j = 1;
                if (lVar.F(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            Log.d("TaskRunner", "UIDT JobService finished for taskId " + this.f26700l.p().getTaskId());
            this.f26701m.jobs.remove(AbstractC5158b.c(this.f26702n.getJobId()));
            this.f26701m.jobFinished(this.f26702n, false);
            return C4015H.f34254a;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters params) {
        l hVar;
        Log.d("TaskRunner", "Starting UIDT JobService");
        if (params == null) {
            return false;
        }
        PersistableBundle extras = params.getExtras();
        AbstractC4862t.d(extras, "getExtras(...)");
        String string = extras.getString("Task");
        if (string == null) {
            Log.e("TaskRunner", "Task JSON not found in job parameters");
            return false;
        }
        a aVar = new a(this, params);
        try {
            AbstractC4304b.a aVar2 = AbstractC4304b.f36582d;
            aVar2.d();
            aVar.v((Task) aVar2.a(Task.INSTANCE.serializer(), string));
            aVar.m(extras.getString("notificationConfig"));
            if (aVar.getNotificationConfigJsonString() != null) {
                String notificationConfigJsonString = aVar.getNotificationConfigJsonString();
                AbstractC4862t.b(notificationConfigJsonString);
                aVar2.d();
                aVar.u((NotificationConfig) aVar2.a(AbstractC3918a.p(NotificationConfig.INSTANCE.serializer()), notificationConfigJsonString));
            }
            String taskType = aVar.p().getTaskType();
            switch (taskType.hashCode()) {
                case -2093100556:
                    if (taskType.equals("ParallelDownloadTask")) {
                        hVar = new h(aVar);
                        this.jobs.put(Integer.valueOf(params.getJobId()), AbstractC2132i.d(N.a(C2123d0.b()), null, null, new b(hVar, aVar, this, params, null), 3, null));
                    }
                    Log.e("TaskRunner", "Unknown task type: " + aVar.p().getTaskType());
                    break;
                case -1975386727:
                    if (taskType.equals("UriDownloadTask")) {
                        hVar = new c(aVar);
                        this.jobs.put(Integer.valueOf(params.getJobId()), AbstractC2132i.d(N.a(C2123d0.b()), null, null, new b(hVar, aVar, this, params, null), 3, null));
                    }
                    Log.e("TaskRunner", "Unknown task type: " + aVar.p().getTaskType());
                    break;
                case -683424481:
                    if (taskType.equals("MultiUploadTask")) {
                        hVar = new n(aVar);
                        this.jobs.put(Integer.valueOf(params.getJobId()), AbstractC2132i.d(N.a(C2123d0.b()), null, null, new b(hVar, aVar, this, params, null), 3, null));
                    }
                    Log.e("TaskRunner", "Unknown task type: " + aVar.p().getTaskType());
                    break;
                case 415156626:
                    if (taskType.equals("UriUploadTask")) {
                        hVar = new n(aVar);
                        this.jobs.put(Integer.valueOf(params.getJobId()), AbstractC2132i.d(N.a(C2123d0.b()), null, null, new b(hVar, aVar, this, params, null), 3, null));
                    }
                    Log.e("TaskRunner", "Unknown task type: " + aVar.p().getTaskType());
                    break;
                case 1273381453:
                    if (taskType.equals("DownloadTask")) {
                        hVar = new c(aVar);
                        this.jobs.put(Integer.valueOf(params.getJobId()), AbstractC2132i.d(N.a(C2123d0.b()), null, null, new b(hVar, aVar, this, params, null), 3, null));
                    }
                    Log.e("TaskRunner", "Unknown task type: " + aVar.p().getTaskType());
                    break;
                case 1750379334:
                    if (taskType.equals("UploadTask")) {
                        hVar = new n(aVar);
                        this.jobs.put(Integer.valueOf(params.getJobId()), AbstractC2132i.d(N.a(C2123d0.b()), null, null, new b(hVar, aVar, this, params, null), 3, null));
                    }
                    Log.e("TaskRunner", "Unknown task type: " + aVar.p().getTaskType());
                    break;
                case 1853692015:
                    if (taskType.equals("DataTask")) {
                        hVar = new r(aVar);
                        this.jobs.put(Integer.valueOf(params.getJobId()), AbstractC2132i.d(N.a(C2123d0.b()), null, null, new b(hVar, aVar, this, params, null), 3, null));
                    }
                    Log.e("TaskRunner", "Unknown task type: " + aVar.p().getTaskType());
                    break;
                default:
                    Log.e("TaskRunner", "Unknown task type: " + aVar.p().getTaskType());
                    break;
            }
        } catch (Exception e10) {
            Log.e("TaskRunner", "Failed to decode task or notification config: " + e10);
            return false;
        }
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters params) {
        InterfaceC2166z0 interfaceC2166z0;
        Log.i("TaskRunner", "Stopping UIDT JobService");
        if (params != null && (interfaceC2166z0 = (InterfaceC2166z0) this.jobs.remove(Integer.valueOf(params.getJobId()))) != null) {
            InterfaceC2166z0.a.a(interfaceC2166z0, null, 1, null);
        }
        return true;
    }
}
