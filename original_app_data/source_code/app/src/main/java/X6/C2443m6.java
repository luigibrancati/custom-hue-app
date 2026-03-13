package X6;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.HandlerC3269o0;

/* JADX INFO: renamed from: X6.m6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2443m6 extends AbstractC2399h2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f19103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2435l6 f19105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2427k6 f19106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2403h6 f19107g;

    public C2443m6(C2416j3 c2416j3) {
        super(c2416j3);
        this.f19104d = true;
        this.f19105e = new C2435l6(this);
        this.f19106f = new C2427k6(this);
        this.f19107g = new C2403h6(this);
    }

    @Override // X6.AbstractC2399h2
    public final boolean m() {
        return false;
    }

    public final void o(boolean z10) {
        h();
        this.f19104d = z10;
    }

    public final boolean p() {
        h();
        return this.f19104d;
    }

    public final /* synthetic */ void r(long j10) {
        h();
        q();
        C2416j3 c2416j3 = this.f18400a;
        c2416j3.a().w().b("Activity resumed, time", Long.valueOf(j10));
        if (c2416j3.w().H(null, AbstractC2383f2.f18860V0)) {
            if (c2416j3.w().N() || this.f19104d) {
                this.f19106f.a(j10);
            }
        } else if (c2416j3.w().N() || c2416j3.x().f18439t.a()) {
            this.f19106f.a(j10);
        }
        this.f19107g.a();
        C2435l6 c2435l6 = this.f19105e;
        C2443m6 c2443m6 = c2435l6.f19091a;
        c2443m6.h();
        if (c2443m6.f18400a.g()) {
            c2435l6.b(c2443m6.f18400a.e().a(), false);
        }
    }

    public final /* synthetic */ void s(long j10) {
        h();
        q();
        C2416j3 c2416j3 = this.f18400a;
        c2416j3.a().w().b("Activity paused, time", Long.valueOf(j10));
        this.f19107g.b(j10);
        if (c2416j3.w().N()) {
            this.f19106f.b(j10);
        }
    }

    public final /* synthetic */ Handler t() {
        return this.f19103c;
    }

    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void q() {
        h();
        if (this.f19103c == null) {
            this.f19103c = new HandlerC3269o0(Looper.getMainLooper());
        }
    }
}
