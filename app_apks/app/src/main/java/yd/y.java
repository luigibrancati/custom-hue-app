package yd;

import Lc.a0;
import gc.C4207u;
import gc.P;
import hd.AbstractC4297a;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class y implements InterfaceC6475h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hd.c f48647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC4297a f48648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vc.l f48649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f48650d;

    public y(fd.m proto, hd.c nameResolver, AbstractC4297a metadataVersion, vc.l classSource) {
        AbstractC4862t.e(proto, "proto");
        AbstractC4862t.e(nameResolver, "nameResolver");
        AbstractC4862t.e(metadataVersion, "metadataVersion");
        AbstractC4862t.e(classSource, "classSource");
        this.f48647a = nameResolver;
        this.f48648b = metadataVersion;
        this.f48649c = classSource;
        List listD = proto.D();
        AbstractC4862t.d(listD, "proto.class_List");
        LinkedHashMap linkedHashMap = new LinkedHashMap(Bc.k.e(P.e(C4207u.v(listD, 10)), 16));
        for (Object obj : listD) {
            linkedHashMap.put(x.a(this.f48647a, ((fd.c) obj).A0()), obj);
        }
        this.f48650d = linkedHashMap;
    }

    @Override // yd.InterfaceC6475h
    public C6474g a(kd.b classId) {
        AbstractC4862t.e(classId, "classId");
        fd.c cVar = (fd.c) this.f48650d.get(classId);
        if (cVar == null) {
            return null;
        }
        return new C6474g(this.f48647a, cVar, this.f48648b, (a0) this.f48649c.invoke(classId));
    }

    public final Collection b() {
        return this.f48650d.keySet();
    }
}
