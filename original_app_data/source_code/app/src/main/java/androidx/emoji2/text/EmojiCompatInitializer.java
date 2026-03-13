package androidx.emoji2.text;

import U0.m;
import android.content.Context;
import androidx.emoji2.text.c;
import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC2758n;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import n1.AbstractC5071b;
import p3.C5386a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements p3.b {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC2754j f22919a;

        public a(AbstractC2754j abstractC2754j) {
            this.f22919a = abstractC2754j;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(InterfaceC2758n interfaceC2758n) {
            EmojiCompatInitializer.this.e();
            this.f22919a.c(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends c.AbstractC0290c {
        public b(Context context) {
            super(new c(context));
            b(1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c implements c.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f22921a;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a extends c.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c.i f22922a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThreadPoolExecutor f22923b;

            public a(c.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f22922a = iVar;
                this.f22923b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.c.i
            public void a(Throwable th) {
                try {
                    this.f22922a.a(th);
                } finally {
                    this.f22923b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.c.i
            public void b(f fVar) {
                try {
                    this.f22922a.b(fVar);
                } finally {
                    this.f22923b.shutdown();
                }
            }
        }

        public c(Context context) {
            this.f22921a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.c.h
        public void a(final c.i iVar) {
            final ThreadPoolExecutor threadPoolExecutorB = AbstractC5071b.b("EmojiCompatInitializer");
            threadPoolExecutorB.execute(new Runnable() { // from class: n1.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40494a.c(iVar, threadPoolExecutorB);
                }
            });
        }

        public void c(c.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                e eVarA = androidx.emoji2.text.a.a(this.f22921a);
                if (eVarA == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                eVarA.c(threadPoolExecutor);
                eVarA.a().a(new a(iVar, threadPoolExecutor));
            } catch (Throwable th) {
                iVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                m.a("EmojiCompat.EmojiCompatInitializer.run");
                if (androidx.emoji2.text.c.i()) {
                    androidx.emoji2.text.c.c().l();
                }
            } finally {
                m.b();
            }
        }
    }

    @Override // p3.b
    public List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // p3.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean b(Context context) {
        androidx.emoji2.text.c.h(new b(context));
        d(context);
        return Boolean.TRUE;
    }

    public void d(Context context) {
        AbstractC2754j lifecycle = ((InterfaceC2758n) C5386a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new a(lifecycle));
    }

    public void e() {
        AbstractC5071b.c().postDelayed(new d(), 500L);
    }
}
