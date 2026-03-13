package com.bbflight.background_downloader;

import Q4.r;
import android.content.Context;
import androidx.work.WorkerParameters;
import io.sentry.protocol.Message;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bbflight/background_downloader/DataTaskWorker;", "Lcom/bbflight/background_downloader/TaskWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", Message.JsonKeys.PARAMS, "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lcom/bbflight/background_downloader/l;", "N", "()Lcom/bbflight/background_downloader/l;", "background_downloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DataTaskWorker extends TaskWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataTaskWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(params, "params");
    }

    @Override // com.bbflight.background_downloader.TaskWorker
    public l N() {
        return new r(this);
    }
}
