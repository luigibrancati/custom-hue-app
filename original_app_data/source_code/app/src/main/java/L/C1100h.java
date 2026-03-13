package L;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: L.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1100h extends AbstractC1087a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f8069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f8070b;

    public C1100h(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.f8069a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.f8070b = handler;
    }

    @Override // L.AbstractC1087a0
    public Executor b() {
        return this.f8069a;
    }

    @Override // L.AbstractC1087a0
    public Handler c() {
        return this.f8070b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1087a0) {
            AbstractC1087a0 abstractC1087a0 = (AbstractC1087a0) obj;
            if (this.f8069a.equals(abstractC1087a0.b()) && this.f8070b.equals(abstractC1087a0.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f8070b.hashCode() ^ ((this.f8069a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f8069a + ", schedulerHandler=" + this.f8070b + "}";
    }
}
