package g4;

import Rd.InterfaceC2166z0;
import android.graphics.Bitmap;
import android.view.View;
import b0.J;
import i4.j;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class w implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v f35519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile UUID f35520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile InterfaceC2166z0 f35521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile j.a f35522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile InterfaceC2166z0 f35523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f35524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f35525g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final J f35526h = new J();

    public final UUID a() {
        UUID uuid = this.f35520b;
        if (uuid != null && this.f35524f && n4.e.j()) {
            return uuid;
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC4862t.d(uuidRandomUUID, "randomUUID()");
        return uuidRandomUUID;
    }

    public final Bitmap b(Object tag, Bitmap bitmap) {
        AbstractC4862t.e(tag, "tag");
        return bitmap != null ? (Bitmap) this.f35526h.put(tag, bitmap) : (Bitmap) this.f35526h.remove(tag);
    }

    public final void c(v vVar) {
        if (this.f35524f) {
            this.f35524f = false;
        } else {
            InterfaceC2166z0 interfaceC2166z0 = this.f35523e;
            if (interfaceC2166z0 != null) {
                InterfaceC2166z0.a.a(interfaceC2166z0, null, 1, null);
            }
            this.f35523e = null;
        }
        v vVar2 = this.f35519a;
        if (vVar2 != null) {
            vVar2.b();
        }
        this.f35519a = vVar;
        this.f35525g = true;
    }

    public final UUID d(InterfaceC2166z0 job) {
        AbstractC4862t.e(job, "job");
        UUID uuidA = a();
        this.f35520b = uuidA;
        this.f35521c = job;
        return uuidA;
    }

    public final void e(j.a aVar) {
        this.f35522d = aVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v10) {
        AbstractC4862t.e(v10, "v");
        if (this.f35525g) {
            this.f35525g = false;
            return;
        }
        v vVar = this.f35519a;
        if (vVar == null) {
            return;
        }
        this.f35524f = true;
        vVar.c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v10) {
        AbstractC4862t.e(v10, "v");
        this.f35525g = false;
        v vVar = this.f35519a;
        if (vVar == null) {
            return;
        }
        vVar.b();
    }
}
