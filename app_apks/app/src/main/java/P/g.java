package P;

import E.AbstractC0807p0;
import L.AbstractC1109l0;
import L.C1095e0;
import L.a1;
import android.media.MediaCodec;
import android.util.Range;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12517a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public final boolean a(C1095e0.a aVar) {
        Set<AbstractC1109l0> setL = aVar.l();
        AbstractC4862t.d(setL, "getSurfaces(...)");
        if (setL != null && setL.isEmpty()) {
            return false;
        }
        for (AbstractC1109l0 abstractC1109l0 : setL) {
            AbstractC4862t.b(abstractC1109l0);
            if (d(abstractC1109l0)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(Collection collection) {
        if (collection != null && collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC1109l0 abstractC1109l0F = ((a1.f) it.next()).f();
            AbstractC4862t.d(abstractC1109l0F, "getSurface(...)");
            if (d(abstractC1109l0F)) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(Range range) {
        return ((Number) range.getUpper()).intValue() >= 120 && AbstractC4862t.a(range.getLower(), range.getUpper());
    }

    public final boolean d(AbstractC1109l0 abstractC1109l0) {
        return AbstractC4862t.a(abstractC1109l0.g(), MediaCodec.class);
    }

    public final void e(Collection outputConfigs, C1095e0.a repeatingConfigBuilder) {
        Range rangeK;
        AbstractC4862t.e(outputConfigs, "outputConfigs");
        AbstractC4862t.e(repeatingConfigBuilder, "repeatingConfigBuilder");
        if (outputConfigs.size() != 2 || !b(outputConfigs) || a(repeatingConfigBuilder) || (rangeK = repeatingConfigBuilder.k()) == null) {
            return;
        }
        if (!c(rangeK)) {
            rangeK = null;
        }
        if (rangeK != null) {
            repeatingConfigBuilder.o(f(rangeK));
        }
    }

    public final Range f(Range range) {
        Range range2 = new Range(30, range.getUpper());
        AbstractC0807p0.a("HighSpeedFpsModifier", "Modified high-speed FPS range from " + range + " to " + range2);
        return range2;
    }
}
