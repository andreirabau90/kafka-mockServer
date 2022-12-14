/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package ru.tinkoff.sme.cryptobpm.requests;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class FileMeta extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2104815976085842362L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FileMeta\",\"namespace\":\"ru.tinkoff.sme.cryptobpm.requests\",\"fields\":[{\"name\":\"fileName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<FileMeta> ENCODER =
      new BinaryMessageEncoder<FileMeta>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<FileMeta> DECODER =
      new BinaryMessageDecoder<FileMeta>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<FileMeta> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<FileMeta> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<FileMeta> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<FileMeta>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this FileMeta to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a FileMeta from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a FileMeta instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static FileMeta fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.String fileName;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public FileMeta() {}

  /**
   * All-args constructor.
   * @param fileName The new value for fileName
   */
  public FileMeta(java.lang.String fileName) {
    this.fileName = fileName;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return fileName;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: fileName = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'fileName' field.
   * @return The value of the 'fileName' field.
   */
  public java.lang.String getFileName() {
    return fileName;
  }


  /**
   * Sets the value of the 'fileName' field.
   * @param value the value to set.
   */
  public void setFileName(java.lang.String value) {
    this.fileName = value;
  }

  /**
   * Creates a new FileMeta RecordBuilder.
   * @return A new FileMeta RecordBuilder
   */
  public static ru.tinkoff.sme.cryptobpm.requests.FileMeta.Builder newBuilder() {
    return new ru.tinkoff.sme.cryptobpm.requests.FileMeta.Builder();
  }

  /**
   * Creates a new FileMeta RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new FileMeta RecordBuilder
   */
  public static ru.tinkoff.sme.cryptobpm.requests.FileMeta.Builder newBuilder(ru.tinkoff.sme.cryptobpm.requests.FileMeta.Builder other) {
    if (other == null) {
      return new ru.tinkoff.sme.cryptobpm.requests.FileMeta.Builder();
    } else {
      return new ru.tinkoff.sme.cryptobpm.requests.FileMeta.Builder(other);
    }
  }

  /**
   * Creates a new FileMeta RecordBuilder by copying an existing FileMeta instance.
   * @param other The existing instance to copy.
   * @return A new FileMeta RecordBuilder
   */
  public static ru.tinkoff.sme.cryptobpm.requests.FileMeta.Builder newBuilder(ru.tinkoff.sme.cryptobpm.requests.FileMeta other) {
    if (other == null) {
      return new ru.tinkoff.sme.cryptobpm.requests.FileMeta.Builder();
    } else {
      return new ru.tinkoff.sme.cryptobpm.requests.FileMeta.Builder(other);
    }
  }

  /**
   * RecordBuilder for FileMeta instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FileMeta>
    implements org.apache.avro.data.RecordBuilder<FileMeta> {

    private java.lang.String fileName;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(ru.tinkoff.sme.cryptobpm.requests.FileMeta.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.fileName)) {
        this.fileName = data().deepCopy(fields()[0].schema(), other.fileName);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing FileMeta instance
     * @param other The existing instance to copy.
     */
    private Builder(ru.tinkoff.sme.cryptobpm.requests.FileMeta other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.fileName)) {
        this.fileName = data().deepCopy(fields()[0].schema(), other.fileName);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'fileName' field.
      * @return The value.
      */
    public java.lang.String getFileName() {
      return fileName;
    }


    /**
      * Sets the value of the 'fileName' field.
      * @param value The value of 'fileName'.
      * @return This builder.
      */
    public ru.tinkoff.sme.cryptobpm.requests.FileMeta.Builder setFileName(java.lang.String value) {
      validate(fields()[0], value);
      this.fileName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'fileName' field has been set.
      * @return True if the 'fileName' field has been set, false otherwise.
      */
    public boolean hasFileName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'fileName' field.
      * @return This builder.
      */
    public ru.tinkoff.sme.cryptobpm.requests.FileMeta.Builder clearFileName() {
      fileName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public FileMeta build() {
      try {
        FileMeta record = new FileMeta();
        record.fileName = fieldSetFlags()[0] ? this.fileName : (java.lang.String) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<FileMeta>
    WRITER$ = (org.apache.avro.io.DatumWriter<FileMeta>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<FileMeta>
    READER$ = (org.apache.avro.io.DatumReader<FileMeta>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.fileName);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.fileName = in.readString();

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.fileName = in.readString();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










