package com.google.ar.sceneform.rendering;

import com.google.android.filament.Engine;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.VertexBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public interface d {
    float a();

    rb.p b();

    void c(rb.p pVar);

    rb.p d();

    void e(VertexBuffer vertexBuffer);

    void f(FloatBuffer floatBuffer);

    void g(FloatBuffer floatBuffer);

    void h(IndexBuffer indexBuffer);

    void i(rb.p pVar);

    IndexBuffer j();

    VertexBuffer k();

    FloatBuffer l();

    FloatBuffer m();

    void n(IntBuffer intBuffer);

    FloatBuffer o();

    void p(FloatBuffer floatBuffer);

    FloatBuffer q();

    void r(Engine engine, p pVar, int i10);

    IntBuffer s();

    void t(FloatBuffer floatBuffer);

    rb.p u();

    ArrayList v();

    rb.p w();
}
