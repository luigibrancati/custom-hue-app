package org.apache.tika.embedder;

import Je.f;
import Oe.e;
import j$.util.Collection$EL;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.IntFunction;
import org.apache.tika.embedder.ExternalEmbedder;
import org.apache.tika.exception.TikaException;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.Property;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.external.ExternalParser;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class ExternalEmbedder implements Embedder {
    public static final String METADATA_COMMAND_ARGUMENTS_SERIALIZED_TOKEN = "${METADATA_SERIALIZED}";
    public static final String METADATA_COMMAND_ARGUMENTS_TOKEN = "${METADATA}";
    private static final long serialVersionUID = -2828829275642475697L;
    private final TemporaryResources tmp = new TemporaryResources();
    private Set<MediaType> supportedEmbedTypes = Collections.EMPTY_SET;
    private Map<Property, String[]> metadataCommandArguments = null;
    private String[] command = {"sed", "-e", "$a\\\n${METADATA_SERIALIZED}", ExternalParser.INPUT_FILE_TOKEN};
    private String commandAssignmentOperator = "=";
    private String commandAssignmentDelimeter = ", ";
    private String commandAppendOperator = "=";
    private boolean quoteAssignmentValues = false;

    public static /* synthetic */ void a(InputStream inputStream, OutputStream outputStream) {
        try {
            f.n(inputStream, outputStream);
        } catch (IOException e10) {
            System.out.println("ERROR: " + e10.getMessage());
        }
    }

    public static /* synthetic */ String[] b(int i10) {
        return new String[i10];
    }

    public static /* synthetic */ String[] c(int i10) {
        return new String[i10];
    }

    public static boolean check(String str, int... iArr) {
        return check(new String[]{str}, iArr);
    }

    private void multiThreadedStreamCopy(final InputStream inputStream, final OutputStream outputStream) {
        new Thread(new Runnable() { // from class: Qe.a
            @Override // java.lang.Runnable
            public final void run() {
                ExternalEmbedder.a(inputStream, outputStream);
            }
        }).start();
    }

    private void sendInputStreamToStdIn(InputStream inputStream, Process process) {
        multiThreadedStreamCopy(inputStream, process.getOutputStream());
    }

    private void sendStdErrToOutputStream(Process process, OutputStream outputStream) {
        multiThreadedStreamCopy(process.getErrorStream(), outputStream);
    }

    private void sendStdOutToOutputStream(Process process, OutputStream outputStream) {
        try {
            f.n(process.getInputStream(), outputStream);
        } catch (IOException e10) {
            System.out.println("ERROR: " + e10.getMessage());
        }
    }

    public static String serializeMetadata(List<String> list) {
        return list != null ? Arrays.toString(list.toArray()) : "";
    }

    @Override // org.apache.tika.embedder.Embedder
    public void embed(Metadata metadata, InputStream inputStream, OutputStream outputStream, ParseContext parseContext) throws TikaException {
        TikaInputStream tikaInputStream;
        Map<Property, String[]> map = this.metadataCommandArguments;
        boolean z10 = (map == null || map.isEmpty()) ? false : true;
        TikaInputStream tikaInputStream2 = TikaInputStream.get(inputStream);
        File file = null;
        List<String> commandMetadataSegments = z10 ? getCommandMetadataSegments(metadata) : null;
        String[] strArr = this.command;
        ArrayList<String> arrayList = new ArrayList();
        int length = strArr.length;
        int i10 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = true;
        boolean z14 = true;
        while (i10 < length) {
            String strReplace = strArr[i10];
            boolean z15 = z10;
            if (strReplace.contains(ExternalParser.INPUT_FILE_TOKEN)) {
                tikaInputStream = tikaInputStream2;
                strReplace = strReplace.replace(ExternalParser.INPUT_FILE_TOKEN, tikaInputStream2.getFile().toString());
                z13 = false;
            } else {
                tikaInputStream = tikaInputStream2;
            }
            if (strReplace.contains(ExternalParser.OUTPUT_FILE_TOKEN)) {
                File fileCreateTemporaryFile = this.tmp.createTemporaryFile();
                strReplace = strReplace.replace(ExternalParser.OUTPUT_FILE_TOKEN, fileCreateTemporaryFile.toString());
                z14 = false;
                file = fileCreateTemporaryFile;
            }
            if (strReplace.contains(METADATA_COMMAND_ARGUMENTS_SERIALIZED_TOKEN)) {
                z11 = true;
            }
            if (strReplace.contains(METADATA_COMMAND_ARGUMENTS_TOKEN)) {
                if (z15) {
                    arrayList.addAll(commandMetadataSegments);
                }
                z12 = true;
            } else {
                arrayList.add(strReplace);
            }
            i10++;
            z10 = z15;
            tikaInputStream2 = tikaInputStream;
        }
        TikaInputStream tikaInputStream3 = tikaInputStream2;
        if (z10) {
            if (z11) {
                int i11 = 0;
                for (String str : arrayList) {
                    if (str.contains(METADATA_COMMAND_ARGUMENTS_SERIALIZED_TOKEN)) {
                        arrayList.set(i11, str.replace(METADATA_COMMAND_ARGUMENTS_SERIALIZED_TOKEN, serializeMetadata(commandMetadataSegments)));
                    }
                    i11++;
                }
            } else if (!z12 && !z11) {
                arrayList.addAll(commandMetadataSegments);
            }
        }
        Process processExec = arrayList.toArray().length == 1 ? Runtime.getRuntime().exec(((String[]) Collection$EL.toArray(arrayList, new IntFunction() { // from class: Qe.b
            @Override // java.util.function.IntFunction
            public final Object apply(int i12) {
                return ExternalEmbedder.c(i12);
            }
        }))[0]) : Runtime.getRuntime().exec((String[]) Collection$EL.toArray(arrayList, new IntFunction() { // from class: Qe.c
            @Override // java.util.function.IntFunction
            public final Object apply(int i12) {
                return ExternalEmbedder.b(i12);
            }
        }));
        e eVarK = e.i().k();
        try {
            sendStdErrToOutputStream(processExec, eVarK);
            if (z13) {
                sendInputStreamToStdIn(inputStream, processExec);
            } else {
                processExec.getOutputStream().close();
            }
            if (z14) {
                sendStdOutToOutputStream(processExec, outputStream);
            } else {
                this.tmp.dispose();
                try {
                    processExec.waitFor();
                } catch (InterruptedException unused) {
                }
                f.n(TikaInputStream.get(file.toPath()), outputStream);
            }
            if (z14) {
                try {
                    processExec.waitFor();
                } catch (InterruptedException | Exception unused2) {
                }
            } else {
                file.delete();
            }
            if (!z13) {
                f.k(tikaInputStream3);
            }
            f.l(outputStream);
            f.l(eVarK);
            if (processExec.exitValue() == 0) {
                return;
            }
            throw new TikaException("There was an error executing the command line\nExecutable Command:\n\n" + String.valueOf(arrayList) + "\nExecutable Error:\n\n" + eVarK.d(StandardCharsets.UTF_8.name()));
        } catch (Throwable th) {
            if (z14) {
                try {
                    processExec.waitFor();
                } catch (InterruptedException | Exception unused3) {
                }
            } else {
                file.delete();
            }
            if (!z13) {
                f.k(tikaInputStream3);
            }
            f.l(outputStream);
            f.l(eVarK);
            if (processExec.exitValue() == 0) {
                throw th;
            }
            throw new TikaException("There was an error executing the command line\nExecutable Command:\n\n" + String.valueOf(arrayList) + "\nExecutable Error:\n\n" + eVarK.d(StandardCharsets.UTF_8.name()));
        }
    }

    public String[] getCommand() {
        return this.command;
    }

    public String getCommandAppendOperator() {
        return this.commandAppendOperator;
    }

    public String getCommandAssignmentDelimeter() {
        return this.commandAssignmentDelimeter;
    }

    public String getCommandAssignmentOperator() {
        return this.commandAssignmentOperator;
    }

    public List<String> getCommandMetadataSegments(Metadata metadata) {
        String[] strArr;
        String[] strArr2;
        int i10;
        ArrayList arrayList = new ArrayList();
        if (metadata != null && metadata.names() != null) {
            String[] strArrNames = metadata.names();
            int length = strArrNames.length;
            for (int i11 = 0; i11 < length; i11++) {
                String str = strArrNames[i11];
                for (Property property : getMetadataCommandArguments().keySet()) {
                    if (str.equals(property.getName()) && (strArr = getMetadataCommandArguments().get(property)) != null) {
                        int length2 = strArr.length;
                        int i12 = 0;
                        while (i12 < length2) {
                            String str2 = strArr[i12];
                            if (metadata.isMultiValued(str)) {
                                String[] values = metadata.getValues(str);
                                int length3 = values.length;
                                int i13 = 0;
                                while (true) {
                                    strArr2 = strArrNames;
                                    if (i13 >= length3) {
                                        break;
                                    }
                                    String str3 = values[i13];
                                    int i14 = length;
                                    if (this.quoteAssignmentValues) {
                                        str3 = "'" + str3 + "'";
                                    }
                                    arrayList.add(str2 + this.commandAppendOperator + str3);
                                    i13++;
                                    strArrNames = strArr2;
                                    length = i14;
                                }
                                i10 = length;
                            } else {
                                strArr2 = strArrNames;
                                i10 = length;
                                String str4 = metadata.get(str);
                                if (this.quoteAssignmentValues) {
                                    str4 = "'" + str4 + "'";
                                }
                                arrayList.add(str2 + this.commandAssignmentOperator + str4);
                            }
                            i12++;
                            strArrNames = strArr2;
                            length = i10;
                        }
                    }
                    strArrNames = strArrNames;
                    length = length;
                }
            }
        }
        return arrayList;
    }

    public Map<Property, String[]> getMetadataCommandArguments() {
        return this.metadataCommandArguments;
    }

    @Override // org.apache.tika.embedder.Embedder
    public Set<MediaType> getSupportedEmbedTypes(ParseContext parseContext) {
        return getSupportedEmbedTypes();
    }

    public boolean isQuoteAssignmentValues() {
        return this.quoteAssignmentValues;
    }

    public void setCommand(String... strArr) {
        this.command = strArr;
    }

    public void setCommandAppendOperator(String str) {
        this.commandAppendOperator = str;
    }

    public void setCommandAssignmentDelimeter(String str) {
        this.commandAssignmentDelimeter = str;
    }

    public void setCommandAssignmentOperator(String str) {
        this.commandAssignmentOperator = str;
    }

    public void setMetadataCommandArguments(Map<Property, String[]> map) {
        this.metadataCommandArguments = map;
    }

    public void setQuoteAssignmentValues(boolean z10) {
        this.quoteAssignmentValues = z10;
    }

    public void setSupportedEmbedTypes(Set<MediaType> set) {
        this.supportedEmbedTypes = Collections.unmodifiableSet(new HashSet(set));
    }

    public static boolean check(String[] strArr, int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{127};
        }
        try {
            int iWaitFor = (strArr.length == 1 ? Runtime.getRuntime().exec(strArr[0]) : Runtime.getRuntime().exec(strArr)).waitFor();
            for (int i10 : iArr) {
                if (iWaitFor == i10) {
                    return false;
                }
            }
            return true;
        } catch (IOException | InterruptedException unused) {
            return false;
        }
    }

    public Set<MediaType> getSupportedEmbedTypes() {
        return this.supportedEmbedTypes;
    }
}
