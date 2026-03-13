package F9;

import com.google.android.gms.maps.model.CameraPosition;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class g extends a implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f3784b;

    public g(b bVar) {
        this.f3784b = bVar;
    }

    @Override // F9.b
    public boolean b(E9.b bVar) {
        return this.f3784b.b(bVar);
    }

    @Override // F9.b
    public void c() {
        this.f3784b.c();
    }

    @Override // F9.f
    public boolean d() {
        return false;
    }

    @Override // F9.b
    public Set e(float f10) {
        return this.f3784b.e(f10);
    }

    @Override // F9.b
    public boolean f(E9.b bVar) {
        return this.f3784b.f(bVar);
    }

    @Override // F9.b
    public int g() {
        return this.f3784b.g();
    }

    @Override // F9.f
    public void a(CameraPosition cameraPosition) {
    }
}
