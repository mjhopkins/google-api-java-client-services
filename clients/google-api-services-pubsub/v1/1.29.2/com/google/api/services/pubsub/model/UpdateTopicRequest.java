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

package com.google.api.services.pubsub.model;

/**
 * Request for the UpdateTopic method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Pub/Sub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdateTopicRequest extends com.google.api.client.json.GenericJson {

  /**
   * The updated topic object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Topic topic;

  /**
   * Indicates which fields in the provided topic to update. Must be specified and non-empty. Note
   * that if `update_mask` contains "message_storage_policy" then the new value will be determined
   * based on the policy configured at the project or organization level. The
   * `message_storage_policy` must not be set in the `topic` provided above.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateMask;

  /**
   * The updated topic object.
   * @return value or {@code null} for none
   */
  public Topic getTopic() {
    return topic;
  }

  /**
   * The updated topic object.
   * @param topic topic or {@code null} for none
   */
  public UpdateTopicRequest setTopic(Topic topic) {
    this.topic = topic;
    return this;
  }

  /**
   * Indicates which fields in the provided topic to update. Must be specified and non-empty. Note
   * that if `update_mask` contains "message_storage_policy" then the new value will be determined
   * based on the policy configured at the project or organization level. The
   * `message_storage_policy` must not be set in the `topic` provided above.
   * @return value or {@code null} for none
   */
  public String getUpdateMask() {
    return updateMask;
  }

  /**
   * Indicates which fields in the provided topic to update. Must be specified and non-empty. Note
   * that if `update_mask` contains "message_storage_policy" then the new value will be determined
   * based on the policy configured at the project or organization level. The
   * `message_storage_policy` must not be set in the `topic` provided above.
   * @param updateMask updateMask or {@code null} for none
   */
  public UpdateTopicRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  @Override
  public UpdateTopicRequest set(String fieldName, Object value) {
    return (UpdateTopicRequest) super.set(fieldName, value);
  }

  @Override
  public UpdateTopicRequest clone() {
    return (UpdateTopicRequest) super.clone();
  }

}
