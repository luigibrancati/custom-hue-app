package L3;

import I3.AbstractC0890u;
import I3.C0874d;
import I3.EnumC0871a;
import I3.EnumC0891v;
import I3.InterfaceC0872b;
import Q3.I;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f8550d = AbstractC0890u.i("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentName f8551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0872b f8552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8553c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8554a;

        static {
            int[] iArr = new int[EnumC0891v.values().length];
            f8554a = iArr;
            try {
                iArr[EnumC0891v.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8554a[EnumC0891v.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8554a[EnumC0891v.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8554a[EnumC0891v.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8554a[EnumC0891v.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public d(Context context, InterfaceC0872b interfaceC0872b, boolean z10) {
        this.f8552b = interfaceC0872b;
        this.f8551a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.f8553c = z10;
    }

    public static JobInfo.TriggerContentUri b(C0874d.c cVar) {
        return new JobInfo.TriggerContentUri(cVar.a(), cVar.b() ? 1 : 0);
    }

    public static int c(EnumC0891v enumC0891v) {
        int i10 = a.f8554a[enumC0891v.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 4;
        }
        AbstractC0890u.e().a(f8550d, "API version too low. Cannot convert network type value " + enumC0891v);
        return 1;
    }

    public static void d(JobInfo.Builder builder, EnumC0891v enumC0891v) {
        if (enumC0891v == EnumC0891v.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        } else {
            builder.setRequiredNetworkType(c(enumC0891v));
        }
    }

    public JobInfo a(I i10, int i11) {
        String strL;
        C0874d c0874d = i10.f13597j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", i10.f13588a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", i10.g());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", i10.o());
        JobInfo.Builder extras = new JobInfo.Builder(i11, this.f8551a).setRequiresCharging(c0874d.i()).setRequiresDeviceIdle(c0874d.j()).setExtras(persistableBundle);
        NetworkRequest networkRequestD = c0874d.d();
        if (networkRequestD != null) {
            e.a(extras, networkRequestD);
        } else {
            d(extras, c0874d.f());
        }
        if (!c0874d.j()) {
            extras.setBackoffCriteria(i10.f13600m, i10.f13599l == EnumC0871a.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(i10.c() - this.f8552b.a(), 0L);
        if (jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!i10.f13604q && this.f8553c) {
            extras.setImportantWhileForeground(true);
        }
        if (c0874d.g()) {
            Iterator it = c0874d.c().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(b((C0874d.c) it.next()));
            }
            extras.setTriggerContentUpdateDelay(c0874d.b());
            extras.setTriggerContentMaxDelay(c0874d.a());
        }
        extras.setPersisted(false);
        int i12 = Build.VERSION.SDK_INT;
        extras.setRequiresBatteryNotLow(c0874d.h());
        extras.setRequiresStorageNotLow(c0874d.k());
        boolean z10 = i10.f13598k > 0;
        boolean z11 = jMax > 0;
        if (i10.f13604q && !z10 && !z11) {
            extras.setExpedited(true);
        }
        if (i12 >= 35 && (strL = i10.l()) != null) {
            extras.setTraceTag(strL);
        }
        return extras.build();
    }
}
