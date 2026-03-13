package W;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f17603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f17606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f17607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f17609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f17610h;

    public b(UUID uuid, int i10, int i11, Rect rect, Size size, int i12, boolean z10, boolean z11) {
        if (uuid == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.f17603a = uuid;
        this.f17604b = i10;
        this.f17605c = i11;
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f17606d = rect;
        if (size == null) {
            throw new NullPointerException("Null getSize");
        }
        this.f17607e = size;
        this.f17608f = i12;
        this.f17609g = z10;
        this.f17610h = z11;
    }

    @Override // W.f
    public Rect a() {
        return this.f17606d;
    }

    @Override // W.f
    public int b() {
        return this.f17605c;
    }

    @Override // W.f
    public int c() {
        return this.f17608f;
    }

    @Override // W.f
    public Size d() {
        return this.f17607e;
    }

    @Override // W.f
    public int e() {
        return this.f17604b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f17603a.equals(fVar.f()) && this.f17604b == fVar.e() && this.f17605c == fVar.b() && this.f17606d.equals(fVar.a()) && this.f17607e.equals(fVar.d()) && this.f17608f == fVar.c() && this.f17609g == fVar.g() && this.f17610h == fVar.j()) {
                return true;
            }
        }
        return false;
    }

    @Override // W.f
    public UUID f() {
        return this.f17603a;
    }

    @Override // W.f
    public boolean g() {
        return this.f17609g;
    }

    public int hashCode() {
        return ((((((((((((((this.f17603a.hashCode() ^ 1000003) * 1000003) ^ this.f17604b) * 1000003) ^ this.f17605c) * 1000003) ^ this.f17606d.hashCode()) * 1000003) ^ this.f17607e.hashCode()) * 1000003) ^ this.f17608f) * 1000003) ^ (this.f17609g ? 1231 : 1237)) * 1000003) ^ (this.f17610h ? 1231 : 1237);
    }

    @Override // W.f
    public boolean j() {
        return this.f17610h;
    }

    public String toString() {
        return "OutConfig{getUuid=" + this.f17603a + ", getTargets=" + this.f17604b + ", getFormat=" + this.f17605c + ", getCropRect=" + this.f17606d + ", getSize=" + this.f17607e + ", getRotationDegrees=" + this.f17608f + ", isMirroring=" + this.f17609g + ", shouldRespectInputCropRect=" + this.f17610h + "}";
    }
}
