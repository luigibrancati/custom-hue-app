package i6;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import b6.AbstractC2847p;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import f6.AbstractC3996a;
import j6.InterfaceC4725d;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.zip.Adler32;
import m6.C5024a;

/* JADX INFO: renamed from: i6.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C4362d implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f37250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4725d f37251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC4364f f37252c;

    public C4362d(Context context, InterfaceC4725d interfaceC4725d, AbstractC4364f abstractC4364f) {
        this.f37250a = context;
        this.f37251b = interfaceC4725d;
        this.f37252c = abstractC4364f;
    }

    @Override // i6.x
    public void a(AbstractC2847p abstractC2847p, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f37250a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f37250a.getSystemService("jobscheduler");
        int iC = c(abstractC2847p);
        if (!z10 && d(jobScheduler, iC, i10)) {
            AbstractC3996a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", abstractC2847p);
            return;
        }
        long jX = this.f37251b.X(abstractC2847p);
        JobInfo.Builder builderC = this.f37252c.c(new JobInfo.Builder(iC, componentName), abstractC2847p.d(), jX, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", abstractC2847p.b());
        persistableBundle.putInt("priority", C5024a.a(abstractC2847p.d()));
        if (abstractC2847p.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(abstractC2847p.c(), 0));
        }
        builderC.setExtras(persistableBundle);
        AbstractC3996a.b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", abstractC2847p, Integer.valueOf(iC), Long.valueOf(this.f37252c.g(abstractC2847p.d(), jX, i10)), Long.valueOf(jX), Integer.valueOf(i10));
        jobScheduler.schedule(builderC.build());
    }

    @Override // i6.x
    public void b(AbstractC2847p abstractC2847p, int i10) {
        a(abstractC2847p, i10, false);
    }

    public int c(AbstractC2847p abstractC2847p) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f37250a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(abstractC2847p.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C5024a.a(abstractC2847p.d())).array());
        if (abstractC2847p.c() != null) {
            adler32.update(abstractC2847p.c());
        }
        return (int) adler32.getValue();
    }

    public final boolean d(JobScheduler jobScheduler, int i10, int i11) {
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            JobInfo next = it.next();
            int i12 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i10) {
                if (i12 >= i11) {
                    return true;
                }
            }
        }
        return false;
    }
}
