/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package ru.tinkoff.sme.cryptobpm.requests;
@org.apache.avro.specific.AvroGenerated
public enum SignatureType implements org.apache.avro.generic.GenericEnumSymbol<SignatureType> {
  BES_DETACHED, BES_ENVELOPED, CO_SIGN, XML_ENVELOPED  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"SignatureType\",\"namespace\":\"ru.tinkoff.sme.cryptobpm.requests\",\"symbols\":[\"BES_DETACHED\",\"BES_ENVELOPED\",\"CO_SIGN\",\"XML_ENVELOPED\"],\"default\":\"BES_DETACHED\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
}
