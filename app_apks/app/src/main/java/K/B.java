package K;

import E.AbstractC0799l0;
import androidx.camera.core.ImageProcessingUtil;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class B implements U.y {
    @Override // U.y
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public U.z apply(U.z zVar) {
        androidx.camera.core.f fVar = new androidx.camera.core.f(AbstractC0799l0.a(zVar.h().getWidth(), zVar.h().getHeight(), 256, 2));
        androidx.camera.core.d dVarE = ImageProcessingUtil.e(fVar, (byte[]) zVar.c());
        fVar.i();
        Objects.requireNonNull(dVarE);
        M.f fVarD = zVar.d();
        Objects.requireNonNull(fVarD);
        return U.z.j(dVarE, fVarD, zVar.b(), zVar.f(), zVar.g(), zVar.a());
    }
}
