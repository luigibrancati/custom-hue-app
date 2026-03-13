package Cd;

import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Cd.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0739w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f1401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f1402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f1403c;

    public AbstractC0739w(p0 howThisTypeIsUsed, Set set, M m10) {
        AbstractC4862t.e(howThisTypeIsUsed, "howThisTypeIsUsed");
        this.f1401a = howThisTypeIsUsed;
        this.f1402b = set;
        this.f1403c = m10;
    }

    public abstract M a();

    public abstract p0 b();

    public abstract Set c();

    public abstract AbstractC0739w d(Lc.f0 f0Var);

    public abstract int hashCode();
}
