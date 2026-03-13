package ub;

import cb.C3090a;
import cb.C3091b;
import cb.C3092c;
import com.google.android.filament.Box;
import com.google.android.filament.Engine;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.VertexBuffer;
import gc.C4206t;
import gc.C4207u;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.r;

/* JADX INFO: renamed from: ub.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6014a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RenderableManager.PrimitiveType f45520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VertexBuffer f45521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IndexBuffer f45522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f45523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Box f45524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f45525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f45526g;

    /* JADX INFO: renamed from: ub.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class C0621a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RenderableManager.PrimitiveType f45527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final VertexBuffer.Builder f45528b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IndexBuffer.Builder f45529c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List f45530d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public List f45531e;

        public C0621a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final AbstractC6014a a(Engine engine, r constructor) {
            AbstractC4862t.e(engine, "engine");
            AbstractC4862t.e(constructor, "constructor");
            VertexBuffer vertexBufferBuild = this.f45528b.build(engine);
            AbstractC4862t.d(vertexBufferBuild, "build(...)");
            Object objG = AbstractC6015b.g(vertexBufferBuild, engine, this.f45530d);
            IndexBuffer indexBufferBuild = this.f45529c.build(engine);
            AbstractC4862t.b(indexBufferBuild);
            AbstractC6015b.f(indexBufferBuild, engine, C4207u.x(this.f45531e));
            AbstractC4862t.d(indexBufferBuild, "apply(...)");
            return (AbstractC6014a) constructor.invoke(vertexBufferBuild, indexBufferBuild, AbstractC6015b.e(this.f45531e), objG);
        }

        public final List b() {
            return this.f45531e;
        }

        public final RenderableManager.PrimitiveType c() {
            return this.f45527a;
        }

        public final List d() {
            return this.f45530d;
        }

        public final C0621a e(List indices) {
            AbstractC4862t.e(indices, "indices");
            IndexBuffer.Builder builder = this.f45529c;
            Iterator it = indices.iterator();
            int size = 0;
            while (it.hasNext()) {
                size += ((List) it.next()).size();
            }
            builder.indexCount(size).bufferType(IndexBuffer.Builder.IndexType.UINT);
            this.f45531e = indices;
            return this;
        }

        public final C0621a f(List vertices) {
            AbstractC4862t.e(vertices, "vertices");
            this.f45528b.bufferCount((AbstractC6015b.c(vertices) ? 1 : 0) + 1 + (AbstractC6015b.d(vertices) ? 1 : 0) + (AbstractC6015b.b(vertices) ? 1 : 0));
            this.f45528b.vertexCount(vertices.size());
            int i10 = 0;
            this.f45528b.attribute(VertexBuffer.VertexAttribute.POSITION, 0, VertexBuffer.AttributeType.FLOAT3, 0, 12);
            if (AbstractC6015b.c(vertices)) {
                VertexBuffer.Builder builder = this.f45528b;
                VertexBuffer.VertexAttribute vertexAttribute = VertexBuffer.VertexAttribute.TANGENTS;
                builder.attribute(vertexAttribute, 1, VertexBuffer.AttributeType.FLOAT4, 0, 16);
                this.f45528b.normalized(vertexAttribute);
                i10 = 1;
            }
            if (AbstractC6015b.d(vertices)) {
                int i11 = i10 + 1;
                this.f45528b.attribute(VertexBuffer.VertexAttribute.UV0, i11, VertexBuffer.AttributeType.FLOAT2, 0, 8);
                i10 = i11;
            }
            if (AbstractC6015b.b(vertices)) {
                VertexBuffer.Builder builder2 = this.f45528b;
                VertexBuffer.VertexAttribute vertexAttribute2 = VertexBuffer.VertexAttribute.COLOR;
                builder2.attribute(vertexAttribute2, i10 + 1, VertexBuffer.AttributeType.FLOAT4, 0, 16);
                this.f45528b.normalized(vertexAttribute2);
            }
            this.f45530d = vertices;
            return this;
        }

        public C0621a(RenderableManager.PrimitiveType primitiveType) {
            AbstractC4862t.e(primitiveType, "primitiveType");
            this.f45527a = primitiveType;
            this.f45528b = new VertexBuffer.Builder();
            this.f45529c = new IndexBuffer.Builder();
            this.f45530d = C4206t.k();
            this.f45531e = C4206t.k();
        }

        public /* synthetic */ C0621a(RenderableManager.PrimitiveType primitiveType, int i10, AbstractC4854k abstractC4854k) {
            this((i10 & 1) != 0 ? RenderableManager.PrimitiveType.TRIANGLES : primitiveType);
        }
    }

    /* JADX INFO: renamed from: ub.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C3091b f45532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C3091b f45533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C3090a f45534c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C3092c f45535d;

        public b() {
            this(null, null, null, null, 15, null);
        }

        public final C3092c a() {
            return this.f45535d;
        }

        public final C3091b b() {
            return this.f45533b;
        }

        public final C3091b c() {
            return this.f45532a;
        }

        public final C3090a d() {
            return this.f45534c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC4862t.a(this.f45532a, bVar.f45532a) && AbstractC4862t.a(this.f45533b, bVar.f45533b) && AbstractC4862t.a(this.f45534c, bVar.f45534c) && AbstractC4862t.a(this.f45535d, bVar.f45535d);
        }

        public int hashCode() {
            int iHashCode = this.f45532a.hashCode() * 31;
            C3091b c3091b = this.f45533b;
            int iHashCode2 = (iHashCode + (c3091b == null ? 0 : c3091b.hashCode())) * 31;
            C3090a c3090a = this.f45534c;
            int iHashCode3 = (iHashCode2 + (c3090a == null ? 0 : c3090a.hashCode())) * 31;
            C3092c c3092c = this.f45535d;
            return iHashCode3 + (c3092c != null ? c3092c.hashCode() : 0);
        }

        public String toString() {
            return "Vertex(position=" + this.f45532a + ", normal=" + this.f45533b + ", uvCoordinate=" + this.f45534c + ", color=" + this.f45535d + ")";
        }

        public b(C3091b position, C3091b c3091b, C3090a c3090a, C3092c c3092c) {
            AbstractC4862t.e(position, "position");
            this.f45532a = position;
            this.f45533b = c3091b;
            this.f45534c = c3090a;
            this.f45535d = c3092c;
        }

        public /* synthetic */ b(C3091b c3091b, C3091b c3091b2, C3090a c3090a, C3092c c3092c, int i10, AbstractC4854k abstractC4854k) {
            this((i10 & 1) != 0 ? new C3091b(0.0f, 0.0f, 0.0f, 7, null) : c3091b, (i10 & 2) != 0 ? null : c3091b2, (i10 & 4) != 0 ? null : c3090a, (i10 & 8) != 0 ? null : c3092c);
        }
    }

    public AbstractC6014a(RenderableManager.PrimitiveType primitiveType, List vertices, VertexBuffer vertexBuffer, List primitivesIndices, IndexBuffer indexBuffer, List primitivesOffsets, Box boundingBox) {
        AbstractC4862t.e(primitiveType, "primitiveType");
        AbstractC4862t.e(vertices, "vertices");
        AbstractC4862t.e(vertexBuffer, "vertexBuffer");
        AbstractC4862t.e(primitivesIndices, "primitivesIndices");
        AbstractC4862t.e(indexBuffer, "indexBuffer");
        AbstractC4862t.e(primitivesOffsets, "primitivesOffsets");
        AbstractC4862t.e(boundingBox, "boundingBox");
        this.f45520a = primitiveType;
        this.f45521b = vertexBuffer;
        this.f45522c = indexBuffer;
        this.f45523d = primitivesOffsets;
        this.f45524e = boundingBox;
        this.f45525f = vertices;
        this.f45526g = primitivesIndices;
    }

    public final Box a() {
        return this.f45524e;
    }

    public final IndexBuffer b() {
        return this.f45522c;
    }

    public final RenderableManager.PrimitiveType c() {
        return this.f45520a;
    }

    public final List d() {
        return this.f45523d;
    }

    public final VertexBuffer e() {
        return this.f45521b;
    }
}
