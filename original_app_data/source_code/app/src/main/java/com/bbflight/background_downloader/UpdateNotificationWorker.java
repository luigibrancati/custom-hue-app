package com.bbflight.background_downloader;

import android.content.Context;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import nc.AbstractC5160d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/bbflight/background_downloader/UpdateNotificationWorker;", "Lcom/bbflight/background_downloader/TaskWorker;", "Landroid/content/Context;", "applicationContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "K", "(Llc/e;)Ljava/lang/Object;", "q", "a", "background_downloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UpdateNotificationWorker extends TaskWorker {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f26704j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f26705k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f26706l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f26708n;

        public b(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f26706l = obj;
            this.f26708n |= Integer.MIN_VALUE;
            return UpdateNotificationWorker.this.K(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateNotificationWorker(Context applicationContext, WorkerParameters workerParams) {
        super(applicationContext, workerParams);
        AbstractC4862t.e(applicationContext, "applicationContext");
        AbstractC4862t.e(workerParams, "workerParams");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.bbflight.background_downloader.TaskWorker, androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object K(lc.InterfaceC4988e r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbflight.background_downloader.UpdateNotificationWorker.K(lc.e):java.lang.Object");
    }
}
