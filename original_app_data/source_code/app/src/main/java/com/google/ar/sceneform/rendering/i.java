package com.google.ar.sceneform.rendering;

import com.google.android.filament.Engine;
import com.google.ar.sceneform.rendering.m;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class i extends m {
    public static a q() {
        G7.a.b();
        return new a();
    }

    @Override // com.google.ar.sceneform.rendering.m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public i l() {
        return new i(this);
    }

    public i(a aVar) {
        super(aVar);
    }

    public i(i iVar) {
        super(iVar);
        r(iVar);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends m.a {
        @Override // com.google.ar.sceneform.rendering.m.a
        public Class j() {
            return i.class;
        }

        @Override // com.google.ar.sceneform.rendering.m.a
        public F7.c k() {
            return s.c().d();
        }

        @Override // com.google.ar.sceneform.rendering.m.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public i r(Engine engine) {
            return new i(this);
        }

        @Override // com.google.ar.sceneform.rendering.m.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public a l() {
            return this;
        }
    }

    public final void r(i iVar) {
    }
}
