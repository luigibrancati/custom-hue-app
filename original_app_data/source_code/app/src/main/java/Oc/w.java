package Oc;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class w implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f12363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f12364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f12365d;

    public w(List allDependencies, Set modulesWhoseInternalsAreVisible, List directExpectedByDependencies, Set allExpectedByDependencies) {
        AbstractC4862t.e(allDependencies, "allDependencies");
        AbstractC4862t.e(modulesWhoseInternalsAreVisible, "modulesWhoseInternalsAreVisible");
        AbstractC4862t.e(directExpectedByDependencies, "directExpectedByDependencies");
        AbstractC4862t.e(allExpectedByDependencies, "allExpectedByDependencies");
        this.f12362a = allDependencies;
        this.f12363b = modulesWhoseInternalsAreVisible;
        this.f12364c = directExpectedByDependencies;
        this.f12365d = allExpectedByDependencies;
    }

    @Override // Oc.v
    public List a() {
        return this.f12362a;
    }

    @Override // Oc.v
    public List b() {
        return this.f12364c;
    }

    @Override // Oc.v
    public Set c() {
        return this.f12363b;
    }
}
