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

package com.google.api.services.androiddeviceprovisioning.v1.model;

/**
 * Response message of customer's listing DPCs.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Device Provisioning Partner API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CustomerListDpcsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The list of DPCs available to the customer that support zero-touch enrollment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Dpc> dpcs;

  /**
   * The list of DPCs available to the customer that support zero-touch enrollment.
   * @return value or {@code null} for none
   */
  public java.util.List<Dpc> getDpcs() {
    return dpcs;
  }

  /**
   * The list of DPCs available to the customer that support zero-touch enrollment.
   * @param dpcs dpcs or {@code null} for none
   */
  public CustomerListDpcsResponse setDpcs(java.util.List<Dpc> dpcs) {
    this.dpcs = dpcs;
    return this;
  }

  @Override
  public CustomerListDpcsResponse set(String fieldName, Object value) {
    return (CustomerListDpcsResponse) super.set(fieldName, value);
  }

  @Override
  public CustomerListDpcsResponse clone() {
    return (CustomerListDpcsResponse) super.clone();
  }

}
