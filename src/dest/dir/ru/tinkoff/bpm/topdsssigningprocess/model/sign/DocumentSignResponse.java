/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package ru.tinkoff.bpm.topdsssigningprocess.model.sign;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class DocumentSignResponse extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5160790589949589601L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DocumentSignResponse\",\"namespace\":\"ru.tinkoff.bpm.topdsssigningprocess.model.sign\",\"fields\":[{\"name\":\"requestId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"logicalType\":\"uuid\"},{\"name\":\"system\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"submissionId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"signingSide\",\"type\":{\"type\":\"enum\",\"name\":\"SigningSide\",\"symbols\":[\"CLIENT\",\"BANK\"]}},{\"name\":\"success\",\"type\":\"boolean\"},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"documents\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"SignedDocument\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"SignedDocumentType\",\"symbols\":[\"MORTGAGE_AGREEMENT\",\"APPLICATION_FORM\",\"INDIVIDUAL_CONDITIONS\",\"CLIENT_APPLICATION_ROSREESTR\",\"BANK_APPLICATION_ROSREESTR\",\"CONTAINER_DESCRIPTION\"]}},{\"name\":\"documentUri\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"signatureUri\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<DocumentSignResponse> ENCODER =
      new BinaryMessageEncoder<DocumentSignResponse>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<DocumentSignResponse> DECODER =
      new BinaryMessageDecoder<DocumentSignResponse>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<DocumentSignResponse> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<DocumentSignResponse> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<DocumentSignResponse> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<DocumentSignResponse>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this DocumentSignResponse to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a DocumentSignResponse from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a DocumentSignResponse instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static DocumentSignResponse fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.String requestId;
  @Deprecated public java.lang.String system;
  @Deprecated public java.lang.String submissionId;
  @Deprecated public ru.tinkoff.bpm.topdsssigningprocess.model.sign.SigningSide signingSide;
  @Deprecated public boolean success;
  @Deprecated public java.lang.String description;
  @Deprecated public java.util.List<ru.tinkoff.bpm.topdsssigningprocess.model.sign.SignedDocument> documents;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DocumentSignResponse() {}

  /**
   * All-args constructor.
   * @param requestId The new value for requestId
   * @param system The new value for system
   * @param submissionId The new value for submissionId
   * @param signingSide The new value for signingSide
   * @param success The new value for success
   * @param description The new value for description
   * @param documents The new value for documents
   */
  public DocumentSignResponse(java.lang.String requestId, java.lang.String system, java.lang.String submissionId, ru.tinkoff.bpm.topdsssigningprocess.model.sign.SigningSide signingSide, java.lang.Boolean success, java.lang.String description, java.util.List<ru.tinkoff.bpm.topdsssigningprocess.model.sign.SignedDocument> documents) {
    this.requestId = requestId;
    this.system = system;
    this.submissionId = submissionId;
    this.signingSide = signingSide;
    this.success = success;
    this.description = description;
    this.documents = documents;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return requestId;
    case 1: return system;
    case 2: return submissionId;
    case 3: return signingSide;
    case 4: return success;
    case 5: return description;
    case 6: return documents;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: requestId = value$ != null ? value$.toString() : null; break;
    case 1: system = value$ != null ? value$.toString() : null; break;
    case 2: submissionId = value$ != null ? value$.toString() : null; break;
    case 3: signingSide = (ru.tinkoff.bpm.topdsssigningprocess.model.sign.SigningSide)value$; break;
    case 4: success = (java.lang.Boolean)value$; break;
    case 5: description = value$ != null ? value$.toString() : null; break;
    case 6: documents = (java.util.List<ru.tinkoff.bpm.topdsssigningprocess.model.sign.SignedDocument>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'requestId' field.
   * @return The value of the 'requestId' field.
   */
  public java.lang.String getRequestId() {
    return requestId;
  }


  /**
   * Sets the value of the 'requestId' field.
   * @param value the value to set.
   */
  public void setRequestId(java.lang.String value) {
    this.requestId = value;
  }

  /**
   * Gets the value of the 'system' field.
   * @return The value of the 'system' field.
   */
  public java.lang.String getSystem() {
    return system;
  }


  /**
   * Sets the value of the 'system' field.
   * @param value the value to set.
   */
  public void setSystem(java.lang.String value) {
    this.system = value;
  }

  /**
   * Gets the value of the 'submissionId' field.
   * @return The value of the 'submissionId' field.
   */
  public java.lang.String getSubmissionId() {
    return submissionId;
  }


  /**
   * Sets the value of the 'submissionId' field.
   * @param value the value to set.
   */
  public void setSubmissionId(java.lang.String value) {
    this.submissionId = value;
  }

  /**
   * Gets the value of the 'signingSide' field.
   * @return The value of the 'signingSide' field.
   */
  public ru.tinkoff.bpm.topdsssigningprocess.model.sign.SigningSide getSigningSide() {
    return signingSide;
  }


  /**
   * Sets the value of the 'signingSide' field.
   * @param value the value to set.
   */
  public void setSigningSide(ru.tinkoff.bpm.topdsssigningprocess.model.sign.SigningSide value) {
    this.signingSide = value;
  }

  /**
   * Gets the value of the 'success' field.
   * @return The value of the 'success' field.
   */
  public boolean getSuccess() {
    return success;
  }


  /**
   * Sets the value of the 'success' field.
   * @param value the value to set.
   */
  public void setSuccess(boolean value) {
    this.success = value;
  }

  /**
   * Gets the value of the 'description' field.
   * @return The value of the 'description' field.
   */
  public java.lang.String getDescription() {
    return description;
  }


  /**
   * Sets the value of the 'description' field.
   * @param value the value to set.
   */
  public void setDescription(java.lang.String value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'documents' field.
   * @return The value of the 'documents' field.
   */
  public java.util.List<ru.tinkoff.bpm.topdsssigningprocess.model.sign.SignedDocument> getDocuments() {
    return documents;
  }


  /**
   * Sets the value of the 'documents' field.
   * @param value the value to set.
   */
  public void setDocuments(java.util.List<ru.tinkoff.bpm.topdsssigningprocess.model.sign.SignedDocument> value) {
    this.documents = value;
  }

  /**
   * Creates a new DocumentSignResponse RecordBuilder.
   * @return A new DocumentSignResponse RecordBuilder
   */
  public static ru.tinkoff.bpm.topdsssigningprocess.model.sign.DocumentSignResponse.Builder newBuilder() {
    return new ru.tinkoff.bpm.topdsssigningprocess.model.sign.DocumentSignResponse.Builder();
  }

  /**
   * Creates a new DocumentSignResponse RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DocumentSignResponse RecordBuilder
   */
  public static ru.tinkoff.bpm.topdsssigningprocess.model.sign.DocumentSignResponse.Builder newBuilder(ru.tinkoff.bpm.topdsssigningprocess.model.sign.DocumentSignResponse.Builder other) {
    if (other == null) {
      return new ru.tinkoff.bpm.topdsssigningprocess.model.sign.DocumentSignResponse.Builder();
    } else {
      return new ru.tinkoff.bpm.topdsssigningprocess.model.sign.DocumentSignResponse.Builder(other);
    }
  }

  /**
   * Creates a new DocumentSignResponse RecordBuilder by copying an existing DocumentSignResponse instance.
   * @param other The existing instance to copy.
   * @return A new DocumentSignResponse RecordBuilder
   */
  public static ru.tinkoff.bpm.topdsssigningprocess.model.sign.DocumentSignResponse.Builder newBuilder(ru.tinkoff.bpm.topdsssigningprocess.model.sign.DocumentSignResponse other) {
    if (other == null) {
      return new ru.tinkoff.bpm.topdsssigningprocess.model.sign.DocumentSignResponse.Builder();
    } else {
      return new ru.tinkoff.bpm.topdsssigningprocess.model.sign.DocumentSignResponse.Builder(other);
    }
  }

  /**
   * RecordBuilder for DocumentSignResponse instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DocumentSignResponse>
    implements org.apache.avro.data.RecordBuilder<DocumentSignResponse> {

    private java.lang.String requestId;
    private java.lang.String system;
    private java.lang.String submissionId;
    private ru.tinkoff.bpm.topdsssigningprocess.model.sign.SigningSide signingSide;
    private boolean success;
    private java.lang.String description;
    private java.util.List<ru.tinkoff.bpm.topdsssigningprocess.model.sign.SignedDocument> documents;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(ru.tinkoff.bpm.topdsssigningprocess.model.sign.DocumentSignResponse.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.requestId)) {
        this.requestId = data().deepCopy(fields()[0].schema(), other.requestId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.system)) {
        this.system = data().deepCopy(fields()[1].schema(), other.system);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.submissionId)) {
        this.submissionId = data().deepCopy(fields()[2].schema(), other.submissionId);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.signingSide)) {
        this.signingSide = data().deepCopy(fields()[3].schema(), other.signingSide);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.success)) {
        this.success = data().deepCopy(fields()[4].schema(), other.success);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.description)) {
        this.description = data().deepCopy(fields()[5].schema(), other.description);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.documents)) {
        this.documents = data().deepCopy(fields()[6].schema(), other.documents);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
    }

    /**
     * Creates a Builder by copying an existing DocumentSignResponse instance
     * @param other The existing instance to copy.
     */
    private Builder(ru.tinkoff.bpm.topdsssigningprocess.model.sign.DocumentSignResponse other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.requestId)) {
        this.requestId = data().deepCopy(fields()[0].schema(), other.requestId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.system)) {
        this.system = data().deepCopy(fields()[1].schema(), other.system);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.submissionId)) {
        this.submissionId = data().deepCopy(fields()[2].schema(), other.submissionId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.signingSide)) {
        this.signingSide = data().deepCopy(fields()[3].schema(), other.signingSide);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.success)) {
        this.success = data().deepCopy(fields()[4].schema(), other.success);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.description)) {
        this.description = data().deepCopy(fields()[5].schema(), other.description);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.documents)) {
        this.documents = data().deepCopy(fields()[6].schema(), other.documents);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'requestId' field.
      * @return The value.
      */
    public java.lang.String getRequestId() {
      return requestId;
    }


    /**
      * Sets the value of the 'requestId' field.
      * @param value The value of 'requestId'.
      * @return This builder.
      */
    public ru.tinkoff.bpm.topdsssigningprocess.model.sign.DocumentSignResponse.Builder setRequestId(java.lang.String value) {
      validate(fields()[0], value);
      this.requestId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'requestId' field has been set.
      * @return True if the 'requestId' field has been set, false otherwise.
      */
    public boolean hasRequestId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'requestId' field.
      * @return This builder.
      */
    public ru.tinkoff.bpm.topdsssigningprocess.model.sign.DocumentSignResponse.Builder clearRequestId() {
      requestId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'system' field.
      * @return The value.
      */
    public java.lang.String getSystem() {
      return system;
    }


    /**
      * Sets the value of the 'system' field.
      * @param value The value of 'system'.
      * @return This builder.
      */
    public ru.tinkoff.bpm.topdsssigningprocess.model.sign.DocumentSignResponse.Builder setSystem(java.lang.String value) {
      validate(fields()[1], value);
      this.system = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'system' field has been set.
      * @return True if the 'system' field has been set, false otherwise.
      */
    public boolean hasSystem() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'system' field.
      * @return This builder.
      */
    public ru.tinkoff.bpm.topdsssigningprocess.model.sign.DocumentSignResponse.Builder clearSystem() {
      system = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'submissionId' field.
      * @return The value.
      */
    public java.lang.String getSubmissionId() {
      return submissionId;
    }


    /**
      * Sets the value of the 'submissionId' field.
      * @param value The value of 'submissionId'.
      * @return This builder.
      */
    public ru.tinkoff.bpm.topdsssigningprocess.model.sign.DocumentSignResponse.Builder setSubmissionId(java.lang.String value) {
      validate(fields()[2], value);
      this.submissionId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'submissionId' field has been set.
      * @return True if the 'submissionId' field has been set, false otherwise.
      */
    public boolean hasSubmissionId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'submissionId' field.
      * @return This builder.
      */
    public ru.tinkoff.bpm.topdsssigningprocess.model.sign.DocumentSignResponse.Builder clearSubmissionId() {
      submissionId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'signingSide' field.
      * @return The value.
      */
    public ru.tinkoff.bpm.topdsssigningprocess.model.sign.SigningSide getSigningSide() {
      return signingSide;
    }


    /**
      * Sets the value of the 'signingSide' field.
      * @param value The value of 'signingSide'.
      * @return This builder.
      */
    public ru.tinkoff.bpm.topdsssigningprocess.model.sign.DocumentSignResponse.Builder setSigningSide(ru.tinkoff.bpm.topdsssigningprocess.model.sign.SigningSide value) {
      validate(fields()[3], value);
      this.signingSide = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'signingSide' field has been set.
      * @return True if the 'signingSide' field has been set, false otherwise.
      */
    public boolean hasSigningSide() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'signingSide' field.
      * @return This builder.
      */
    public ru.tinkoff.bpm.topdsssigningprocess.model.sign.DocumentSignResponse.Builder clearSigningSide() {
      signingSide = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'success' field.
      * @return The value.
      */
    public boolean getSuccess() {
      return success;
    }


    /**
      * Sets the value of the 'success' field.
      * @param value The value of 'success'.
      * @return This builder.
      */
    public ru.tinkoff.bpm.topdsssigningprocess.model.sign.DocumentSignResponse.Builder setSuccess(boolean value) {
      validate(fields()[4], value);
      this.success = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'success' field has been set.
      * @return True if the 'success' field has been set, false otherwise.
      */
    public boolean hasSuccess() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'success' field.
      * @return This builder.
      */
    public ru.tinkoff.bpm.topdsssigningprocess.model.sign.DocumentSignResponse.Builder clearSuccess() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'description' field.
      * @return The value.
      */
    public java.lang.String getDescription() {
      return description;
    }


    /**
      * Sets the value of the 'description' field.
      * @param value The value of 'description'.
      * @return This builder.
      */
    public ru.tinkoff.bpm.topdsssigningprocess.model.sign.DocumentSignResponse.Builder setDescription(java.lang.String value) {
      validate(fields()[5], value);
      this.description = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'description' field has been set.
      * @return True if the 'description' field has been set, false otherwise.
      */
    public boolean hasDescription() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'description' field.
      * @return This builder.
      */
    public ru.tinkoff.bpm.topdsssigningprocess.model.sign.DocumentSignResponse.Builder clearDescription() {
      description = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'documents' field.
      * @return The value.
      */
    public java.util.List<ru.tinkoff.bpm.topdsssigningprocess.model.sign.SignedDocument> getDocuments() {
      return documents;
    }


    /**
      * Sets the value of the 'documents' field.
      * @param value The value of 'documents'.
      * @return This builder.
      */
    public ru.tinkoff.bpm.topdsssigningprocess.model.sign.DocumentSignResponse.Builder setDocuments(java.util.List<ru.tinkoff.bpm.topdsssigningprocess.model.sign.SignedDocument> value) {
      validate(fields()[6], value);
      this.documents = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'documents' field has been set.
      * @return True if the 'documents' field has been set, false otherwise.
      */
    public boolean hasDocuments() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'documents' field.
      * @return This builder.
      */
    public ru.tinkoff.bpm.topdsssigningprocess.model.sign.DocumentSignResponse.Builder clearDocuments() {
      documents = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public DocumentSignResponse build() {
      try {
        DocumentSignResponse record = new DocumentSignResponse();
        record.requestId = fieldSetFlags()[0] ? this.requestId : (java.lang.String) defaultValue(fields()[0]);
        record.system = fieldSetFlags()[1] ? this.system : (java.lang.String) defaultValue(fields()[1]);
        record.submissionId = fieldSetFlags()[2] ? this.submissionId : (java.lang.String) defaultValue(fields()[2]);
        record.signingSide = fieldSetFlags()[3] ? this.signingSide : (ru.tinkoff.bpm.topdsssigningprocess.model.sign.SigningSide) defaultValue(fields()[3]);
        record.success = fieldSetFlags()[4] ? this.success : (java.lang.Boolean) defaultValue(fields()[4]);
        record.description = fieldSetFlags()[5] ? this.description : (java.lang.String) defaultValue(fields()[5]);
        record.documents = fieldSetFlags()[6] ? this.documents : (java.util.List<ru.tinkoff.bpm.topdsssigningprocess.model.sign.SignedDocument>) defaultValue(fields()[6]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<DocumentSignResponse>
    WRITER$ = (org.apache.avro.io.DatumWriter<DocumentSignResponse>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<DocumentSignResponse>
    READER$ = (org.apache.avro.io.DatumReader<DocumentSignResponse>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.requestId);

    out.writeString(this.system);

    out.writeString(this.submissionId);

    out.writeEnum(this.signingSide.ordinal());

    out.writeBoolean(this.success);

    if (this.description == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.description);
    }

    long size0 = this.documents.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (ru.tinkoff.bpm.topdsssigningprocess.model.sign.SignedDocument e0: this.documents) {
      actualSize0++;
      out.startItem();
      e0.customEncode(out);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.requestId = in.readString();

      this.system = in.readString();

      this.submissionId = in.readString();

      this.signingSide = ru.tinkoff.bpm.topdsssigningprocess.model.sign.SigningSide.values()[in.readEnum()];

      this.success = in.readBoolean();

      if (in.readIndex() != 1) {
        in.readNull();
        this.description = null;
      } else {
        this.description = in.readString();
      }

      long size0 = in.readArrayStart();
      java.util.List<ru.tinkoff.bpm.topdsssigningprocess.model.sign.SignedDocument> a0 = this.documents;
      if (a0 == null) {
        a0 = new SpecificData.Array<ru.tinkoff.bpm.topdsssigningprocess.model.sign.SignedDocument>((int)size0, SCHEMA$.getField("documents").schema());
        this.documents = a0;
      } else a0.clear();
      SpecificData.Array<ru.tinkoff.bpm.topdsssigningprocess.model.sign.SignedDocument> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<ru.tinkoff.bpm.topdsssigningprocess.model.sign.SignedDocument>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          ru.tinkoff.bpm.topdsssigningprocess.model.sign.SignedDocument e0 = (ga0 != null ? ga0.peek() : null);
          if (e0 == null) {
            e0 = new ru.tinkoff.bpm.topdsssigningprocess.model.sign.SignedDocument();
          }
          e0.customDecode(in);
          a0.add(e0);
        }
      }

    } else {
      for (int i = 0; i < 7; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.requestId = in.readString();
          break;

        case 1:
          this.system = in.readString();
          break;

        case 2:
          this.submissionId = in.readString();
          break;

        case 3:
          this.signingSide = ru.tinkoff.bpm.topdsssigningprocess.model.sign.SigningSide.values()[in.readEnum()];
          break;

        case 4:
          this.success = in.readBoolean();
          break;

        case 5:
          if (in.readIndex() != 1) {
            in.readNull();
            this.description = null;
          } else {
            this.description = in.readString();
          }
          break;

        case 6:
          long size0 = in.readArrayStart();
          java.util.List<ru.tinkoff.bpm.topdsssigningprocess.model.sign.SignedDocument> a0 = this.documents;
          if (a0 == null) {
            a0 = new SpecificData.Array<ru.tinkoff.bpm.topdsssigningprocess.model.sign.SignedDocument>((int)size0, SCHEMA$.getField("documents").schema());
            this.documents = a0;
          } else a0.clear();
          SpecificData.Array<ru.tinkoff.bpm.topdsssigningprocess.model.sign.SignedDocument> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<ru.tinkoff.bpm.topdsssigningprocess.model.sign.SignedDocument>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              ru.tinkoff.bpm.topdsssigningprocess.model.sign.SignedDocument e0 = (ga0 != null ? ga0.peek() : null);
              if (e0 == null) {
                e0 = new ru.tinkoff.bpm.topdsssigningprocess.model.sign.SignedDocument();
              }
              e0.customDecode(in);
              a0.add(e0);
            }
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










