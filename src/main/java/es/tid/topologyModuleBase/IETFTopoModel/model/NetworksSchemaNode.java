package es.tid.topologyModuleBase.IETFTopoModel.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import es.tid.topologyModuleBase.IETFTopoModel.model.NetworksSchemaSupportingNode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-07-18T18:59:38.916+02:00")
public class NetworksSchemaNode   {
  
  private List<NetworksSchemaSupportingNode> supportingNode = new ArrayList<NetworksSchemaSupportingNode>();
  private String nodeId = null;

  /**
   * Represents another node, in an underlay network, that\nthis node is supported by.  Used to represent layering\nstructure.
   **/
  public NetworksSchemaNode supportingNode(List<NetworksSchemaSupportingNode> supportingNode) {
    this.supportingNode = supportingNode;
    return this;
  }

  
  @ApiModelProperty(value = "Represents another node, in an underlay network, that\nthis node is supported by.  Used to represent layering\nstructure.")
  @JsonProperty("supportingNode")
  public List<NetworksSchemaSupportingNode> getSupportingNode() {
    return supportingNode;
  }
  public void setSupportingNode(List<NetworksSchemaSupportingNode> supportingNode) {
    this.supportingNode = supportingNode;
  }

  /**
   * Identifies a node uniquely within the containing\nnetwork.
   **/
  public NetworksSchemaNode nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

  
  @ApiModelProperty(value = "Identifies a node uniquely within the containing\nnetwork.")
  @JsonProperty("nodeId")
  public String getNodeId() {
    return nodeId;
  }
  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworksSchemaNode networksSchemaNode = (NetworksSchemaNode) o;
    return Objects.equals(supportingNode, networksSchemaNode.supportingNode) &&
        Objects.equals(nodeId, networksSchemaNode.nodeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportingNode, nodeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworksSchemaNode {\n");
    
    sb.append("    supportingNode: ").append(toIndentedString(supportingNode)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

