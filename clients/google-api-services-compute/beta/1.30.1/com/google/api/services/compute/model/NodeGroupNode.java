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

package com.google.api.services.compute.model;

/**
 * Model definition for NodeGroupNode.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NodeGroupNode extends com.google.api.client.json.GenericJson {

  /**
   * Instances scheduled on this node.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> instances;

  /**
   * The name of the node.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The type of this node.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nodeType;

  /**
   * Binding properties for the physical server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ServerBinding serverBinding;

  /**
   * Server ID associated with this node.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serverId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Instances scheduled on this node.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getInstances() {
    return instances;
  }

  /**
   * Instances scheduled on this node.
   * @param instances instances or {@code null} for none
   */
  public NodeGroupNode setInstances(java.util.List<java.lang.String> instances) {
    this.instances = instances;
    return this;
  }

  /**
   * The name of the node.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the node.
   * @param name name or {@code null} for none
   */
  public NodeGroupNode setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The type of this node.
   * @return value or {@code null} for none
   */
  public java.lang.String getNodeType() {
    return nodeType;
  }

  /**
   * The type of this node.
   * @param nodeType nodeType or {@code null} for none
   */
  public NodeGroupNode setNodeType(java.lang.String nodeType) {
    this.nodeType = nodeType;
    return this;
  }

  /**
   * Binding properties for the physical server.
   * @return value or {@code null} for none
   */
  public ServerBinding getServerBinding() {
    return serverBinding;
  }

  /**
   * Binding properties for the physical server.
   * @param serverBinding serverBinding or {@code null} for none
   */
  public NodeGroupNode setServerBinding(ServerBinding serverBinding) {
    this.serverBinding = serverBinding;
    return this;
  }

  /**
   * Server ID associated with this node.
   * @return value or {@code null} for none
   */
  public java.lang.String getServerId() {
    return serverId;
  }

  /**
   * Server ID associated with this node.
   * @param serverId serverId or {@code null} for none
   */
  public NodeGroupNode setServerId(java.lang.String serverId) {
    this.serverId = serverId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * @param status status or {@code null} for none
   */
  public NodeGroupNode setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public NodeGroupNode set(String fieldName, Object value) {
    return (NodeGroupNode) super.set(fieldName, value);
  }

  @Override
  public NodeGroupNode clone() {
    return (NodeGroupNode) super.clone();
  }

}
