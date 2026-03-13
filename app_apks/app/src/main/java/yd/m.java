package yd;

import Lc.InterfaceC1185m;
import com.fasterxml.jackson.core.JsonFactory;
import hd.AbstractC4297a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6478k f48590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hd.c f48591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1185m f48592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hd.g f48593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hd.h f48594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC4297a f48595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ad.f f48596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C6466D f48597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f48598i;

    public m(C6478k components, hd.c nameResolver, InterfaceC1185m containingDeclaration, hd.g typeTable, hd.h versionRequirementTable, AbstractC4297a metadataVersion, Ad.f fVar, C6466D c6466d, List typeParameters) {
        String strA;
        AbstractC4862t.e(components, "components");
        AbstractC4862t.e(nameResolver, "nameResolver");
        AbstractC4862t.e(containingDeclaration, "containingDeclaration");
        AbstractC4862t.e(typeTable, "typeTable");
        AbstractC4862t.e(versionRequirementTable, "versionRequirementTable");
        AbstractC4862t.e(metadataVersion, "metadataVersion");
        AbstractC4862t.e(typeParameters, "typeParameters");
        this.f48590a = components;
        this.f48591b = nameResolver;
        this.f48592c = containingDeclaration;
        this.f48593d = typeTable;
        this.f48594e = versionRequirementTable;
        this.f48595f = metadataVersion;
        this.f48596g = fVar;
        this.f48597h = new C6466D(this, c6466d, typeParameters, "Deserializer for \"" + containingDeclaration.getName() + JsonFactory.DEFAULT_QUOTE_CHAR, (fVar == null || (strA = fVar.a()) == null) ? "[container not found]" : strA);
        this.f48598i = new w(this);
    }

    public static /* synthetic */ m b(m mVar, InterfaceC1185m interfaceC1185m, List list, hd.c cVar, hd.g gVar, hd.h hVar, AbstractC4297a abstractC4297a, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            cVar = mVar.f48591b;
        }
        hd.c cVar2 = cVar;
        if ((i10 & 8) != 0) {
            gVar = mVar.f48593d;
        }
        hd.g gVar2 = gVar;
        if ((i10 & 16) != 0) {
            hVar = mVar.f48594e;
        }
        hd.h hVar2 = hVar;
        if ((i10 & 32) != 0) {
            abstractC4297a = mVar.f48595f;
        }
        return mVar.a(interfaceC1185m, list, cVar2, gVar2, hVar2, abstractC4297a);
    }

    public final m a(InterfaceC1185m descriptor, List typeParameterProtos, hd.c nameResolver, hd.g typeTable, hd.h versionRequirementTable, AbstractC4297a metadataVersion) {
        AbstractC4862t.e(descriptor, "descriptor");
        AbstractC4862t.e(typeParameterProtos, "typeParameterProtos");
        AbstractC4862t.e(nameResolver, "nameResolver");
        AbstractC4862t.e(typeTable, "typeTable");
        AbstractC4862t.e(versionRequirementTable, "versionRequirementTable");
        AbstractC4862t.e(metadataVersion, "metadataVersion");
        return new m(this.f48590a, nameResolver, descriptor, typeTable, hd.i.b(metadataVersion) ? versionRequirementTable : this.f48594e, metadataVersion, this.f48596g, this.f48597h, typeParameterProtos);
    }

    public final C6478k c() {
        return this.f48590a;
    }

    public final Ad.f d() {
        return this.f48596g;
    }

    public final InterfaceC1185m e() {
        return this.f48592c;
    }

    public final w f() {
        return this.f48598i;
    }

    public final hd.c g() {
        return this.f48591b;
    }

    public final Bd.n h() {
        return this.f48590a.u();
    }

    public final C6466D i() {
        return this.f48597h;
    }

    public final hd.g j() {
        return this.f48593d;
    }

    public final hd.h k() {
        return this.f48594e;
    }
}
