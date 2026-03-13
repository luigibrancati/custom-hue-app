package G1;

import G1.p;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class F implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f4248b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f4249a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Message f4250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public F f4251b;

        public b() {
        }

        @Override // G1.p.a
        public void a() {
            ((Message) AbstractC0853a.e(this.f4250a)).sendToTarget();
            b();
        }

        public final void b() {
            this.f4250a = null;
            this.f4251b = null;
            F.o(this);
        }

        public boolean c(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) AbstractC0853a.e(this.f4250a));
            b();
            return zSendMessageAtFrontOfQueue;
        }

        public b d(Message message, F f10) {
            this.f4250a = message;
            this.f4251b = f10;
            return this;
        }
    }

    public F(Handler handler) {
        this.f4249a = handler;
    }

    public static b n() {
        b bVar;
        List list = f4248b;
        synchronized (list) {
            try {
                bVar = list.isEmpty() ? new b() : (b) list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public static void o(b bVar) {
        List list = f4248b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // G1.p
    public p.a a(int i10) {
        return n().d(this.f4249a.obtainMessage(i10), this);
    }

    @Override // G1.p
    public boolean b(int i10) {
        AbstractC0853a.a(i10 != 0);
        return this.f4249a.hasMessages(i10);
    }

    @Override // G1.p
    public boolean c(p.a aVar) {
        return ((b) aVar).c(this.f4249a);
    }

    @Override // G1.p
    public p.a d(int i10, int i11, int i12, Object obj) {
        return n().d(this.f4249a.obtainMessage(i10, i11, i12, obj), this);
    }

    @Override // G1.p
    public p.a e(int i10, Object obj) {
        return n().d(this.f4249a.obtainMessage(i10, obj), this);
    }

    @Override // G1.p
    public void f(Object obj) {
        this.f4249a.removeCallbacksAndMessages(obj);
    }

    @Override // G1.p
    public Looper g() {
        return this.f4249a.getLooper();
    }

    @Override // G1.p
    public p.a h(int i10, int i11, int i12) {
        return n().d(this.f4249a.obtainMessage(i10, i11, i12), this);
    }

    @Override // G1.p
    public boolean i(Runnable runnable) {
        return this.f4249a.post(runnable);
    }

    @Override // G1.p
    public boolean j(int i10) {
        return this.f4249a.sendEmptyMessage(i10);
    }

    @Override // G1.p
    public boolean k(int i10, long j10) {
        return this.f4249a.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // G1.p
    public void l(int i10) {
        AbstractC0853a.a(i10 != 0);
        this.f4249a.removeMessages(i10);
    }
}
