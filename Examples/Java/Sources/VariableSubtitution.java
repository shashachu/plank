//
// VariableSubtitution.java
// Autogenerated by plank
//
// DO NOT EDIT - EDITS WILL BE OVERWRITTEN
// @generated
//

package com.pinterest.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class VariableSubtitution {

    public static final String TYPE = "variable_subtitution";

    @SerializedName("alloc_prop") private @Nullable Integer allocProp;
    @SerializedName("copy_prop") private @Nullable Integer copyProp;
    @SerializedName("mutable_copy_prop") private @Nullable Integer mutableCopyProp;
    @SerializedName("new_prop") private @Nullable Integer newProp;

    static final private int ALLOC_PROP_INDEX = 0;
    static final private int COPY_PROP_INDEX = 1;
    static final private int MUTABLE_COPY_PROP_INDEX = 2;
    static final private int NEW_PROP_INDEX = 3;

    private boolean[] _bits = new boolean[4];

    private VariableSubtitution(
        @Nullable Integer allocProp,
        @Nullable Integer copyProp,
        @Nullable Integer mutableCopyProp,
        @Nullable Integer newProp,
        boolean[] _bits
    ) {
        this.allocProp = allocProp;
        this.copyProp = copyProp;
        this.mutableCopyProp = mutableCopyProp;
        this.newProp = newProp;
        this._bits = _bits;
    }

    public static VariableSubtitution.Builder builder() {
        return new VariableSubtitution.Builder();
    }

    public VariableSubtitution.Builder toBuilder() {
        return new VariableSubtitution.Builder(this);
    }

    public VariableSubtitution mergeFrom(VariableSubtitution model) {
        VariableSubtitution.Builder builder = this.toBuilder();
        builder.mergeFrom(model);
        return builder.build();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VariableSubtitution that = (VariableSubtitution) o;
        return Objects.equals(this.allocProp, that.allocProp) &&
        Objects.equals(this.copyProp, that.copyProp) &&
        Objects.equals(this.mutableCopyProp, that.mutableCopyProp) &&
        Objects.equals(this.newProp, that.newProp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allocProp,
        copyProp,
        mutableCopyProp,
        newProp);
    }

    @NonNull
    public Integer getAllocProp() {
        return this.allocProp == null ? 0 : this.allocProp;
    }

    @NonNull
    public Integer getCopyProp() {
        return this.copyProp == null ? 0 : this.copyProp;
    }

    @NonNull
    public Integer getMutableCopyProp() {
        return this.mutableCopyProp == null ? 0 : this.mutableCopyProp;
    }

    @NonNull
    public Integer getNewProp() {
        return this.newProp == null ? 0 : this.newProp;
    }

    public boolean getAllocPropIsSet() {
        return this._bits.length > ALLOC_PROP_INDEX && this._bits[ALLOC_PROP_INDEX];
    }

    public boolean getCopyPropIsSet() {
        return this._bits.length > COPY_PROP_INDEX && this._bits[COPY_PROP_INDEX];
    }

    public boolean getMutableCopyPropIsSet() {
        return this._bits.length > MUTABLE_COPY_PROP_INDEX && this._bits[MUTABLE_COPY_PROP_INDEX];
    }

    public boolean getNewPropIsSet() {
        return this._bits.length > NEW_PROP_INDEX && this._bits[NEW_PROP_INDEX];
    }

    public static class Builder {

        private @Nullable Integer allocProp;
        private @Nullable Integer copyProp;
        private @Nullable Integer mutableCopyProp;
        private @Nullable Integer newProp;

        private boolean[] _bits = new boolean[4];

        private Builder() {
        }

        private Builder(@NonNull VariableSubtitution model) {
            this.allocProp = model.allocProp;
            this.copyProp = model.copyProp;
            this.mutableCopyProp = model.mutableCopyProp;
            this.newProp = model.newProp;
            this._bits = model._bits;
        }

        public Builder setAllocProp(@Nullable Integer value) {
            this.allocProp = value;
            if (this._bits.length > ALLOC_PROP_INDEX) {
                this._bits[ALLOC_PROP_INDEX] = true;
            }
            return this;
        }

        public Builder setCopyProp(@Nullable Integer value) {
            this.copyProp = value;
            if (this._bits.length > COPY_PROP_INDEX) {
                this._bits[COPY_PROP_INDEX] = true;
            }
            return this;
        }

        public Builder setMutableCopyProp(@Nullable Integer value) {
            this.mutableCopyProp = value;
            if (this._bits.length > MUTABLE_COPY_PROP_INDEX) {
                this._bits[MUTABLE_COPY_PROP_INDEX] = true;
            }
            return this;
        }

        public Builder setNewProp(@Nullable Integer value) {
            this.newProp = value;
            if (this._bits.length > NEW_PROP_INDEX) {
                this._bits[NEW_PROP_INDEX] = true;
            }
            return this;
        }

        public @Nullable Integer getAllocProp() {
            return this.allocProp;
        }

        public @Nullable Integer getCopyProp() {
            return this.copyProp;
        }

        public @Nullable Integer getMutableCopyProp() {
            return this.mutableCopyProp;
        }

        public @Nullable Integer getNewProp() {
            return this.newProp;
        }

        @NonNull
        public VariableSubtitution build() {
            return new VariableSubtitution(
            this.allocProp,
            this.copyProp,
            this.mutableCopyProp,
            this.newProp,
            this._bits
            );
        }

        public void mergeFrom(VariableSubtitution model) {
            if (model.getAllocPropIsSet()) {
                this.allocProp = model.allocProp;
                if (this._bits.length > ALLOC_PROP_INDEX) {
                    this._bits[ALLOC_PROP_INDEX] = true;
                }
            }
            if (model.getCopyPropIsSet()) {
                this.copyProp = model.copyProp;
                if (this._bits.length > COPY_PROP_INDEX) {
                    this._bits[COPY_PROP_INDEX] = true;
                }
            }
            if (model.getMutableCopyPropIsSet()) {
                this.mutableCopyProp = model.mutableCopyProp;
                if (this._bits.length > MUTABLE_COPY_PROP_INDEX) {
                    this._bits[MUTABLE_COPY_PROP_INDEX] = true;
                }
            }
            if (model.getNewPropIsSet()) {
                this.newProp = model.newProp;
                if (this._bits.length > NEW_PROP_INDEX) {
                    this._bits[NEW_PROP_INDEX] = true;
                }
            }
        }
    }

    public static class VariableSubtitutionTypeAdapterFactory implements TypeAdapterFactory {

        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (!VariableSubtitution.class.isAssignableFrom(typeToken.getRawType())) {
                return null;
            }
            return (TypeAdapter<T>) new VariableSubtitutionTypeAdapter(gson, this, typeToken);
        }
    }

    public static class VariableSubtitutionTypeAdapter extends TypeAdapter<VariableSubtitution> {

        final private VariableSubtitutionTypeAdapterFactory factory;
        final private Gson gson;
        final private TypeToken typeToken;
        private TypeAdapter<VariableSubtitution> delegateTypeAdapter;

        private TypeAdapter<Integer> integerTypeAdapter;

        public VariableSubtitutionTypeAdapter(Gson gson, VariableSubtitutionTypeAdapterFactory factory, TypeToken typeToken) {
            this.factory = factory;
            this.gson = gson;
            this.typeToken = typeToken;
        }

        @Override
        public void write(JsonWriter writer, VariableSubtitution value) throws IOException {
            if (this.delegateTypeAdapter == null) {
                this.delegateTypeAdapter = this.gson.getDelegateAdapter(this.factory, this.typeToken);
            }
            writer.setSerializeNulls(false);
            this.delegateTypeAdapter.write(writer, value);
        }

        @Override
        public VariableSubtitution read(JsonReader reader) throws IOException {
            if (reader.peek() == JsonToken.NULL) {
                reader.nextNull();
                return null;
            }
            Builder builder = VariableSubtitution.builder();
            boolean[] bits = null;
            reader.beginObject();
            while (reader.hasNext()) {
                String name = reader.nextName();
                switch (name) {
                    case ("alloc_prop"):
                        if (this.integerTypeAdapter == null) {
                            this.integerTypeAdapter = this.gson.getAdapter(Integer.class).nullSafe();
                        }
                        builder.setAllocProp(this.integerTypeAdapter.read(reader));
                        break;
                    case ("copy_prop"):
                        if (this.integerTypeAdapter == null) {
                            this.integerTypeAdapter = this.gson.getAdapter(Integer.class).nullSafe();
                        }
                        builder.setCopyProp(this.integerTypeAdapter.read(reader));
                        break;
                    case ("mutable_copy_prop"):
                        if (this.integerTypeAdapter == null) {
                            this.integerTypeAdapter = this.gson.getAdapter(Integer.class).nullSafe();
                        }
                        builder.setMutableCopyProp(this.integerTypeAdapter.read(reader));
                        break;
                    case ("new_prop"):
                        if (this.integerTypeAdapter == null) {
                            this.integerTypeAdapter = this.gson.getAdapter(Integer.class).nullSafe();
                        }
                        builder.setNewProp(this.integerTypeAdapter.read(reader));
                        break;
                    case ("_bits"):
                        bits = new boolean[4];
                        int i = 0;
                        reader.beginArray();
                        while (reader.hasNext() && i < 4) {
                            bits[i] = reader.nextBoolean();
                            i++;
                        }
                        reader.endArray();
                        break;
                    default:
                        reader.skipValue();
                }
            }
            reader.endObject();
            if (bits != null) {
                builder._bits = bits;
            }
            return builder.build();
        }
    }
}
