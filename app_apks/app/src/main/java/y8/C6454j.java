package y8;

import android.util.Base64;
import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x8.C6322a;
import x8.F;

/* JADX INFO: renamed from: y8.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C6454j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H8.a f48496a = new J8.d().j(C6322a.f47539a).k(true).i();

    /* JADX INFO: renamed from: y8.j$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        Object a(JsonReader jsonReader);
    }

    public static F.e.d.f A(JsonReader jsonReader) throws IOException {
        F.e.d.f.a aVarA = F.e.d.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("assignments")) {
                aVarA.b(n(jsonReader, new a() { // from class: y8.f
                    @Override // y8.C6454j.a
                    public final Object a(JsonReader jsonReader2) {
                        return C6454j.z(jsonReader2);
                    }
                }));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static F.e.d.a.b.AbstractC0654d B(JsonReader jsonReader) throws IOException {
        F.e.d.a.b.AbstractC0654d.AbstractC0655a abstractC0655aA = F.e.d.a.b.AbstractC0654d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "address":
                    abstractC0655aA.b(jsonReader.nextLong());
                    break;
                case "code":
                    abstractC0655aA.c(jsonReader.nextString());
                    break;
                case "name":
                    abstractC0655aA.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0655aA.a();
    }

    public static F.e.d.a.b.AbstractC0656e C(JsonReader jsonReader) throws IOException {
        F.e.d.a.b.AbstractC0656e.AbstractC0657a abstractC0657aA = F.e.d.a.b.AbstractC0656e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    abstractC0657aA.b(n(jsonReader, new C6453i()));
                    break;
                case "name":
                    abstractC0657aA.d(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC0657aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0657aA.a();
    }

    public static F.d.b D(JsonReader jsonReader) throws IOException {
        F.d.b.a aVarA = F.d.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("filename")) {
                aVarA.c(jsonReader.nextString());
            } else if (strNextName.equals("contents")) {
                aVarA.b(Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static F.d E(JsonReader jsonReader) throws IOException {
        F.d.a aVarA = F.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("files")) {
                aVarA.b(n(jsonReader, new a() { // from class: y8.e
                    @Override // y8.C6454j.a
                    public final Object a(JsonReader jsonReader2) {
                        return C6454j.D(jsonReader2);
                    }
                }));
            } else if (strNextName.equals("orgId")) {
                aVarA.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static F.e.AbstractC0663e F(JsonReader jsonReader) throws IOException {
        F.e.AbstractC0663e.a aVarA = F.e.AbstractC0663e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildVersion":
                    aVarA.b(jsonReader.nextString());
                    break;
                case "jailbroken":
                    aVarA.c(jsonReader.nextBoolean());
                    break;
                case "version":
                    aVarA.e(jsonReader.nextString());
                    break;
                case "platform":
                    aVarA.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static F.e.d.a.c G(JsonReader jsonReader) throws IOException {
        F.e.d.a.c.AbstractC0660a abstractC0660aA = F.e.d.a.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    abstractC0660aA.d(jsonReader.nextInt());
                    break;
                case "processName":
                    abstractC0660aA.e(jsonReader.nextString());
                    break;
                case "defaultProcess":
                    abstractC0660aA.b(jsonReader.nextBoolean());
                    break;
                case "importance":
                    abstractC0660aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0660aA.a();
    }

    public static F H(JsonReader jsonReader) throws IOException {
        F.b bVarB = F.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "ndkPayload":
                    bVarB.j(E(jsonReader));
                    break;
                case "sdkVersion":
                    bVarB.l(jsonReader.nextString());
                    break;
                case "appQualitySessionId":
                    bVarB.c(jsonReader.nextString());
                    break;
                case "appExitInfo":
                    bVarB.b(m(jsonReader));
                    break;
                case "buildVersion":
                    bVarB.d(jsonReader.nextString());
                    break;
                case "firebaseAuthenticationToken":
                    bVarB.f(jsonReader.nextString());
                    break;
                case "gmpAppId":
                    bVarB.h(jsonReader.nextString());
                    break;
                case "installationUuid":
                    bVarB.i(jsonReader.nextString());
                    break;
                case "firebaseInstallationId":
                    bVarB.g(jsonReader.nextString());
                    break;
                case "platform":
                    bVarB.k(jsonReader.nextInt());
                    break;
                case "displayVersion":
                    bVarB.e(jsonReader.nextString());
                    break;
                case "session":
                    bVarB.m(J(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarB.a();
    }

    public static F.e.d.AbstractC0662e.b I(JsonReader jsonReader) throws IOException {
        F.e.d.AbstractC0662e.b.a aVarA = F.e.d.AbstractC0662e.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("variantId")) {
                aVarA.c(jsonReader.nextString());
            } else if (strNextName.equals("rolloutId")) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static F.e J(JsonReader jsonReader) throws IOException {
        F.e.b bVarA = F.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "startedAt":
                    bVarA.m(jsonReader.nextLong());
                    break;
                case "appQualitySessionId":
                    bVarA.c(jsonReader.nextString());
                    break;
                case "identifier":
                    bVarA.k(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "endedAt":
                    bVarA.f(Long.valueOf(jsonReader.nextLong()));
                    break;
                case "device":
                    bVarA.e(q(jsonReader));
                    break;
                case "events":
                    bVarA.g(n(jsonReader, new a() { // from class: y8.d
                        @Override // y8.C6454j.a
                        public final Object a(JsonReader jsonReader2) {
                            return C6454j.r(jsonReader2);
                        }
                    }));
                    break;
                case "os":
                    bVarA.l(F(jsonReader));
                    break;
                case "app":
                    bVarA.b(l(jsonReader));
                    break;
                case "user":
                    bVarA.n(K(jsonReader));
                    break;
                case "generator":
                    bVarA.h(jsonReader.nextString());
                    break;
                case "crashed":
                    bVarA.d(jsonReader.nextBoolean());
                    break;
                case "generatorType":
                    bVarA.i(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    public static F.e.f K(JsonReader jsonReader) throws IOException {
        F.e.f.a aVarA = F.e.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("identifier")) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static F.e.a l(JsonReader jsonReader) throws IOException {
        F.e.a.AbstractC0648a abstractC0648aA = F.e.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "identifier":
                    abstractC0648aA.e(jsonReader.nextString());
                    break;
                case "developmentPlatform":
                    abstractC0648aA.b(jsonReader.nextString());
                    break;
                case "developmentPlatformVersion":
                    abstractC0648aA.c(jsonReader.nextString());
                    break;
                case "version":
                    abstractC0648aA.g(jsonReader.nextString());
                    break;
                case "installationUuid":
                    abstractC0648aA.f(jsonReader.nextString());
                    break;
                case "displayVersion":
                    abstractC0648aA.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0648aA.a();
    }

    public static F.a m(JsonReader jsonReader) throws IOException {
        F.a.b bVarA = F.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    bVarA.b(n(jsonReader, new a() { // from class: y8.a
                        @Override // y8.C6454j.a
                        public final Object a(JsonReader jsonReader2) {
                            return C6454j.o(jsonReader2);
                        }
                    }));
                    break;
                case "pid":
                    bVarA.d(jsonReader.nextInt());
                    break;
                case "pss":
                    bVarA.f(jsonReader.nextLong());
                    break;
                case "rss":
                    bVarA.h(jsonReader.nextLong());
                    break;
                case "timestamp":
                    bVarA.i(jsonReader.nextLong());
                    break;
                case "processName":
                    bVarA.e(jsonReader.nextString());
                    break;
                case "reasonCode":
                    bVarA.g(jsonReader.nextInt());
                    break;
                case "traceFile":
                    bVarA.j(jsonReader.nextString());
                    break;
                case "importance":
                    bVarA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    public static List n(JsonReader jsonReader, a aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    public static F.a.AbstractC0646a o(JsonReader jsonReader) throws IOException {
        F.a.AbstractC0646a.AbstractC0647a abstractC0647aA = F.a.AbstractC0646a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "libraryName":
                    abstractC0647aA.d(jsonReader.nextString());
                    break;
                case "arch":
                    abstractC0647aA.b(jsonReader.nextString());
                    break;
                case "buildId":
                    abstractC0647aA.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0647aA.a();
    }

    public static F.c p(JsonReader jsonReader) throws IOException {
        F.c.a aVarA = F.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                aVarA.b(jsonReader.nextString());
            } else if (strNextName.equals("value")) {
                aVarA.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static F.e.c q(JsonReader jsonReader) throws IOException {
        F.e.c.a aVarA = F.e.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "simulator":
                    aVarA.i(jsonReader.nextBoolean());
                    break;
                case "manufacturer":
                    aVarA.e(jsonReader.nextString());
                    break;
                case "ram":
                    aVarA.h(jsonReader.nextLong());
                    break;
                case "arch":
                    aVarA.b(jsonReader.nextInt());
                    break;
                case "diskSpace":
                    aVarA.d(jsonReader.nextLong());
                    break;
                case "cores":
                    aVarA.c(jsonReader.nextInt());
                    break;
                case "model":
                    aVarA.f(jsonReader.nextString());
                    break;
                case "state":
                    aVarA.j(jsonReader.nextInt());
                    break;
                case "modelClass":
                    aVarA.g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static F.e.d r(JsonReader jsonReader) throws IOException {
        F.e.d.b bVarA = F.e.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "device":
                    bVarA.c(u(jsonReader));
                    break;
                case "rollouts":
                    bVarA.e(A(jsonReader));
                    break;
                case "app":
                    bVarA.b(s(jsonReader));
                    break;
                case "log":
                    bVarA.d(y(jsonReader));
                    break;
                case "type":
                    bVarA.g(jsonReader.nextString());
                    break;
                case "timestamp":
                    bVarA.f(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    public static F.e.d.a s(JsonReader jsonReader) throws IOException {
        F.e.d.a.AbstractC0649a abstractC0649aA = F.e.d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "appProcessDetails":
                    abstractC0649aA.b(n(jsonReader, new a() { // from class: y8.c
                        @Override // y8.C6454j.a
                        public final Object a(JsonReader jsonReader2) {
                            return C6454j.G(jsonReader2);
                        }
                    }));
                    break;
                case "background":
                    abstractC0649aA.c(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case "execution":
                    abstractC0649aA.f(v(jsonReader));
                    break;
                case "internalKeys":
                    abstractC0649aA.g(n(jsonReader, new a() { // from class: y8.b
                        @Override // y8.C6454j.a
                        public final Object a(JsonReader jsonReader2) {
                            return C6454j.p(jsonReader2);
                        }
                    }));
                    break;
                case "customAttributes":
                    abstractC0649aA.e(n(jsonReader, new a() { // from class: y8.b
                        @Override // y8.C6454j.a
                        public final Object a(JsonReader jsonReader2) {
                            return C6454j.p(jsonReader2);
                        }
                    }));
                    break;
                case "uiOrientation":
                    abstractC0649aA.h(jsonReader.nextInt());
                    break;
                case "currentProcessDetails":
                    abstractC0649aA.d(G(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0649aA.a();
    }

    public static F.e.d.a.b.AbstractC0650a t(JsonReader jsonReader) throws IOException {
        F.e.d.a.b.AbstractC0650a.AbstractC0651a abstractC0651aA = F.e.d.a.b.AbstractC0650a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "name":
                    abstractC0651aA.c(jsonReader.nextString());
                    break;
                case "size":
                    abstractC0651aA.d(jsonReader.nextLong());
                    break;
                case "uuid":
                    abstractC0651aA.f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "baseAddress":
                    abstractC0651aA.b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0651aA.a();
    }

    public static F.e.d.c u(JsonReader jsonReader) throws IOException {
        F.e.d.c.a aVarA = F.e.d.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "batteryLevel":
                    aVarA.b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case "batteryVelocity":
                    aVarA.c(jsonReader.nextInt());
                    break;
                case "orientation":
                    aVarA.e(jsonReader.nextInt());
                    break;
                case "diskUsed":
                    aVarA.d(jsonReader.nextLong());
                    break;
                case "ramUsed":
                    aVarA.g(jsonReader.nextLong());
                    break;
                case "proximityOn":
                    aVarA.f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static F.e.d.a.b v(JsonReader jsonReader) throws IOException {
        F.e.d.a.b.AbstractC0652b abstractC0652bA = F.e.d.a.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "appExitInfo":
                    abstractC0652bA.b(m(jsonReader));
                    break;
                case "threads":
                    abstractC0652bA.f(n(jsonReader, new a() { // from class: y8.g
                        @Override // y8.C6454j.a
                        public final Object a(JsonReader jsonReader2) {
                            return C6454j.C(jsonReader2);
                        }
                    }));
                    break;
                case "signal":
                    abstractC0652bA.e(B(jsonReader));
                    break;
                case "binaries":
                    abstractC0652bA.c(n(jsonReader, new a() { // from class: y8.h
                        @Override // y8.C6454j.a
                        public final Object a(JsonReader jsonReader2) {
                            return C6454j.t(jsonReader2);
                        }
                    }));
                    break;
                case "exception":
                    abstractC0652bA.d(w(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0652bA.a();
    }

    public static F.e.d.a.b.c w(JsonReader jsonReader) throws IOException {
        F.e.d.a.b.c.AbstractC0653a abstractC0653aA = F.e.d.a.b.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    abstractC0653aA.c(n(jsonReader, new C6453i()));
                    break;
                case "reason":
                    abstractC0653aA.e(jsonReader.nextString());
                    break;
                case "type":
                    abstractC0653aA.f(jsonReader.nextString());
                    break;
                case "causedBy":
                    abstractC0653aA.b(w(jsonReader));
                    break;
                case "overflowCount":
                    abstractC0653aA.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0653aA.a();
    }

    public static F.e.d.a.b.AbstractC0656e.AbstractC0658b x(JsonReader jsonReader) throws IOException {
        F.e.d.a.b.AbstractC0656e.AbstractC0658b.AbstractC0659a abstractC0659aA = F.e.d.a.b.AbstractC0656e.AbstractC0658b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    abstractC0659aA.d(jsonReader.nextLong());
                    break;
                case "symbol":
                    abstractC0659aA.f(jsonReader.nextString());
                    break;
                case "pc":
                    abstractC0659aA.e(jsonReader.nextLong());
                    break;
                case "file":
                    abstractC0659aA.b(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC0659aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0659aA.a();
    }

    public static F.e.d.AbstractC0661d y(JsonReader jsonReader) throws IOException {
        F.e.d.AbstractC0661d.a aVarA = F.e.d.AbstractC0661d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("content")) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static F.e.d.AbstractC0662e z(JsonReader jsonReader) throws IOException {
        F.e.d.AbstractC0662e.a aVarA = F.e.d.AbstractC0662e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "parameterKey":
                    aVarA.b(jsonReader.nextString());
                    break;
                case "templateVersion":
                    aVarA.e(jsonReader.nextLong());
                    break;
                case "rolloutVariant":
                    aVarA.d(I(jsonReader));
                    break;
                case "parameterValue":
                    aVarA.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public F L(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                F fH = H(jsonReader);
                jsonReader.close();
                return fH;
            } finally {
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    public String M(F f10) {
        return f48496a.b(f10);
    }

    public F.e.d j(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                F.e.d dVarR = r(jsonReader);
                jsonReader.close();
                return dVarR;
            } finally {
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    public String k(F.e.d dVar) {
        return f48496a.b(dVar);
    }
}
