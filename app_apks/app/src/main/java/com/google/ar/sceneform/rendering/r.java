package com.google.ar.sceneform.rendering;

import android.content.Context;
import com.google.android.filament.Engine;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.VertexBuffer;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class r implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f31359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Buffer f31360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f31361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Function f31362d;

    @Override // com.google.ar.sceneform.rendering.d
    public float a() {
        return 1.0f;
    }

    @Override // com.google.ar.sceneform.rendering.d
    public rb.p b() {
        return rb.p.x();
    }

    @Override // com.google.ar.sceneform.rendering.d
    public rb.p d() {
        return rb.p.x();
    }

    @Override // com.google.ar.sceneform.rendering.d
    public IndexBuffer j() {
        return null;
    }

    @Override // com.google.ar.sceneform.rendering.d
    public VertexBuffer k() {
        return null;
    }

    @Override // com.google.ar.sceneform.rendering.d
    public FloatBuffer l() {
        return null;
    }

    @Override // com.google.ar.sceneform.rendering.d
    public FloatBuffer m() {
        return null;
    }

    @Override // com.google.ar.sceneform.rendering.d
    public FloatBuffer o() {
        return null;
    }

    @Override // com.google.ar.sceneform.rendering.d
    public FloatBuffer q() {
        return null;
    }

    @Override // com.google.ar.sceneform.rendering.d
    public IntBuffer s() {
        return null;
    }

    @Override // com.google.ar.sceneform.rendering.d
    public rb.p u() {
        return rb.p.x();
    }

    @Override // com.google.ar.sceneform.rendering.d
    public ArrayList v() {
        return new ArrayList(1);
    }

    @Override // com.google.ar.sceneform.rendering.d
    public rb.p w() {
        throw new IllegalStateException("Not Implemented");
    }

    @Override // com.google.ar.sceneform.rendering.d
    public void c(rb.p pVar) {
    }

    @Override // com.google.ar.sceneform.rendering.d
    public void e(VertexBuffer vertexBuffer) {
    }

    @Override // com.google.ar.sceneform.rendering.d
    public void f(FloatBuffer floatBuffer) {
    }

    @Override // com.google.ar.sceneform.rendering.d
    public void g(FloatBuffer floatBuffer) {
    }

    @Override // com.google.ar.sceneform.rendering.d
    public void h(IndexBuffer indexBuffer) {
    }

    @Override // com.google.ar.sceneform.rendering.d
    public void i(rb.p pVar) {
    }

    @Override // com.google.ar.sceneform.rendering.d
    public void n(IntBuffer intBuffer) {
    }

    @Override // com.google.ar.sceneform.rendering.d
    public void p(FloatBuffer floatBuffer) {
    }

    @Override // com.google.ar.sceneform.rendering.d
    public void t(FloatBuffer floatBuffer) {
    }

    @Override // com.google.ar.sceneform.rendering.d
    public void r(Engine engine, p pVar, int i10) {
    }
}
