/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.healthcare.v1alpha.model;

/**
 * A patient identifier and associated type.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PatientId extends com.google.api.client.json.GenericJson {

  /**
   * ID type, e.g. MRN or NHS.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The patient's unique identifier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * ID type, e.g. MRN or NHS.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * ID type, e.g. MRN or NHS.
   * @param type type or {@code null} for none
   */
  public PatientId setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * The patient's unique identifier.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * The patient's unique identifier.
   * @param value value or {@code null} for none
   */
  public PatientId setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public PatientId set(String fieldName, Object value) {
    return (PatientId) super.set(fieldName, value);
  }

  @Override
  public PatientId clone() {
    return (PatientId) super.clone();
  }

}