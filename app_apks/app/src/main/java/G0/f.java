package G0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m f4198d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4201g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f4195a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4196b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4197c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f4199e = a.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4202h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f4203i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4204j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f4205k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f4206l = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(m mVar) {
        this.f4198d = mVar;
    }

    @Override // G0.d
    public void a(d dVar) {
        Iterator it = this.f4206l.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f4204j) {
                return;
            }
        }
        this.f4197c = true;
        d dVar2 = this.f4195a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f4196b) {
            this.f4198d.a(this);
            return;
        }
        f fVar = null;
        int i10 = 0;
        for (f fVar2 : this.f4206l) {
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f4204j) {
            g gVar = this.f4203i;
            if (gVar != null) {
                if (!gVar.f4204j) {
                    return;
                } else {
                    this.f4200f = this.f4202h * gVar.f4201g;
                }
            }
            d(fVar.f4201g + this.f4200f);
        }
        d dVar3 = this.f4195a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f4205k.add(dVar);
        if (this.f4204j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f4206l.clear();
        this.f4205k.clear();
        this.f4204j = false;
        this.f4201g = 0;
        this.f4197c = false;
        this.f4196b = false;
    }

    public void d(int i10) {
        if (this.f4204j) {
            return;
        }
        this.f4204j = true;
        this.f4201g = i10;
        for (d dVar : this.f4205k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f4198d.f4222b.p());
        sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        sb2.append(this.f4199e);
        sb2.append("(");
        sb2.append(this.f4204j ? Integer.valueOf(this.f4201g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f4206l.size());
        sb2.append(":d=");
        sb2.append(this.f4205k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
